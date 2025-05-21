package com.google.android.gms.backup.settings.component;

import android.content.Context;
import android.content.Intent;
import defpackage.ahre;
import defpackage.ahxo;
import defpackage.aiaa;
import defpackage.aiab;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PhotosBackupApiHelperIntentOperation extends ahre {
    private final aiab a;
    private ahxo b;

    public PhotosBackupApiHelperIntentOperation() {
        aiaa a = aiab.a();
        a.c(13);
        this.a = a.a();
    }

    public static Intent b(Context context, String str, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.chimera.GmsIntentOperationService").setAction("com.google.android.gms.backup.CONNECT_TO_PHOTOS_API").putExtra("account", str).putExtra("is_enable_photos_backup", z);
        return intent;
    }

    @Override // defpackage.ahre
    public final void a(Intent intent) {
        if (this.b == null) {
            this.b = ahxo.b(this);
        }
        if (intent.getBooleanExtra("is_enable_photos_backup", false)) {
            this.b.e(intent.getStringExtra("account"), this.a);
        } else {
            this.b.d(intent.getStringExtra("account"), this.a);
        }
    }
}
