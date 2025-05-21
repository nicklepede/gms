package com.google.android.gms.backup.settings.component;

import android.os.Bundle;
import defpackage.ahwd;
import defpackage.arxo;
import defpackage.eble;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupOrRestoreSettingsChimeraActivity extends qgg {
    private static final arxo j = ahwd.a("BackupOrRestoreSettingsChimeraActivity");

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        int i = eble.a;
        super.onCreate(bundle);
        j.f("Activity launched for platform version below S", new Object[0]);
        finish();
    }
}
