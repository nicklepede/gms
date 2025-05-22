package com.google.android.gms.chimera.container;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aqit;
import defpackage.aqiu;
import defpackage.bswd;
import defpackage.cauf;
import defpackage.dowv;
import defpackage.doww;
import defpackage.dowx;
import defpackage.dowy;
import defpackage.dowz;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fgtj;
import defpackage.fpht;
import defpackage.rix;
import defpackage.rtb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AppModuleManagementService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private final dowy b;
    private aqit c;

    public AppModuleManagementService() {
        this(null);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        int i;
        boolean z;
        fgri Q;
        if (this.c == null) {
            this.c = new aqit(this);
        }
        aqit aqitVar = this.c;
        fgsa fgsaVar = this.b.b;
        ArrayList arrayList = new ArrayList();
        rtb rtbVar = new rtb(aqitVar.b);
        Iterator it = fgsaVar.iterator();
        while (true) {
            i = 2;
            z = true;
            if (!it.hasNext()) {
                break;
            }
            dowx dowxVar = (dowx) it.next();
            String str = dowxVar.b;
            PackageInfo a2 = rtbVar.a(str);
            if (a2 != null) {
                int i2 = a2.versionCode;
                dowv dowvVar = (dowv) doww.a.v();
                if (!dowvVar.b.L()) {
                    dowvVar.U();
                }
                doww dowwVar = (doww) dowvVar.b;
                str.getClass();
                dowwVar.b = 1 | dowwVar.b;
                dowwVar.c = str;
                long j = i2;
                if (!dowvVar.b.L()) {
                    dowvVar.U();
                }
                doww dowwVar2 = (doww) dowvVar.b;
                dowwVar2.b = 2 | dowwVar2.b;
                dowwVar2.d = j;
                dowvVar.a(dowxVar.c);
                arrayList.add((doww) dowvVar.Q());
            }
        }
        aqit aqitVar2 = this.c;
        ArrayList arrayList2 = new ArrayList();
        PackageManager packageManager = aqitVar2.b;
        rtb rtbVar2 = new rtb(packageManager);
        elgo elgoVar = aqitVar2.d;
        int i3 = ((elpg) elgoVar).c;
        int i4 = 0;
        List<PackageInfo> list = null;
        while (i4 < i3) {
            aqiu aqiuVar = (aqiu) elgoVar.get(i4);
            if (aqiuVar.d() == z) {
                arrayList2.addAll(aqiuVar.b(packageManager, rtbVar2));
            } else {
                if (list == null) {
                    list = packageManager.getInstalledPackages(128);
                }
                if (list != null) {
                    for (PackageInfo packageInfo : list) {
                        if (packageInfo != null) {
                            int i5 = i;
                            elgo a3 = aqiuVar.a(packageInfo);
                            if (a3.isEmpty()) {
                                i = i5;
                            } else {
                                boolean z2 = z;
                                if (packageInfo.packageName != null) {
                                    dowv dowvVar2 = (dowv) doww.a.v();
                                    String str2 = packageInfo.packageName;
                                    if (!dowvVar2.b.L()) {
                                        dowvVar2.U();
                                    }
                                    doww dowwVar3 = (doww) dowvVar2.b;
                                    str2.getClass();
                                    elgo elgoVar2 = elgoVar;
                                    dowwVar3.b |= 1;
                                    dowwVar3.c = str2;
                                    long j2 = packageInfo.versionCode;
                                    if (!dowvVar2.b.L()) {
                                        dowvVar2.U();
                                    }
                                    doww dowwVar4 = (doww) dowvVar2.b;
                                    dowwVar4.b |= 2;
                                    dowwVar4.d = j2;
                                    dowvVar2.a(a3);
                                    arrayList2.add((doww) dowvVar2.Q());
                                    i = i5;
                                    z = z2;
                                    elgoVar = elgoVar2;
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
            elgoVar = elgoVar;
        }
        int i6 = i;
        boolean z3 = z;
        ArrayList<doww> arrayList3 = new ArrayList(arrayList);
        arrayList3.addAll(arrayList2);
        aqit aqitVar3 = this.c;
        Map a4 = bswd.a();
        for (doww dowwVar5 : arrayList3) {
            String str3 = dowwVar5.c;
            doww dowwVar6 = (doww) a4.get(str3);
            if (dowwVar6 == null) {
                boolean h = aqitVar3.c.h(str3);
                fgrc fgrcVar = (fgrc) dowwVar5.iQ(5, null);
                fgrcVar.X(dowwVar5);
                dowv dowvVar3 = (dowv) fgrcVar;
                if (!dowvVar3.b.L()) {
                    dowvVar3.U();
                }
                doww dowwVar7 = (doww) dowvVar3.b;
                dowwVar7.b |= 4;
                dowwVar7.e = h;
                Q = dowvVar3.Q();
            } else {
                fgrc fgrcVar2 = (fgrc) dowwVar6.iQ(5, null);
                fgrcVar2.X(dowwVar6);
                dowv dowvVar4 = (dowv) fgrcVar2;
                dowvVar4.a(dowwVar5.f);
                Q = dowvVar4.Q();
            }
            a4.put(str3, (doww) Q);
        }
        Map a5 = bswd.a();
        for (Map.Entry entry : a4.entrySet()) {
            Collection a6 = this.c.a((doww) entry.getValue());
            String str4 = (String) entry.getKey();
            doww dowwVar8 = (doww) entry.getValue();
            fgrc fgrcVar3 = (fgrc) dowwVar8.iQ(5, null);
            fgrcVar3.X(dowwVar8);
            dowv dowvVar5 = (dowv) fgrcVar3;
            if (!dowvVar5.b.L()) {
                dowvVar5.U();
            }
            doww dowwVar9 = (doww) dowvVar5.b;
            doww dowwVar10 = doww.a;
            dowwVar9.f = fgtj.a;
            dowvVar5.a(a6);
            a5.put(str4, (doww) dowvVar5.Q());
        }
        boolean h2 = rix.d().h(a5);
        boolean z4 = z3;
        for (doww dowwVar11 : a5.values()) {
            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
            featureRequest.setRequesterAppPackage(rix.e(dowwVar11.c));
            for (dowz dowzVar : dowwVar11.f) {
                featureRequest.requestFeatureAtVersion(dowzVar.c, dowzVar.d);
            }
            z4 &= ModuleManager.get(this).requestFeatures(featureRequest);
        }
        if (z4 && h2) {
            return 0;
        }
        return i6;
    }

    public AppModuleManagementService(aqit aqitVar) {
        this.b = fpht.b();
        this.c = aqitVar;
    }
}
