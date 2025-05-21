package com.google.android.gms.auth.api.credentials.fido.authentication.ui;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.fido.authentication.ui.AuthenticationChimeraActivity;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.a;
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
import defpackage.eldt;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.ew;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fksi;
import defpackage.fuwt;
import defpackage.fuwy;
import defpackage.fvbo;
import defpackage.iru;
import defpackage.iyo;
import defpackage.iyt;
import defpackage.iyz;
import defpackage.izt;
import defpackage.jbo;
import defpackage.jbr;
import defpackage.jcd;
import defpackage.jcj;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.wio;
import defpackage.wiq;
import defpackage.wkg;
import defpackage.wtc;
import defpackage.wyb;
import defpackage.wzp;
import defpackage.wzq;
import defpackage.xah;
import defpackage.xcy;
import defpackage.xdi;
import defpackage.xdk;
import defpackage.xtg;
import defpackage.xul;
import defpackage.yzu;
import defpackage.zam;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthenticationChimeraActivity extends qet {
    public static final /* synthetic */ int j = 0;
    private static final asot k = xul.b("AuthenticationChimeraActivity");
    private bmgq l;
    private String m;
    private wzq n;
    private AuthenticationOptions o;

    public final void a(wiq wiqVar) {
        Intent b;
        wiq wiqVar2;
        if (fksi.c() && zam.a(this.o)) {
            xdi c = xdi.c(wiqVar);
            b = new Intent();
            if (c.g()) {
                iyt iytVar = new iyt(new iyz(((PublicKeyCredential) c.a).c()));
                jcd.d(b, iytVar);
                wiqVar2 = c;
            } else {
                izt iztVar = (izt) wtc.a.a(c.b);
                jcd.c(b, iztVar);
                wiqVar2 = c;
            }
        } else {
            b = wiqVar.b();
            wiqVar2 = wiqVar;
        }
        wiqVar2.f(k);
        fecj k2 = wiqVar2.k();
        if (!k2.b.L()) {
            k2.U();
        }
        elfb elfbVar = (elfb) k2.b;
        elfb elfbVar2 = elfb.a;
        elfbVar.f = 210;
        elfbVar.b |= 8;
        wzq wzqVar = this.n;
        if (wzqVar != null) {
            fecj c2 = xcy.c(wzqVar.v, wzqVar.i, wzqVar.q);
            int i = wzqVar.p;
            if (!c2.b.L()) {
                c2.U();
            }
            eldt eldtVar = (eldt) c2.b;
            eldt eldtVar2 = eldt.a;
            eldtVar.b |= 1;
            eldtVar.c = i;
            boolean z = wzqVar.w instanceof xdk;
            if (!c2.b.L()) {
                c2.U();
            }
            eldt eldtVar3 = (eldt) c2.b;
            eldtVar3.b |= 32;
            eldtVar3.g = z;
            eldt eldtVar4 = (eldt) c2.Q();
            if (!k2.b.L()) {
                k2.U();
            }
            elfb elfbVar3 = (elfb) k2.b;
            eldtVar4.getClass();
            elfbVar3.j = eldtVar4;
            elfbVar3.b |= 128;
        } else {
            fecj v = eldt.a.v();
            if (!v.b.L()) {
                v.U();
            }
            eldt eldtVar5 = (eldt) v.b;
            eldtVar5.b |= 32;
            eldtVar5.g = false;
            eldt eldtVar6 = (eldt) v.Q();
            if (!k2.b.L()) {
                k2.U();
            }
            elfb elfbVar4 = (elfb) k2.b;
            eldtVar6.getClass();
            elfbVar4.j = eldtVar6;
            elfbVar4.b |= 128;
        }
        bmgq bmgqVar = this.l;
        fecj v2 = elfd.a.v();
        String str = this.m;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        Set set;
        Parcelable[] parcelableArray;
        jcj jcjVar = null;
        this.l = bmgp.a(this, null);
        this.m = bmgx.a();
        setTheme(R.style.ThemeTranslucentDayNight);
        super.onCreate(bundle);
        getContainerActivity();
        int i = eble.a;
        AuthenticationOptions authenticationOptions = (AuthenticationOptions) arxd.b(getIntent(), "authentication_options", AuthenticationOptions.CREATOR);
        this.o = authenticationOptions;
        if (authenticationOptions == null) {
            a(new wio(eigb.a, (int[]) null).c(50170, wkg.a("authenticationOptions")));
            return;
        }
        if (fksi.c()) {
            Intent intent = getIntent();
            fvbo.f(intent, "intent");
            fvbo.f(intent, "intent");
            try {
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST");
                if (bundleExtra != null) {
                    jbr d = jbo.d(bundleExtra);
                    if (d == null) {
                        throw new IllegalArgumentException("Bundle was missing CallingAppInfo.");
                    }
                    int i2 = bundleExtra.getInt("androidx.credentials.provider.extra.CREDENTIAL_OPTION_SIZE", -1);
                    if (i2 < 0) {
                        throw new IllegalArgumentException("Bundle had invalid option size as " + i2 + '.');
                    }
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    int i3 = 0;
                    while (i3 < i2) {
                        String string = bundleExtra.getString(a.j(i3, "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_"));
                        if (string == null) {
                            throw new IllegalArgumentException("Bundle was missing option type at index " + i2 + '.');
                        }
                        Bundle bundle2 = bundleExtra.getBundle(a.j(i3, "androidx.credentials.provider.extra.CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_"));
                        if (bundle2 == null) {
                            throw new IllegalArgumentException("Bundle was missing candidate query data at index " + i2 + '.');
                        }
                        Bundle bundle3 = bundleExtra.getBundle(a.j(i3, "androidx.credentials.provider.extra.CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_"));
                        if (bundle3 == null) {
                            throw new IllegalArgumentException("Bundle was missing request data at index " + i2 + '.');
                        }
                        boolean z2 = bundleExtra.getBoolean(a.j(i3, "androidx.credentials.provider.extra.CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_"), z);
                        try {
                            parcelableArray = bundleExtra.getParcelableArray(a.j(i3, "androidx.credentials.provider.extra.CREDENTIAL_OPTION_ALLOWED_PROVIDERS_"));
                        } catch (Exception unused) {
                            set = fuwy.a;
                        }
                        if (parcelableArray != null) {
                            ArrayList arrayList2 = new ArrayList();
                            int length = parcelableArray.length;
                            for (?? r7 = z; r7 < length; r7++) {
                                ComponentName componentName = (ComponentName) parcelableArray[r7];
                                if (componentName != null) {
                                    arrayList2.add(componentName);
                                }
                            }
                            set = fuwt.ak(arrayList2);
                            if (set != null) {
                                arrayList.add(iyo.a(string, bundle3, bundle2, z2, set));
                                i3++;
                                z = false;
                            }
                        }
                        set = fuwy.a;
                        arrayList.add(iyo.a(string, bundle3, bundle2, z2, set));
                        i3++;
                        z = false;
                    }
                    jcjVar = new jcj(arrayList, d);
                }
            } catch (Exception unused2) {
                jcjVar = null;
            }
            if (jcjVar != null) {
                yzu yzuVar = new yzu(this.o);
                yzuVar.c = null;
                this.o = yzuVar.a();
            }
        }
        this.m = this.o.b;
        if (!asqh.a()) {
            a(new wio(eigb.a, (int[]) null).b(xtg.a()));
            return;
        }
        ComponentName callingActivity = getCallingActivity();
        wzq wzqVar = (wzq) new jrh(this, new wzp(this.o, callingActivity != null ? eiid.j(callingActivity.getClassName()) : eigb.a)).a(wzq.class);
        this.n = wzqVar;
        wzqVar.c.g(this, new jpd() { // from class: wzr
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AuthenticationChimeraActivity.this.a((wiq) obj);
            }
        });
        acm acmVar = new acm();
        final wzq wzqVar2 = this.n;
        Objects.requireNonNull(wzqVar2);
        iru iruVar = new iru() { // from class: wzs
            @Override // defpackage.iru
            public final void a(Object obj) {
                wiq d2 = new wio((eiid) eigb.a, (short[]) null).d((PublicKeyCredential) obj);
                wzq wzqVar3 = wzq.this;
                wzqVar3.w = d2;
                wzqVar3.g.g();
            }
        };
        final wzq wzqVar3 = this.n;
        Objects.requireNonNull(wzqVar3);
        final abv registerForActivityResult = registerForActivityResult(acmVar, new wyb(iruVar, new iru() { // from class: wzt
            @Override // defpackage.iru
            public final void a(Object obj) {
                wya wyaVar = (wya) obj;
                PublicKeyCredential publicKeyCredential = wyaVar.b;
                wzq wzqVar4 = wzq.this;
                if (publicKeyCredential == null) {
                    wzqVar4.w = new wio(eigb.a, (int[]) null).b(wyaVar.a);
                } else {
                    wzqVar4.w = new wio((eiid) eigb.a, (short[]) null).f(publicKeyCredential, wyaVar.a);
                }
                wzqVar4.g.g();
            }
        }, 50172));
        this.n.u.g(this, new jpd() { // from class: wzu
            @Override // defpackage.jpd
            public final void a(Object obj) {
                int i4 = AuthenticationChimeraActivity.j;
                abv.this.b(new ace(((PendingIntent) obj).getIntentSender()).a());
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("dialog") == null) {
            new xah().showNow(supportFragmentManager, "dialog");
        }
    }
}
