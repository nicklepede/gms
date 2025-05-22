package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.azqp;
import defpackage.azuc;
import defpackage.fokk;
import defpackage.fokt;
import defpackage.fokw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DrivingModeLocationSettingsIntentOperation extends azuc {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (!fokt.c()) {
            return null;
        }
        Log.i("CAR.DRIVINGMODE", "DrivingMode Settings Indexed from the location module");
        if (!fokk.e() || !fokw.a.lK().a() || !g()) {
            return null;
        }
        Intent className = new Intent().setClassName(this, azqp.d());
        className.setAction("com.google.android.gms.drivingmode.Invoked_from_search");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(className, 6, getApplicationContext().getString(R.string.driving_mode_settings_search_title), aqlc.DRIVING_MODE_ITEM, auiq.DRIVING_MODE);
        googleSettingsItem.g = true;
        googleSettingsItem.i = true;
        googleSettingsItem.j = true;
        googleSettingsItem.l = true;
        googleSettingsItem.p = getString(R.string.driving_mode_settings_page_description);
        googleSettingsItem.m = "DrivingModeSettings";
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_car));
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_do_not_disturb));
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_drive));
        googleSettingsItem.a(getApplicationContext().getString(R.string.gearhead_app_name));
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_bluetooth));
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_dnd));
        googleSettingsItem.a(getApplicationContext().getString(R.string.driving_mode_settings_search_car_mode));
        return googleSettingsItem;
    }
}
