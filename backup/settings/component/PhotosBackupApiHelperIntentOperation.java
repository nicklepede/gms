package com.google.android.gms.backup.settings.component;

import android.content.Context;
import android.content.Intent;
import defpackage.ajru;
import defpackage.ajye;
import defpackage.akaq;
import defpackage.akar;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PhotosBackupApiHelperIntentOperation extends ajru {
    private final akar a;
    private ajye b;

    public PhotosBackupApiHelperIntentOperation() {
        akaq a = akar.a();
        a.c(13);
        this.a = a.a();
    }

    public static Intent b(Context context, String str, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.chimera.GmsIntentOperationService").setAction("com.google.android.gms.backup.CONNECT_TO_PHOTOS_API").putExtra("account", str).putExtra("is_enable_photos_backup", z);
        return intent;
    }

    @Override // defpackage.ajru
    public final void a(Intent intent) {
        if (this.b == null) {
            this.b = ajye.b(this);
        }
        if (intent.getBooleanExtra("is_enable_photos_backup", false)) {
            this.b.e(intent.getStringExtra("account"), this.a);
        } else {
            this.b.d(intent.getStringExtra("account"), this.a);
        }
    }
}
