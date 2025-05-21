package com.google.android.gms.auth.account.be;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.asnd;
import defpackage.asot;
import defpackage.bsa;
import defpackage.dvni;
import defpackage.eiif;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.fkmi;
import defpackage.fvbo;
import defpackage.uoh;
import defpackage.vdv;
import defpackage.vfv;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SupervisedAccountIntentOperation extends IntentOperation {
    private final void a() {
        dvni dvniVar = vfv.a;
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
        fkmi fkmiVar = fkmi.a;
        if (fkmiVar.a().h()) {
            asot asotVar = vdv.a;
            fvbo.f(intent, "intent");
            String action = intent.getAction();
            ((ejhf) vdv.a.h()).B("onHandleIntent: %s", action);
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
            if (!fkmiVar.a().e()) {
                fvbo.c(a);
                if (!vdv.b(a) || vdv.c(a)) {
                    return;
                }
                vdv.a(a, vdv.d(a, action));
                return;
            }
            fvbo.c(a);
            if (vdv.b(a) || (fkmi.a.a().f() && vdv.c(a))) {
                Object systemService = a.getSystemService("device_policy");
                fvbo.d(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
                if (((DevicePolicyManager) systemService).isProfileOwnerApp("com.google.android.gms.supervision")) {
                    return;
                }
                vdv.a(a, vdv.d(a, action));
                return;
            }
            return;
        }
        String action2 = intent.getAction();
        Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] onHandleIntent(): ".concat(String.valueOf(action2)), new Object[0]));
        if (fkmi.a.a().d()) {
            getApplicationContext();
            getApplicationContext();
        }
        dvni dvniVar = vfv.a;
        if (!fkmiVar.a().b()) {
            Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] This operation is disabled", new Object[0]));
            return;
        }
        eiig.x(action2);
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
                if (fkmiVar.a().c()) {
                    for (Account account : asnd.h(this, getPackageName())) {
                        try {
                            uoh.k(this, uoh.h(this, account, "ac2dm", Bundle.EMPTY));
                            uoh.h(this, account, "ac2dm", Bundle.EMPTY);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    Log.i("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] Skipping token refresh", new Object[0]));
                }
            }
            if (asnd.x(this).isEmpty()) {
                return;
            }
            a();
            return;
        }
        Uri data = intent.getData();
        String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
        if (eiif.c(schemeSpecificPart)) {
            Log.w("Auth", String.format(Locale.US, "[SupervisedAccountIntentOperation] Dropping " + intent.getAction() + " Intent with missing package name", new Object[0]));
            return;
        }
        String a2 = fkmiVar.a().a();
        if (a2.isEmpty()) {
            set = Collections.EMPTY_SET;
        } else {
            bsa bsaVar = new bsa();
            Collections.addAll(bsaVar, a2.split(","));
            set = bsaVar;
        }
        if (set.contains(schemeSpecificPart)) {
            a();
        }
    }
}
