package com.google.android.gms.backup.extension.download;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.gms.R;
import com.google.android.setupcompat.portal.ProgressServiceComponent;
import defpackage.ajwt;
import defpackage.akfg;
import defpackage.akyc;
import defpackage.akyf;
import defpackage.akyj;
import defpackage.akyk;
import defpackage.akyn;
import defpackage.akzc;
import defpackage.akzd;
import defpackage.akzo;
import defpackage.akzq;
import defpackage.akzr;
import defpackage.alau;
import defpackage.atzb;
import defpackage.aupn;
import defpackage.aupz;
import defpackage.dhpk;
import defpackage.efro;
import defpackage.efrx;
import defpackage.efrz;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.emuw;
import defpackage.emux;
import defpackage.eqgo;
import defpackage.fodd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CustomBackupDownloadManagerChimeraService extends aupn {
    public static final ajwt a = new ajwt("CustomBackupDownloadService");
    public static boolean b = false;
    public String e;
    public akyn f;
    public akyk g;
    public akyf h;
    public efro j;
    private akzr k;
    private akzd l;
    public final Object c = new Object();
    public final eqgo d = new aupz(1, 9);
    public final ekww i = ekxd.a(new ekww() { // from class: akyg
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fodd.t());
        }
    });
    private final ekww m = ekxd.a(new ekww() { // from class: akyh
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fodi.f());
        }
    });

    public static void d(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.google.android.gms.backup.extension.download.CustomBackupDataDownloadManagerService");
        context.startService(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108 A[Catch: all -> 0x00e7, TryCatch #2 {all -> 0x00e7, blocks: (B:24:0x00ae, B:27:0x00bb, B:30:0x00c7, B:33:0x00cb, B:36:0x00d0, B:38:0x00d6, B:39:0x0100, B:41:0x0108, B:42:0x011d, B:58:0x011f, B:59:0x0129, B:60:0x00e2, B:63:0x00f2), top: B:23:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f A[Catch: all -> 0x00e7, TryCatch #2 {all -> 0x00e7, blocks: (B:24:0x00ae, B:27:0x00bb, B:30:0x00c7, B:33:0x00cb, B:36:0x00d0, B:38:0x00d6, B:39:0x0100, B:41:0x0108, B:42:0x011d, B:58:0x011f, B:59:0x0129, B:60:0x00e2, B:63:0x00f2), top: B:23:0x00ae }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.extension.download.CustomBackupDownloadManagerChimeraService.a():void");
    }

    @Override // defpackage.aupn
    protected final void b(Intent intent) {
        akyc akycVar = new akyc(this);
        akyf akyfVar = this.h;
        ekvl.y(akyfVar);
        akzr akzrVar = new akzr(akyfVar);
        this.k = akzrVar;
        ajwt ajwtVar = akzr.a;
        ajwtVar.d("Should integrate called", new Object[0]);
        if (!((Boolean) akzrVar.b.lK()).booleanValue()) {
            ajwtVar.d("Portal integration flag is disabled", new Object[0]);
        } else if (checkSelfPermission("com.google.android.setupwizard.SETUP_PROGRESS_SERVICE") != 0) {
            ajwtVar.d("Portal integration permission (%s) is not granted", "com.google.android.setupwizard.SETUP_PROGRESS_SERVICE");
        } else if (akzrVar.a(this)) {
            ajwtVar.d("Integration with portal allowed. Flag: true, Permission: granted", new Object[0]);
            if (akycVar.j()) {
                this.h.e(2);
                long d = fodd.a.lK().d();
                Intent c = akfg.c();
                akzr akzrVar2 = this.k;
                try {
                    ProgressServiceComponent a2 = efrz.a(getPackageName(), "BbG1Portal", false, false, d, R.string.backup_extension_download_ongoing_screen_title, 2131232889, new Intent().setClassName(getPackageName(), "com.google.android.gms.backup.extension.download.CustomBackupDataDownloadManagerService"), c);
                    ajwtVar.d("Registering %s to Portal", getClass().getName());
                    akzo akzoVar = akzrVar2.d;
                    efrx.a(this, a2, new akzq(akzrVar2, this));
                    return;
                } catch (RuntimeException e) {
                    akzr.a.i("Exception raised in portal registration: starting download with notification %s", e, new Object[0]);
                    akzrVar2.c(4);
                    c();
                    return;
                }
            }
        } else {
            ajwtVar.d("Consent notification displayed or Portal failed already. Cannot use Portal", new Object[0]);
        }
        a.d("Not eligible for portal.", new Object[0]);
        this.h.e(3);
        c();
    }

    protected final void c() {
        akyc akycVar = new akyc(this);
        int a2 = ((Boolean) this.m.lK()).booleanValue() ? dhpk.BACKUP_CUSTOM_RESTORE_NOTIFICATIONS.a() : 5;
        ajwt ajwtVar = a;
        ajwtVar.d("Foregrounding service with notification and downloading. Notification id %s", Integer.valueOf(a2));
        akzd akzdVar = this.l;
        ekvl.y(akzdVar);
        Integer num = (Integer) akzdVar.c.get(akzc.IN_PROGRESS);
        atzb.s(num);
        int intValue = num.intValue();
        Context context = akzdVar.a;
        String string = context.getString(intValue);
        Notification.Builder builder = akzdVar.b;
        builder.setContentTitle(string);
        builder.setContentText(context.getString(R.string.backup_extension_restore_default_notification_text));
        builder.setOngoing(true);
        startForeground(a2, builder.build());
        akyf akyfVar = this.h;
        if (akyfVar != null) {
            akyfVar.c(3);
        }
        a();
        if (akycVar.j()) {
            akzd akzdVar2 = this.l;
            ekvl.y(akzdVar2);
            akzdVar2.a(akzc.FAILURE);
            ajwtVar.d("Posting failure notification", new Object[0]);
        } else {
            akzd akzdVar3 = this.l;
            ekvl.y(akzdVar3);
            akzdVar3.a(akzc.DONE);
            ajwtVar.d("Posting done notification", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(2);
        } else {
            stopForeground(false);
        }
    }

    @Override // defpackage.aupn, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (((Boolean) this.i.lK()).booleanValue() && efrx.c(intent)) {
            a.d("#onBind: Returning SetupWizardPortalBinder", new Object[0]);
            return new akyj(this);
        }
        a.d("#onBind: Returning CustomBackupDownloadManagerServiceBinder", new Object[0]);
        return new alau(this);
    }

    @Override // defpackage.aupn, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.l = new akzd(this);
        this.h = new akyf();
        this.g = new akyk(this, this.h);
    }

    @Override // defpackage.aupn, com.google.android.chimera.Service
    public final void onDestroy() {
        akyc akycVar = new akyc(this);
        if (akycVar.j()) {
            a.d("Reschedule the CustomBackupDownloadStarterTask task as there is more data for download: %s", akycVar.c());
            CustomBackupDownloadStarterTask.d(this);
        }
        this.h.a(emux.a, emuw.CUSTOM_BACKUP_DOWNLOAD_SERVICE_DESTROYED_EVENT);
        super.onDestroy();
    }
}
