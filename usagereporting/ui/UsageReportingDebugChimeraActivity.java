package com.google.android.gms.usagereporting.ui;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.dhsq;
import defpackage.dhsr;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UsageReportingDebugChimeraActivity extends qfp {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class UsageReportingDebugOperation extends anxy {
        @Override // defpackage.anxy
        public final GoogleSettingsItem b() {
            GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(new Intent("com.google.android.gms.usagereporting.UR_SETTINGS").setPackage(getPackageName()), 2, getResources().getString(R.string.usage_reporting_debug_title), aojj.USAGE_REPORTING_DEBUG_ITEM, asew.DEFAULT_USAGEREPORTING);
            googleSettingsItem.f = true;
            return googleSettingsItem;
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.usage_reporting_debug_settings);
        Button button = (Button) findViewById(R.id.crash_button);
        button.getBackground().setColorFilter(-65536, PorterDuff.Mode.MULTIPLY);
        button.setOnClickListener(new dhsq());
        ((Button) findViewById(R.id.reset_button)).setOnClickListener(new dhsr());
        setTitle(R.string.usage_reporting_debug_title);
    }
}
