package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import defpackage.aszs;
import defpackage.aszt;
import defpackage.atpt;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bjjz;
import defpackage.bjka;
import defpackage.bsk;
import defpackage.bsl;
import defpackage.bswd;
import defpackage.cyjh;
import defpackage.cyki;
import defpackage.dhmr;
import defpackage.elkk;
import defpackage.elqm;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgti;
import defpackage.ric;
import defpackage.ril;
import defpackage.rpf;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class TestSetupIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("TestIntentOp", auid.CONTAINER);

    private static void a(String str) {
        Log.i("TestIntentOp", str);
    }

    private static void b(Context context, boolean z) {
        byte b = true != z ? (byte) 48 : (byte) 49;
        File b2 = ric.b(context);
        ric.a(new byte[]{b}, new File(b2, ".tmp-.config_updated"), new File(b2, ".config_updated"), true);
    }

    private final boolean c(int i, long j, long j2, Set set) {
        Intent startIntent;
        for (int i2 = 0; i2 < i && SystemClock.elapsedRealtime() < j2; i2++) {
            if (i2 > 0) {
                SystemClock.sleep(j);
            }
            a("TEST SETUP (Phenotype): " + i2 + " of " + i + " - " + TimeUnit.MILLISECONDS.toSeconds(j2 - SystemClock.elapsedRealtime()));
            bsl bslVar = (bsl) set;
            ArrayList e = elkk.e(bslVar.c);
            aszs aszsVar = cyjh.a;
            cyki cykiVar = new cyki(this);
            bsk bskVar = new bsk(bslVar);
            while (bskVar.hasNext()) {
                e.add(cykiVar.k((String) bskVar.next()));
            }
            try {
                dhmr.o(dhmr.i(e), 30L, TimeUnit.SECONDS);
                return true;
            } catch (InterruptedException e2) {
                e = e2;
                ((eluo) ((eluo) a.i()).s(e)).B("Something went wrong when getting P/H config:%s", e);
            } catch (ExecutionException e3) {
                ((eluo) a.i()).B("Failed to get P/H config from required packages: %s", e3.getMessage());
                Throwable cause = e3.getCause();
                if ((cause instanceof aszt) && ((aszt) cause).a() == 29503 && (startIntent = IntentOperation.getStartIntent(this, "com.google.android.gms.common.config.PhenotypeRegistrationOperation", "com.google.android.chimera.MODULE_CONFIGURATION_CHANGED")) != null) {
                    startService(startIntent);
                }
            } catch (TimeoutException e4) {
                e = e4;
                ((eluo) ((eluo) a.i()).s(e)).B("Something went wrong when getting P/H config:%s", e);
            }
        }
        return false;
    }

    private final boolean d(Set set, Set set2, Set set3) {
        int length;
        set2.add("com.google.android.gms");
        if (set.isEmpty()) {
            return true;
        }
        try {
            Collection<ModuleManager.ModuleInfo> allModules = ModuleManager.get(this).getAllModules();
            Set c = bswd.c();
            Iterator it = allModules.iterator();
            while (it.hasNext()) {
                c.add(((ModuleManager.ModuleInfo) it.next()).moduleApk.apkPackageName);
            }
            if (!c.containsAll(set)) {
                set3.addAll(elqm.d(set, c));
                return false;
            }
            for (ModuleManager.ModuleInfo moduleInfo : allModules) {
                byte[] byteArray = moduleInfo.getMetadata(this).getByteArray("com.google.android.gms.phenotype.registration.proto");
                if (byteArray != null && (length = byteArray.length) > 0) {
                    fgqp fgqpVar = fgqp.a;
                    fgti fgtiVar = fgti.a;
                    fgri y = fgri.y(bjka.a, byteArray, 0, length, fgqp.a);
                    fgri.M(y);
                    for (bjjz bjjzVar : ((bjka) y).b) {
                        String b = atpt.b(this, bjjzVar);
                        if (bjjzVar.g) {
                            String str = moduleInfo.moduleId;
                            String str2 = moduleInfo.moduleApk.apkPackageName;
                        } else {
                            String str3 = moduleInfo.moduleId;
                            String str4 = moduleInfo.moduleApk.apkPackageName;
                            set2.add(b);
                        }
                    }
                }
            }
            return true;
        } catch (InvalidConfigException e) {
            ((eluo) ((eluo) a.i()).s(e)).B("Unable to get Chimera module info collection:%s", e);
            return false;
        }
    }

    private static final boolean e() {
        return rpf.d(ril.f().a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f1, code lost:
    
        if (defpackage.dpya.i(r25) == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0190  */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.TestSetupIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
