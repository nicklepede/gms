package com.google.android.gms.instantapps.backend;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bqlo;
import defpackage.eluo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DevManagerStatus$OnPackageChangeOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        synchronized (bqlo.c) {
            if (intent.getData() != null && Objects.equals(intent.getData().getEncodedSchemeSpecificPart(), "com.google.android.instantapps.devman")) {
                if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
                    ((eluo) ((eluo) bqlo.a.h()).ai(5221)).x("DevManager installed");
                    bqlo.b = true;
                } else if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
                    ((eluo) ((eluo) bqlo.a.h()).ai(5220)).x("DevManager uninstalled");
                    bqlo.b = false;
                }
            }
        }
    }
}
