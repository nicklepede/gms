package com.google.android.gms.auth.api.credentials.fido.registration.ui;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.fido.registration.ui.RegistrationChimeraActivity;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.abad;
import defpackage.abam;
import defpackage.aca;
import defpackage.acr;
import defpackage.atzs;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonp;
import defpackage.edxt;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.ekvw;
import defpackage.enrg;
import defpackage.enso;
import defpackage.ensq;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fngi;
import defpackage.fnjh;
import defpackage.itk;
import defpackage.jaa;
import defpackage.jba;
import defpackage.jdt;
import defpackage.jdu;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.yeu;
import defpackage.yew;
import defpackage.ygq;
import defpackage.ypp;
import defpackage.yuv;
import defpackage.yzs;
import defpackage.zac;
import defpackage.zae;
import defpackage.zoo;
import defpackage.zop;
import defpackage.zpd;
import defpackage.zrd;
import defpackage.zsi;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class RegistrationChimeraActivity extends rxx {
    public static final /* synthetic */ int k = 0;
    private static final ausn l = zsi.b("RegistrationChimeraActivity");
    public zop j;
    private boni m;
    private String n;
    private RegistrationOptions o;

    public final void a(yew yewVar) {
        Intent b;
        yew yewVar2;
        if (fnjh.d() && abad.a(this.o)) {
            zac c = zac.c(yewVar);
            b = new Intent();
            if (c.g()) {
                jaa jaaVar = new jaa(((PublicKeyCredential) c.a).c());
                jdu.c(b, jaaVar);
                yewVar2 = c;
            } else {
                jba jbaVar = (jba) ypp.a.a(c.b);
                jdt.b(b, jbaVar);
                yewVar2 = c;
            }
        } else {
            b = yewVar.b();
            yewVar2 = yewVar;
        }
        yewVar2.f(l);
        fgrc l2 = yewVar2.l();
        if (!l2.b.L()) {
            l2.U();
        }
        enso ensoVar = (enso) l2.b;
        enso ensoVar2 = enso.a;
        ensoVar.f = 211;
        ensoVar.b |= 8;
        zop zopVar = this.j;
        if (zopVar != null) {
            ekvi ekviVar = zopVar.C;
            fgrc c2 = yzs.c(ekviVar != null ? ((Integer) ((ekvw) ekviVar).a).intValue() : -1, zopVar.r, zopVar.E);
            boolean z = zopVar.F instanceof zae;
            if (!c2.b.L()) {
                c2.U();
            }
            enrg enrgVar = (enrg) c2.b;
            enrg enrgVar2 = enrg.a;
            enrgVar.b |= 32;
            enrgVar.g = z;
            enrg enrgVar3 = (enrg) c2.Q();
            if (!l2.b.L()) {
                l2.U();
            }
            enso ensoVar3 = (enso) l2.b;
            enrgVar3.getClass();
            ensoVar3.j = enrgVar3;
            ensoVar3.b |= 128;
        } else {
            fgrc v = enrg.a.v();
            if (!v.b.L()) {
                v.U();
            }
            enrg enrgVar4 = (enrg) v.b;
            enrgVar4.b |= 32;
            enrgVar4.g = false;
            enrg enrgVar5 = (enrg) v.Q();
            if (!l2.b.L()) {
                l2.U();
            }
            enso ensoVar4 = (enso) l2.b;
            enrgVar5.getClass();
            ensoVar4.j = enrgVar5;
            ensoVar4.b |= 128;
        }
        boni boniVar = this.m;
        fgrc v2 = ensq.a.v();
        String str = this.n;
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        ensq ensqVar = (ensq) fgriVar;
        str.getClass();
        ensqVar.b |= 2;
        ensqVar.e = str;
        if (!fgriVar.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        ensq ensqVar2 = (ensq) fgriVar2;
        ensqVar2.d = 17;
        ensqVar2.b |= 1;
        if (!fgriVar2.L()) {
            v2.U();
        }
        ensq ensqVar3 = (ensq) v2.b;
        enso ensoVar5 = (enso) l2.Q();
        ensoVar5.getClass();
        ensqVar3.s = ensoVar5;
        ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar.a((ensq) v2.Q());
        setResult(yewVar2.a(), b);
        RegistrationOptions registrationOptions = this.o;
        ResultReceiver resultReceiver = registrationOptions != null ? registrationOptions.j : null;
        if (fngi.f() && resultReceiver != null) {
            resultReceiver.send(-1, yewVar2.h());
        }
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        this.m = bonh.a(this, null);
        this.n = bonp.a();
        hS().q(-1);
        setTheme(R.style.ThemeTranslucentDayNight);
        super.onCreate(bundle);
        getContainerActivity();
        int i = edxt.a;
        Intent intent = getIntent();
        RegistrationOptions registrationOptions = (RegistrationOptions) atzs.b(intent, "registration_options", RegistrationOptions.CREATOR);
        this.o = registrationOptions;
        if (registrationOptions == null) {
            a(new yeu((ekvi) ektg.a, (short[]) null).c(50170, ygq.a("registrationOptions")));
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("result_receiver");
        abam abamVar = new abam(this.o);
        abamVar.f = resultReceiver;
        this.o = abamVar.a();
        if (fnjh.d()) {
            if (jdu.a(getIntent()) != null) {
                abam abamVar2 = new abam(this.o);
                abamVar2.d = null;
                this.o = abamVar2.a();
            }
        }
        this.n = this.o.b;
        if (!auub.a()) {
            a(new yeu((ekvi) ektg.a, (short[]) null).b(zrd.a()));
            return;
        }
        ComponentName callingActivity = getCallingActivity();
        zop zopVar = (zop) new jxw(this, new zoo(this.o, callingActivity != null ? ekvi.j(callingActivity.getClassName()) : ektg.a)).a(zop.class);
        this.j = zopVar;
        zopVar.c.g(this, new jvs() { // from class: zpe
            @Override // defpackage.jvs
            public final void a(Object obj) {
                RegistrationChimeraActivity.this.a((yew) obj);
            }
        });
        acr acrVar = new acr();
        final zop zopVar2 = this.j;
        Objects.requireNonNull(zopVar2);
        itk itkVar = new itk() { // from class: zpf
            @Override // defpackage.itk
            public final void a(Object obj) {
                yew d = new yeu(ektg.a, (boolean[]) null).d((PublicKeyCredential) obj);
                zop zopVar3 = zop.this;
                zopVar3.F = d;
                zopVar3.m.g();
            }
        };
        final zop zopVar3 = this.j;
        Objects.requireNonNull(zopVar3);
        final aca registerForActivityResult = registerForActivityResult(acrVar, new yuv(itkVar, new itk() { // from class: zpg
            @Override // defpackage.itk
            public final void a(Object obj) {
                yuu yuuVar = (yuu) obj;
                PublicKeyCredential publicKeyCredential = yuuVar.b;
                zop zopVar4 = zop.this;
                if (publicKeyCredential == null) {
                    zopVar4.F = new yeu((ekvi) ektg.a, (short[]) null).b(yuuVar.a);
                } else {
                    zopVar4.F = new yeu(ektg.a, (boolean[]) null).f(publicKeyCredential, yuuVar.a);
                }
                zopVar4.m.g();
            }
        }, 50172));
        this.j.y.g(this, new jvs() { // from class: zph
            @Override // defpackage.jvs
            public final void a(Object obj) {
                int i2 = RegistrationChimeraActivity.k;
                aca.this.b(new acj(((PendingIntent) obj).getIntentSender()).a());
            }
        });
        this.j.f.g(this, new jvs() { // from class: zpi
            @Override // defpackage.jvs
            public final void a(Object obj) {
                RegistrationChimeraActivity registrationChimeraActivity = RegistrationChimeraActivity.this;
                izv izvVar = (izv) obj;
                zop zopVar4 = registrationChimeraActivity.j;
                eqgo eqgoVar = zopVar4.v;
                zom zomVar = new zom(zopVar4);
                Context a = AppContextProvider.a();
                fxxm.f(a, "context");
                fxxm.f(izvVar, "request");
                fxxm.f(eqgoVar, "executor");
                fxxm.f(izvVar, "request");
                jag a2 = ((izvVar instanceof jab) || fxxm.n(izvVar, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) ? jah.a(registrationChimeraActivity) : ((izvVar instanceof izz) && ((izz) izvVar).i) ? jah.a(registrationChimeraActivity) : (registrationChimeraActivity.getPackageManager().hasSystemFeature("android.software.leanback") || registrationChimeraActivity.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? jah.a(registrationChimeraActivity) : jah.a(registrationChimeraActivity);
                if (a2 == null) {
                    zomVar.a(new jbd("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                    return;
                }
                fxxm.f(a, "ctx");
                if (a.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    zomVar.a(new jbf("createCredential is not supported on this device"));
                } else {
                    a2.b();
                }
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("RegistrationBottomSheetDialog") == null) {
            new zpd().show(supportFragmentManager, "RegistrationBottomSheetDialog");
        }
    }
}
