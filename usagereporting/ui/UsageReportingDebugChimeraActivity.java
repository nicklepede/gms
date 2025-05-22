package com.google.android.gms.usagereporting.ui;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.dkdy;
import defpackage.dkdz;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UsageReportingDebugChimeraActivity extends ryt {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class UsageReportingDebugOperation extends apzq {
        @Override // defpackage.apzq
        public final GoogleSettingsItem b() {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.usagereporting.UR_SETTINGS").setPackage(getPackageName()), 2, getResources().getString(R.string.usage_reporting_debug_title), aqlc.USAGE_REPORTING_DEBUG_ITEM, auiq.DEFAULT_USAGEREPORTING);
            googleSettingsItem.f = true;
            return googleSettingsItem;
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.usage_reporting_debug_settings);
        Button button = (Button) findViewById(R.id.crash_button);
        button.getBackground().setColorFilter(-65536, PorterDuff.Mode.MULTIPLY);
        button.setOnClickListener(new dkdy());
        ((Button) findViewById(R.id.reset_button)).setOnClickListener(new dkdz());
        setTitle(R.string.usage_reporting_debug_title);
    }
}
