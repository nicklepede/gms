package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.provider.MediaStore;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.acwa;
import defpackage.acwb;
import defpackage.acxf;
import defpackage.acxg;
import defpackage.acxh;
import defpackage.adbx;
import defpackage.arxo;
import defpackage.byiv;
import defpackage.byiw;
import defpackage.byjl;
import defpackage.byln;
import defpackage.fecj;
import java.lang.ref.WeakReference;
import java.util.Timer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhoneGalleryGmsTaskBoundService extends GmsTaskBoundService implements acxg {
    private static final arxo a = new arxo("ProximityAuth", "PhoneGalleryGmsTaskBoundService");
    private final acxh b = new acxh();

    public static void e(Context context) {
        byjl.a(context).d("PhotoGalleryUpdate", PhoneGalleryGmsTaskBoundService.class.getName());
    }

    static void f(Context context) {
        a.d("Scheduling task for media update", new Object[0]);
        byjl a2 = byjl.a(context);
        byiw byiwVar = new byiw();
        byiwVar.t("PhotoGalleryUpdate");
        byiwVar.w(PhoneGalleryGmsTaskBoundService.class.getName());
        byiwVar.c(new byiv(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, 1));
        byiwVar.c(new byiv(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, 1));
        byiwVar.v(0);
        byiwVar.g(2);
        a2.f(byiwVar.b());
    }

    private final void g() {
        a.h("Media content changed, notifying connected devices", new Object[0]);
        for (acwa acwaVar : acwb.b().d()) {
            if (acwaVar.e) {
                fecj v = adbx.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                ((adbx) v.b).f = true;
                acwaVar.o((adbx) v.Q());
            } else {
                acwa.a.h("Camera Roll setting is disabled on connected device.", new Object[0]);
            }
        }
        f(getApplicationContext());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        acxh acxhVar = this.b;
        if (acxhVar.c) {
            if (acxhVar.d.get() == null) {
                acxhVar.d = new WeakReference(this);
            }
            a.h("Too frequent! Update will be postponed.", new Object[0]);
            return 1;
        }
        acxhVar.c = true;
        new Timer().schedule(new acxf(acxhVar), acxhVar.b);
        g();
        return 0;
    }

    @Override // defpackage.acxg
    public final void d() {
        g();
    }
}
