package com.google.android.gms.instantapps.backend;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.body;
import defpackage.ejhf;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DevManagerStatus$OnPackageChangeOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        synchronized (body.c) {
            if (intent.getData() != null && Objects.equals(intent.getData().getEncodedSchemeSpecificPart(), "com.google.android.instantapps.devman")) {
                if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
                    ((ejhf) ((ejhf) body.a.h()).ah(5208)).x("DevManager installed");
                    body.b = true;
                } else if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
                    ((ejhf) ((ejhf) body.a.h()).ah(5207)).x("DevManager uninstalled");
                    body.b = false;
                }
            }
        }
    }
}
