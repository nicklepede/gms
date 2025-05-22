package com.google.android.gms.auth.api.credentials.credman.create;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credman.create.CreatePasswordOrPasskeyChimeraActivity;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
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
import defpackage.enqo;
import defpackage.enqp;
import defpackage.ensq;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.itk;
import defpackage.jdu;
import defpackage.jdx;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.ygq;
import defpackage.ymg;
import defpackage.ymh;
import defpackage.yoz;
import defpackage.ypa;
import defpackage.yut;
import defpackage.yuv;
import defpackage.zsi;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CreatePasswordOrPasskeyChimeraActivity extends rxx {
    private static final ausn n = zsi.b("CreatePasswordOrPasskeyChimeraActivity");
    int j;
    public ypa k;
    public aca l;
    public aca m;
    private boni o;
    private String p;
    private CallingAppInfoCompat q;
    private jdx r;

    private final void k(String str) {
        a((ymh) new ymg(ektg.a).c(28453, str));
    }

    public final void a(ymh ymhVar) {
        int i;
        ymhVar.f(n);
        fgrc v = enqp.a.v();
        if (!v.b.L()) {
            v.U();
        }
        enqp enqpVar = (enqp) v.b;
        enqpVar.c = 1;
        enqpVar.b |= 1;
        yut.a(v, this.q);
        fgrc v2 = enqo.a.v();
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
        fgri fgriVar = v2.b;
        enqo enqoVar = (enqo) fgriVar;
        enqoVar.c = i - 1;
        enqoVar.b |= 1;
        ypa ypaVar = this.k;
        if (ypaVar != null) {
            boolean z = ypaVar.t;
            if (!fgriVar.L()) {
                v2.U();
            }
            fgri fgriVar2 = v2.b;
            enqo enqoVar2 = (enqo) fgriVar2;
            enqoVar2.b |= 2;
            enqoVar2.d = z;
            boolean z2 = ypaVar.u;
            if (!fgriVar2.L()) {
                v2.U();
            }
            enqo enqoVar3 = (enqo) v2.b;
            enqoVar3.b = 4 | enqoVar3.b;
            enqoVar3.e = z2;
        }
        if (!v.b.L()) {
            v.U();
        }
        enqp enqpVar2 = (enqp) v.b;
        enqo enqoVar4 = (enqo) v2.Q();
        enqoVar4.getClass();
        enqpVar2.n = enqoVar4;
        enqpVar2.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        yut.b(v, ymhVar.b);
        boni boniVar = this.o;
        fgrc v3 = ensq.a.v();
        String str = this.p;
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar3 = v3.b;
        ensq ensqVar = (ensq) fgriVar3;
        str.getClass();
        ensqVar.b = 2 | ensqVar.b;
        ensqVar.e = str;
        if (!fgriVar3.L()) {
            v3.U();
        }
        fgri fgriVar4 = v3.b;
        ensq ensqVar2 = (ensq) fgriVar4;
        ensqVar2.d = 26;
        ensqVar2.b = 1 | ensqVar2.b;
        if (!fgriVar4.L()) {
            v3.U();
        }
        ensq ensqVar3 = (ensq) v3.b;
        enqp enqpVar3 = (enqp) v.Q();
        enqpVar3.getClass();
        ensqVar3.A = enqpVar3;
        ensqVar3.b |= 33554432;
        boniVar.a((ensq) v3.Q());
        setResult(ymhVar.a(), ymhVar.b());
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_GisHidden);
        this.o = bonh.a(this, null);
        this.p = (String) ekvh.c(getIntent().getStringExtra("session_id"), bonp.a());
        CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) atzs.b(getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
        if (callingAppInfoCompat == null) {
            k(ygq.a("callingAppInfoCompat"));
            return;
        }
        this.q = callingAppInfoCompat;
        String stringExtra = getIntent().getStringExtra("credential_provider_account_name");
        if (stringExtra == null) {
            k(ygq.a("accountName"));
            return;
        }
        if (!getIntent().hasExtra("credential_provider_credential_type")) {
            k(ygq.a("credentialType"));
            return;
        }
        int intExtra = getIntent().getIntExtra("credential_provider_credential_type", 0);
        this.j = intExtra;
        if (intExtra != 1 && intExtra != 2) {
            k(String.format("Invalid credential type: %s.", Integer.valueOf(intExtra)));
            return;
        }
        jdx a = jdu.a(getIntent());
        this.r = a;
        if (a == null) {
            k(ygq.a("providerCreateCredentialRequest"));
            return;
        }
        ypa ypaVar = (ypa) new jxw(this, new yoz(this.p, this.q, stringExtra, this.j, this.r, getIntent().getLongExtra("start_time_millis", System.currentTimeMillis()), getIntent().getStringExtra("caller_verification_token_id"))).a(ypa.class);
        this.k = ypaVar;
        ypaVar.n.g(this, new jvs() { // from class: yod
            @Override // defpackage.jvs
            public final void a(Object obj) {
                CreatePasswordOrPasskeyChimeraActivity.this.a((ymh) obj);
            }
        });
        this.k.l.g(this, new jvs() { // from class: yoe
            @Override // defpackage.jvs
            public final void a(Object obj) {
                CreatePasswordOrPasskeyChimeraActivity.this.l.b(new acj((PendingIntent) obj).a());
            }
        });
        this.k.m.g(this, new jvs() { // from class: yof
            @Override // defpackage.jvs
            public final void a(Object obj) {
                CreatePasswordOrPasskeyChimeraActivity.this.m.b(new acj((PendingIntent) obj).a());
            }
        });
        this.l = registerForActivityResult(new acr(), new aby() { // from class: yog
            @Override // defpackage.aby
            public final void jF(Object obj) {
                int i = ((ActivityResult) obj).a;
                ypa ypaVar2 = CreatePasswordOrPasskeyChimeraActivity.this.k;
                if (i != -1) {
                    ypaVar2.j.k(16, "Zuul key retrieval failed.");
                } else {
                    ypaVar2.u = true;
                    ypaVar2.j.f(5);
                }
            }
        });
        acr acrVar = new acr();
        final ypa ypaVar2 = this.k;
        Objects.requireNonNull(ypaVar2);
        itk itkVar = new itk() { // from class: yoh
            @Override // defpackage.itk
            public final void a(Object obj) {
                ypa ypaVar3 = ypa.this;
                ypaVar3.s = (PublicKeyCredential) obj;
                ypaVar3.j.f(9);
            }
        };
        final ypa ypaVar3 = this.k;
        Objects.requireNonNull(ypaVar3);
        this.m = registerForActivityResult(acrVar, new yuv(itkVar, new itk() { // from class: yoi
            @Override // defpackage.itk
            public final void a(Object obj) {
                ypa.this.j.j(((yuu) obj).a);
            }
        }, 28451));
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        ypa ypaVar = this.k;
        if (ypaVar != null) {
            ypaVar.j.i();
        }
    }
}
