package com.google.android.gms.auth.api.credentials.credman.authentication;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credman.authentication.AuthenticationChimeraActivity;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import defpackage.aby;
import defpackage.aca;
import defpackage.acr;
import defpackage.atzs;
import defpackage.ausn;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonp;
import defpackage.ektg;
import defpackage.ekvh;
import defpackage.ekvi;
import defpackage.enqk;
import defpackage.enqp;
import defpackage.ensq;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fxxm;
import defpackage.jcu;
import defpackage.jcv;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.yeu;
import defpackage.ygq;
import defpackage.ymc;
import defpackage.ymy;
import defpackage.ymz;
import defpackage.yut;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthenticationChimeraActivity extends rxx {
    private static final ausn l = zsi.b("AuthenticationChimeraActivity");
    public ymz j;
    public aca k;
    private boni m;
    private String n;
    private CallingAppInfoCompat o;
    private jcv p;

    private final void k(String str) {
        a((ymc) new yeu((ekvi) ektg.a, (byte[]) null).c(28453, str));
    }

    public final void a(ymc ymcVar) {
        ymcVar.f(l);
        fgrc v = enqp.a.v();
        if (!v.b.L()) {
            v.U();
        }
        enqp enqpVar = (enqp) v.b;
        enqpVar.c = 1;
        enqpVar.b |= 1;
        yut.a(v, this.o);
        yut.b(v, ymcVar.b);
        fgrc v2 = enqk.a.v();
        ymz ymzVar = this.j;
        if (ymzVar != null) {
            boolean z = ymzVar.j;
            if (!v2.b.L()) {
                v2.U();
            }
            enqk enqkVar = (enqk) v2.b;
            enqkVar.b |= 1;
            enqkVar.c = z;
        }
        if (!v.b.L()) {
            v.U();
        }
        enqp enqpVar2 = (enqp) v.b;
        enqk enqkVar2 = (enqk) v2.Q();
        enqkVar2.getClass();
        enqpVar2.m = enqkVar2;
        enqpVar2.b |= 8192;
        boni boniVar = this.m;
        fgrc v3 = ensq.a.v();
        String str = this.n;
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar = v3.b;
        ensq ensqVar = (ensq) fgriVar;
        str.getClass();
        ensqVar.b |= 2;
        ensqVar.e = str;
        if (!fgriVar.L()) {
            v3.U();
        }
        fgri fgriVar2 = v3.b;
        ensq ensqVar2 = (ensq) fgriVar2;
        ensqVar2.d = 26;
        ensqVar2.b = 1 | ensqVar2.b;
        if (!fgriVar2.L()) {
            v3.U();
        }
        ensq ensqVar3 = (ensq) v3.b;
        enqp enqpVar3 = (enqp) v.Q();
        enqpVar3.getClass();
        ensqVar3.A = enqpVar3;
        ensqVar3.b |= 33554432;
        boniVar.a((ensq) v3.Q());
        setResult(ymcVar.a(), ymcVar.b());
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_GisHidden);
        this.m = bonh.a(this, null);
        this.n = (String) ekvh.c(getIntent().getStringExtra("session_id"), bonp.a());
        CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) atzs.b(getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
        if (callingAppInfoCompat == null) {
            k(ygq.a("callingAppInfoCompat"));
            return;
        }
        this.o = callingAppInfoCompat;
        String stringExtra = getIntent().getStringExtra("credential_provider_account_name");
        if (stringExtra == null) {
            k(ygq.a("accountName"));
            return;
        }
        Intent intent = getIntent();
        fxxm.f(intent, "intent");
        fxxm.f(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST");
        jcv b = bundleExtra != null ? jcu.b(bundleExtra) : null;
        this.p = b;
        if (b == null) {
            k(ygq.a("beginGetCredentialRequest"));
            return;
        }
        ymz ymzVar = (ymz) new jxw(this, new ymy(this.n, this.o, b, stringExtra)).a(ymz.class);
        this.j = ymzVar;
        ymzVar.h.g(this, new jvs() { // from class: ymp
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AuthenticationChimeraActivity.this.a((ymc) obj);
            }
        });
        this.j.g.g(this, new jvs() { // from class: ymq
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AuthenticationChimeraActivity.this.k.b(new acj((PendingIntent) obj).a());
            }
        });
        this.k = registerForActivityResult(new acr(), new aby() { // from class: ymr
            @Override // defpackage.aby
            public final void jF(Object obj) {
                boolean z = ((ActivityResult) obj).a == -1;
                ymz ymzVar2 = AuthenticationChimeraActivity.this.j;
                ymzVar2.j = z;
                ymzVar2.f.f(2);
            }
        });
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        ymz ymzVar = this.j;
        if (ymzVar != null) {
            ymzVar.f.i();
        }
    }
}
