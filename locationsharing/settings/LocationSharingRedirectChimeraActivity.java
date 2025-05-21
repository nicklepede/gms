package com.google.android.gms.locationsharing.settings;

import android.content.Intent;
import android.os.Bundle;
import defpackage.fpwa;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationSharingRedirectChimeraActivity extends qfp {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent();
        if (fpwa.a.a().k()) {
            intent.setClassName(this, "com.google.android.gms.locationsharingreporter.service.settings.LocationSharingSettingsActivity");
        } else {
            intent.setClassName(this, "com.google.android.gms.locationsharing.settings.ManageExistingSharesActivity");
        }
        intent.addFlags(33554432);
        intent.addFlags(getIntent().getFlags());
        intent.putExtras(getIntent());
        if (getCallingActivity() != null) {
            intent.putExtra("calling_package_name", getCallingActivity().getPackageName());
        }
        startActivity(intent);
        finish();
    }
}
