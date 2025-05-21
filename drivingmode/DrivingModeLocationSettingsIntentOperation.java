package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.aojj;
import defpackage.asew;
import defpackage.axmp;
import defpackage.axqc;
import defpackage.fltb;
import defpackage.fltk;
import defpackage.fltn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DrivingModeLocationSettingsIntentOperation extends axqc {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (!fltk.c()) {
            return null;
        }
        Log.i("CAR.DRIVINGMODE", "DrivingMode Settings Indexed from the location module");
        if (!fltb.e() || !fltn.a.a().a() || !g()) {
            return null;
        }
        Intent className = new Intent().setClassName(this, axmp.d());
        className.setAction("com.google.android.gms.drivingmode.Invoked_from_search");
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(className, 6, getApplicationContext().getString(R.string.driving_mode_settings_search_title), aojj.DRIVING_MODE_ITEM, asew.DRIVING_MODE);
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
