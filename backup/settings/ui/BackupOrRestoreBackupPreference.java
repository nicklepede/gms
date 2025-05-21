package com.google.android.gms.backup.settings.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import defpackage.ajwx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupOrRestoreBackupPreference extends Preference {
    public BackupOrRestoreBackupPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        L("backup");
        ajwx ajwxVar = ajwx.h;
        Context context2 = this.j;
        if (context2 == null) {
            return;
        }
        n(ajwxVar.a(context2));
    }
}
