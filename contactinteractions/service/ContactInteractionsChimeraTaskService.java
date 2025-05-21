package com.google.android.gms.contactinteractions.service;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.apul;
import defpackage.asej;
import defpackage.asot;
import defpackage.atnm;
import defpackage.atnn;
import defpackage.atno;
import defpackage.bxdd;
import defpackage.bxdf;
import defpackage.bxdg;
import defpackage.bxek;
import defpackage.byjl;
import defpackage.bykm;
import defpackage.bylf;
import defpackage.byll;
import defpackage.byln;
import defpackage.dnmt;
import defpackage.enxx;
import defpackage.fmnc;
import defpackage.fnbr;
import defpackage.fnde;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ContactInteractionsChimeraTaskService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static apul b;

    static {
        asot.b("ContactInteractionsServ", asej.CONTACT_INTERACTIONS);
    }

    public static synchronized apul e(Context context) {
        apul apulVar;
        synchronized (ContactInteractionsChimeraTaskService.class) {
            if (b == null) {
                b = dnmt.b(context, new enxx());
            }
            apulVar = b;
        }
        return apulVar;
    }

    public static void f(Context context) {
        atnm.b(false, fmnc.c(), fmnc.j(), fmnc.b(), fmnc.h(), fmnc.i(), fmnc.g(), bxek.a(context, "contactinteractions", "contactinteractions_gms_prefs", 0));
        try {
            byjl.a(context).c("com.google.android.gms.contactinteractions.service.ContactInteractionsTaskService");
        } catch (IllegalArgumentException unused) {
        }
    }

    public static void g(Context context, atno atnoVar) {
        if (!fmnc.f()) {
            f(context);
        } else if (j(context)) {
            h(context, atnoVar);
        }
    }

    public static void h(Context context, atno atnoVar) {
        bxdf a2 = bxek.a(context, "contactinteractions", "contactinteractions_gms_prefs", 0);
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        long b2 = bxdg.b(a2, "clear_interaction_service_last_scheduled_timestamp", currentTimeMillis);
        bxdd c = a2.c();
        c.g("clear_interaction_service_last_scheduled_timestamp", currentTimeMillis);
        bxdg.f(c);
        boolean j = fmnc.a.a().e() ? j(context) : true;
        bykm bykmVar = new bykm();
        bykmVar.j = "com.google.android.gms.contactinteractions.service.ContactInteractionsTaskService";
        bykmVar.t("com.google.android.gms.contactinteractions.service.ClearContactInteractionsPeriodicTask");
        bykmVar.y(2, 2);
        bykmVar.x(fmnc.h() ? 1 : 0, 1);
        bykmVar.i(fmnc.i());
        bykmVar.u(j);
        bykmVar.p = fmnc.g();
        long c2 = fmnc.c();
        if (fnde.a.a().p()) {
            bykmVar.e(c2, (long) (fnbr.b() * c2), bylf.a);
        } else {
            bykmVar.a = c2;
            if (fmnc.j()) {
                bykmVar.b = fmnc.b();
            }
        }
        atnm.b(true, fmnc.c(), fmnc.j(), fmnc.b(), fmnc.h(), fmnc.i(), fmnc.g(), a2);
        i(context, bykmVar.b(), true != j ? 6 : 3, currentTimeMillis, uptimeMillis, b2, atnoVar);
    }

    public static void i(Context context, byll byllVar, int i, long j, long j2, long j3, atno atnoVar) {
        int i2;
        try {
            byjl.a(context).f(byllVar);
            i2 = 3;
        } catch (IllegalArgumentException unused) {
            i2 = 4;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = j - j3;
        atnoVar.a(i, i2, null, Long.valueOf(j), Long.valueOf(currentTimeMillis), Long.valueOf(uptimeMillis - j2), Long.valueOf(j4));
    }

    private static boolean j(Context context) {
        bxdf a2 = bxek.a(context, "contactinteractions", "contactinteractions_gms_prefs", 0);
        return (bxdg.i(a2, "clear_interactions_service_enabled", false) == fmnc.f() && bxdg.b(a2, "clear_interactions_service_period_seconds", -1L) == fmnc.c() && bxdg.i(a2, "clear_interactions_service_use_flex", false) == fmnc.j() && bxdg.b(a2, "clear_interactions_service_flex_seconds", -1L) == fmnc.b() && bxdg.i(a2, "clear_interactions_service_requires_charging", false) == fmnc.h() && bxdg.i(a2, "clear_interactions_service_requires_device_idle", false) == fmnc.i() && bxdg.i(a2, "clear_interactions_service_persist_task", false) == fmnc.g()) ? false : true;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            return 0;
        }
        return d(bylnVar, new atno(this, new atnn() { // from class: atnl
            @Override // defpackage.atnn
            public final apul a() {
                return ContactInteractionsChimeraTaskService.e(ContactInteractionsChimeraTaskService.this);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int d(defpackage.byln r23, defpackage.atno r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.lang.String r1 = r1.a
            java.lang.String r2 = "com.google.android.gms.contactinteractions.service.ClearContactInteractionsPeriodicTask"
            boolean r3 = r1.equals(r2)
            r4 = 2
            if (r3 == 0) goto L15
            boolean r3 = defpackage.fmnc.f()
            if (r3 != 0) goto L23
        L15:
            java.lang.String r3 = "com.google.android.gms.contactinteractions.service.ClearContactInteractionsOneOffTask"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto Ldf
            boolean r3 = defpackage.fmnc.e()
            if (r3 == 0) goto Ldf
        L23:
            java.lang.String r3 = "contactinteractions"
            java.lang.String r5 = "contactinteractions_gms_prefs"
            r6 = 0
            bxdf r3 = defpackage.bxek.a(r0, r3, r5, r6)
            long r7 = android.os.SystemClock.uptimeMillis()
            long r9 = java.lang.System.currentTimeMillis()
            long r11 = defpackage.atnm.a(r9, r3)
            bxdd r3 = r3.c()
            java.lang.String r5 = "clear_interactions_service_last_run_timestamp"
            r3.g(r5, r9)
            defpackage.bxdg.f(r3)
            java.lang.String r3 = "android.permission.WRITE_CONTACTS"
            int r3 = defpackage.iln.a(r0, r3)
            r5 = 3
            r13 = 0
            if (r3 == 0) goto L54
            r3 = 7
            r16 = r3
            r17 = r13
            goto Lab
        L54:
            java.lang.String r3 = "_count"
            java.lang.String[] r16 = new java.lang.String[]{r3}
            android.content.ContentResolver r14 = r0.getContentResolver()
            java.lang.String r3 = "0"
            java.lang.String[] r18 = new java.lang.String[]{r3, r3}
            java.lang.String r17 = "times_contacted>? OR last_time_contacted>?"
            r19 = 0
            java.lang.String r15 = "content://com.android.contacts/raw_contacts"
            android.database.Cursor r3 = defpackage.bqpl.b(r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L81
            int r14 = r3.getCount()
            if (r14 <= 0) goto L81
            r3.moveToFirst()
            int r14 = r3.getInt(r6)
            r3.close()
            goto L82
        L81:
            r14 = r6
        L82:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            android.content.ContentResolver r14 = r0.getContentResolver()     // Catch: java.lang.Throwable -> La3 java.lang.IllegalArgumentException -> La5
            java.lang.String r15 = "contentResolver"
            java.lang.String r16 = "content://com.android.contacts/contacts/delete_usage"
            defpackage.fvbo.f(r14, r15)     // Catch: java.lang.Throwable -> La3 java.lang.IllegalArgumentException -> La5
            android.net.Uri r15 = android.net.Uri.parse(r16)     // Catch: java.lang.Throwable -> La3 java.lang.IllegalArgumentException -> La5
            int r13 = r14.delete(r15, r13, r13)     // Catch: java.lang.Throwable -> La3 java.lang.IllegalArgumentException -> La5
            r17 = r3
            if (r13 <= 0) goto La0
            r16 = r5
            goto Lab
        La0:
            r16 = r4
            goto Lab
        La3:
            r13 = 4
            goto La7
        La5:
            r13 = 8
        La7:
            r17 = r3
            r16 = r13
        Lab:
            long r13 = java.lang.System.currentTimeMillis()
            long r18 = android.os.SystemClock.uptimeMillis()
            boolean r1 = r1.equals(r2)
            r2 = 1
            if (r2 == r1) goto Lbd
            r1 = 5
            r15 = r1
            goto Lbe
        Lbd:
            r15 = r4
        Lbe:
            r1 = r18
            java.lang.Long r18 = java.lang.Long.valueOf(r9)
            java.lang.Long r19 = java.lang.Long.valueOf(r13)
            long r1 = r1 - r7
            long r9 = r9 - r11
            java.lang.Long r20 = java.lang.Long.valueOf(r1)
            java.lang.Long r21 = java.lang.Long.valueOf(r9)
            r14 = r24
            r14.a(r15, r16, r17, r18, r19, r20, r21)
            r13 = r16
            g(r0, r14)
            if (r13 != r5) goto Ldf
            return r6
        Ldf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.d(byln, atno):int");
    }
}
