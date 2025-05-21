package com.google.android.gms.backup.settings.component;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.ahhp;
import defpackage.ahpv;
import defpackage.ahpw;
import defpackage.ahwd;
import defpackage.aieb;
import defpackage.aieq;
import defpackage.aifm;
import defpackage.ajlf;
import defpackage.anxo;
import defpackage.arxo;
import defpackage.asbo;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.dfee;
import defpackage.dwae;
import defpackage.ekiw;
import defpackage.ekmw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fllq;
import defpackage.flly;
import defpackage.flom;
import defpackage.flqi;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class NoBackupNotificationChimeraService extends GmsTaskChimeraService {
    public static final arxo a = ahwd.a("NoBackupNotification");

    public static void d(Context context, int i, boolean z) {
        long h = h(i);
        long seconds = TimeUnit.MINUTES.toSeconds((int) fllq.a.a().k());
        long seconds2 = TimeUnit.MINUTES.toSeconds(h);
        long seconds3 = TimeUnit.MINUTES.toSeconds(h) + seconds;
        byjl a2 = byjl.a(context);
        bykj bykjVar = new bykj();
        bykjVar.t("no_backup_notification_service");
        bykjVar.p = true;
        bykjVar.u(z);
        bykjVar.j = "com.google.android.gms.backup.component.NoBackupNotificationService";
        bykjVar.e(seconds2, seconds3);
        a2.f(bykjVar.b());
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
        aifm.a();
        flqi.d();
        if (flly.a.a().e() && Build.VERSION.SDK_INT >= fllq.f()) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.backup.component.NoBackupNotificationService");
            if (context.getPackageManager().resolveService(intent, 0) != null && new ahhp(context).a() != null) {
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
        String[] split = fllq.a.a().o().split(";");
        a.j("Current back off values: %s", Arrays.toString(split));
        return Long.valueOf(split[Math.min(i, split.length - 1)]).longValue();
    }

    private static void j(Context context) {
        arxo arxoVar = a;
        arxoVar.j("About to reset notification count", new Object[0]);
        asbo f = asbo.f(context);
        if (flom.c() && f == null) {
            arxoVar.f("Unable to get NotificationManager.", new Object[0]);
            return;
        }
        f.o("com.google.android.backup.notification.no_backup.tag", 3, dfee.BACKUP_INCOMPLETE);
        k(context);
        d(context, 0, true);
    }

    private static synchronized void k(Context context) {
        synchronized (NoBackupNotificationChimeraService.class) {
            arxo arxoVar = a;
            arxoVar.j("Resetting the number of times shown.", new Object[0]);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.backup.component.NoBackupNotificationService", 0);
            if (sharedPreferences.getInt("times_shown", 0) == 0 || sharedPreferences.edit().putInt("times_shown", 0).commit()) {
                return;
            }
            arxoVar.m("Failed to erase notification preferences", new Object[0]);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!f(this)) {
            a.j("Disabled, not running and not rescheduling", new Object[0]);
            return 2;
        }
        if (!new ahpv(this).k()) {
            a.j("Backup is disabled, rescheduling.", new Object[0]);
            e(this);
            return 0;
        }
        asbo f = asbo.f(this);
        if (flom.c() && f == null) {
            a.f("Unable to send notifications.", new Object[0]);
            return 2;
        }
        dfee dfeeVar = dfee.BACKUP_INCOMPLETE;
        Intent f2 = aieq.f();
        dwae.c(f2, ekiw.NO_BACKUP_NOTIFICATION);
        PendingIntent activity = PendingIntent.getActivity(this, 0, f2, 134217728);
        flqi.a.a().b();
        ahpw ahpwVar = ahpw.a;
        Notification.Builder contentText = aieb.b(this).setContentIntent(activity).setAutoCancel(true).setContentTitle(getString(R.string.no_backup_notification_title)).setContentText(!ahpwVar.l(this) ? getString(R.string.no_backup_notification_text_missing_consent_bits) : getString(R.string.no_backup_notification_text));
        if (flly.a.a().h()) {
            contentText.setStyle(new Notification.BigTextStyle());
        }
        if (flly.e()) {
            aieb.d(this, contentText);
        } else {
            contentText.setSmallIcon(anxo.a(this, 2131232932)).setColor(getColor(R.color.quantum_googblue600));
        }
        f.w("com.google.android.backup.notification.no_backup.tag", 3, dfeeVar, contentText.build());
        int g = g(this);
        a.h("Showing notification, times: %d", Integer.valueOf(g));
        d(this, g, true);
        boolean l = ahpwVar.l(this);
        long h = h(g);
        fecj v = ekmw.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ekmw ekmwVar = (ekmw) fecpVar;
        ekmwVar.b |= 1;
        ekmwVar.c = g;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        ekmw ekmwVar2 = (ekmw) fecpVar2;
        ekmwVar2.b = 2 | ekmwVar2.b;
        ekmwVar2.d = h;
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        ekmw ekmwVar3 = (ekmw) fecpVar3;
        ekmwVar3.b |= 4;
        ekmwVar3.e = l;
        if (!fecpVar3.L()) {
            v.U();
        }
        ekmw ekmwVar4 = (ekmw) v.b;
        ekmwVar4.h = 1;
        ekmwVar4.b |= 32;
        ajlf.a((ekmw) v.Q());
        return 0;
    }
}
