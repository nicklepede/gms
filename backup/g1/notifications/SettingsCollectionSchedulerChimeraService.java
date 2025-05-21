package com.google.android.gms.backup.g1.notifications;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ahpw;
import defpackage.ahwd;
import defpackage.ajcf;
import defpackage.ajdf;
import defpackage.aqsz;
import defpackage.asiu;
import defpackage.byjl;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.dmng;
import defpackage.dvvh;
import defpackage.fecj;
import defpackage.flon;
import defpackage.fnck;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SettingsCollectionSchedulerChimeraService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final ahwd b = new ahwd("SettingsCollectionSchedulerService");
    private static final String c = dmng.a("googleone");
    private static final ahpw d = ahpw.a;
    private ajdf e;

    public static void d(byjl byjlVar) {
        if (!fnck.a.a().d()) {
            bykm bykmVar = new bykm();
            bykmVar.w(SettingsCollectionSchedulerChimeraService.class.getName());
            bykmVar.t("settings_collection");
            bykmVar.a = flon.a.a().b();
            bykmVar.x(flon.h() ? 1 : 0, 1);
            bykmVar.y(true != flon.i() ? 2 : 1, 1);
            bykmVar.v(2);
            byjlVar.f(bykmVar.b());
            return;
        }
        byko bykoVar = new byko();
        bykoVar.w(SettingsCollectionSchedulerChimeraService.class.getName());
        bykoVar.t("settings_collection");
        bykoVar.a = bykv.j;
        bykoVar.l(true);
        bykoVar.v(2);
        if (flon.h()) {
            bykoVar.e();
        }
        if (flon.i()) {
            bykoVar.k();
        }
        byjlVar.f(bykoVar.b());
    }

    private static final boolean e(Context context) {
        dvvh dvvhVar;
        Intent intent = new Intent("com.google.android.apps.photos.backup.apiservice.extensions.BACKUP_EXTENSIONS_SERVICE").setPackage("com.google.android.apps.photos");
        if (context.getPackageManager().queryIntentServices(intent, 0).isEmpty()) {
            b.m("Could not find Photos extensions service", new Object[0]);
            return false;
        }
        aqsz aqszVar = new aqsz();
        asiu.a().d(context, intent, aqszVar, 1);
        try {
            try {
                IBinder a2 = aqszVar.a();
                if (a2 == null) {
                    dvvhVar = null;
                } else {
                    IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.libraries.photos.api.backupextensions.IPhotosBackupExtensions");
                    dvvhVar = queryLocalInterface instanceof dvvh ? (dvvh) queryLocalInterface : new dvvh(a2);
                }
                Parcel fs = dvvhVar.fs(2, dvvhVar.fr());
                boolean h = oto.h(fs);
                fs.recycle();
                try {
                    asiu.a().b(context, aqszVar);
                    return h;
                } catch (IllegalArgumentException | IllegalStateException e) {
                    b.n("Could not unbind from Photos extensions service", e, new Object[0]);
                    return h;
                }
            } catch (RemoteException | IllegalArgumentException | IllegalStateException | InterruptedException e2) {
                b.n("Could not bind to Photos extensions service", e2, new Object[0]);
                try {
                    asiu.a().b(context, aqszVar);
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    b.n("Could not unbind from Photos extensions service", e3, new Object[0]);
                }
                return false;
            }
        } catch (Throwable th) {
            try {
                asiu.a().b(context, aqszVar);
            } catch (IllegalArgumentException | IllegalStateException e4) {
                b.n("Could not unbind from Photos extensions service", e4, new Object[0]);
            }
            throw th;
        }
    }

    private static final ajcf f(ajcf ajcfVar) {
        fecj fecjVar = (fecj) ajcfVar.iB(5, null);
        fecjVar.X(ajcfVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ajcf ajcfVar2 = (ajcf) fecjVar.b;
        ajcf ajcfVar3 = ajcf.a;
        ajcfVar2.b |= 128;
        ajcfVar2.j = 0L;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        ajcf ajcfVar4 = (ajcf) fecjVar.b;
        ajcfVar4.b |= 16;
        ajcfVar4.g = 0L;
        return (ajcf) fecjVar.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0892 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r20) {
        /*
            Method dump skipped, instructions count: 2666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.g1.notifications.SettingsCollectionSchedulerChimeraService.a(byln):int");
    }
}
