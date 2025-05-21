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
import defpackage.aoak;
import defpackage.aodx;
import defpackage.aqsz;
import defpackage.dmll;
import defpackage.dmln;
import defpackage.dmlq;
import defpackage.dmls;
import defpackage.eike;
import defpackage.eite;
import defpackage.eitj;
import defpackage.eitk;
import defpackage.eitl;
import defpackage.ejcb;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fedk;
import defpackage.feep;
import defpackage.fmpv;
import defpackage.oto;
import defpackage.ppt;
import defpackage.ppx;
import defpackage.pun;
import defpackage.rmu;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ModuleDependencyDownloadIntentOperation extends IntentOperation {
    static final Intent a = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");
    private static final String b = "ModuleDependencyDownloadIntentOperation";

    public static Intent a(Context context, byte[] bArr) {
        Intent startIntent = IntentOperation.getStartIntent(context, ModuleDependencyDownloadIntentOperation.class, "com.google.android.gms.chimera.container.MODULE_DEPENDENCY_REQUEST");
        eike.e(startIntent);
        startIntent.putExtra("request_bytes", bArr);
        startIntent.putExtra("initiate_download_if_available", true);
        return startIntent;
    }

    private final void b(String str, List list, int i) {
        rmu rmuVar;
        aodx e = aodx.e();
        String e2 = ppx.e(list);
        StringBuilder sb = new StringBuilder();
        sb.append(e2);
        sb.append(" ");
        int i2 = i - 1;
        sb.append(i2);
        e.b(this, 83, sb.toString());
        aqsz aqszVar = new aqsz();
        try {
            if (!bindService(a, aqszVar, 1)) {
                Log.e(b, "Unable to bind to Phonesky");
                return;
            }
            try {
                IBinder a2 = aqszVar.a();
                if (a2 == null) {
                    rmuVar = null;
                } else {
                    IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                    rmuVar = queryLocalInterface instanceof rmu ? (rmu) queryLocalInterface : new rmu(a2);
                }
                if (rmuVar == null) {
                    Log.e(b, "Unable to connect to Phonesky");
                } else {
                    Bundle bundle = new Bundle();
                    fecj v = dmlq.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar = v.b;
                    dmlq dmlqVar = (dmlq) fecpVar;
                    str.getClass();
                    dmlqVar.b = 1 | dmlqVar.b;
                    dmlqVar.c = str;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    dmlq dmlqVar2 = (dmlq) v.b;
                    dmlqVar2.d = i2;
                    dmlqVar2.b |= 2;
                    bundle.putByteArray("status_event_bytes", ((dmlq) v.Q()).r());
                    Parcel fr = rmuVar.fr();
                    oto.e(fr, bundle);
                    rmuVar.fu(5, fr);
                }
            } catch (RemoteException e3) {
                Log.e(b, "Unable to deliver App Module Dependency event. " + e3.getMessage());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } finally {
            try {
                unbindService(aqszVar);
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
            febw febwVar = febw.a;
            feep feepVar = feep.a;
            fecp y = fecp.y(dmln.a, byteArrayExtra, 0, byteArrayExtra.length, febw.a);
            fecp.M(y);
            dmln dmlnVar = (dmln) y;
            if (dmlnVar.b.isEmpty()) {
                Log.w(b, "Received request without package name.");
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("initiate_download_if_available", true);
            String str = dmlnVar.b;
            fedh<dmll> fedhVar = dmlnVar.c;
            eitk eitkVar = new eitk();
            for (dmll dmllVar : fedhVar) {
                dmls b2 = dmls.b(dmllVar.e);
                if (b2 == null) {
                    b2 = dmls.DEPENDENCY_TYPE_UNKNOWN;
                }
                fecj v = pun.a.v();
                String str2 = dmllVar.c;
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                pun punVar = (pun) fecpVar;
                str2.getClass();
                punVar.b |= 1;
                punVar.c = str2;
                long j = dmllVar.d;
                if (!fecpVar.L()) {
                    v.U();
                }
                pun punVar2 = (pun) v.b;
                punVar2.b = 2 | punVar2.b;
                punVar2.d = j;
                eitkVar.b(b2, (pun) v.Q());
            }
            eitl a2 = eitkVar.a();
            ModuleManager moduleManager = ModuleManager.get(this);
            dmls dmlsVar = dmls.DEPENDENCY_TYPE_OPTIONAL;
            if (!a2.a(dmlsVar).isEmpty()) {
                ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
                featureRequest.setRequesterAppPackage(ppt.e(str));
                eitj a3 = a2.a(dmlsVar);
                int size = a3.size();
                int i = 0;
                while (i < size) {
                    pun punVar3 = (pun) a3.get(i);
                    featureRequest.requestFeatureAtVersion(punVar3.c, punVar3.d);
                    i++;
                    dmlsVar = dmlsVar;
                }
                dmls dmlsVar2 = dmlsVar;
                if (!moduleManager.requestFeatures(featureRequest)) {
                    Log.e(b, "Failed to record optional module dependencies for features: ".concat(ppx.e(a2.a(dmlsVar2))));
                }
            }
            eite eiteVar = new eite();
            eiteVar.k(a2.a(dmls.DEPENDENCY_TYPE_REQUIRED));
            eiteVar.k(a2.a(dmls.DEPENDENCY_TYPE_PREFERRED));
            eitj g = eiteVar.g();
            if (g.isEmpty()) {
                return;
            }
            ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
            int i2 = ((ejcb) g).c;
            for (int i3 = 0; i3 < i2; i3++) {
                pun punVar4 = (pun) g.get(i3);
                featureCheck.checkFeatureAtVersion(punVar4.c, punVar4.d);
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
            featureRequest2.setRequesterAppPackage(ppt.e(str));
            for (int i4 = 0; i4 < i2; i4++) {
                pun punVar5 = (pun) g.get(i4);
                featureRequest2.requestFeatureAtVersion(punVar5.c, punVar5.d);
            }
            if (!booleanExtra) {
                if (moduleManager.requestFeatures(featureRequest2)) {
                    return;
                }
                Log.e(b, "Failed to record module dependencies: ".concat(ppx.e(g)));
                return;
            }
            aoak aoakVar = new aoak();
            featureRequest2.setUrgent(aoakVar);
            if (!moduleManager.requestFeatures(featureRequest2)) {
                b(str, g, 4);
                return;
            }
            b(str, g, 2);
            try {
                num = (Integer) aoakVar.a.poll(fmpv.a.a().a(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                num = null;
            }
            if (num == null) {
                aodx.e().b(this, 83, ppx.e(g).concat(" T"));
            } else if (num.intValue() == 0) {
                b(str, g, 3);
                return;
            }
            eitj a4 = a2.a(dmls.DEPENDENCY_TYPE_REQUIRED);
            int size2 = a4.size();
            boolean z = true;
            for (int i5 = 0; i5 < size2; i5++) {
                pun punVar6 = (pun) a4.get(i5);
                ModuleManager.FeatureCheck featureCheck2 = new ModuleManager.FeatureCheck();
                featureCheck2.checkFeatureAtVersion(punVar6.c, punVar6.d);
                z &= moduleManager.checkFeaturesAreAvailable(featureCheck2) == 0;
            }
            b(str, g, true != z ? 4 : 3);
        } catch (fedk e) {
            Log.e(b, "Unable to parse request proto: ".concat(String.valueOf(e.toString())));
        }
    }
}
