package com.google.android.gms.backup.settings.notifications.photosoptin;

import com.google.android.gms.backup.settings.notifications.photosoptin.PhotosOptInNotificationSenderTask;
import defpackage.ajti;
import defpackage.ajtk;
import defpackage.byln;
import defpackage.enss;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fuyx;
import defpackage.fuyy;
import defpackage.fvaf;
import defpackage.fvic;
import defpackage.fvie;
import defpackage.fvug;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PhotosOptInNotificationSenderTask extends Pommel_PhotosOptInNotificationSenderTask {
    public ajti a;
    public fuyx b;
    private final fuuw c = new fuvg(new fvaf() { // from class: ajtj
        @Override // defpackage.fvaf
        public final Object a() {
            fuyx fuyxVar = PhotosOptInNotificationSenderTask.this.b;
            if (fuyxVar == null) {
                fvbo.j("coroutineContext");
                fuyxVar = null;
            }
            return fvid.b(fuyxVar);
        }
    });

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        enss b;
        b = fvug.b((fvic) this.c.a(), fuyy.a, fvie.a, new ajtk(this, null));
        return b;
    }
}
