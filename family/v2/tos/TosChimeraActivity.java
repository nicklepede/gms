package com.google.android.gms.family.v2.tos;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import defpackage.asxe;
import defpackage.atzb;
import defpackage.aura;
import defpackage.auur;
import defpackage.bbua;
import defpackage.bbvn;
import defpackage.bcgo;
import defpackage.bcgp;
import defpackage.bp;
import defpackage.bsup;
import defpackage.evmr;
import defpackage.ew;
import defpackage.fgpr;
import defpackage.fgrc;
import defpackage.rxx;
import defpackage.wib;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class TosChimeraActivity extends rxx implements bcgo {
    private String j;
    private byte[] k;
    private boolean l;
    private bbvn m;

    private final Intent a() {
        return new Intent().putExtra("accountName", getIntent().getStringExtra("accountName")).putExtra("tosAccepted", this.l);
    }

    private final void k(int i) {
        setResult(4, new Intent().putExtra("accountName", this.j).putExtra("errorCode", i));
        finish();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (getSupportFragmentManager().b() != 0) {
            super.onBackPressed();
        } else {
            setResult(3, a());
            finish();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m = new bbvn(this);
        String q = aura.q(this);
        if (!asxe.d(this).h(auur.c(q))) {
            this.m.f(3, 8, "tos");
            k(-3);
            return;
        }
        bbua.d(this, getIntent(), q);
        String stringExtra = getIntent().getStringExtra("accountName");
        if (stringExtra == null) {
            this.m.f(3, 13, "tos");
            k(-2);
            return;
        }
        this.j = stringExtra;
        Account account = null;
        byte[] byteArray = bundle != null ? bundle.getByteArray("auditToken") : null;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("auditToken");
        if (byteArray != null) {
            this.k = byteArray;
        } else if (byteArrayExtra != null) {
            this.k = byteArrayExtra;
        } else {
            fgrc v = evmr.a.v();
            fgpr w = fgpr.w(wib.a());
            if (!v.b.L()) {
                v.U();
            }
            evmr evmrVar = (evmr) v.b;
            evmrVar.b |= 1;
            evmrVar.c = w;
            this.k = ((evmr) v.Q()).r();
        }
        String stringExtra2 = getIntent().getStringExtra("appId");
        atzb.s(stringExtra2);
        this.m.d(this.j, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion), stringExtra2);
        for (Account account2 : bsup.b(this).p("com.google")) {
            if (true == account2.name.equals(this.j)) {
                account = account2;
            }
        }
        if (account == null) {
            this.m.f(3, 14, "tos");
            k(-2);
            return;
        }
        String stringExtra3 = getIntent().getStringExtra("tosContent");
        String stringExtra4 = getIntent().getStringExtra("tosContinueButton");
        String stringExtra5 = getIntent().getStringExtra("tosMoreButton");
        if (TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra4)) {
            this.m.f(3, 15, "tos");
            k(-2);
            return;
        }
        this.l = bundle != null && bundle.getBoolean("tosAccepted", false);
        setContentView(R.layout.fm_activity_play_tos);
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.g(R.id.fm_family_play_tos_fragment_container) == null) {
            bp bpVar = new bp(supportFragmentManager);
            bpVar.t(R.id.fm_family_play_tos_fragment_container, bcgp.x(this.k, this.j, stringExtra3, stringExtra4, stringExtra5));
            bpVar.a();
        }
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("tosAccepted", this.l);
        bundle.putByteArray("auditToken", this.k);
    }

    @Override // defpackage.bcgo
    public final void y() {
        this.l = true;
        setResult(1, a());
        finish();
    }
}
