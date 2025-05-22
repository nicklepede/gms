package com.google.android.gms.backup.g1.notifications;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ajqm;
import defpackage.ajwt;
import defpackage.alcx;
import defpackage.aldx;
import defpackage.asvp;
import defpackage.aumo;
import defpackage.casd;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.doyu;
import defpackage.dyhi;
import defpackage.fgrc;
import defpackage.fofx;
import defpackage.fpuj;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SettingsCollectionSchedulerChimeraService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final ajwt b = new ajwt("SettingsCollectionSchedulerService");
    private static final String c = doyu.a("googleone");
    private static final ajqm d = ajqm.a;
    private aldx e;

    public static void d(casd casdVar) {
        if (!fpuj.a.lK().d()) {
            cate cateVar = new cate();
            cateVar.w(SettingsCollectionSchedulerChimeraService.class.getName());
            cateVar.t("settings_collection");
            cateVar.a = fofx.a.lK().b();
            cateVar.x(fofx.h() ? 1 : 0, 1);
            cateVar.y(true != fofx.i() ? 2 : 1, 1);
            cateVar.v(2);
            casdVar.f(cateVar.b());
            return;
        }
        catg catgVar = new catg();
        catgVar.w(SettingsCollectionSchedulerChimeraService.class.getName());
        catgVar.t("settings_collection");
        catgVar.a = catn.j;
        catgVar.l(true);
        catgVar.v(2);
        if (fofx.h()) {
            catgVar.e();
        }
        if (fofx.i()) {
            catgVar.k();
        }
        casdVar.f(catgVar.b());
    }

    private static final boolean e(Context context) {
        dyhi dyhiVar;
        Intent intent = new Intent("com.google.android.apps.photos.backup.apiservice.extensions.BACKUP_EXTENSIONS_SERVICE").setPackage("com.google.android.apps.photos");
        if (context.getPackageManager().queryIntentServices(intent, 0).isEmpty()) {
            b.m("Could not find Photos extensions service", new Object[0]);
            return false;
        }
        asvp asvpVar = new asvp();
        aumo.a().d(context, intent, asvpVar, 1);
        try {
            try {
                IBinder a2 = asvpVar.a();
                if (a2 == null) {
                    dyhiVar = null;
                } else {
                    IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.libraries.photos.api.backupextensions.IPhotosBackupExtensions");
                    dyhiVar = queryLocalInterface instanceof dyhi ? (dyhi) queryLocalInterface : new dyhi(a2);
                }
                Parcel fF = dyhiVar.fF(2, dyhiVar.fE());
                boolean h = qmr.h(fF);
                fF.recycle();
                try {
                    aumo.a().b(context, asvpVar);
                    return h;
                } catch (IllegalArgumentException | IllegalStateException e) {
                    b.n("Could not unbind from Photos extensions service", e, new Object[0]);
                    return h;
                }
            } catch (RemoteException | IllegalArgumentException | IllegalStateException | InterruptedException e2) {
                b.n("Could not bind to Photos extensions service", e2, new Object[0]);
                try {
                    aumo.a().b(context, asvpVar);
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    b.n("Could not unbind from Photos extensions service", e3, new Object[0]);
                }
                return false;
            }
        } catch (Throwable th) {
            try {
                aumo.a().b(context, asvpVar);
            } catch (IllegalArgumentException | IllegalStateException e4) {
                b.n("Could not unbind from Photos extensions service", e4, new Object[0]);
            }
            throw th;
        }
    }

    private static final alcx f(alcx alcxVar) {
        fgrc fgrcVar = (fgrc) alcxVar.iQ(5, null);
        fgrcVar.X(alcxVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        alcx alcxVar2 = (alcx) fgrcVar.b;
        alcx alcxVar3 = alcx.a;
        alcxVar2.b |= 128;
        alcxVar2.j = 0L;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        alcx alcxVar4 = (alcx) fgrcVar.b;
        alcxVar4.b |= 16;
        alcxVar4.g = 0L;
        return (alcx) fgrcVar.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0892 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r20) {
        /*
            Method dump skipped, instructions count: 2666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.g1.notifications.SettingsCollectionSchedulerChimeraService.a(cauf):int");
    }
}
