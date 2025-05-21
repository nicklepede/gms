package com.google.android.gms.backup.transport.component;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.backup.transport.component.CustomBackupNewScheduleLoggingTask;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ahwd;
import defpackage.ahwj;
import defpackage.akdr;
import defpackage.akds;
import defpackage.akdx;
import defpackage.arxo;
import defpackage.byjl;
import defpackage.byko;
import defpackage.bykv;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ekhk;
import defpackage.ekhl;
import defpackage.ekko;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.flnr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CustomBackupNewScheduleLoggingTask extends GmsTaskBoundService {
    private static final arxo a = ahwd.a("CustomBackupNewScheduleLog");
    private final eijr b = eijy.a(new eijr() { // from class: akdt
        @Override // defpackage.eijr
        public final Object a() {
            return new akdx();
        }
    });
    private final eijr c = eijy.a(new eijr() { // from class: akdu
        @Override // defpackage.eijr
        public final Object a() {
            return ahxq.a(CustomBackupNewScheduleLoggingTask.this);
        }
    });

    public static void d(Context context) {
        if (!e()) {
            a.j("Not scheduling, disabled.", new Object[0]);
            return;
        }
        akdx akdxVar = new akdx();
        if (!e()) {
            a.j("Not scheduling, disabled.", new Object[0]);
            return;
        }
        akdr a2 = akds.a(context);
        byko bykoVar = new byko();
        bykoVar.w("com.google.android.gms.backup.transport.component.CustomBackupNewScheduleLoggingTask");
        bykoVar.t("custom_backup_schedule_logging");
        bykoVar.l(true);
        bykoVar.p = true;
        bykv bykvVar = bykv.j;
        flnr flnrVar = flnr.a;
        int a3 = (int) flnrVar.a().a();
        if (a3 != -1) {
            bykvVar = bykv.e(a3);
        }
        bykoVar.a = bykvVar;
        if (flnr.a.a().l()) {
            bykoVar.v(1);
        } else {
            bykoVar.v(2);
        }
        boolean z = a2.a;
        if (z) {
            bykoVar.k();
        }
        boolean z2 = a2.c;
        if (z2) {
            bykoVar.e();
        }
        byjl.a(context).f(bykoVar.b());
        a.j("Task is scheduled to run", new Object[0]);
        int i = bykvVar.g;
        fecj v = ekko.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ekko ekkoVar = (ekko) fecpVar;
        ekkoVar.b = 1 | ekkoVar.b;
        ekkoVar.c = z;
        if (!fecpVar.L()) {
            v.U();
        }
        ekko ekkoVar2 = (ekko) v.b;
        ekkoVar2.b |= 2;
        ekkoVar2.d = z2;
        if (flnrVar.a().h()) {
            if (!v.b.L()) {
                v.U();
            }
            ekko ekkoVar3 = (ekko) v.b;
            ekkoVar3.b |= 4;
            ekkoVar3.e = i;
        }
        fecj c = ahwj.c();
        ekko ekkoVar4 = (ekko) v.Q();
        if (!c.b.L()) {
            c.U();
        }
        ekhl ekhlVar = (ekhl) c.b;
        ekhl ekhlVar2 = ekhl.a;
        ekkoVar4.getClass();
        ekhlVar.aw = ekkoVar4;
        ekhlVar.d |= 2097152;
        akdxVar.a((ekhl) c.Q(), ekhk.CUSTOM_BACKUP_NEW_SCHEDULE_LOGGING_SCHEDULED);
    }

    private static boolean e() {
        return flnr.a.a().c() && Build.VERSION.SDK_INT >= 26;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (getPackageManager().getPackageInfo("com.google.android.apps.photos", 0).versionCode >= 222407) goto L39;
     */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r12) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.transport.component.CustomBackupNewScheduleLoggingTask.a(byln):int");
    }
}
