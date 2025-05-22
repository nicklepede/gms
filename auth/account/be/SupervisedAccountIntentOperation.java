package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.auqx;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bsl;
import defpackage.dxyi;
import defpackage.ekvk;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.fncx;
import defpackage.fxxm;
import defpackage.wkg;
import defpackage.wzw;
import defpackage.xbw;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SupervisedAccountIntentOperation extends IntentOperation {
    private final void a() {
        dxyi dxyiVar = xbw.a;
        Boolean bool = true;
        bool.getClass();
        ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
        featureRequest.requestFeatureAtAnyVersion("kids");
        Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] Requesting feature: kids...", new Object[0]));
        ModuleManager.get(this).requestFeatures(featureRequest);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        Set set;
        fncx fncxVar = fncx.a;
        if (fncxVar.lK().i()) {
            ausn ausnVar = wzw.a;
            fxxm.f(intent, "intent");
            String action = intent.getAction();
            ausn ausnVar2 = wzw.a;
            ((eluo) ausnVar2.h()).B("onHandleIntent: %s", action);
            if (action == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int hashCode = action.hashCode();
            if (hashCode != 438946629) {
                if (hashCode != 798292259) {
                    if (hashCode != 898290403 || !action.equals("com.google.android.gms.auth.ACCOUNT_SERVICES_CHANGED")) {
                        return;
                    }
                } else if (!action.equals("android.intent.action.BOOT_COMPLETED")) {
                    return;
                }
            } else if (!action.equals("com.google.android.gms.chimera.container.CONTAINER_UPDATED")) {
                return;
            }
            Context a = AppContextProvider.a();
            if (fncxVar.lK().f()) {
                fxxm.c(a);
                if (wzw.b(a) || (fncxVar.lK().g() && wzw.c(a))) {
                    Object systemService = a.getSystemService("device_policy");
                    fxxm.d(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
                    if (!((DevicePolicyManager) systemService).isProfileOwnerApp("com.google.android.gms.supervision")) {
                        wzw.a(a, wzw.d(a, action));
                    }
                }
            } else {
                fxxm.c(a);
                if (wzw.b(a) && !wzw.c(a)) {
                    wzw.a(a, wzw.d(a, action));
                }
            }
            Context a2 = AppContextProvider.a();
            if (fncxVar.lK().b()) {
                fxxm.c(a2);
                if (wzw.b(a2)) {
                    try {
                        aura.I(a2, new ComponentName("com.google.android.gms.supervision", "com.google.android.gms.chimera.GmsIntentOperationService"), 1);
                        ((eluo) ausnVar2.h()).x("Separate APK's IntentOperations enabled");
                        return;
                    } catch (IllegalArgumentException e) {
                        ((eluo) ((eluo) wzw.a.h()).s(e)).x("System Parental Controls: IntentOperationService component not found.");
                        return;
                    }
                }
                return;
            }
            return;
        }
        String action2 = intent.getAction();
        Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] onHandleIntent(): ".concat(String.valueOf(action2)), new Object[0]));
        fncx fncxVar2 = fncx.a;
        if (fncxVar2.lK().e()) {
            getApplicationContext();
            getApplicationContext();
        }
        dxyi dxyiVar = xbw.a;
        if (!fncxVar2.lK().c()) {
            Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] This operation is disabled", new Object[0]));
            return;
        }
        ekvl.y(action2);
        int hashCode2 = action2.hashCode();
        if (hashCode2 != 438946629) {
            if (hashCode2 == 1544582882 && action2.equals("android.intent.action.PACKAGE_ADDED")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action2.equals("com.google.android.gms.chimera.container.CONTAINER_UPDATED")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c == 1) {
                Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] onContainerUpdated", new Object[0]));
                if (fncxVar2.lK().d()) {
                    for (Account account : auqx.h(this, getPackageName())) {
                        try {
                            wkg.k(this, wkg.h(this, account, "ac2dm", Bundle.EMPTY));
                            wkg.h(this, account, "ac2dm", Bundle.EMPTY);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] Skipping token refresh", new Object[0]));
                }
            }
            if (auqx.x(this).isEmpty()) {
                return;
            }
            a();
            return;
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (ekvk.c(schemeSpecificPart)) {
            Log.w("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] Dropping " + intent.getAction() + " Intent with missing package name", new Object[0]));
            return;
        }
        String a3 = fncxVar2.lK().a();
        if (a3.isEmpty()) {
            set = Collections.EMPTY_SET;
        } else {
            bsl bslVar = new bsl();
            Collections.addAll(bslVar, a3.split(","));
            set = bslVar;
        }
        if (set.contains(schemeSpecificPart)) {
            a();
        }
    }
}
