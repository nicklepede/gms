package com.google.android.gms.backup.settings.component;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.ajif;
import defpackage.ajql;
import defpackage.ajqm;
import defpackage.ajwt;
import defpackage.aker;
import defpackage.akfg;
import defpackage.akgc;
import defpackage.allx;
import defpackage.apzg;
import defpackage.auad;
import defpackage.aued;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.dhpk;
import defpackage.dymf;
import defpackage.emwi;
import defpackage.enai;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.foda;
import defpackage.fodi;
import defpackage.fofw;
import defpackage.fohs;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class NoBackupNotificationChimeraService extends GmsTaskChimeraService {
    public static final auad a = ajwt.a("NoBackupNotification");

    public static void d(Context context, int i, boolean z) {
        long h = h(i);
        long seconds = TimeUnit.MINUTES.toSeconds((int) foda.a.lK().k());
        long seconds2 = TimeUnit.MINUTES.toSeconds(h);
        long seconds3 = TimeUnit.MINUTES.toSeconds(h) + seconds;
        casd a2 = casd.a(context);
        catb catbVar = new catb();
        catbVar.t("no_backup_notification_service");
        catbVar.p = true;
        catbVar.u(z);
        catbVar.j = "com.google.android.gms.backup.component.NoBackupNotificationService";
        catbVar.e(seconds2, seconds3);
        a2.f(catbVar.b());
        a.j("Scheduled task to run in %d seconds, overriding: %b", Long.valueOf(seconds2), Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.component.NoBackupNotificationChimeraService.e(android.content.Context):void");
    }

    public static boolean f(Context context) {
        akgc.a();
        fohs.d();
        if (fodi.a.lK().e() && Build.VERSION.SDK_INT >= foda.f()) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.backup.component.NoBackupNotificationService");
            if (context.getPackageManager().resolveService(intent, 0) != null && new ajif(context).a() != null) {
                return true;
            }
        }
        return false;
    }

    private static synchronized int g(Context context) {
        int i;
        synchronized (NoBackupNotificationChimeraService.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.backup.component.NoBackupNotificationService", 0);
            i = sharedPreferences.getInt("times_shown", 0) + 1;
            if (!sharedPreferences.edit().putInt("times_shown", i).commit()) {
                a.m("Failed to write notification preferences", new Object[0]);
            }
            a.j("Times showed notification: %d", Integer.valueOf(i));
        }
        return i;
    }

    private static long h(int i) {
        String[] split = foda.a.lK().o().split(";");
        a.j("Current back off values: %s", Arrays.toString(split));
        return Long.valueOf(split[Math.min(i, split.length - 1)]).longValue();
    }

    private static void j(Context context) {
        auad auadVar = a;
        auadVar.j("About to reset notification count", new Object[0]);
        aued f = aued.f(context);
        if (fofw.c() && f == null) {
            auadVar.f("Unable to get NotificationManager.", new Object[0]);
            return;
        }
        f.o("com.google.android.backup.notification.no_backup.tag", 3, dhpk.BACKUP_INCOMPLETE);
        k(context);
        d(context, 0, true);
    }

    private static synchronized void k(Context context) {
        synchronized (NoBackupNotificationChimeraService.class) {
            auad auadVar = a;
            auadVar.j("Resetting the number of times shown.", new Object[0]);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.backup.component.NoBackupNotificationService", 0);
            if (sharedPreferences.getInt("times_shown", 0) == 0 || sharedPreferences.edit().putInt("times_shown", 0).commit()) {
                return;
            }
            auadVar.m("Failed to erase notification preferences", new Object[0]);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!f(this)) {
            a.j("Disabled, not running and not rescheduling", new Object[0]);
            return 2;
        }
        if (!new ajql(this).j()) {
            a.j("Backup is disabled, rescheduling.", new Object[0]);
            e(this);
            return 0;
        }
        aued f = aued.f(this);
        if (fofw.c() && f == null) {
            a.f("Unable to send notifications.", new Object[0]);
            return 2;
        }
        dhpk dhpkVar = dhpk.BACKUP_INCOMPLETE;
        Intent f2 = akfg.f();
        dymf.c(f2, emwi.NO_BACKUP_NOTIFICATION);
        PendingIntent activity = PendingIntent.getActivity(this, 0, f2, 134217728);
        fohs.a.lK().b();
        ajqm ajqmVar = ajqm.a;
        Notification.Builder contentText = aker.b(this).setContentIntent(activity).setAutoCancel(true).setContentTitle(getString(R.string.no_backup_notification_title)).setContentText(!ajqmVar.l(this) ? getString(R.string.no_backup_notification_text_missing_consent_bits) : getString(R.string.no_backup_notification_text));
        if (fodi.a.lK().h()) {
            contentText.setStyle(new Notification.BigTextStyle());
        }
        if (fodi.e()) {
            aker.d(this, contentText);
        } else {
            contentText.setSmallIcon(apzg.a(this, 2131232996)).setColor(getColor(R.color.quantum_googblue600));
        }
        f.w("com.google.android.backup.notification.no_backup.tag", 3, dhpkVar, contentText.build());
        int g = g(this);
        a.h("Showing notification, times: %d", Integer.valueOf(g));
        d(this, g, true);
        boolean l = ajqmVar.l(this);
        long h = h(g);
        fgrc v = enai.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        enai enaiVar = (enai) fgriVar;
        enaiVar.b |= 1;
        enaiVar.c = g;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        enai enaiVar2 = (enai) fgriVar2;
        enaiVar2.b = 2 | enaiVar2.b;
        enaiVar2.d = h;
        if (!fgriVar2.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        enai enaiVar3 = (enai) fgriVar3;
        enaiVar3.b |= 4;
        enaiVar3.e = l;
        if (!fgriVar3.L()) {
            v.U();
        }
        enai enaiVar4 = (enai) v.b;
        enaiVar4.h = 1;
        enaiVar4.b |= 32;
        allx.a((enai) v.Q());
        return 0;
    }
}
