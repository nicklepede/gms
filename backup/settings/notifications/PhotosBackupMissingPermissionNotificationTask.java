package com.google.android.gms.backup.settings.notifications;

import com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ahwd;
import defpackage.ajru;
import defpackage.ajsw;
import defpackage.arxo;
import defpackage.asnv;
import defpackage.asnz;
import defpackage.bqpn;
import defpackage.byln;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.enss;
import defpackage.fuyx;
import defpackage.fuyy;
import defpackage.fvbo;
import defpackage.fvid;
import defpackage.fvie;
import defpackage.fvug;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PhotosBackupMissingPermissionNotificationTask extends GmsTaskBoundService {
    public static final arxo a = ahwd.a("PhotosBackupMissingPermissionNotificationTask");
    public final asnv b;
    private final eijr c;
    private final eijr d;
    private final eijr e;
    private final eijr f;
    private final ajru g;

    public PhotosBackupMissingPermissionNotificationTask() {
        eijr a2 = eijy.a(new eijr() { // from class: ajsq
            @Override // defpackage.eijr
            public final Object a() {
                return ahxq.a(PhotosBackupMissingPermissionNotificationTask.this);
            }
        });
        fvbo.e(a2, "memoize(...)");
        this.c = a2;
        eijr a3 = eijy.a(new eijr() { // from class: ajsr
            @Override // defpackage.eijr
            public final Object a() {
                return ahxo.b(PhotosBackupMissingPermissionNotificationTask.this);
            }
        });
        fvbo.e(a3, "memoize(...)");
        this.d = a3;
        eijr a4 = eijy.a(new eijr() { // from class: ajss
            @Override // defpackage.eijr
            public final Object a() {
                return ahww.a(PhotosBackupMissingPermissionNotificationTask.this);
            }
        });
        fvbo.e(a4, "memoize(...)");
        this.e = a4;
        this.b = asnz.a;
        eijr a5 = eijy.a(new eijr() { // from class: ajst
            @Override // defpackage.eijr
            public final Object a() {
                PhotosBackupMissingPermissionNotificationTask photosBackupMissingPermissionNotificationTask = PhotosBackupMissingPermissionNotificationTask.this;
                return new ajsp(photosBackupMissingPermissionNotificationTask, photosBackupMissingPermissionNotificationTask.b);
            }
        });
        fvbo.e(a5, "memoize(...)");
        this.f = a5;
        this.g = new ajru();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.fuyp r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ajsv
            if (r0 == 0) goto L13
            r0 = r6
            ajsv r0 = (defpackage.ajsv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajsv r0 = new ajsv
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fuzb r1 = defpackage.fuzb.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fuve.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fuve.b(r6)
            eijr r6 = r5.e
            java.lang.Object r6 = r6.a()
            dvzj r6 = (defpackage.dvzj) r6
            dvzs r2 = defpackage.dvzs.a
            java.lang.String r4 = "getDefaultInstance(...)"
            defpackage.fvbo.e(r2, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.dvzj.c(r6, r2, r0)
            if (r6 == r1) goto L6e
        L49:
            dvzv r6 = (defpackage.dvzv) r6
            r0 = 2
            dvzu[] r0 = new defpackage.dvzu[r0]
            r1 = 0
            dvzu r2 = defpackage.dvzu.RESTORE_SCREEN
            r0[r1] = r2
            dvzu r1 = defpackage.dvzu.BACKUP_AND_PHOTOS_TOGGLES
            r0[r3] = r1
            java.util.List r0 = defpackage.fuwt.f(r0)
            int r6 = r6.b
            dvzu r6 = defpackage.dvzu.b(r6)
            if (r6 != 0) goto L65
            dvzu r6 = defpackage.dvzu.UNSPECIFIED
        L65:
            boolean r6 = r0.contains(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask.d(fuyp):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0109, code lost:
    
        if (r1 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (r0 != r2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.fuyp r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask.e(fuyp):java.lang.Object");
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
    public final java.lang.Object f(defpackage.fuyp r12) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask.f(fuyp):java.lang.Object");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        enss b;
        fuyx fuyxVar = bqpn.a;
        b = fvug.b(fvid.b(bqpn.b), fuyy.a, fvie.a, new ajsw(this, bylnVar, null));
        return b;
    }
}
