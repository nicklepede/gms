package com.google.android.gms.vision.service;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.auwr;
import defpackage.dkmn;
import defpackage.dknx;
import defpackage.ektg;
import defpackage.fpht;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class VisionIntentHandlers$OnPackageAddedOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fpht.f()) {
            return;
        }
        if (intent.getData() == null) {
            dkmn.a("Null data for %s", intent);
            return;
        }
        String[] split = intent.getData().toString().split(":");
        if (split.length < 2) {
            dkmn.a("Data not package name: %s", intent.getData());
            return;
        }
        String str = split[1];
        String str2 = null;
        try {
            ApplicationInfo e = auwr.b(this).e(str, 128);
            if (e != null && e.metaData != null) {
                String string = e.metaData.getString("com.google.android.gms.vision.DEPENDENCIES");
                if (TextUtils.isEmpty(string)) {
                    string = e.metaData.getString("com.google.firebase.ml.vision.DEPENDENCIES");
                }
                str2 = TextUtils.isEmpty(string) ? e.metaData.getString("com.google.mlkit.vision.DEPENDENCIES") : string;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            dkmn.a("Failed to find package %s", str);
        }
        if (str2 != null) {
            dknx.c(this, str2, true, ektg.a);
        }
    }
}
