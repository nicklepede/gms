package com.google.android.gms.security.snet;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import defpackage.bzoz;
import defpackage.dajj;
import defpackage.dbhr;
import defpackage.dblk;
import defpackage.itn;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SafetyNetClientChimeraService extends dbhr {
    public static final Set a = new HashSet();

    public static void c(HarmfulAppsInfo harmfulAppsInfo) {
        Set set = a;
        set.clear();
        if (harmfulAppsInfo != null) {
            for (HarmfulAppsData harmfulAppsData : harmfulAppsInfo.b) {
                set.add(new itn(harmfulAppsData.a, new dajj(harmfulAppsData.b)));
            }
        }
    }

    @Override // defpackage.dbhr, defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new dblk(this, l(), getServiceRequest.f));
    }
}
