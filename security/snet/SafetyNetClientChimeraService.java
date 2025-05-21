package com.google.android.gms.security.snet;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import defpackage.bxgj;
import defpackage.cxzm;
import defpackage.cyxt;
import defpackage.czbm;
import defpackage.irx;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SafetyNetClientChimeraService extends cyxt {
    public static final Set a = new HashSet();

    public static void c(HarmfulAppsInfo harmfulAppsInfo) {
        Set set = a;
        set.clear();
        if (harmfulAppsInfo != null) {
            for (HarmfulAppsData harmfulAppsData : harmfulAppsInfo.b) {
                set.add(new irx(harmfulAppsData.a, new cxzm(harmfulAppsData.b)));
            }
        }
    }

    @Override // defpackage.cyxt, defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new czbm(this, l(), getServiceRequest.f));
    }
}
