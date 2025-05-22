package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import defpackage.a;
import defpackage.aqcc;
import defpackage.aqfq;
import defpackage.asvp;
import defpackage.dowz;
import defpackage.doxb;
import defpackage.doxe;
import defpackage.doxg;
import defpackage.ekxj;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elgp;
import defpackage.elgq;
import defpackage.elpg;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fpht;
import defpackage.qmr;
import defpackage.rix;
import defpackage.rjb;
import defpackage.rnr;
import defpackage.tfy;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ModuleDependencyDownloadIntentOperation extends IntentOperation {
    static final Intent a = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");
    private static final String b = "ModuleDependencyDownloadIntentOperation";

    public static Intent a(Context context, byte[] bArr) {
        Intent startIntent = IntentOperation.getStartIntent(context, ModuleDependencyDownloadIntentOperation.class, "com.google.android.gms.chimera.container.MODULE_DEPENDENCY_REQUEST");
        ekxj.e(startIntent);
        startIntent.putExtra("request_bytes", bArr);
        startIntent.putExtra("initiate_download_if_available", true);
        return startIntent;
    }

    private final void b(String str, List list, int i) {
        tfy tfyVar;
        aqfq e = aqfq.e();
        String e2 = rjb.e(list);
        StringBuilder sb = new StringBuilder();
        sb.append(e2);
        sb.append(" ");
        int i2 = i - 1;
        sb.append(i2);
        e.b(this, 83, sb.toString());
        asvp asvpVar = new asvp();
        try {
            if (!bindService(a, asvpVar, 1)) {
                Log.e(b, "Unable to bind to Phonesky");
                return;
            }
            try {
                IBinder a2 = asvpVar.a();
                if (a2 == null) {
                    tfyVar = null;
                } else {
                    IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                    tfyVar = queryLocalInterface instanceof tfy ? (tfy) queryLocalInterface : new tfy(a2);
                }
                if (tfyVar == null) {
                    Log.e(b, "Unable to connect to Phonesky");
                } else {
                    Bundle bundle = new Bundle();
                    fgrc v = doxe.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar = v.b;
                    doxe doxeVar = (doxe) fgriVar;
                    str.getClass();
                    doxeVar.b = 1 | doxeVar.b;
                    doxeVar.c = str;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    doxe doxeVar2 = (doxe) v.b;
                    doxeVar2.d = i2;
                    doxeVar2.b |= 2;
                    bundle.putByteArray("status_event_bytes", ((doxe) v.Q()).r());
                    Parcel fE = tfyVar.fE();
                    qmr.e(fE, bundle);
                    tfyVar.fH(5, fE);
                }
            } catch (RemoteException e3) {
                Log.e(b, "Unable to deliver App Module Dependency event. " + e3.getMessage());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } finally {
            try {
                unbindService(asvpVar);
            } catch (IllegalStateException unused2) {
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Integer num;
        byte[] byteArrayExtra = intent.getByteArrayExtra("request_bytes");
        if (byteArrayExtra == null) {
            Log.e(b, "Missing extra: request_bytes");
            return;
        }
        try {
            fgqp fgqpVar = fgqp.a;
            fgti fgtiVar = fgti.a;
            fgri y = fgri.y(doxb.a, byteArrayExtra, 0, byteArrayExtra.length, fgqp.a);
            fgri.M(y);
            doxb doxbVar = (doxb) y;
            if (doxbVar.b.isEmpty()) {
                Log.w(b, "Received request without package name.");
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("initiate_download_if_available", true);
            String str = doxbVar.b;
            fgsa<dowz> fgsaVar = doxbVar.c;
            elgp elgpVar = new elgp();
            for (dowz dowzVar : fgsaVar) {
                doxg b2 = doxg.b(dowzVar.e);
                if (b2 == null) {
                    b2 = doxg.DEPENDENCY_TYPE_UNKNOWN;
                }
                fgrc v = rnr.a.v();
                String str2 = dowzVar.c;
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                rnr rnrVar = (rnr) fgriVar;
                str2.getClass();
                rnrVar.b |= 1;
                rnrVar.c = str2;
                long j = dowzVar.d;
                if (!fgriVar.L()) {
                    v.U();
                }
                rnr rnrVar2 = (rnr) v.b;
                rnrVar2.b = 2 | rnrVar2.b;
                rnrVar2.d = j;
                elgpVar.b(b2, (rnr) v.Q());
            }
            elgq a2 = elgpVar.a();
            ModuleManager moduleManager = ModuleManager.get(this);
            doxg doxgVar = doxg.DEPENDENCY_TYPE_OPTIONAL;
            if (!a2.a(doxgVar).isEmpty()) {
                ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
                featureRequest.setRequesterAppPackage(rix.e(str));
                elgo a3 = a2.a(doxgVar);
                int size = a3.size();
                int i = 0;
                while (i < size) {
                    rnr rnrVar3 = (rnr) a3.get(i);
                    featureRequest.requestFeatureAtVersion(rnrVar3.c, rnrVar3.d);
                    i++;
                    doxgVar = doxgVar;
                }
                doxg doxgVar2 = doxgVar;
                if (!moduleManager.requestFeatures(featureRequest)) {
                    Log.e(b, "Failed to record optional module dependencies for features: ".concat(rjb.e(a2.a(doxgVar2))));
                }
            }
            elgj elgjVar = new elgj();
            elgjVar.k(a2.a(doxg.DEPENDENCY_TYPE_REQUIRED));
            elgjVar.k(a2.a(doxg.DEPENDENCY_TYPE_PREFERRED));
            elgo g = elgjVar.g();
            if (g.isEmpty()) {
                return;
            }
            ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
            int i2 = ((elpg) g).c;
            for (int i3 = 0; i3 < i2; i3++) {
                rnr rnrVar4 = (rnr) g.get(i3);
                featureCheck.checkFeatureAtVersion(rnrVar4.c, rnrVar4.d);
            }
            int checkFeaturesAreAvailable = moduleManager.checkFeaturesAreAvailable(featureCheck);
            if (checkFeaturesAreAvailable == 0) {
                if (booleanExtra) {
                    b(str, g, 3);
                    return;
                }
                checkFeaturesAreAvailable = 0;
            }
            if (checkFeaturesAreAvailable == 3 || checkFeaturesAreAvailable == 1) {
                Log.e(b, a.j(checkFeaturesAreAvailable, "The module dependencies cannot be satisfied: "));
                b(str, g, 5);
                return;
            }
            ModuleManager.FeatureRequest featureRequest2 = new ModuleManager.FeatureRequest();
            featureRequest2.setRequesterAppPackage(rix.e(str));
            for (int i4 = 0; i4 < i2; i4++) {
                rnr rnrVar5 = (rnr) g.get(i4);
                featureRequest2.requestFeatureAtVersion(rnrVar5.c, rnrVar5.d);
            }
            if (!booleanExtra) {
                if (moduleManager.requestFeatures(featureRequest2)) {
                    return;
                }
                Log.e(b, "Failed to record module dependencies: ".concat(rjb.e(g)));
                return;
            }
            aqcc aqccVar = new aqcc();
            featureRequest2.setUrgent(aqccVar);
            if (!moduleManager.requestFeatures(featureRequest2)) {
                b(str, g, 4);
                return;
            }
            b(str, g, 2);
            try {
                num = (Integer) aqccVar.a.poll(fpht.a.lK().a(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                num = null;
            }
            if (num == null) {
                aqfq.e().b(this, 83, rjb.e(g).concat(" T"));
            } else if (num.intValue() == 0) {
                b(str, g, 3);
                return;
            }
            elgo a4 = a2.a(doxg.DEPENDENCY_TYPE_REQUIRED);
            int size2 = a4.size();
            boolean z = true;
            for (int i5 = 0; i5 < size2; i5++) {
                rnr rnrVar6 = (rnr) a4.get(i5);
                ModuleManager.FeatureCheck featureCheck2 = new ModuleManager.FeatureCheck();
                featureCheck2.checkFeatureAtVersion(rnrVar6.c, rnrVar6.d);
                z &= moduleManager.checkFeaturesAreAvailable(featureCheck2) == 0;
            }
            b(str, g, true != z ? 4 : 3);
        } catch (fgsd e) {
            Log.e(b, "Unable to parse request proto: ".concat(String.valueOf(e.toString())));
        }
    }
}
