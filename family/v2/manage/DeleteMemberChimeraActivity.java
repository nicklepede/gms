package com.google.android.gms.family.v2.manage;

import android.accounts.Account;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import defpackage.aqup;
import defpackage.asng;
import defpackage.azpv;
import defpackage.azpx;
import defpackage.azqe;
import defpackage.azrr;
import defpackage.azzy;
import defpackage.babj;
import defpackage.babk;
import defpackage.babn;
import defpackage.babr;
import defpackage.bp;
import defpackage.bqna;
import defpackage.eiig;
import defpackage.ew;
import defpackage.fnmh;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DeleteMemberChimeraActivity extends qet implements babn, babj {
    public azpx j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public boolean o = false;
    public ProgressDialog p = null;
    public azpv q;
    public azrr r;
    private String s;

    private final void s() {
        ProgressDialog progressDialog = new ProgressDialog(this, azqe.c(getIntent()));
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

    @Override // defpackage.babj
    public final int a() {
        return 1;
    }

    @Override // defpackage.babj
    public final void hB() {
        this.o = true;
        s();
        getSupportLoaderManager().c(0, null, new azzy(this));
    }

    @Override // defpackage.babj
    public final int k() {
        return 2;
    }

    @Override // defpackage.babn
    public final azpv l() {
        return this.q;
    }

    @Override // defpackage.babn
    public final azpx m() {
        return this.j;
    }

    @Override // defpackage.babn
    public final void n() {
        this.r.h(17);
        setResult(10);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        babr babrVar;
        super.onCreate(bundle);
        this.r = new azrr(this);
        String q = asng.q(this);
        if (q != null && !aqup.d(this).h(q)) {
            this.r.f(2, 8, "deletemember");
            t(-3);
            return;
        }
        if (getIntent().getStringExtra("clientCallingPackage") != null) {
            q = getIntent().getStringExtra("clientCallingPackage");
        }
        azqe.d(this, getIntent(), q);
        String stringExtra = getIntent().getStringExtra("accountName");
        this.k = stringExtra;
        if (stringExtra == null) {
            this.r.f(2, 13, "deletemember");
            t(-2);
            return;
        }
        Account account = null;
        for (Account account2 : bqna.b(this).p("com.google")) {
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
        eiig.x(stringExtra5);
        this.q = new azpv(stringExtra5, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion));
        azrr azrrVar = this.r;
        String str = this.k;
        eiig.x(str);
        azpv azpvVar = this.q;
        azrrVar.d(str, azpvVar.b, azpvVar.a);
        this.j = new azpx();
        if (getIntent().getStringExtra("consistencyToken") != null) {
            this.j.c(getIntent().getStringExtra("consistencyToken"), getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
        }
        if (fnmh.h()) {
            getWindow();
            azqe.e(this);
            fnmh.l();
        }
        setContentView(R.layout.fm_activity_delete_member);
        ew supportFragmentManager = getSupportFragmentManager();
        if (this.n) {
            String str2 = this.k;
            eiig.x(str2);
            babrVar = new babr();
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("accountName", str2);
            babrVar.setArguments(bundle2);
        } else {
            String str3 = this.k;
            eiig.x(str3);
            String str4 = this.l;
            eiig.x(str4);
            babr babrVar2 = new babr();
            Bundle bundle3 = new Bundle(2);
            bundle3.putString("accountName", str3);
            bundle3.putString("memberId", str4);
            babrVar2.setArguments(bundle3);
            babrVar = babrVar2;
        }
        if (supportFragmentManager.g(R.id.fm_delete_member_fragment_container) == null) {
            bp bpVar = new bp(supportFragmentManager);
            bpVar.t(R.id.fm_delete_member_fragment_container, babrVar);
            bpVar.a();
        }
        if (bundle == null || !bundle.getBoolean("DeleteMemberInProgress", false)) {
            return;
        }
        s();
        getSupportLoaderManager().c(0, null, new azzy(this));
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("DeleteMemberInProgress", this.o);
        ProgressDialog progressDialog = this.p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // defpackage.babn
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

    @Override // defpackage.babn
    public final void r() {
        String string = this.n ? getString(R.string.fm_reauth_password_title_leave_family, new Object[]{this.s}) : getString(R.string.fm_reauth_password_title_remove_member, new Object[]{this.m});
        String string2 = this.n ? getString(R.string.fm_reauth_pin_title_leave_family, new Object[]{this.s}) : getString(R.string.fm_reauth_pin_title_remove_member, new Object[]{this.m});
        String str = this.k;
        eiig.x(str);
        babk.x(str, string, string2).show(getSupportFragmentManager(), (String) null);
    }
}
