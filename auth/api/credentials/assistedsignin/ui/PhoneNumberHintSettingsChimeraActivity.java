package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.auub;
import defpackage.bp;
import defpackage.ig;
import defpackage.rxx;
import defpackage.xxs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneNumberHintSettingsChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!auub.c()) {
            setTheme(R.style.common_Theme_GoogleSettings);
        }
        setContentView(R.layout.credentials_gis_phone_number_hint_settings);
        setTitle(R.string.credentials_phone_number_hint_settings_title);
        ig hO = hO();
        if (hO != null) {
            hO.z(R.string.credentials_phone_number_hint_settings_title);
            hO.o(true);
        }
        xxs xxsVar = new xxs();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.main_container, xxsVar, "phone_number_hint_preference");
        bpVar.a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
