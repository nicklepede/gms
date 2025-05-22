package com.google.android.gms.contactinteractions.service;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.arxc;
import defpackage.auid;
import defpackage.ausn;
import defpackage.avrp;
import defpackage.avrq;
import defpackage.avrr;
import defpackage.bzlt;
import defpackage.bzlv;
import defpackage.bzlw;
import defpackage.bzna;
import defpackage.casd;
import defpackage.cate;
import defpackage.catx;
import defpackage.caud;
import defpackage.cauf;
import defpackage.dpxc;
import defpackage.eqlq;
import defpackage.fpey;
import defpackage.fptq;
import defpackage.fpvd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ContactInteractionsChimeraTaskService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static arxc b;

    static {
        ausn.b("ContactInteractionsServ", auid.CONTACT_INTERACTIONS);
    }

    public static synchronized arxc e(Context context) {
        arxc arxcVar;
        synchronized (ContactInteractionsChimeraTaskService.class) {
            if (b == null) {
                b = dpxc.b(context, new eqlq());
            }
            arxcVar = b;
        }
        return arxcVar;
    }

    public static void f(Context context) {
        avrp.b(false, fpey.c(), fpey.j(), fpey.b(), fpey.h(), fpey.i(), fpey.g(), bzna.a(context, "contactinteractions", "contactinteractions_gms_prefs", 0));
        try {
            casd.a(context).c("com.google.android.gms.contactinteractions.service.ContactInteractionsTaskService");
        } catch (IllegalArgumentException unused) {
        }
    }

    public static void g(Context context, avrr avrrVar) {
        if (!fpey.f()) {
            f(context);
        } else if (j(context)) {
            h(context, avrrVar);
        }
    }

    public static void h(Context context, avrr avrrVar) {
        bzlv a2 = bzna.a(context, "contactinteractions", "contactinteractions_gms_prefs", 0);
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        long b2 = bzlw.b(a2, "clear_interaction_service_last_scheduled_timestamp", currentTimeMillis);
        bzlt c = a2.c();
        c.g("clear_interaction_service_last_scheduled_timestamp", currentTimeMillis);
        bzlw.f(c);
        boolean j = fpey.a.lK().e() ? j(context) : true;
        cate cateVar = new cate();
        cateVar.j = "com.google.android.gms.contactinteractions.service.ContactInteractionsTaskService";
        cateVar.t("com.google.android.gms.contactinteractions.service.ClearContactInteractionsPeriodicTask");
        cateVar.y(2, 2);
        cateVar.x(fpey.h() ? 1 : 0, 1);
        cateVar.i(fpey.i());
        cateVar.u(j);
        cateVar.p = fpey.g();
        long c2 = fpey.c();
        if (fpvd.a.lK().p()) {
            cateVar.e(c2, (long) (fptq.b() * c2), catx.a);
        } else {
            cateVar.a = c2;
            if (fpey.j()) {
                cateVar.b = fpey.b();
            }
        }
        avrp.b(true, fpey.c(), fpey.j(), fpey.b(), fpey.h(), fpey.i(), fpey.g(), a2);
        i(context, cateVar.b(), true != j ? 6 : 3, currentTimeMillis, uptimeMillis, b2, avrrVar);
    }

    public static void i(Context context, caud caudVar, int i, long j, long j2, long j3, avrr avrrVar) {
        int i2;
        try {
            casd.a(context).f(caudVar);
            i2 = 3;
        } catch (IllegalArgumentException unused) {
            i2 = 4;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = j - j3;
        avrrVar.a(i, i2, null, Long.valueOf(j), Long.valueOf(currentTimeMillis), Long.valueOf(uptimeMillis - j2), Long.valueOf(j4));
    }

    private static boolean j(Context context) {
        bzlv a2 = bzna.a(context, "contactinteractions", "contactinteractions_gms_prefs", 0);
        return (bzlw.i(a2, "clear_interactions_service_enabled", false) == fpey.f() && bzlw.b(a2, "clear_interactions_service_period_seconds", -1L) == fpey.c() && bzlw.i(a2, "clear_interactions_service_use_flex", false) == fpey.j() && bzlw.b(a2, "clear_interactions_service_flex_seconds", -1L) == fpey.b() && bzlw.i(a2, "clear_interactions_service_requires_charging", false) == fpey.h() && bzlw.i(a2, "clear_interactions_service_requires_device_idle", false) == fpey.i() && bzlw.i(a2, "clear_interactions_service_persist_task", false) == fpey.g()) ? false : true;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            return 0;
        }
        return d(caufVar, new avrr(this, new avrq() { // from class: avro
            @Override // defpackage.avrq
            public final arxc a() {
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
    final int d(defpackage.cauf r23, defpackage.avrr r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.lang.String r1 = r1.a
            java.lang.String r2 = "com.google.android.gms.contactinteractions.service.ClearContactInteractionsPeriodicTask"
            boolean r3 = r1.equals(r2)
            r4 = 2
            if (r3 == 0) goto L15
            boolean r3 = defpackage.fpey.f()
            if (r3 != 0) goto L23
        L15:
            java.lang.String r3 = "com.google.android.gms.contactinteractions.service.ClearContactInteractionsOneOffTask"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto Ldf
            boolean r3 = defpackage.fpey.e()
            if (r3 == 0) goto Ldf
        L23:
            java.lang.String r3 = "contactinteractions"
            java.lang.String r5 = "contactinteractions_gms_prefs"
            r6 = 0
            bzlv r3 = defpackage.bzna.a(r0, r3, r5, r6)
            long r7 = android.os.SystemClock.uptimeMillis()
            long r9 = java.lang.System.currentTimeMillis()
            long r11 = defpackage.avrp.a(r9, r3)
            bzlt r3 = r3.c()
            java.lang.String r5 = "clear_interactions_service_last_run_timestamp"
            r3.g(r5, r9)
            defpackage.bzlw.f(r3)
            java.lang.String r3 = "android.permission.WRITE_CONTACTS"
            int r3 = defpackage.ind.a(r0, r3)
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
            android.database.Cursor r3 = defpackage.bsxc.b(r14, r15, r16, r17, r18, r19)
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
            defpackage.fxxm.f(r14, r15)     // Catch: java.lang.Throwable -> La3 java.lang.IllegalArgumentException -> La5
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService.d(cauf, avrr):int");
    }
}
