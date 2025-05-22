package com.google.android.gms.carsetup;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.amvp;
import defpackage.ancy;
import defpackage.anty;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auiq;
import defpackage.auub;
import defpackage.fomn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarSetupGoogleSettingsIntentOperation extends apzq {
    static {
        ancy.a("CAR.SETUP");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        String c;
        fomn fomnVar = fomn.a;
        if (!fomnVar.lK().j() || auub.g()) {
            return null;
        }
        if (fomnVar.lK().l()) {
            if (new anty(getApplicationContext()).a() != 0) {
                return null;
            }
        } else if (!fomnVar.lK().k() || anty.b(this)) {
            return null;
        }
        Intent component = new Intent().setComponent(AaSettingsActivityImpl.j);
        try {
            c = amvp.c(this);
        } catch (IllegalStateException | SecurityException unused) {
        }
        if (!AaSettingsActivityImpl.k(getPackageManager(), c)) {
            return null;
        }
        component.putExtra("gearhead_package", c);
        return new GoogleSettingsItem(component, 6, getString(R.string.car_app_name), aqlc.DEVICE_CONNECTIONS_ITEM, auiq.DEFAULT_CAR_SETUP);
    }
}
