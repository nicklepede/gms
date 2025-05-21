package com.google.android.gms.auth.api.credentials.credman.remote;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credman.remote.RemoteChimeraActivity;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.abv;
import defpackage.ace;
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
import defpackage.elde;
import defpackage.elfd;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.iru;
import defpackage.qet;
import defpackage.wkg;
import defpackage.wpt;
import defpackage.wpu;
import defpackage.wpw;
import defpackage.wpz;
import defpackage.wxz;
import defpackage.wyb;
import defpackage.xul;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RemoteChimeraActivity extends qet {
    private static final asot l = xul.b("RemoteChimeraActivity");
    public int j;
    public wpt k;
    private bmgq m;
    private String n;
    private CallingAppInfoCompat o;
    private boolean p;

    private final void k(String str) {
        a((wpu) this.k.c(28453, str));
    }

    public final void a(wpu wpuVar) {
        wpuVar.f(l);
        fecj v = eldc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eldc eldcVar = (eldc) v.b;
        eldcVar.c = 3;
        eldcVar.b |= 1;
        wxz.a(v, this.o);
        wxz.b(v, wpuVar.b);
        int i = this.j;
        if (i == 1) {
            fecj v2 = elde.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            elde eldeVar = (elde) v2.b;
            eldeVar.c = 2;
            eldeVar.b |= 1;
            if (!v.b.L()) {
                v.U();
            }
            eldc eldcVar2 = (eldc) v.b;
            elde eldeVar2 = (elde) v2.Q();
            eldeVar2.getClass();
            eldcVar2.l = eldeVar2;
            eldcVar2.b |= 4096;
        } else if (i == 2) {
            fecj v3 = eldb.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            eldb eldbVar = (eldb) v3.b;
            eldbVar.c = 2;
            eldbVar.b |= 1;
            if (!v.b.L()) {
                v.U();
            }
            eldc eldcVar3 = (eldc) v.b;
            eldb eldbVar2 = (eldb) v3.Q();
            eldbVar2.getClass();
            eldcVar3.n = eldbVar2;
            eldcVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        }
        bmgq bmgqVar = this.m;
        fecj v4 = elfd.a.v();
        String str = this.n;
        if (!v4.b.L()) {
            v4.U();
        }
        fecp fecpVar = v4.b;
        elfd elfdVar = (elfd) fecpVar;
        str.getClass();
        elfdVar.b = 2 | elfdVar.b;
        elfdVar.e = str;
        if (!fecpVar.L()) {
            v4.U();
        }
        fecp fecpVar2 = v4.b;
        elfd elfdVar2 = (elfd) fecpVar2;
        elfdVar2.d = 26;
        elfdVar2.b = 1 | elfdVar2.b;
        if (!fecpVar2.L()) {
            v4.U();
        }
        elfd elfdVar3 = (elfd) v4.b;
        eldc eldcVar4 = (eldc) v.Q();
        eldcVar4.getClass();
        elfdVar3.A = eldcVar4;
        elfdVar3.b |= 33554432;
        bmgqVar.a((elfd) v4.Q());
        setResult(wpuVar.a(), wpuVar.b());
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_GisHidden);
        this.m = bmgp.a(this, null);
        this.n = (String) eiic.c(getIntent().getStringExtra("session_id"), bmgx.a());
        int intExtra = getIntent().getIntExtra("remote_flow_type", 0);
        this.j = intExtra;
        this.k = intExtra == 2 ? new wpw(eigb.a) : new wpz(eigb.a);
        if (!getIntent().hasExtra("remote_flow_type")) {
            k(wkg.a("flowType"));
            return;
        }
        int i = this.j;
        if (i != 2 && i != 1) {
            k(String.format("Invalid flowType: %s.", Integer.valueOf(i)));
            return;
        }
        CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) arxd.b(getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
        if (callingAppInfoCompat == null) {
            k(wkg.a("callingAppInfoCompat"));
            return;
        }
        this.o = callingAppInfoCompat;
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("remote_pending_intent");
        if (pendingIntent == null) {
            k(wkg.a("remotePendingIntent"));
            return;
        }
        abv registerForActivityResult = registerForActivityResult(new acm(), new wyb(new iru() { // from class: wxa
            @Override // defpackage.iru
            public final void a(Object obj) {
                RemoteChimeraActivity remoteChimeraActivity = RemoteChimeraActivity.this;
                remoteChimeraActivity.a(remoteChimeraActivity.k.h(((PublicKeyCredential) obj).d().toString()));
            }
        }, new iru() { // from class: wxb
            @Override // defpackage.iru
            public final void a(Object obj) {
                RemoteChimeraActivity remoteChimeraActivity = RemoteChimeraActivity.this;
                wya wyaVar = (wya) obj;
                remoteChimeraActivity.a(remoteChimeraActivity.j == 1 ? (wpu) new wpz(eigb.a).b(wyaVar.a) : (wpu) new wpw(eigb.a).b(wyaVar.a));
            }
        }, 28451));
        if (bundle != null) {
            this.p = bundle.getBoolean("fido_activity_started", false);
        }
        if (this.p) {
            return;
        }
        registerForActivityResult.b(new ace(pendingIntent).a());
        this.p = true;
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("fido_activity_started", this.p);
        super.onSaveInstanceState(bundle);
    }
}
