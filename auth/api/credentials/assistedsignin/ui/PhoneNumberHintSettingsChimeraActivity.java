package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.asqh;
import defpackage.bp;
import defpackage.ig;
import defpackage.qet;
import defpackage.wbm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhoneNumberHintSettingsChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!asqh.c()) {
            setTheme(R.style.common_Theme_GoogleSettings);
        }
        setContentView(R.layout.credentials_gis_phone_number_hint_settings);
        setTitle(R.string.credentials_phone_number_hint_settings_title);
        ig hy = hy();
        if (hy != null) {
            hy.z(R.string.credentials_phone_number_hint_settings_title);
            hy.o(true);
        }
        wbm wbmVar = new wbm();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.main_container, wbmVar, "phone_number_hint_preference");
        bpVar.a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
