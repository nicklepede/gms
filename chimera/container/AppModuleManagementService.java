package com.google.android.gms.chimera.container;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aoha;
import defpackage.aohb;
import defpackage.bqon;
import defpackage.byln;
import defpackage.dmlh;
import defpackage.dmli;
import defpackage.dmlj;
import defpackage.dmlk;
import defpackage.dmll;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.feeq;
import defpackage.fmpv;
import defpackage.ppt;
import defpackage.pzx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AppModuleManagementService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final dmlk b;
    private aoha c;

    public AppModuleManagementService() {
        this(null);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        int i;
        boolean z;
        fecp Q;
        if (this.c == null) {
            this.c = new aoha(this);
        }
        aoha aohaVar = this.c;
        fedh fedhVar = this.b.b;
        ArrayList arrayList = new ArrayList();
        pzx pzxVar = new pzx(aohaVar.b);
        Iterator it = fedhVar.iterator();
        while (true) {
            i = 2;
            z = true;
            if (!it.hasNext()) {
                break;
            }
            dmlj dmljVar = (dmlj) it.next();
            String str = dmljVar.b;
            PackageInfo a2 = pzxVar.a(str);
            if (a2 != null) {
                int i2 = a2.versionCode;
                dmlh dmlhVar = (dmlh) dmli.a.v();
                if (!dmlhVar.b.L()) {
                    dmlhVar.U();
                }
                dmli dmliVar = (dmli) dmlhVar.b;
                str.getClass();
                dmliVar.b = 1 | dmliVar.b;
                dmliVar.c = str;
                long j = i2;
                if (!dmlhVar.b.L()) {
                    dmlhVar.U();
                }
                dmli dmliVar2 = (dmli) dmlhVar.b;
                dmliVar2.b = 2 | dmliVar2.b;
                dmliVar2.d = j;
                dmlhVar.a(dmljVar.c);
                arrayList.add((dmli) dmlhVar.Q());
            }
        }
        aoha aohaVar2 = this.c;
        ArrayList arrayList2 = new ArrayList();
        PackageManager packageManager = aohaVar2.b;
        pzx pzxVar2 = new pzx(packageManager);
        eitj eitjVar = aohaVar2.d;
        int i3 = ((ejcb) eitjVar).c;
        int i4 = 0;
        List<PackageInfo> list = null;
        while (i4 < i3) {
            aohb aohbVar = (aohb) eitjVar.get(i4);
            if (aohbVar.d() == z) {
                arrayList2.addAll(aohbVar.b(packageManager, pzxVar2));
            } else {
                if (list == null) {
                    list = packageManager.getInstalledPackages(128);
                }
                if (list != null) {
                    for (PackageInfo packageInfo : list) {
                        if (packageInfo != null) {
                            int i5 = i;
                            eitj a3 = aohbVar.a(packageInfo);
                            if (a3.isEmpty()) {
                                i = i5;
                            } else {
                                boolean z2 = z;
                                if (packageInfo.packageName != null) {
                                    dmlh dmlhVar2 = (dmlh) dmli.a.v();
                                    String str2 = packageInfo.packageName;
                                    if (!dmlhVar2.b.L()) {
                                        dmlhVar2.U();
                                    }
                                    dmli dmliVar3 = (dmli) dmlhVar2.b;
                                    str2.getClass();
                                    eitj eitjVar2 = eitjVar;
                                    dmliVar3.b |= 1;
                                    dmliVar3.c = str2;
                                    long j2 = packageInfo.versionCode;
                                    if (!dmlhVar2.b.L()) {
                                        dmlhVar2.U();
                                    }
                                    dmli dmliVar4 = (dmli) dmlhVar2.b;
                                    dmliVar4.b |= 2;
                                    dmliVar4.d = j2;
                                    dmlhVar2.a(a3);
                                    arrayList2.add((dmli) dmlhVar2.Q());
                                    i = i5;
                                    z = z2;
                                    eitjVar = eitjVar2;
                                } else {
                                    i = i5;
                                    z = z2;
                                }
                            }
                        }
                    }
                }
            }
            i4++;
            i = i;
            z = z;
            eitjVar = eitjVar;
        }
        int i6 = i;
        boolean z3 = z;
        ArrayList<dmli> arrayList3 = new ArrayList(arrayList);
        arrayList3.addAll(arrayList2);
        aoha aohaVar3 = this.c;
        Map a4 = bqon.a();
        for (dmli dmliVar5 : arrayList3) {
            String str3 = dmliVar5.c;
            dmli dmliVar6 = (dmli) a4.get(str3);
            if (dmliVar6 == null) {
                boolean h = aohaVar3.c.h(str3);
                fecj fecjVar = (fecj) dmliVar5.iB(5, null);
                fecjVar.X(dmliVar5);
                dmlh dmlhVar3 = (dmlh) fecjVar;
                if (!dmlhVar3.b.L()) {
                    dmlhVar3.U();
                }
                dmli dmliVar7 = (dmli) dmlhVar3.b;
                dmliVar7.b |= 4;
                dmliVar7.e = h;
                Q = dmlhVar3.Q();
            } else {
                fecj fecjVar2 = (fecj) dmliVar6.iB(5, null);
                fecjVar2.X(dmliVar6);
                dmlh dmlhVar4 = (dmlh) fecjVar2;
                dmlhVar4.a(dmliVar5.f);
                Q = dmlhVar4.Q();
            }
            a4.put(str3, (dmli) Q);
        }
        Map a5 = bqon.a();
        for (Map.Entry entry : a4.entrySet()) {
            Collection a6 = this.c.a((dmli) entry.getValue());
            String str4 = (String) entry.getKey();
            dmli dmliVar8 = (dmli) entry.getValue();
            fecj fecjVar3 = (fecj) dmliVar8.iB(5, null);
            fecjVar3.X(dmliVar8);
            dmlh dmlhVar5 = (dmlh) fecjVar3;
            if (!dmlhVar5.b.L()) {
                dmlhVar5.U();
            }
            dmli dmliVar9 = (dmli) dmlhVar5.b;
            dmli dmliVar10 = dmli.a;
            dmliVar9.f = feeq.a;
            dmlhVar5.a(a6);
            a5.put(str4, (dmli) dmlhVar5.Q());
        }
        boolean h2 = ppt.d().h(a5);
        boolean z4 = z3;
        for (dmli dmliVar11 : a5.values()) {
            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
            featureRequest.setRequesterAppPackage(ppt.e(dmliVar11.c));
            for (dmll dmllVar : dmliVar11.f) {
                featureRequest.requestFeatureAtVersion(dmllVar.c, dmllVar.d);
            }
            z4 &= ModuleManager.get(this).requestFeatures(featureRequest);
        }
        if (z4 && h2) {
            return 0;
        }
        return i6;
    }

    public AppModuleManagementService(aoha aohaVar) {
        this.b = fmpv.b();
        this.c = aohaVar;
    }
}
