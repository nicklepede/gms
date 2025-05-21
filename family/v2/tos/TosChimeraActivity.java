package com.google.android.gms.family.v2.tos;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import defpackage.aqup;
import defpackage.arwm;
import defpackage.asng;
import defpackage.asqx;
import defpackage.azqe;
import defpackage.azrr;
import defpackage.bacs;
import defpackage.bact;
import defpackage.bp;
import defpackage.bqna;
import defpackage.esxb;
import defpackage.ew;
import defpackage.feay;
import defpackage.fecj;
import defpackage.qet;
import defpackage.umc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class TosChimeraActivity extends qet implements bacs {
    private String j;
    private byte[] k;
    private boolean l;
    private azrr m;

    private final Intent a() {
        return new Intent().putExtra("accountName", getIntent().getStringExtra("accountName")).putExtra("tosAccepted", this.l);
    }

    private final void k(int i) {
        setResult(4, new Intent().putExtra("accountName", this.j).putExtra("errorCode", i));
        finish();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        if (getSupportFragmentManager().b() != 0) {
            super.onBackPressed();
        } else {
            setResult(3, a());
            finish();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m = new azrr(this);
        String q = asng.q(this);
        if (!aqup.d(this).h(asqx.c(q))) {
            this.m.f(3, 8, "tos");
            k(-3);
            return;
        }
        azqe.d(this, getIntent(), q);
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
            fecj v = esxb.a.v();
            feay w = feay.w(umc.a());
            if (!v.b.L()) {
                v.U();
            }
            esxb esxbVar = (esxb) v.b;
            esxbVar.b |= 1;
            esxbVar.c = w;
            this.k = ((esxb) v.Q()).r();
        }
        String stringExtra2 = getIntent().getStringExtra("appId");
        arwm.s(stringExtra2);
        this.m.d(this.j, Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion), stringExtra2);
        for (Account account2 : bqna.b(this).p("com.google")) {
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
            bpVar.t(R.id.fm_family_play_tos_fragment_container, bact.x(this.k, this.j, stringExtra3, stringExtra4, stringExtra5));
            bpVar.a();
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("tosAccepted", this.l);
        bundle.putByteArray("auditToken", this.k);
    }

    @Override // defpackage.bacs
    public final void y() {
        this.l = true;
        setResult(1, a());
        finish();
    }
}
