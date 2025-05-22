package com.google.android.gms.platform.scanner.loader;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import defpackage.apzs;
import defpackage.fvor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class InitIntentOperation extends apzs {
    private final void e() {
        ModuleManager moduleManager = ModuleManager.get(getApplicationContext());
        ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
        featureCheck.checkFeatureAtAnyVersion("mlkit.barcode.ui");
        if (moduleManager.checkFeaturesAreAvailable(featureCheck) == 0) {
            return;
        }
        try {
            Resources resources = getApplicationContext().createPackageContext("android", 0).getResources();
            String string = resources.getString(resources.getIdentifier("config_defaultQrCodeComponent", "string", "android"));
            if (string == null || !string.startsWith("com.google.android.gms/")) {
                return;
            }
            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
            featureRequest.requestFeatureAtAnyVersion("mlkit.barcode.ui");
            featureRequest.setUrgent();
            moduleManager.requestFeatures(featureRequest);
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            Log.w("InitPlatformScanner", "android package/resource not found");
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (fvor.a.lK().a()) {
            e();
        }
    }
}
