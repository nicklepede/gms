package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.fkrd;
import defpackage.qgg;
import defpackage.wbk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhoneNumberHintCollapsingToolbarSettingsChimeraActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fkrd.a.a().a()) {
            startActivity(new Intent("com.google.android.gms.auth.api.credentials.PHONE_NUMBER_HINT_SETTINGS"));
            finish();
            return;
        }
        setContentView(R.layout.credentials_gis_phone_number_hint_settings);
        setTitle(R.string.credentials_phone_number_hint_settings_title);
        wbk wbkVar = new wbk();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.main_container, wbkVar, "phone_number_hint_preference");
        bpVar.a();
    }
}
