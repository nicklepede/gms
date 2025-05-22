package com.google.android.gms.app.settings;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.TileService;
import com.google.android.chimera.android.Activity;
import defpackage.auub;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class TileServiceTrampolineChimeraActivity extends Activity {
    private final void a() {
        Intent intent = new Intent();
        intent.setClassName(getPackageName(), "com.google.android.gms.app.settings.GoogleSettingsLink");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setClassName(getPackageName(), "com.google.android.gms.app.settings.GoogleSettingsActivity");
            startActivity(intent);
        }
        finish();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!TileService.ACTION_QS_TILE_PREFERENCES.equals(intent.getAction())) {
            Log.w("TileServiceActivity", "Received invalid action. Ignoring intent");
            finish();
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            a();
            return;
        }
        String str = null;
        ComponentName componentName = auub.c() ? (ComponentName) extras.getParcelable("android.intent.extra.COMPONENT_NAME") : null;
        if (componentName == null) {
            Log.w("TileServiceActivity", "Missing component name extra");
            a();
            return;
        }
        String packageName = getPackageName();
        if (!packageName.equals(componentName.getPackageName())) {
            Log.w("TileServiceActivity", "Invalid component: ".concat(componentName.toString()));
            a();
            return;
        }
        try {
            Bundle bundle2 = getPackageManager().getServiceInfo(componentName, 128).metaData;
            if (bundle2 != null) {
                str = bundle2.getString("com.google.android.gms.app.settings.tileaction");
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("TileServiceActivity", "Failed to fetch <meta-data> for ".concat(componentName.toString()), e);
        }
        if (str == null) {
            Log.w("TileServiceActivity", "No Activity mapping found for service: ".concat(componentName.toString()));
            a();
        } else {
            Intent intent2 = new Intent(str).setPackage(packageName);
            intent2.putExtras(extras);
            startActivity(intent2);
            finish();
        }
    }
}
