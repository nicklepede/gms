package com.google.android.gms.auth.api.credentials.credman.create;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credman.create.CreatePasswordOrPasskeyChimeraActivity;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.abt;
import defpackage.abv;
import defpackage.acm;
import defpackage.arxd;
import defpackage.asot;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgx;
import defpackage.eigb;
import defpackage.eiic;
import defpackage.eldb;
import defpackage.eldc;
import defpackage.elfd;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.iru;
import defpackage.jce;
import defpackage.jch;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.wkg;
import defpackage.wpw;
import defpackage.wpx;
import defpackage.wsl;
import defpackage.wsm;
import defpackage.wxz;
import defpackage.wyb;
import defpackage.xul;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CreatePasswordOrPasskeyChimeraActivity extends qet {
    private static final asot n = xul.b("CreatePasswordOrPasskeyChimeraActivity");
    int j;
    public wsm k;
    public abv l;
    public abv m;
    private bmgq o;
    private String p;
    private CallingAppInfoCompat q;
    private jch r;

    private final void k(String str) {
        a((wpx) new wpw(eigb.a).c(28453, str));
    }

    public final void a(wpx wpxVar) {
        int i;
        wpxVar.f(n);
        fecj v = eldc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eldc eldcVar = (eldc) v.b;
        eldcVar.c = 1;
        eldcVar.b |= 1;
        wxz.a(v, this.q);
        fecj v2 = eldb.a.v();
        int i2 = this.j;
        if (i2 != 1) {
            i = 3;
            if (i2 != 2) {
                i = i2 != 3 ? 1 : 4;
            }
        } else {
            i = 2;
        }
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        eldb eldbVar = (eldb) fecpVar;
        eldbVar.c = i - 1;
        eldbVar.b |= 1;
        wsm wsmVar = this.k;
        if (wsmVar != null) {
            boolean z = wsmVar.s;
            if (!fecpVar.L()) {
                v2.U();
            }
            fecp fecpVar2 = v2.b;
            eldb eldbVar2 = (eldb) fecpVar2;
            eldbVar2.b |= 2;
            eldbVar2.d = z;
            boolean z2 = wsmVar.t;
            if (!fecpVar2.L()) {
                v2.U();
            }
            eldb eldbVar3 = (eldb) v2.b;
            eldbVar3.b = 4 | eldbVar3.b;
            eldbVar3.e = z2;
        }
        if (!v.b.L()) {
            v.U();
        }
        eldc eldcVar2 = (eldc) v.b;
        eldb eldbVar4 = (eldb) v2.Q();
        eldbVar4.getClass();
        eldcVar2.n = eldbVar4;
        eldcVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        wxz.b(v, wpxVar.b);
        bmgq bmgqVar = this.o;
        fecj v3 = elfd.a.v();
        String str = this.p;
        if (!v3.b.L()) {
            v3.U();
        }
        fecp fecpVar3 = v3.b;
        elfd elfdVar = (elfd) fecpVar3;
        str.getClass();
        elfdVar.b = 2 | elfdVar.b;
        elfdVar.e = str;
        if (!fecpVar3.L()) {
            v3.U();
        }
        fecp fecpVar4 = v3.b;
        elfd elfdVar2 = (elfd) fecpVar4;
        elfdVar2.d = 26;
        elfdVar2.b = 1 | elfdVar2.b;
        if (!fecpVar4.L()) {
            v3.U();
        }
        elfd elfdVar3 = (elfd) v3.b;
        eldc eldcVar3 = (eldc) v.Q();
        eldcVar3.getClass();
        elfdVar3.A = eldcVar3;
        elfdVar3.b |= 33554432;
        bmgqVar.a((elfd) v3.Q());
        setResult(wpxVar.a(), wpxVar.b());
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_GisHidden);
        this.o = bmgp.a(this, null);
        this.p = (String) eiic.c(getIntent().getStringExtra("session_id"), bmgx.a());
        CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) arxd.b(getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
        if (callingAppInfoCompat == null) {
            k(wkg.a("callingAppInfoCompat"));
            return;
        }
        this.q = callingAppInfoCompat;
        String stringExtra = getIntent().getStringExtra("credential_provider_account_name");
        if (stringExtra == null) {
            k(wkg.a("accountName"));
            return;
        }
        if (!getIntent().hasExtra("credential_provider_credential_type")) {
            k(wkg.a("credentialType"));
            return;
        }
        int intExtra = getIntent().getIntExtra("credential_provider_credential_type", 0);
        this.j = intExtra;
        if (intExtra != 1 && intExtra != 2) {
            k(String.format("Invalid credential type: %s.", Integer.valueOf(intExtra)));
            return;
        }
        jch a = jce.a(getIntent());
        this.r = a;
        if (a == null) {
            k(wkg.a("providerCreateCredentialRequest"));
            return;
        }
        wsm wsmVar = (wsm) new jrh(this, new wsl(this.p, this.q, stringExtra, this.j, this.r, getIntent().getLongExtra("start_time_millis", System.currentTimeMillis()))).a(wsm.class);
        this.k = wsmVar;
        wsmVar.m.g(this, new jpd() { // from class: wrr
            @Override // defpackage.jpd
            public final void a(Object obj) {
                CreatePasswordOrPasskeyChimeraActivity.this.a((wpx) obj);
            }
        });
        this.k.k.g(this, new jpd() { // from class: wrs
            @Override // defpackage.jpd
            public final void a(Object obj) {
                CreatePasswordOrPasskeyChimeraActivity.this.l.b(new ace((PendingIntent) obj).a());
            }
        });
        this.k.l.g(this, new jpd() { // from class: wrt
            @Override // defpackage.jpd
            public final void a(Object obj) {
                CreatePasswordOrPasskeyChimeraActivity.this.m.b(new ace((PendingIntent) obj).a());
            }
        });
        this.l = registerForActivityResult(new acm(), new abt() { // from class: wru
            @Override // defpackage.abt
            public final void jq(Object obj) {
                int i = ((ActivityResult) obj).a;
                wsm wsmVar2 = CreatePasswordOrPasskeyChimeraActivity.this.k;
                if (i != -1) {
                    wsmVar2.i.k(16, "Zuul key retrieval failed.");
                } else {
                    wsmVar2.t = true;
                    wsmVar2.i.f(5);
                }
            }
        });
        acm acmVar = new acm();
        final wsm wsmVar2 = this.k;
        Objects.requireNonNull(wsmVar2);
        iru iruVar = new iru() { // from class: wrv
            @Override // defpackage.iru
            public final void a(Object obj) {
                wsm wsmVar3 = wsm.this;
                wsmVar3.r = (PublicKeyCredential) obj;
                wsmVar3.i.f(9);
            }
        };
        final wsm wsmVar3 = this.k;
        Objects.requireNonNull(wsmVar3);
        this.m = registerForActivityResult(acmVar, new wyb(iruVar, new iru() { // from class: wrw
            @Override // defpackage.iru
            public final void a(Object obj) {
                wsm.this.i.j(((wya) obj).a);
            }
        }, 28451));
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        wsm wsmVar = this.k;
        if (wsmVar != null) {
            wsmVar.i.i();
        }
    }
}
