package com.google.android.gms.backup.settings.notifications;

import com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ajwt;
import defpackage.alsn;
import defpackage.altp;
import defpackage.auad;
import defpackage.aurp;
import defpackage.aurt;
import defpackage.bsxe;
import defpackage.cauf;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eqgl;
import defpackage.fxuv;
import defpackage.fxxm;
import defpackage.fyeb;
import defpackage.fyqe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class PhotosBackupMissingPermissionNotificationTask extends GmsTaskBoundService {
    public static final auad a = ajwt.a("PhotosBackupMissingPermissionNotificationTask");
    public final aurp b;
    private final ekww c;
    private final ekww d;
    private final ekww e;
    private final ekww f;
    private final alsn g;

    public PhotosBackupMissingPermissionNotificationTask() {
        ekww a2 = ekxd.a(new ekww() { // from class: altj
            @Override // defpackage.ekww
            public final Object lK() {
                return ajyg.a(PhotosBackupMissingPermissionNotificationTask.this);
            }
        });
        fxxm.e(a2, "memoize(...)");
        this.c = a2;
        ekww a3 = ekxd.a(new ekww() { // from class: altk
            @Override // defpackage.ekww
            public final Object lK() {
                return ajye.b(PhotosBackupMissingPermissionNotificationTask.this);
            }
        });
        fxxm.e(a3, "memoize(...)");
        this.d = a3;
        ekww a4 = ekxd.a(new ekww() { // from class: altl
            @Override // defpackage.ekww
            public final Object lK() {
                return ajxm.a(PhotosBackupMissingPermissionNotificationTask.this);
            }
        });
        fxxm.e(a4, "memoize(...)");
        this.e = a4;
        this.b = aurt.a;
        ekww a5 = ekxd.a(new ekww() { // from class: altm
            @Override // defpackage.ekww
            public final Object lK() {
                PhotosBackupMissingPermissionNotificationTask photosBackupMissingPermissionNotificationTask = PhotosBackupMissingPermissionNotificationTask.this;
                return new alti(photosBackupMissingPermissionNotificationTask, photosBackupMissingPermissionNotificationTask.b);
            }
        });
        fxxm.e(a5, "memoize(...)");
        this.f = a5;
        this.g = new alsn();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.fxun r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.alto
            if (r0 == 0) goto L13
            r0 = r6
            alto r0 = (defpackage.alto) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            alto r0 = new alto
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fxuz r1 = defpackage.fxuz.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fxrc.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fxrc.b(r6)
            ekww r6 = r5.e
            java.lang.Object r6 = r6.lK()
            dylk r6 = (defpackage.dylk) r6
            dylt r2 = defpackage.dylt.a
            java.lang.String r4 = "getDefaultInstance(...)"
            defpackage.fxxm.e(r2, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.dylk.c(r6, r2, r0)
            if (r6 == r1) goto L6e
        L49:
            dylw r6 = (defpackage.dylw) r6
            r0 = 2
            dylv[] r0 = new defpackage.dylv[r0]
            r1 = 0
            dylv r2 = defpackage.dylv.RESTORE_SCREEN
            r0[r1] = r2
            dylv r1 = defpackage.dylv.BACKUP_AND_PHOTOS_TOGGLES
            r0[r3] = r1
            java.util.List r0 = defpackage.fxsr.f(r0)
            int r6 = r6.b
            dylv r6 = defpackage.dylv.b(r6)
            if (r6 != 0) goto L65
            dylv r6 = defpackage.dylv.UNSPECIFIED
        L65:
            boolean r6 = r0.contains(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask.d(fxun):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x010a, code lost:
    
        if (r2 != r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        if (r1 != r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.fxun r17) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask.e(fxun):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x013d, code lost:
    
        if (r12 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01b7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012d, code lost:
    
        if (r12 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        if (r12 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.fxun r12) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask.f(fxun):java.lang.Object");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        fxuv fxuvVar = bsxe.a;
        return fyqe.d(fyeb.b(bsxe.b), new altp(this, caufVar, null));
    }
}
