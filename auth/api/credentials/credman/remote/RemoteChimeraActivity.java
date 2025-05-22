package com.google.android.gms.auth.api.credentials.credman.remote;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credman.remote.RemoteChimeraActivity;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aca;
import defpackage.acj;
import defpackage.acr;
import defpackage.atzs;
import defpackage.ausn;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonp;
import defpackage.ektg;
import defpackage.ekvh;
import defpackage.enqo;
import defpackage.enqp;
import defpackage.enqr;
import defpackage.ensq;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.itk;
import defpackage.rxx;
import defpackage.ygq;
import defpackage.ymd;
import defpackage.yme;
import defpackage.ymg;
import defpackage.ymj;
import defpackage.yut;
import defpackage.yuv;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RemoteChimeraActivity extends rxx {
    private static final ausn l = zsi.b("RemoteChimeraActivity");
    public int j;
    public ymd k;
    private boni m;
    private String n;
    private CallingAppInfoCompat o;
    private boolean p;

    private final void k(String str) {
        a((yme) this.k.c(28453, str));
    }

    public final void a(yme ymeVar) {
        ymeVar.f(l);
        fgrc v = enqp.a.v();
        if (!v.b.L()) {
            v.U();
        }
        enqp enqpVar = (enqp) v.b;
        enqpVar.c = 3;
        enqpVar.b |= 1;
        yut.a(v, this.o);
        yut.b(v, ymeVar.b);
        int i = this.j;
        if (i == 1) {
            fgrc v2 = enqr.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            enqr enqrVar = (enqr) v2.b;
            enqrVar.c = 2;
            enqrVar.b |= 1;
            if (!v.b.L()) {
                v.U();
            }
            enqp enqpVar2 = (enqp) v.b;
            enqr enqrVar2 = (enqr) v2.Q();
            enqrVar2.getClass();
            enqpVar2.l = enqrVar2;
            enqpVar2.b |= 4096;
        } else if (i == 2) {
            fgrc v3 = enqo.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            enqo enqoVar = (enqo) v3.b;
            enqoVar.c = 2;
            enqoVar.b |= 1;
            if (!v.b.L()) {
                v.U();
            }
            enqp enqpVar3 = (enqp) v.b;
            enqo enqoVar2 = (enqo) v3.Q();
            enqoVar2.getClass();
            enqpVar3.n = enqoVar2;
            enqpVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        }
        boni boniVar = this.m;
        fgrc v4 = ensq.a.v();
        String str = this.n;
        if (!v4.b.L()) {
            v4.U();
        }
        fgri fgriVar = v4.b;
        ensq ensqVar = (ensq) fgriVar;
        str.getClass();
        ensqVar.b = 2 | ensqVar.b;
        ensqVar.e = str;
        if (!fgriVar.L()) {
            v4.U();
        }
        fgri fgriVar2 = v4.b;
        ensq ensqVar2 = (ensq) fgriVar2;
        ensqVar2.d = 26;
        ensqVar2.b = 1 | ensqVar2.b;
        if (!fgriVar2.L()) {
            v4.U();
        }
        ensq ensqVar3 = (ensq) v4.b;
        enqp enqpVar4 = (enqp) v.Q();
        enqpVar4.getClass();
        ensqVar3.A = enqpVar4;
        ensqVar3.b |= 33554432;
        boniVar.a((ensq) v4.Q());
        setResult(ymeVar.a(), ymeVar.b());
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_GisHidden);
        this.m = bonh.a(this, null);
        this.n = (String) ekvh.c(getIntent().getStringExtra("session_id"), bonp.a());
        int intExtra = getIntent().getIntExtra("remote_flow_type", 0);
        this.j = intExtra;
        this.k = intExtra == 2 ? new ymg(ektg.a) : new ymj(ektg.a);
        if (!getIntent().hasExtra("remote_flow_type")) {
            k(ygq.a("flowType"));
            return;
        }
        int i = this.j;
        if (i != 2 && i != 1) {
            k(String.format("Invalid flowType: %s.", Integer.valueOf(i)));
            return;
        }
        CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) atzs.b(getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
        if (callingAppInfoCompat == null) {
            k(ygq.a("callingAppInfoCompat"));
            return;
        }
        this.o = callingAppInfoCompat;
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("remote_pending_intent");
        if (pendingIntent == null) {
            k(ygq.a("remotePendingIntent"));
            return;
        }
        aca registerForActivityResult = registerForActivityResult(new acr(), new yuv(new itk() { // from class: ytt
            @Override // defpackage.itk
            public final void a(Object obj) {
                RemoteChimeraActivity remoteChimeraActivity = RemoteChimeraActivity.this;
                remoteChimeraActivity.a(remoteChimeraActivity.k.h(((PublicKeyCredential) obj).d().toString()));
            }
        }, new itk() { // from class: ytu
            @Override // defpackage.itk
            public final void a(Object obj) {
                RemoteChimeraActivity remoteChimeraActivity = RemoteChimeraActivity.this;
                yuu yuuVar = (yuu) obj;
                remoteChimeraActivity.a(remoteChimeraActivity.j == 1 ? (yme) new ymj(ektg.a).b(yuuVar.a) : (yme) new ymg(ektg.a).b(yuuVar.a));
            }
        }, 28451));
        if (bundle != null) {
            this.p = bundle.getBoolean("fido_activity_started", false);
        }
        if (this.p) {
            return;
        }
        registerForActivityResult.b(new acj(pendingIntent).a());
        this.p = true;
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("fido_activity_started", this.p);
        super.onSaveInstanceState(bundle);
    }
}
