package com.google.android.gms.auth.api.credentials.fido.registration.ui;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.fido.registration.ui.RegistrationChimeraActivity;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.abv;
import defpackage.acm;
import defpackage.arxd;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgx;
import defpackage.eble;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eiir;
import defpackage.eldt;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.ew;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fksi;
import defpackage.iru;
import defpackage.iyk;
import defpackage.izk;
import defpackage.jcd;
import defpackage.jce;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.wio;
import defpackage.wiq;
import defpackage.wkg;
import defpackage.wtb;
import defpackage.wyb;
import defpackage.xcy;
import defpackage.xdi;
import defpackage.xdk;
import defpackage.xqr;
import defpackage.xqs;
import defpackage.xrg;
import defpackage.xtg;
import defpackage.xul;
import defpackage.zam;
import defpackage.zav;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class RegistrationChimeraActivity extends qet {
    public static final /* synthetic */ int k = 0;
    private static final asot l = xul.b("RegistrationChimeraActivity");
    public xqs j;
    private bmgq m;
    private String n;
    private RegistrationOptions o;

    public final void a(wiq wiqVar) {
        Intent b;
        wiq wiqVar2;
        if (fksi.d() && zam.a(this.o)) {
            xdi c = xdi.c(wiqVar);
            b = new Intent();
            if (c.g()) {
                iyk iykVar = new iyk(((PublicKeyCredential) c.a).c());
                jce.b(b, iykVar);
                wiqVar2 = c;
            } else {
                izk izkVar = (izk) wtb.a.a(c.b);
                jcd.b(b, izkVar);
                wiqVar2 = c;
            }
        } else {
            b = wiqVar.b();
            wiqVar2 = wiqVar;
        }
        wiqVar2.f(l);
        fecj k2 = wiqVar2.k();
        if (!k2.b.L()) {
            k2.U();
        }
        elfb elfbVar = (elfb) k2.b;
        elfb elfbVar2 = elfb.a;
        elfbVar.f = 211;
        elfbVar.b |= 8;
        xqs xqsVar = this.j;
        if (xqsVar != null) {
            eiid eiidVar = xqsVar.C;
            fecj c2 = xcy.c(eiidVar != null ? ((Integer) ((eiir) eiidVar).a).intValue() : -1, xqsVar.r, xqsVar.E);
            boolean z = xqsVar.F instanceof xdk;
            if (!c2.b.L()) {
                c2.U();
            }
            eldt eldtVar = (eldt) c2.b;
            eldt eldtVar2 = eldt.a;
            eldtVar.b |= 32;
            eldtVar.g = z;
            eldt eldtVar3 = (eldt) c2.Q();
            if (!k2.b.L()) {
                k2.U();
            }
            elfb elfbVar3 = (elfb) k2.b;
            eldtVar3.getClass();
            elfbVar3.j = eldtVar3;
            elfbVar3.b |= 128;
        } else {
            fecj v = eldt.a.v();
            if (!v.b.L()) {
                v.U();
            }
            eldt eldtVar4 = (eldt) v.b;
            eldtVar4.b |= 32;
            eldtVar4.g = false;
            eldt eldtVar5 = (eldt) v.Q();
            if (!k2.b.L()) {
                k2.U();
            }
            elfb elfbVar4 = (elfb) k2.b;
            eldtVar5.getClass();
            elfbVar4.j = eldtVar5;
            elfbVar4.b |= 128;
        }
        bmgq bmgqVar = this.m;
        fecj v2 = elfd.a.v();
        String str = this.n;
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        elfd elfdVar = (elfd) fecpVar;
        str.getClass();
        elfdVar.b |= 2;
        elfdVar.e = str;
        if (!fecpVar.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        elfd elfdVar2 = (elfd) fecpVar2;
        elfdVar2.d = 17;
        elfdVar2.b |= 1;
        if (!fecpVar2.L()) {
            v2.U();
        }
        elfd elfdVar3 = (elfd) v2.b;
        elfb elfbVar5 = (elfb) k2.Q();
        elfbVar5.getClass();
        elfdVar3.s = elfbVar5;
        elfdVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bmgqVar.a((elfd) v2.Q());
        setResult(wiqVar2.a(), b);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        this.m = bmgp.a(this, null);
        this.n = bmgx.a();
        hC().q(-1);
        setTheme(R.style.ThemeTranslucentDayNight);
        super.onCreate(bundle);
        getContainerActivity();
        int i = eble.a;
        RegistrationOptions registrationOptions = (RegistrationOptions) arxd.b(getIntent(), "registration_options", RegistrationOptions.CREATOR);
        this.o = registrationOptions;
        if (registrationOptions == null) {
            a(new wio(eigb.a, (int[]) null).c(50170, wkg.a("registrationOptions")));
            return;
        }
        if (fksi.d()) {
            if (jce.a(getIntent()) != null) {
                zav zavVar = new zav(this.o);
                zavVar.d = null;
                this.o = zavVar.a();
            }
        }
        this.n = this.o.b;
        if (!asqh.a()) {
            a(new wio(eigb.a, (int[]) null).b(xtg.a()));
            return;
        }
        ComponentName callingActivity = getCallingActivity();
        xqs xqsVar = (xqs) new jrh(this, new xqr(this.o, callingActivity != null ? eiid.j(callingActivity.getClassName()) : eigb.a)).a(xqs.class);
        this.j = xqsVar;
        xqsVar.c.g(this, new jpd() { // from class: xrh
            @Override // defpackage.jpd
            public final void a(Object obj) {
                RegistrationChimeraActivity.this.a((wiq) obj);
            }
        });
        acm acmVar = new acm();
        final xqs xqsVar2 = this.j;
        Objects.requireNonNull(xqsVar2);
        iru iruVar = new iru() { // from class: xri
            @Override // defpackage.iru
            public final void a(Object obj) {
                wiq d = new wio((eiid) eigb.a, (short[]) null).d((PublicKeyCredential) obj);
                xqs xqsVar3 = xqs.this;
                xqsVar3.F = d;
                xqsVar3.m.g();
            }
        };
        final xqs xqsVar3 = this.j;
        Objects.requireNonNull(xqsVar3);
        final abv registerForActivityResult = registerForActivityResult(acmVar, new wyb(iruVar, new iru() { // from class: xrj
            @Override // defpackage.iru
            public final void a(Object obj) {
                wya wyaVar = (wya) obj;
                PublicKeyCredential publicKeyCredential = wyaVar.b;
                xqs xqsVar4 = xqs.this;
                if (publicKeyCredential == null) {
                    xqsVar4.F = new wio(eigb.a, (int[]) null).b(wyaVar.a);
                } else {
                    xqsVar4.F = new wio((eiid) eigb.a, (short[]) null).f(publicKeyCredential, wyaVar.a);
                }
                xqsVar4.m.g();
            }
        }, 50172));
        this.j.y.g(this, new jpd() { // from class: xrk
            @Override // defpackage.jpd
            public final void a(Object obj) {
                int i2 = RegistrationChimeraActivity.k;
                abv.this.b(new ace(((PendingIntent) obj).getIntentSender()).a());
            }
        });
        this.j.f.g(this, new jpd() { // from class: xrl
            @Override // defpackage.jpd
            public final void a(Object obj) {
                RegistrationChimeraActivity registrationChimeraActivity = RegistrationChimeraActivity.this;
                iyf iyfVar = (iyf) obj;
                xqs xqsVar4 = registrationChimeraActivity.j;
                ensv ensvVar = xqsVar4.v;
                xqp xqpVar = new xqp(xqsVar4);
                Context a = AppContextProvider.a();
                fvbo.f(a, "context");
                fvbo.f(iyfVar, "request");
                fvbo.f(ensvVar, "executor");
                fvbo.f(iyfVar, "request");
                iyq a2 = ((iyfVar instanceof iyl) || fvbo.n(iyfVar, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) ? iyr.a(registrationChimeraActivity) : ((iyfVar instanceof iyj) && ((iyj) iyfVar).i) ? iyr.a(registrationChimeraActivity) : (registrationChimeraActivity.getPackageManager().hasSystemFeature("android.software.leanback") || registrationChimeraActivity.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? iyr.a(registrationChimeraActivity) : iyr.a(registrationChimeraActivity);
                if (a2 == null) {
                    xqpVar.a(new izn("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                    return;
                }
                fvbo.f(a, "ctx");
                if (a.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    xqpVar.a(new izp("createCredential is not supported on this device"));
                } else {
                    a2.b();
                }
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("RegistrationBottomSheetDialog") == null) {
            new xrg().show(supportFragmentManager, "RegistrationBottomSheetDialog");
        }
    }
}
