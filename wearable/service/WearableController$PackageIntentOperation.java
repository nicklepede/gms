package com.google.android.gms.wearable.service;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.dooo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class WearableController$PackageIntentOperation extends IntentOperation {
    private static final String a(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        return data.getSchemeSpecificPart();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String a;
        if (Objects.equals(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        String schemeSpecificPart = data == null ? "" : data.getSchemeSpecificPart();
        if (Log.isLoggable("Wear_Controller", 3)) {
            Log.d("Wear_Controller", String.format("Received broadcast action=%s and uri=%s", action, schemeSpecificPart));
        }
        if (Objects.equals(action, "android.intent.action.PACKAGE_ADDED")) {
            String a2 = a(intent);
            if (a2 != null) {
                dooo.f();
                if (dooo.b(this)) {
                    if (!dooo.d(this, a2)) {
                        dooo.a(this, "com.google.android.gms.wearable.ACTION_PACKAGE_ADDED", a2);
                        return;
                    } else {
                        dooo.c(this);
                        dooo.a(this, "com.google.android.gms.wearable.ACTION_WEARABLE_APP_PACKAGE_ADDED", a2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (Objects.equals(action, "android.intent.action.PACKAGE_DATA_CLEARED")) {
            String a3 = a(intent);
            if (a3 != null) {
                dooo.f();
                if (dooo.b(this)) {
                    dooo.a(this, "com.google.android.gms.wearable.ACTION_PACKAGE_DATA_CLEARED", a3);
                    return;
                }
                return;
            }
            return;
        }
        if (Objects.equals(action, "android.intent.action.PACKAGE_CHANGED")) {
            String a4 = a(intent);
            if (a4 != null) {
                dooo.f();
                if (dooo.b(this)) {
                    dooo.a(this, "com.google.android.gms.wearable.ACTION_PACKAGE_CHANGED", a4);
                    return;
                }
                return;
            }
            return;
        }
        if (!Objects.equals(action, "android.intent.action.PACKAGE_REMOVED") || intent.getBooleanExtra("android.intent.extra.REPLACING", false) || (a = a(intent)) == null) {
            return;
        }
        dooo.f();
        if (dooo.b(this)) {
            if (dooo.d(this, a)) {
                dooo.a(this, "com.google.android.gms.wearable.ACTION_WEARABLE_APP_PACKAGE_REMOVED", a);
            } else {
                dooo.a(this, "com.google.android.gms.wearable.ACTION_PACKAGE_REMOVED", a);
            }
        }
    }
}
