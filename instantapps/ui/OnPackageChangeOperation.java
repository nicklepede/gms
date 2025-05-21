package com.google.android.gms.instantapps.ui;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.boev;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class OnPackageChangeOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (boev.a() == 1) {
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
