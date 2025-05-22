package com.google.android.gms.backup.transport.component;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.backup.transport.component.CustomBackupNewScheduleLoggingTask;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ajwt;
import defpackage.ajwv;
import defpackage.ajwz;
import defpackage.ameo;
import defpackage.amep;
import defpackage.ameu;
import defpackage.auad;
import defpackage.casd;
import defpackage.catg;
import defpackage.catn;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.emuw;
import defpackage.emux;
import defpackage.emya;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fofb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CustomBackupNewScheduleLoggingTask extends GmsTaskBoundService {
    private static final auad a = ajwt.a("CustomBackupNewScheduleLog");
    private final ekww b = ekxd.a(new ekww() { // from class: ameq
        @Override // defpackage.ekww
        public final Object lK() {
            return new ameu();
        }
    });
    private final ekww c = ekxd.a(new ekww() { // from class: amer
        @Override // defpackage.ekww
        public final Object lK() {
            return ajyg.a(CustomBackupNewScheduleLoggingTask.this);
        }
    });

    public static void d(Context context) {
        if (!e()) {
            a.j("Not scheduling, disabled.", new Object[0]);
            return;
        }
        new ameu();
        if (!e()) {
            a.j("Not scheduling, disabled.", new Object[0]);
            return;
        }
        ameo a2 = amep.a(context);
        catg catgVar = new catg();
        catgVar.w("com.google.android.gms.backup.transport.component.CustomBackupNewScheduleLoggingTask");
        catgVar.t("custom_backup_schedule_logging");
        catgVar.l(true);
        catgVar.p = true;
        catn catnVar = catn.j;
        fofb fofbVar = fofb.a;
        int a3 = (int) fofbVar.lK().a();
        if (a3 != -1) {
            catnVar = catn.e(a3);
        }
        catgVar.a = catnVar;
        if (fofbVar.lK().l()) {
            catgVar.v(1);
        } else {
            catgVar.v(2);
        }
        boolean z = a2.a;
        if (z) {
            catgVar.k();
        }
        boolean z2 = a2.c;
        if (z2) {
            catgVar.e();
        }
        casd.a(context).f(catgVar.b());
        a.j("Task is scheduled to run", new Object[0]);
        int i = catnVar.g;
        fgrc v = emya.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        emya emyaVar = (emya) fgriVar;
        emyaVar.b = 1 | emyaVar.b;
        emyaVar.c = z;
        if (!fgriVar.L()) {
            v.U();
        }
        emya emyaVar2 = (emya) v.b;
        emyaVar2.b |= 2;
        emyaVar2.d = z2;
        if (fofbVar.lK().h()) {
            if (!v.b.L()) {
                v.U();
            }
            emya emyaVar3 = (emya) v.b;
            emyaVar3.b |= 4;
            emyaVar3.e = i;
        }
        fgrc c = ajwz.c();
        emya emyaVar4 = (emya) v.Q();
        if (!c.b.L()) {
            c.U();
        }
        emux emuxVar = (emux) c.b;
        emux emuxVar2 = emux.a;
        emyaVar4.getClass();
        emuxVar.aw = emyaVar4;
        emuxVar.d |= 2097152;
        ajwv.a((emux) c.Q(), emuw.CUSTOM_BACKUP_NEW_SCHEDULE_LOGGING_SCHEDULED);
    }

    private static boolean e() {
        return fofb.a.lK().c() && Build.VERSION.SDK_INT >= 26;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (getPackageManager().getPackageInfo("com.google.android.apps.photos", 0).versionCode >= 222407) goto L39;
     */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r12) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.transport.component.CustomBackupNewScheduleLoggingTask.a(cauf):int");
    }
}
