package com.google.android.gms.app.phone.settings;

import android.content.Intent;
import android.os.Bundle;
import defpackage.asoe;
import defpackage.bwpm;
import defpackage.eike;
import defpackage.fouy;
import defpackage.fuwr;
import defpackage.fvbo;
import defpackage.qfp;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GoogleSettingsChimeraActivity extends qfp {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        if (fouy.a.a().d().b.contains(Integer.valueOf(asoe.a(this).k))) {
            intent = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.googlesettings.ui.GoogleSettingsActivity");
            Intent intent2 = getIntent();
            Set set = bwpm.a;
            fvbo.f(intent2, "fromIntent");
            fvbo.f(intent, "toIntent");
            Iterator a = new fuwr(new String[]{"com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_REQUEST_CODE", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_SOURCE", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_MEDIUM", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_CAMPAIGN", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_ITEM_ID", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_FACET_ID"}).a();
            while (a.hasNext()) {
                String str = (String) a.next();
                if (intent2.hasExtra(str)) {
                    intent.putExtra(str, intent2.getIntExtra(str, 0));
                }
            }
            Iterator a2 = new fuwr(new String[]{"com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_SESSION_ID"}).a();
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
        eike.e(intent);
        startActivity(intent);
        finish();
    }
}
