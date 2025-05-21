package com.google.android.gms.auth.managed.services;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abrq;
import defpackage.abuc;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqpn;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgk;
import defpackage.bxhh;
import defpackage.eifw;
import defpackage.ejhf;
import defpackage.ejqk;
import defpackage.ejqn;
import defpackage.fedh;
import defpackage.flao;
import defpackage.fuww;
import defpackage.fuyx;
import defpackage.fvbo;
import defpackage.fvid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class DeviceSecurityPostureService extends bxgd {
    private static final asot a = asot.b("AuthManaged", asej.AUTH_MANAGED_DEVICE_POSTURE_SERVICE);

    public DeviceSecurityPostureService() {
        super(373, "com.google.android.gms.auth.managed.START_DEVICE_POSTURE_SERVICE", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bxgd
    public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        ArrayList arrayList;
        List list;
        Signature[] apkContentsSigners;
        fvbo.f(getServiceRequest, "request");
        if (!flao.a.a().c()) {
            bxgjVar.a(21700, null);
            return;
        }
        fedh<abrq> fedhVar = flao.a.a().b().b;
        fvbo.e(fedhVar, "getAppInfosList(...)");
        if (!(fedhVar instanceof Collection) || !fedhVar.isEmpty()) {
            for (abrq abrqVar : fedhVar) {
                if (fvbo.n(abrqVar.b, getServiceRequest.f)) {
                    String str = abrqVar.b;
                    fvbo.e(str, "getPackageName(...)");
                    SigningInfo signingInfo = Build.VERSION.SDK_INT >= 28 ? getApplicationContext().getPackageManager().getPackageInfo(str, 134217728).signingInfo : null;
                    if (signingInfo == null) {
                        list = fuww.a;
                    } else {
                        hasMultipleSigners = signingInfo.hasMultipleSigners();
                        int i = 0;
                        if (hasMultipleSigners) {
                            apkContentsSigners = signingInfo.getApkContentsSigners();
                            fvbo.e(apkContentsSigners, "getApkContentsSigners(...)");
                            int length = apkContentsSigners.length;
                            arrayList = new ArrayList(length);
                            while (i < length) {
                                Signature signature = apkContentsSigners[i];
                                int i2 = ejqn.b;
                                arrayList.add(ejqk.a.a(signature.toByteArray()).toString());
                                i++;
                            }
                        } else {
                            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            fvbo.e(signingCertificateHistory, "getSigningCertificateHistory(...)");
                            int length2 = signingCertificateHistory.length;
                            arrayList = new ArrayList(length2);
                            while (i < length2) {
                                Signature signature2 = signingCertificateHistory[i];
                                int i3 = ejqn.b;
                                arrayList.add(ejqk.a.a(signature2.toByteArray()).toString());
                                i++;
                            }
                        }
                        list = arrayList;
                    }
                    if (list.contains(abrqVar.c)) {
                        Context applicationContext = getApplicationContext();
                        fvbo.e(applicationContext, "getApplicationContext(...)");
                        bxgk a2 = bxhh.a(this);
                        String str2 = getServiceRequest.f;
                        fvbo.e(str2, "getCallingPackage(...)");
                        String str3 = getServiceRequest.p;
                        fuyx fuyxVar = bqpn.a;
                        fvid.b(bqpn.c);
                        bxgjVar.c(new abuc(applicationContext, a2, eifw.a, str2, str3));
                        return;
                    }
                }
            }
        }
        ((ejhf) a.j()).B("Package %s is not allowed to use DevicePosture API", getServiceRequest.f);
        bxgjVar.a(21701, null);
    }
}
