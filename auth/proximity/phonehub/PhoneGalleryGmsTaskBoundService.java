package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.provider.MediaStore;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aewa;
import defpackage.aewb;
import defpackage.aexf;
import defpackage.aexg;
import defpackage.aexh;
import defpackage.afbx;
import defpackage.auad;
import defpackage.carn;
import defpackage.caro;
import defpackage.casd;
import defpackage.cauf;
import defpackage.fgrc;
import java.lang.ref.WeakReference;
import java.util.Timer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneGalleryGmsTaskBoundService extends GmsTaskBoundService implements aexg {
    private static final auad a = new auad("ProximityAuth", "PhoneGalleryGmsTaskBoundService");
    private final aexh b = new aexh();

    public static void e(Context context) {
        casd.a(context).d("PhotoGalleryUpdate", PhoneGalleryGmsTaskBoundService.class.getName());
    }

    static void f(Context context) {
        a.d("Scheduling task for media update", new Object[0]);
        casd a2 = casd.a(context);
        caro caroVar = new caro();
        caroVar.t("PhotoGalleryUpdate");
        caroVar.w(PhoneGalleryGmsTaskBoundService.class.getName());
        caroVar.c(new carn(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, 1));
        caroVar.c(new carn(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, 1));
        caroVar.v(0);
        caroVar.g(2);
        a2.f(caroVar.b());
    }

    private final void g() {
        a.h("Media content changed, notifying connected devices", new Object[0]);
        for (aewa aewaVar : aewb.b().d()) {
            if (aewaVar.e) {
                fgrc v = afbx.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                ((afbx) v.b).f = true;
                aewaVar.o((afbx) v.Q());
            } else {
                aewa.a.h("Camera Roll setting is disabled on connected device.", new Object[0]);
            }
        }
        f(getApplicationContext());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        aexh aexhVar = this.b;
        if (aexhVar.c) {
            if (aexhVar.d.get() == null) {
                aexhVar.d = new WeakReference(this);
            }
            a.h("Too frequent! Update will be postponed.", new Object[0]);
            return 1;
        }
        aexhVar.c = true;
        new Timer().schedule(new aexf(aexhVar), aexhVar.b);
        g();
        return 0;
    }

    @Override // defpackage.aexg
    public final void d() {
        g();
    }
}
