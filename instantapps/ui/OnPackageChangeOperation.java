package com.google.android.gms.instantapps.ui;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.bqml;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class OnPackageChangeOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bqml.a() == 1) {
            return;
        }
        Uri data = intent.getData();
        if (data == null || intent.getAction() == null) {
            Log.e("OnPackageChangeOperation", String.format("Bad intent %s", intent));
            return;
        }
        String encodedSchemeSpecificPart = data.getEncodedSchemeSpecificPart();
        intent.getAction();
        Objects.equals(encodedSchemeSpecificPart, "com.google.android.instantapps.supervisor");
    }
}
