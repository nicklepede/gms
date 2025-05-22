package com.google.android.gms.app.phone.settings;

import android.content.Intent;
import android.os.Bundle;
import defpackage.aury;
import defpackage.byxz;
import defpackage.ekxj;
import defpackage.froa;
import defpackage.fxsp;
import defpackage.fxxm;
import defpackage.ryt;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GoogleSettingsChimeraActivity extends ryt {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        if (froa.a.lK().d().b.contains(Integer.valueOf(aury.a(this).k))) {
            intent = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.googlesettings.ui.GoogleSettingsActivity");
            Intent intent2 = getIntent();
            Set set = byxz.a;
            fxxm.f(intent2, "fromIntent");
            fxxm.f(intent, "toIntent");
            Iterator a = new fxsp(new String[]{"com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_REQUEST_CODE", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_SOURCE", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_MEDIUM", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_CAMPAIGN", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_ITEM_ID", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_FACET_ID"}).a();
            while (a.hasNext()) {
                String str = (String) a.next();
                if (intent2.hasExtra(str)) {
                    intent.putExtra(str, intent2.getIntExtra(str, 0));
                }
            }
            Iterator a2 = new fxsp(new String[]{"com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_SESSION_ID"}).a();
            while (a2.hasNext()) {
                String str2 = (String) a2.next();
                String stringExtra = intent2.getStringExtra(str2);
                if (stringExtra != null) {
                    intent.putExtra(str2, stringExtra);
                }
            }
        } else {
            intent = null;
        }
        if (intent == null || intent.resolveActivity(getPackageManager()) == null) {
            intent = new Intent().setClassName(this, "com.google.android.gms.app.settings.BasicGoogleSettingsActivity");
        }
        ekxj.e(intent);
        startActivity(intent);
        finish();
    }
}
