package com.google.android.gms.learning.module;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.bsmc;
import defpackage.bsmn;
import defpackage.bsoy;
import defpackage.bsse;
import defpackage.bsss;
import defpackage.bssu;
import defpackage.dvql;
import defpackage.eojd;
import defpackage.eoje;
import defpackage.eojg;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.fgrc;
import defpackage.fgri;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class RequestBrellaDynamiteFeatureIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        dvql dvqlVar;
        long j;
        long j2;
        if (!"com.google.android.gms.learning.REQUEST_FULL_FEATURE".equals(intent.getAction())) {
            return;
        }
        bsss.a();
        dvql b = dvql.b(this);
        try {
            bsmc bsmcVar = (bsmc) b.c(bsmc.class);
            bsmn bsmnVar = (bsmn) b.c(bsmn.class);
            ModuleManager moduleManager = ModuleManager.get(this);
            String stringExtra = intent.getStringExtra("requester_package");
            bsse bsseVar = (bsse) b.c(bsse.class);
            b.d();
            eqgc.t(bsseVar.b(stringExtra), new bssu(b, bsmnVar), eqex.a);
            bsoy bsoyVar = (bsoy) b.c(bsoy.class);
            if (bsmcVar.N()) {
                long a = bsoyVar.a() / 1000000;
                Context context = bsoyVar.a;
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
                fgrc v = eojg.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                eojg eojgVar = (eojg) fgriVar;
                dvqlVar = b;
                try {
                    eojgVar.b |= 1;
                    eojgVar.c = a;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    fgri fgriVar2 = v.b;
                    eojg eojgVar2 = (eojg) fgriVar2;
                    eojgVar2.b |= 4;
                    eojgVar2.e = totalSpace;
                    if (!fgriVar2.L()) {
                        v.U();
                    }
                    eojg eojgVar3 = (eojg) v.b;
                    eojgVar3.b |= 2;
                    eojgVar3.d = j3;
                    eojg eojgVar4 = (eojg) v.Q();
                    fgrc v2 = eojd.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    eojd eojdVar = (eojd) v2.b;
                    eojgVar4.getClass();
                    eojdVar.g = eojgVar4;
                    eojdVar.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    if (stringExtra != null) {
                        fgrc v3 = eoje.a.v();
                        if (!v3.b.L()) {
                            v3.U();
                        }
                        eoje eojeVar = (eoje) v3.b;
                        eojeVar.b |= 1;
                        eojeVar.c = stringExtra;
                        eoje eojeVar2 = (eoje) v3.Q();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        eojd eojdVar2 = (eojd) v2.b;
                        eojeVar2.getClass();
                        eojdVar2.c = eojeVar2;
                        eojdVar2.b |= 1;
                    }
                    bsmnVar.a((eojd) v2.Q());
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    if (dvqlVar == null) {
                        throw th2;
                    }
                    try {
                        dvqlVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } else {
                dvqlVar = b;
                j = 0;
            }
            if (!intent.getBooleanExtra("module_loaded_successfully", false)) {
                if (bsmcVar.P() || (stringExtra != null && bsmcVar.R(stringExtra))) {
                    long f = bsmcVar.f() * 1000;
                    if (f != j && stringExtra != null && bsmcVar.F(stringExtra) && bsoyVar.a() < f) {
                        bsmnVar.e(694, stringExtra);
                    }
                    ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
                    featureRequest.requestFeatureAtLatestVersion("brella_dynamite");
                    if (bsmcVar.Q()) {
                        featureRequest.setUrgent();
                    }
                    if (moduleManager.requestFeatures(featureRequest)) {
                        bsmnVar.e(700, stringExtra);
                    } else {
                        bsmnVar.e(699, stringExtra);
                    }
                } else {
                    bsmnVar.d(602, stringExtra);
                }
            }
            if (dvqlVar != null) {
                dvqlVar.close();
            }
        } catch (Throwable th4) {
            th = th4;
            dvqlVar = b;
        }
    }
}
