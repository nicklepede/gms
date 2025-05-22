package com.google.android.gms.locationsharingreporter.service.settings;

import android.content.Intent;
import android.os.Bundle;
import defpackage.auid;
import defpackage.ausn;
import defpackage.caxn;
import defpackage.cdoo;
import defpackage.eluo;
import defpackage.fsrb;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class LocationSharingSettingsChimeraActivity extends cdoo {
    private static final ausn l = ausn.b("LSR", auid.LOCATION_SHARING_REPORTER);
    public caxn j;

    @Override // defpackage.cbbp
    public final caxn a() {
        caxn caxnVar = this.j;
        if (caxnVar != null) {
            return caxnVar;
        }
        fxxm.j("settingsEnvironmentFactory");
        return null;
    }

    @Override // defpackage.cdoo, defpackage.cbbp, defpackage.deaf, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fsrb.w()) {
            return;
        }
        ((eluo) l.h()).x("Forwarding intent to web view activity intent");
        Intent className = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.locationsharing.settings.ManageExistingSharesActivity");
        fxxm.e(className, "setClassName(...)");
        className.addFlags(33554432);
        className.addFlags(getIntent().getFlags());
        className.putExtras(getIntent());
        startActivity(className);
        finish();
    }
}
