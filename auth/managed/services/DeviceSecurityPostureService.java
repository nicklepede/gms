package com.google.android.gms.auth.managed.services;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.adrq;
import defpackage.aduc;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bsxe;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpa;
import defpackage.bzpx;
import defpackage.ektc;
import defpackage.eluo;
import defpackage.emdt;
import defpackage.emdw;
import defpackage.fgsa;
import defpackage.fnrw;
import defpackage.fxsu;
import defpackage.fxuv;
import defpackage.fxxm;
import defpackage.fyeb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class DeviceSecurityPostureService extends bzot {
    private static final ausn a = ausn.b("AuthManaged", auid.AUTH_MANAGED_DEVICE_POSTURE_SERVICE);

    public DeviceSecurityPostureService() {
        super(373, "com.google.android.gms.auth.managed.START_DEVICE_POSTURE_SERVICE", Collections.EMPTY_SET, 3, 10);
    }

    @Override // defpackage.bzot
    public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        ArrayList arrayList;
        List list;
        Signature[] apkContentsSigners;
        fxxm.f(getServiceRequest, "request");
        fnrw fnrwVar = fnrw.a;
        if (!fnrwVar.lK().c()) {
            bzozVar.a(21700, null);
            return;
        }
        fgsa<adrq> fgsaVar = fnrwVar.lK().b().b;
        fxxm.e(fgsaVar, "getAppInfosList(...)");
        if (!(fgsaVar instanceof Collection) || !fgsaVar.isEmpty()) {
            for (adrq adrqVar : fgsaVar) {
                if (fxxm.n(adrqVar.b, getServiceRequest.f)) {
                    String str = adrqVar.b;
                    fxxm.e(str, "getPackageName(...)");
                    SigningInfo signingInfo = Build.VERSION.SDK_INT >= 28 ? getApplicationContext().getPackageManager().getPackageInfo(str, 134217728).signingInfo : null;
                    if (signingInfo == null) {
                        list = fxsu.a;
                    } else {
                        hasMultipleSigners = signingInfo.hasMultipleSigners();
                        int i = 0;
                        if (hasMultipleSigners) {
                            apkContentsSigners = signingInfo.getApkContentsSigners();
                            fxxm.e(apkContentsSigners, "getApkContentsSigners(...)");
                            int length = apkContentsSigners.length;
                            arrayList = new ArrayList(length);
                            while (i < length) {
                                Signature signature = apkContentsSigners[i];
                                int i2 = emdw.b;
                                arrayList.add(emdt.a.a(signature.toByteArray()).toString());
                                i++;
                            }
                        } else {
                            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            fxxm.e(signingCertificateHistory, "getSigningCertificateHistory(...)");
                            int length2 = signingCertificateHistory.length;
                            arrayList = new ArrayList(length2);
                            while (i < length2) {
                                Signature signature2 = signingCertificateHistory[i];
                                int i3 = emdw.b;
                                arrayList.add(emdt.a.a(signature2.toByteArray()).toString());
                                i++;
                            }
                        }
                        list = arrayList;
                    }
                    if (list.contains(adrqVar.c)) {
                        Context applicationContext = getApplicationContext();
                        fxxm.e(applicationContext, "getApplicationContext(...)");
                        bzpa a2 = bzpx.a(this);
                        String str2 = getServiceRequest.f;
                        fxxm.e(str2, "getCallingPackage(...)");
                        String str3 = getServiceRequest.p;
                        fxuv fxuvVar = bsxe.a;
                        fyeb.b(bsxe.c);
                        bzozVar.c(new aduc(applicationContext, a2, ektc.a, str2, str3));
                        return;
                    }
                }
            }
        }
        ((eluo) a.j()).B("Package %s is not allowed to use DevicePosture API", getServiceRequest.f);
        bzozVar.a(21701, null);
    }
}
