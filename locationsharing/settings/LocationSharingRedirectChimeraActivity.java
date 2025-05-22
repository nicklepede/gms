package com.google.android.gms.locationsharing.settings;

import android.content.Intent;
import android.os.Bundle;
import defpackage.fspt;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationSharingRedirectChimeraActivity extends ryt {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent();
        if (fspt.a.lK().k()) {
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
