package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.fnic;
import defpackage.rzk;
import defpackage.xxq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneNumberHintCollapsingToolbarSettingsChimeraActivity extends rzk {
    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fnic.a.lK().a()) {
            startActivity(new Intent("com.google.android.gms.auth.api.credentials.PHONE_NUMBER_HINT_SETTINGS"));
            finish();
            return;
        }
        setContentView(R.layout.credentials_gis_phone_number_hint_settings);
        setTitle(R.string.credentials_phone_number_hint_settings_title);
        xxq xxqVar = new xxq();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.main_container, xxqVar, "phone_number_hint_preference");
        bpVar.a();
    }
}
