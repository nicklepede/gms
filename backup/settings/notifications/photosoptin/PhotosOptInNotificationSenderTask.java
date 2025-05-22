package com.google.android.gms.backup.settings.notifications.photosoptin;

import com.google.android.gms.backup.settings.notifications.photosoptin.PhotosOptInNotificationSenderTask;
import defpackage.alub;
import defpackage.alud;
import defpackage.cauf;
import defpackage.eqgl;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxuv;
import defpackage.fxwd;
import defpackage.fyea;
import defpackage.fyqe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class PhotosOptInNotificationSenderTask extends Pommel_PhotosOptInNotificationSenderTask {
    public alub a;
    public fxuv b;
    private final fxqu c = new fxre(new fxwd() { // from class: aluc
        @Override // defpackage.fxwd
        public final Object a() {
            fxuv fxuvVar = PhotosOptInNotificationSenderTask.this.b;
            if (fxuvVar == null) {
                fxxm.j("coroutineContext");
                fxuvVar = null;
            }
            return fyeb.b(fxuvVar);
        }
    });

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        return fyqe.d((fyea) this.c.a(), new alud(this, null));
    }
}
