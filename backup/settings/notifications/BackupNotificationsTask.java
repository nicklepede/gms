package com.google.android.gms.backup.settings.notifications;

import com.google.android.gms.backup.settings.notifications.BackupNotificationsTask;
import defpackage.ajrx;
import defpackage.ajsb;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.ensj;
import defpackage.enss;
import defpackage.flkc;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fuyx;
import defpackage.fuyy;
import defpackage.fvaf;
import defpackage.fvic;
import defpackage.fvid;
import defpackage.fvie;
import defpackage.fvjg;
import defpackage.fvug;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class BackupNotificationsTask extends Pommel_BackupNotificationsTask {
    public static final asot a = asot.b("BackupNotificationsTask", asej.BACKUP);
    public fuyx b;
    public ajsb c;
    private final fuuw d = new fuvg(new fvaf() { // from class: ajrw
        @Override // defpackage.fvaf
        public final Object a() {
            fuyx fuyxVar = BackupNotificationsTask.this.b;
            if (fuyxVar == null) {
                fvbo.j("coroutineContext");
                fuyxVar = null;
            }
            return fvid.b(fuyxVar);
        }
    });

    private final fvic j() {
        return (fvic) this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.fuyp r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ajry
            if (r0 == 0) goto L13
            r0 = r5
            ajry r0 = (defpackage.ajry) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajry r0 = new ajry
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fuzb r1 = defpackage.fuzb.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fuve.b(r5)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fuve.b(r5)
            asot r5 = com.google.android.gms.backup.settings.notifications.BackupNotificationsTask.a
            ejgq r5 = r5.h()
            ejhf r5 = (defpackage.ejhf) r5
            java.lang.String r2 = "Running backup notifications task."
            r5.x(r2)
            ajsb r5 = r4.c
            if (r5 != 0) goto L49
            java.lang.String r5 = "backupNotificationsTaskRunner"
            defpackage.fvbo.j(r5)
            r5 = 0
        L49:
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            java.lang.Integer r5 = new java.lang.Integer
            r0 = 0
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.notifications.BackupNotificationsTask.d(fuyp):java.lang.Object");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        enss b;
        if (flkc.a.a().d() && asqh.c()) {
            b = fvug.b(j(), fuyy.a, fvie.a, new ajrx(this, bylnVar, null));
            return b;
        }
        ((ejhf) a.h()).x("Conditions for backup notifications task not met.");
        return ensj.i(2);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        super.onDestroy();
        if (fvid.g(j())) {
            fvid.e(j(), fvjg.a("BackupNotificationsTask is being destroyed.", null));
        }
    }
}
