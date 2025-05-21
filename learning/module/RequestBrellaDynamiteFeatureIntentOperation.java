package com.google.android.gms.learning.module;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.bqem;
import defpackage.bqex;
import defpackage.bqhj;
import defpackage.bqkp;
import defpackage.bqld;
import defpackage.bqlf;
import defpackage.dtgd;
import defpackage.elvp;
import defpackage.elvq;
import defpackage.elvs;
import defpackage.enre;
import defpackage.ensj;
import defpackage.fecj;
import defpackage.fecp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class RequestBrellaDynamiteFeatureIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        dtgd dtgdVar;
        long j;
        long j2;
        if (!"com.google.android.gms.learning.REQUEST_FULL_FEATURE".equals(intent.getAction())) {
            return;
        }
        bqld.a();
        dtgd b = dtgd.b(this);
        try {
            bqem bqemVar = (bqem) b.c(bqem.class);
            bqex bqexVar = (bqex) b.c(bqex.class);
            ModuleManager moduleManager = ModuleManager.get(this);
            String stringExtra = intent.getStringExtra("requester_package");
            bqkp bqkpVar = (bqkp) b.c(bqkp.class);
            b.d();
            ensj.t(bqkpVar.b(stringExtra), new bqlf(b, bqexVar), enre.a);
            bqhj bqhjVar = (bqhj) b.c(bqhj.class);
            if (bqemVar.N()) {
                long a = bqhjVar.a() / 1000000;
                Context context = bqhjVar.a;
                long totalSpace = context.getFilesDir().getTotalSpace() / 1000000;
                j = 0;
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager == null) {
                    j2 = 0;
                } else {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    j2 = memoryInfo.totalMem;
                }
                long j3 = j2 / 1000000;
                fecj v = elvs.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                elvs elvsVar = (elvs) fecpVar;
                dtgdVar = b;
                try {
                    elvsVar.b |= 1;
                    elvsVar.c = a;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    fecp fecpVar2 = v.b;
                    elvs elvsVar2 = (elvs) fecpVar2;
                    elvsVar2.b |= 4;
                    elvsVar2.e = totalSpace;
                    if (!fecpVar2.L()) {
                        v.U();
                    }
                    elvs elvsVar3 = (elvs) v.b;
                    elvsVar3.b |= 2;
                    elvsVar3.d = j3;
                    elvs elvsVar4 = (elvs) v.Q();
                    fecj v2 = elvp.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    elvp elvpVar = (elvp) v2.b;
                    elvsVar4.getClass();
                    elvpVar.g = elvsVar4;
                    elvpVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    if (stringExtra != null) {
                        fecj v3 = elvq.a.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        elvq elvqVar = (elvq) v3.b;
                        elvqVar.b |= 1;
                        elvqVar.c = stringExtra;
                        elvq elvqVar2 = (elvq) v3.Q();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        elvp elvpVar2 = (elvp) v2.b;
                        elvqVar2.getClass();
                        elvpVar2.c = elvqVar2;
                        elvpVar2.b |= 1;
                    }
                    bqexVar.a((elvp) v2.Q());
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    if (dtgdVar == null) {
                        throw th2;
                    }
                    try {
                        dtgdVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } else {
                dtgdVar = b;
                j = 0;
            }
            if (!intent.getBooleanExtra("module_loaded_successfully", false)) {
                if (bqemVar.P() || (stringExtra != null && bqemVar.R(stringExtra))) {
                    long f = bqemVar.f() * 1000;
                    if (f != j && stringExtra != null && bqemVar.F(stringExtra) && bqhjVar.a() < f) {
                        bqexVar.e(694, stringExtra);
                    }
                    ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
                    featureRequest.requestFeatureAtLatestVersion("brella_dynamite");
                    if (bqemVar.Q()) {
                        featureRequest.setUrgent();
                    }
                    if (moduleManager.requestFeatures(featureRequest)) {
                        bqexVar.e(700, stringExtra);
                    } else {
                        bqexVar.e(699, stringExtra);
                    }
                } else {
                    bqexVar.d(602, stringExtra);
                }
            }
            if (dtgdVar != null) {
                dtgdVar.close();
            }
        } catch (Throwable th4) {
            th = th4;
            dtgdVar = b;
        }
    }
}
