package com.google.android.gms.carsetup;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.akue;
import defpackage.albn;
import defpackage.alsn;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.asew;
import defpackage.asqh;
import defpackage.flve;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarSetupGoogleSettingsIntentOperation extends anxy {
    static {
        albn.a("CAR.SETUP");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        String c;
        if (!flve.a.a().j() || asqh.g()) {
            return null;
        }
        flve flveVar = flve.a;
        if (flveVar.a().l()) {
            if (new alsn(getApplicationContext()).a() != 0) {
                return null;
            }
        } else if (!flveVar.a().k() || alsn.b(this)) {
            return null;
        }
        Intent component = new Intent().setComponent(AaSettingsActivityImpl.j);
        try {
            c = akue.c(this);
        } catch (IllegalStateException | SecurityException unused) {
        }
        if (!AaSettingsActivityImpl.k(getPackageManager(), c)) {
            return null;
        }
        component.putExtra("gearhead_package", c);
        return new GoogleSettingsItem(component, 6, getString(R.string.car_app_name), aojj.DEVICE_CONNECTIONS_ITEM, asew.DEFAULT_CAR_SETUP);
    }
}
