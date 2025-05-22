package com.google.android.gms.growth.init;

import android.app.NotificationChannel;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.growth.featuredrops.activity.FeatureDropsChimeraActivity;
import com.google.android.gms.growth.featuredrops.activity.FeatureDropsProofingChimeraActivity;
import com.google.android.gms.growth.notifications.NotificationActionChimeraActivity;
import com.google.android.gms.growth.ui.GrowthDebugChimeraActivity;
import com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity;
import defpackage.apzs;
import defpackage.aued;
import defpackage.auee;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bmrr;
import defpackage.bmrs;
import defpackage.bmsc;
import defpackage.eluo;
import defpackage.evdb;
import defpackage.evdd;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.flnj;
import defpackage.frpu;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ModuleInitializer extends apzs {
    private static final ausn a = ausn.e(auid.GROWTH);
    private static final String[] b = {GrowthDebugChimeraActivity.j, GrowthWebViewChimeraActivity.j, FeatureDropsChimeraActivity.p, FeatureDropsProofingChimeraActivity.p, NotificationActionChimeraActivity.j, "com.google.android.gms.growth.notifications.GcmBroadcastReceiver", "com.google.android.gms.growth.surveys.activity.GmsSurveyActivity"};

    /* JADX WARN: Type inference failed for: r0v4, types: [bmnj, java.lang.Object] */
    private final void e() {
        aued f;
        NotificationChannel c;
        int importance;
        try {
            bmrs a2 = bmrr.a();
            flnj flnjVar = ((bmrr) a2).c;
            flnj flnjVar2 = ((bmrr) a2).e;
            flnjVar.getClass();
            flnjVar2.getClass();
            bmsc bmscVar = (bmsc) flnjVar.a();
            bmscVar.getClass();
            ?? a3 = flnjVar2.a();
            fgrc v = evdd.a.v();
            if (!v.b.L()) {
                v.U();
            }
            evdd evddVar = (evdd) v.b;
            evddVar.c = 1;
            evddVar.b |= 1;
            int i = true != auee.a(this).f() ? 2 : 3;
            if (!v.b.L()) {
                v.U();
            }
            evdd evddVar2 = (evdd) v.b;
            evddVar2.d = i - 1;
            evddVar2.b |= 2;
            for (String str : frpu.a.lK().e().b) {
                fgrc v2 = evdb.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                fgri fgriVar = v2.b;
                evdb evdbVar = (evdb) fgriVar;
                str.getClass();
                evdbVar.b |= 1;
                evdbVar.c = str;
                if (!fgriVar.L()) {
                    v2.U();
                }
                evdb evdbVar2 = (evdb) v2.b;
                evdbVar2.d = 0;
                evdbVar2.b |= 2;
                if (Build.VERSION.SDK_INT >= 26 && (f = aued.f(this)) != null && (c = f.c(str)) != null) {
                    importance = c.getImportance();
                    if (importance < 2) {
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        evdb evdbVar3 = (evdb) v2.b;
                        evdbVar3.d = 1;
                        evdbVar3.b |= 2;
                    } else {
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        evdb evdbVar4 = (evdb) v2.b;
                        evdbVar4.d = 2;
                        evdbVar4.b |= 2;
                    }
                }
                evdb evdbVar5 = (evdb) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                evdd evddVar3 = (evdd) v.b;
                evdbVar5.getClass();
                fgsa fgsaVar = evddVar3.e;
                if (!fgsaVar.c()) {
                    evddVar3.e = fgri.E(fgsaVar);
                }
                evddVar3.e.add(evdbVar5);
            }
            Iterator it = a3.b().iterator();
            while (it.hasNext()) {
                bmscVar.d((String) it.next(), v);
            }
        } catch (RuntimeException e) {
            ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 5090)).x("Failed to log notification block state");
        }
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        String[] strArr = b;
        int length = strArr.length;
        for (int i = 0; i < 7; i++) {
            aura.K(strArr[i], true);
        }
        e();
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        bmrr.a().e().a(this);
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        e();
    }
}
