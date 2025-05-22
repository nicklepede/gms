package com.google.android.gms.backup.settings.entrypoint;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.ajwt;
import defpackage.akfg;
import defpackage.alri;
import defpackage.apzq;
import defpackage.aqlc;
import defpackage.auad;
import defpackage.auiq;
import defpackage.dymf;
import defpackage.emwi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupGoogleSettingsIntentOperation extends apzq {
    private static final auad a = ajwt.a("BackupGoogleSettingsIO");

    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        if (!new alri(this).a()) {
            a.d("Backup settings item not available", new Object[0]);
            return null;
        }
        Intent f = akfg.f();
        dymf.c(f, emwi.GOOGLE_SETTINGS_BACKUP_ITEM);
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f, 0, R.string.drive_backup_settings_title, aqlc.BACKUP_ITEM, auiq.DEFAULT_BACKUP_SETTINGS);
        googleSettingsItem.e = false;
        return googleSettingsItem;
    }
}
