package com.google.android.gms.backup.settings.notifications;

import com.google.android.gms.backup.settings.notifications.BackupNotificationsTask;
import defpackage.alsq;
import defpackage.alsu;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auub;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fobm;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxuv;
import defpackage.fxwd;
import defpackage.fyea;
import defpackage.fyeb;
import defpackage.fyfe;
import defpackage.fyqe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class BackupNotificationsTask extends Pommel_BackupNotificationsTask {
    public static final ausn a = ausn.b("BackupNotificationsTask", auid.BACKUP);
    public fxuv b;
    public alsu c;
    private final fxqu d = new fxre(new fxwd() { // from class: alsp
        @Override // defpackage.fxwd
        public final Object a() {
            fxuv fxuvVar = BackupNotificationsTask.this.b;
            if (fxuvVar == null) {
                fxxm.j("coroutineContext");
                fxuvVar = null;
            }
            return fyeb.b(fxuvVar);
        }
    });

    private final fyea j() {
        return (fyea) this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.fxun r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.alsr
            if (r0 == 0) goto L13
            r0 = r5
            alsr r0 = (defpackage.alsr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            alsr r0 = new alsr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fxuz r1 = defpackage.fxuz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fxrc.b(r5)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fxrc.b(r5)
            ausn r5 = com.google.android.gms.backup.settings.notifications.BackupNotificationsTask.a
            eltz r5 = r5.h()
            eluo r5 = (defpackage.eluo) r5
            java.lang.String r2 = "Running backup notifications task."
            r5.x(r2)
            alsu r5 = r4.c
            if (r5 != 0) goto L49
            java.lang.String r5 = "backupNotificationsTaskRunner"
            defpackage.fxxm.j(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.notifications.BackupNotificationsTask.d(fxun):java.lang.Object");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (fobm.a.lK().d() && auub.c()) {
            return fyqe.d(j(), new alsq(this, caufVar, null));
        }
        ((eluo) a.h()).x("Conditions for backup notifications task not met.");
        return eqgc.i(2);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        super.onDestroy();
        if (fyeb.g(j())) {
            fyeb.e(j(), fyfe.a("BackupNotificationsTask is being destroyed.", null));
        }
    }
}
