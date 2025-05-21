package com.google.android.gms.growth.init;

import android.app.NotificationChannel;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.growth.featuredrops.activity.FeatureDropsChimeraActivity;
import com.google.android.gms.growth.featuredrops.activity.FeatureDropsProofingChimeraActivity;
import com.google.android.gms.growth.notifications.NotificationActionChimeraActivity;
import com.google.android.gms.growth.ui.GrowthDebugChimeraActivity;
import com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity;
import defpackage.anya;
import defpackage.asbo;
import defpackage.asbp;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.bklb;
import defpackage.bklc;
import defpackage.bklm;
import defpackage.ejhf;
import defpackage.esno;
import defpackage.esnq;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fixm;
import defpackage.fowr;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ModuleInitializer extends anya {
    private static final asot a = asot.e(asej.GROWTH);
    private static final String[] b = {GrowthDebugChimeraActivity.j, GrowthWebViewChimeraActivity.j, FeatureDropsChimeraActivity.p, FeatureDropsProofingChimeraActivity.p, NotificationActionChimeraActivity.j, "com.google.android.gms.growth.notifications.GcmBroadcastReceiver", "com.google.android.gms.growth.surveys.activity.GmsSurveyActivity"};

    /* JADX WARN: Type inference failed for: r0v4, types: [bkgt, java.lang.Object] */
    private final void e() {
        asbo f;
        NotificationChannel c;
        int importance;
        try {
            bklc a2 = bklb.a();
            fixm fixmVar = ((bklb) a2).c;
            fixm fixmVar2 = ((bklb) a2).e;
            fixmVar.getClass();
            fixmVar2.getClass();
            bklm bklmVar = (bklm) fixmVar.a();
            bklmVar.getClass();
            ?? a3 = fixmVar2.a();
            fecj v = esnq.a.v();
            if (!v.b.L()) {
                v.U();
            }
            esnq esnqVar = (esnq) v.b;
            esnqVar.c = 1;
            esnqVar.b |= 1;
            int i = true != asbp.a(this).g() ? 2 : 3;
            if (!v.b.L()) {
                v.U();
            }
            esnq esnqVar2 = (esnq) v.b;
            esnqVar2.d = i - 1;
            esnqVar2.b |= 2;
            for (String str : fowr.a.a().e().b) {
                fecj v2 = esno.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                fecp fecpVar = v2.b;
                esno esnoVar = (esno) fecpVar;
                str.getClass();
                esnoVar.b |= 1;
                esnoVar.c = str;
                if (!fecpVar.L()) {
                    v2.U();
                }
                esno esnoVar2 = (esno) v2.b;
                esnoVar2.d = 0;
                esnoVar2.b |= 2;
                if (Build.VERSION.SDK_INT >= 26 && (f = asbo.f(this)) != null && (c = f.c(str)) != null) {
                    importance = c.getImportance();
                    if (importance < 2) {
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        esno esnoVar3 = (esno) v2.b;
                        esnoVar3.d = 1;
                        esnoVar3.b |= 2;
                    } else {
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        esno esnoVar4 = (esno) v2.b;
                        esnoVar4.d = 2;
                        esnoVar4.b |= 2;
                    }
                }
                esno esnoVar5 = (esno) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                esnq esnqVar3 = (esnq) v.b;
                esnoVar5.getClass();
                fedh fedhVar = esnqVar3.e;
                if (!fedhVar.c()) {
                    esnqVar3.e = fecp.E(fedhVar);
                }
                esnqVar3.e.add(esnoVar5);
            }
            Iterator it = a3.b().iterator();
            while (it.hasNext()) {
                bklmVar.d((String) it.next(), v);
            }
        } catch (RuntimeException e) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 5077)).x("Failed to log notification block state");
        }
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        String[] strArr = b;
        int length = strArr.length;
        for (int i = 0; i < 7; i++) {
            asng.K(strArr[i], true);
        }
        e();
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        bklb.a().e().a(this);
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        e();
    }
}
