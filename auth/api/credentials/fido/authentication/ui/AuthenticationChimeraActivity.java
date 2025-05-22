package com.google.android.gms.auth.api.credentials.fido.authentication.ui;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.fido.authentication.ui.AuthenticationChimeraActivity;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aazk;
import defpackage.abad;
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
import defpackage.enrg;
import defpackage.enso;
import defpackage.ensq;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fngi;
import defpackage.fnjh;
import defpackage.itk;
import defpackage.jaj;
import defpackage.jap;
import defpackage.jbj;
import defpackage.jdt;
import defpackage.jdu;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.yeu;
import defpackage.yew;
import defpackage.ygq;
import defpackage.ypq;
import defpackage.yuv;
import defpackage.ywj;
import defpackage.ywk;
import defpackage.yxb;
import defpackage.yzs;
import defpackage.zac;
import defpackage.zae;
import defpackage.zrd;
import defpackage.zsi;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthenticationChimeraActivity extends rxx {
    public static final /* synthetic */ int j = 0;
    private static final ausn k = zsi.b("AuthenticationChimeraActivity");
    private boni l;
    private String m;
    private ywk n;
    private AuthenticationOptions o;

    public final void a(yew yewVar) {
        Intent b;
        yew yewVar2;
        if (fnjh.c() && abad.a(this.o)) {
            zac c = zac.c(yewVar);
            b = new Intent();
            if (c.g()) {
                jaj jajVar = new jaj(new jap(((PublicKeyCredential) c.a).c()));
                jdt.d(b, jajVar);
                yewVar2 = c;
            } else {
                jbj jbjVar = (jbj) ypq.a.a(c.b);
                jdt.c(b, jbjVar);
                yewVar2 = c;
            }
        } else {
            b = yewVar.b();
            yewVar2 = yewVar;
        }
        yewVar2.f(k);
        fgrc l = yewVar2.l();
        if (!l.b.L()) {
            l.U();
        }
        enso ensoVar = (enso) l.b;
        enso ensoVar2 = enso.a;
        ensoVar.f = 210;
        ensoVar.b |= 8;
        ywk ywkVar = this.n;
        if (ywkVar != null) {
            fgrc c2 = yzs.c(ywkVar.v, ywkVar.i, ywkVar.q);
            int i = ywkVar.p;
            if (!c2.b.L()) {
                c2.U();
            }
            enrg enrgVar = (enrg) c2.b;
            enrg enrgVar2 = enrg.a;
            enrgVar.b |= 1;
            enrgVar.c = i;
            boolean z = ywkVar.w instanceof zae;
            if (!c2.b.L()) {
                c2.U();
            }
            enrg enrgVar3 = (enrg) c2.b;
            enrgVar3.b |= 32;
            enrgVar3.g = z;
            enrg enrgVar4 = (enrg) c2.Q();
            if (!l.b.L()) {
                l.U();
            }
            enso ensoVar3 = (enso) l.b;
            enrgVar4.getClass();
            ensoVar3.j = enrgVar4;
            ensoVar3.b |= 128;
        } else {
            fgrc v = enrg.a.v();
            if (!v.b.L()) {
                v.U();
            }
            enrg enrgVar5 = (enrg) v.b;
            enrgVar5.b |= 32;
            enrgVar5.g = false;
            enrg enrgVar6 = (enrg) v.Q();
            if (!l.b.L()) {
                l.U();
            }
            enso ensoVar4 = (enso) l.b;
            enrgVar6.getClass();
            ensoVar4.j = enrgVar6;
            ensoVar4.b |= 128;
        }
        boni boniVar = this.l;
        fgrc v2 = ensq.a.v();
        String str = this.m;
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
        enso ensoVar5 = (enso) l.Q();
        ensoVar5.getClass();
        ensqVar3.s = ensoVar5;
        ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar.a((ensq) v2.Q());
        setResult(yewVar2.a(), b);
        AuthenticationOptions authenticationOptions = this.o;
        ResultReceiver resultReceiver = authenticationOptions != null ? authenticationOptions.i : null;
        if (fngi.f() && resultReceiver != null) {
            resultReceiver.send(-1, yewVar2.h());
        }
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        this.l = bonh.a(this, null);
        this.m = bonp.a();
        setTheme(R.style.ThemeTranslucentDayNight);
        super.onCreate(bundle);
        getContainerActivity();
        int i = edxt.a;
        Intent intent = getIntent();
        AuthenticationOptions authenticationOptions = (AuthenticationOptions) atzs.b(intent, "authentication_options", AuthenticationOptions.CREATOR);
        this.o = authenticationOptions;
        if (authenticationOptions == null) {
            a(new yeu((ekvi) ektg.a, (short[]) null).c(50170, ygq.a("authenticationOptions")));
            return;
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("result_receiver");
        aazk aazkVar = new aazk(this.o);
        aazkVar.d = resultReceiver;
        this.o = aazkVar.a();
        if (fnjh.c()) {
            if (jdu.b(getIntent()) != null) {
                aazk aazkVar2 = new aazk(this.o);
                aazkVar2.c = null;
                this.o = aazkVar2.a();
            }
        }
        this.m = this.o.b;
        if (!auub.a()) {
            a(new yeu((ekvi) ektg.a, (short[]) null).b(zrd.a()));
            return;
        }
        ComponentName callingActivity = getCallingActivity();
        ywk ywkVar = (ywk) new jxw(this, new ywj(this.o, callingActivity != null ? ekvi.j(callingActivity.getClassName()) : ektg.a)).a(ywk.class);
        this.n = ywkVar;
        ywkVar.c.g(this, new jvs() { // from class: ywl
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AuthenticationChimeraActivity.this.a((yew) obj);
            }
        });
        acr acrVar = new acr();
        final ywk ywkVar2 = this.n;
        Objects.requireNonNull(ywkVar2);
        itk itkVar = new itk() { // from class: ywm
            @Override // defpackage.itk
            public final void a(Object obj) {
                yew d = new yeu(ektg.a, (boolean[]) null).d((PublicKeyCredential) obj);
                ywk ywkVar3 = ywk.this;
                ywkVar3.w = d;
                ywkVar3.g.g();
            }
        };
        final ywk ywkVar3 = this.n;
        Objects.requireNonNull(ywkVar3);
        final aca registerForActivityResult = registerForActivityResult(acrVar, new yuv(itkVar, new itk() { // from class: ywn
            @Override // defpackage.itk
            public final void a(Object obj) {
                yuu yuuVar = (yuu) obj;
                PublicKeyCredential publicKeyCredential = yuuVar.b;
                ywk ywkVar4 = ywk.this;
                if (publicKeyCredential == null) {
                    ywkVar4.w = new yeu((ekvi) ektg.a, (short[]) null).b(yuuVar.a);
                } else {
                    ywkVar4.w = new yeu(ektg.a, (boolean[]) null).f(publicKeyCredential, yuuVar.a);
                }
                ywkVar4.g.g();
            }
        }, 50172));
        this.n.u.g(this, new jvs() { // from class: ywo
            @Override // defpackage.jvs
            public final void a(Object obj) {
                int i2 = AuthenticationChimeraActivity.j;
                aca.this.b(new acj(((PendingIntent) obj).getIntentSender()).a());
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("dialog") == null) {
            new yxb().showNow(supportFragmentManager, "dialog");
        }
    }
}
