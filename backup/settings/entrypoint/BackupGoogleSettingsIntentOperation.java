package com.google.android.gms.backup.settings.entrypoint;

import android.content.Intent;
import com.google.android.gms.R;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.ahwd;
import defpackage.aieq;
import defpackage.ajqp;
import defpackage.anxy;
import defpackage.aojj;
import defpackage.arxo;
import defpackage.asew;
import defpackage.dwae;
import defpackage.ekiw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupGoogleSettingsIntentOperation extends anxy {
    private static final arxo a = ahwd.a("BackupGoogleSettingsIO");

    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        if (!new ajqp(this).a()) {
            a.d("Backup settings item not available", new Object[0]);
            return null;
        }
        Intent f = aieq.f();
        dwae.c(f, ekiw.GOOGLE_SETTINGS_BACKUP_ITEM);
        GoogleSettingsItem googleSettingsItem = new GoogleSettingsItem(f, 0, R.string.drive_backup_settings_title, aojj.BACKUP_ITEM, asew.DEFAULT_BACKUP_SETTINGS);
        googleSettingsItem.e = false;
        return googleSettingsItem;
    }
}
