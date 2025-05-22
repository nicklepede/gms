package com.google.android.gms.family.v2.manage;

import android.accounts.Account;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import defpackage.asxe;
import defpackage.aura;
import defpackage.bbtr;
import defpackage.bbtt;
import defpackage.bbua;
import defpackage.bbvn;
import defpackage.bcdu;
import defpackage.bcff;
import defpackage.bcfg;
import defpackage.bcfj;
import defpackage.bcfn;
import defpackage.bp;
import defpackage.bsup;
import defpackage.ekvl;
import defpackage.ew;
import defpackage.fqep;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DeleteMemberChimeraActivity extends rxx implements bcfj, bcff {
    public bbtt j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public boolean o = false;
    public ProgressDialog p = null;
    public bbtr q;
    public bbvn r;
    private String s;

    private final void s() {
        ProgressDialog progressDialog = new ProgressDialog(this, bbua.c(getIntent()));
        this.p = progressDialog;
        progressDialog.setIndeterminate(true);
        this.p.setCancelable(false);
        if (this.n) {
            this.p.setMessage(getResources().getString(R.string.fm_leave_family_progress));
        } else {
            this.p.setMessage(getResources().getString(R.string.fm_remove_member_progress));
        }
        this.p.show();
    }

    private final void t(int i) {
        setResult(4, new Intent().putExtra("accountName", this.k).putExtra("errorCode", i));
        finish();
    }

    @Override // defpackage.bcff
    public final int a() {
        return 1;
    }

    @Override // defpackage.bcff
    public final void hR() {
        this.o = true;
        s();
        getSupportLoaderManager().c(0, null, new bcdu(this));
    }

    @Override // defpackage.bcff
    public final int k() {
        return 2;
    }

    @Override // defpackage.bcfj
    public final bbtr l() {
        return this.q;
    }

    @Override // defpackage.bcfj
    public final bbtt m() {
        return this.j;
    }

    @Override // defpackage.bcfj
    public final void n() {
        this.r.h(17);
        setResult(10);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        bcfn bcfnVar;
        super.onCreate(bundle);
        this.r = new bbvn(this);
        String q = aura.q(this);
        if (q != null && !asxe.d(this).h(q)) {
            this.r.f(2, 8, "deletemember");
            t(-3);
            return;
        }
        if (getIntent().getStringExtra("clientCallingPackage") != null) {
            q = getIntent().getStringExtra("clientCallingPackage");
        }
        bbua.d(this, getIntent(), q);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.k = stringExtra;
        if (stringExtra == null) {
            this.r.f(2, 13, "deletemember");
            t(-2);
            return;
        }
        Account account = null;
        for (Account account2 : bsup.b(this).p("com.google")) {
            if (true == account2.name.equals(this.k)) {
                account = account2;
            }
        }
        if (account == null) {
            this.r.f(2, 14, "deletemember");
            t(-2);
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("memberId");
        this.l = stringExtra2;
        if (stringExtra2 == null) {
            this.r.f(2, 10, "deletemember");
            t(-2);
            return;
        }
        String stringExtra3 = getIntent().getStringExtra("memberGivenName");
        this.m = stringExtra3;
        if (TextUtils.isEmpty(stringExtra3)) {
            this.r.f(2, 11, "deletemember");
            t(-2);
            return;
        }
        this.n = getIntent().getBooleanExtra("leaveFamily", false);
        String stringExtra4 = getIntent().getStringExtra("hohGivenName");
        this.s = stringExtra4;
        if (this.n && TextUtils.isEmpty(stringExtra4)) {
            this.r.f(2, 12, "deletemember");
            t(-2);
            return;
        }
        String stringExtra5 = getIntent().getStringExtra("appId");
        ekvl.y(stringExtra5);
        this.q = new bbtr(stringExtra5, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        bbvn bbvnVar = this.r;
        String str = this.k;
        ekvl.y(str);
        bbtr bbtrVar = this.q;
        bbvnVar.d(str, bbtrVar.b, bbtrVar.a);
        this.j = new bbtt();
        if (getIntent().getStringExtra("consistencyToken") != null) {
            this.j.c(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
        }
        if (fqep.h()) {
            getWindow();
            bbua.e(this);
            fqep.l();
        }
        setContentView(R.layout.fm_activity_delete_member);
        ew supportFragmentManager = getSupportFragmentManager();
        if (this.n) {
            String str2 = this.k;
            ekvl.y(str2);
            bcfnVar = new bcfn();
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("accountName", str2);
            bcfnVar.setArguments(bundle2);
        } else {
            String str3 = this.k;
            ekvl.y(str3);
            String str4 = this.l;
            ekvl.y(str4);
            bcfn bcfnVar2 = new bcfn();
            Bundle bundle3 = new Bundle(2);
            bundle3.putString("accountName", str3);
            bundle3.putString("memberId", str4);
            bcfnVar2.setArguments(bundle3);
            bcfnVar = bcfnVar2;
        }
        if (supportFragmentManager.g(R.id.fm_delete_member_fragment_container) == null) {
            bp bpVar = new bp(supportFragmentManager);
            bpVar.t(R.id.fm_delete_member_fragment_container, bcfnVar);
            bpVar.a();
        }
        if (bundle == null || !bundle.getBoolean("DeleteMemberInProgress", false)) {
            return;
        }
        s();
        getSupportLoaderManager().c(0, null, new bcdu(this));
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("DeleteMemberInProgress", this.o);
        ProgressDialog progressDialog = this.p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // defpackage.bcfj
    public final void p() {
        this.r.h(8);
        setResult(7);
        finish();
    }

    public final void q(Intent intent) {
        this.j.b();
        if (this.j.b().isEmpty()) {
            return;
        }
        intent.putExtra("consistencyToken", this.j.b()).putExtra("tokenExpirationTimeSecs", this.j.a());
    }

    @Override // defpackage.bcfj
    public final void r() {
        String string = this.n ? getString(R.string.fm_reauth_password_title_leave_family, new Object[]{this.s}) : getString(R.string.fm_reauth_password_title_remove_member, new Object[]{this.m});
        String string2 = this.n ? getString(R.string.fm_reauth_pin_title_leave_family, new Object[]{this.s}) : getString(R.string.fm_reauth_pin_title_remove_member, new Object[]{this.m});
        String str = this.k;
        ekvl.y(str);
        bcfg.x(str, string, string2).show(getSupportFragmentManager(), (String) null);
    }
}
