package com.google.android.gms.locationsharingreporter.service.settings;

import android.content.Intent;
import android.os.Bundle;
import defpackage.asej;
import defpackage.asot;
import defpackage.byov;
import defpackage.cbfw;
import defpackage.ejhf;
import defpackage.fpxh;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class LocationSharingSettingsChimeraActivity extends cbfw {
    private static final asot l = asot.b("LSR", asej.LOCATION_SHARING_REPORTER);
    public byov j;

    @Override // defpackage.bysx
    public final byov a() {
        byov byovVar = this.j;
        if (byovVar != null) {
            return byovVar;
        }
        fvbo.j("settingsEnvironmentFactory");
        return null;
    }

    @Override // defpackage.cbfw, defpackage.bysx, defpackage.dbpz, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fpxh.w()) {
            return;
        }
        ((ejhf) l.h()).x("Forwarding intent to web view activity intent");
        Intent className = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.locationsharing.settings.ManageExistingSharesActivity");
        fvbo.e(className, "setClassName(...)");
        className.addFlags(33554432);
        className.addFlags(getIntent().getFlags());
        className.putExtras(getIntent());
        startActivity(className);
        finish();
    }
}
