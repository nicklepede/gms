package com.google.android.gms.backup.settings.component;

import android.os.Bundle;
import defpackage.ajwt;
import defpackage.auad;
import defpackage.edxt;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupOrRestoreSettingsChimeraActivity extends rzk {
    private static final auad j = ajwt.a("BackupOrRestoreSettingsChimeraActivity");

    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        int i = edxt.a;
        super.onCreate(bundle);
        j.f("Activity launched for platform version below S", new Object[0]);
        finish();
    }
}
