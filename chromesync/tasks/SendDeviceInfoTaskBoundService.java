package com.google.android.gms.chromesync.tasks;

import com.google.android.gms.chromesync.tasks.SendDeviceInfoTaskBoundService;
import defpackage.fxqo;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class SendDeviceInfoTaskBoundService extends Pommel_SendDeviceInfoTaskBoundService {
    public fxqo a;
    private final fxqu b = new fxre(new fxwd() { // from class: artl
        @Override // defpackage.fxwd
        public final Object a() {
            fxqo fxqoVar = SendDeviceInfoTaskBoundService.this.a;
            if (fxqoVar == null) {
                fxxm.j("deviceInfoManagerProvider");
                fxqoVar = null;
            }
            return ((arrf) fxqoVar).b();
        }
    });

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        return 0;
     */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.cauf r13) {
        /*
            r12 = this;
            java.lang.String r13 = r13.a
            java.lang.String r0 = "SendDeviceInfoTaskTag"
            boolean r13 = r13.equals(r0)
            r0 = 2
            if (r13 == 0) goto Ld2
            fxqu r13 = r12.b
            java.lang.Object r13 = r13.a()
            arre r13 = (defpackage.arre) r13
            bohh r1 = r13.d     // Catch: defpackage.wjw -> Lc6
            java.util.List r1 = r1.a()     // Catch: defpackage.wjw -> Lc6
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = r2
        L1f:
            boolean r4 = r1.hasNext()
            r5 = 0
            if (r4 == 0) goto Lc2
            java.lang.Object r4 = r1.next()
            bohl r4 = (defpackage.bohl) r4
            arro r6 = r13.c     // Catch: defpackage.arhe -> Lb3
            defpackage.fxxm.c(r4)     // Catch: defpackage.arhe -> Lb3
            evrj r6 = r6.b(r4)     // Catch: defpackage.arhe -> Lb3
            foxn r7 = defpackage.foxn.a     // Catch: defpackage.arhe -> Lb3
            foxo r8 = r7.lK()     // Catch: defpackage.arhe -> Lb3
            boolean r8 = r8.i()     // Catch: defpackage.arhe -> Lb3
            if (r8 == 0) goto L6e
            if (r6 == 0) goto L59
            ausn r8 = defpackage.arre.a     // Catch: defpackage.arhe -> Lb3
            eltz r8 = r8.j()     // Catch: defpackage.arhe -> Lb3
            eluo r8 = (defpackage.eluo) r8     // Catch: defpackage.arhe -> Lb3
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS     // Catch: defpackage.arhe -> Lb3
            eltz r8 = r8.o(r2, r9)     // Catch: defpackage.arhe -> Lb3
            eluo r8 = (defpackage.eluo) r8     // Catch: defpackage.arhe -> Lb3
            java.lang.String r9 = "Fetched metadata during periodic task."
            r8.x(r9)     // Catch: defpackage.arhe -> Lb3
            goto L6e
        L59:
            ausn r8 = defpackage.arre.a     // Catch: defpackage.arhe -> Lb3
            eltz r8 = r8.j()     // Catch: defpackage.arhe -> Lb3
            eluo r8 = (defpackage.eluo) r8     // Catch: defpackage.arhe -> Lb3
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS     // Catch: defpackage.arhe -> Lb3
            eltz r8 = r8.o(r2, r9)     // Catch: defpackage.arhe -> Lb3
            eluo r8 = (defpackage.eluo) r8     // Catch: defpackage.arhe -> Lb3
            java.lang.String r9 = "Fetched empty metadata during periodic task."
            r8.x(r9)     // Catch: defpackage.arhe -> Lb3
        L6e:
            if (r6 == 0) goto L1f
            arlo r8 = r13.b     // Catch: defpackage.arhe -> Lb3
            arnb r9 = defpackage.arlo.m     // Catch: defpackage.arhe -> Lb3
            java.lang.Object r8 = r8.g(r4, r9)     // Catch: defpackage.arhe -> Lb3
            java.lang.String r9 = "get(...)"
            defpackage.fxxm.e(r8, r9)     // Catch: defpackage.arhe -> Lb3
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: defpackage.arhe -> Lb3
            long r8 = r8.longValue()     // Catch: defpackage.arhe -> Lb3
            aurp r10 = r13.e     // Catch: defpackage.arhe -> Lb3
            long r10 = java.lang.System.currentTimeMillis()     // Catch: defpackage.arhe -> Lb3
            long r10 = r10 - r8
            foxo r7 = r7.lK()     // Catch: defpackage.arhe -> Lb3
            long r7 = r7.a()     // Catch: defpackage.arhe -> Lb3
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 >= 0) goto L9c
            r7 = 0
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 > 0) goto Lc5
        L9c:
            fgpr r7 = r13.c(r4)     // Catch: defpackage.arhe -> Lb3
            if (r7 != 0) goto Lae
            java.lang.String r6 = r6.c     // Catch: defpackage.arhe -> Lb3
            java.lang.String r7 = "getBirthday(...)"
            defpackage.fxxm.e(r6, r7)     // Catch: defpackage.arhe -> Lb3
            r13.a(r4, r6)     // Catch: defpackage.arhe -> Lb3
            goto L1f
        Lae:
            r13.d(r4, r7)     // Catch: defpackage.arhe -> Lb3
            goto L1f
        Lb3:
            r3 = move-exception
            ausn r4 = defpackage.arre.a
            eltz r4 = r4.i()
            java.lang.String r6 = "Unable to send device info for an account."
            defpackage.a.S(r4, r6, r3)
            r3 = r5
            goto L1f
        Lc2:
            if (r3 != 0) goto Lc5
            goto Ld2
        Lc5:
            return r5
        Lc6:
            r13 = move-exception
            ausn r1 = defpackage.arre.a
            eltz r1 = r1.i()
            java.lang.String r2 = "Unable to get accounts for sending device info."
            defpackage.a.S(r1, r2, r13)
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chromesync.tasks.SendDeviceInfoTaskBoundService.a(cauf):int");
    }
}
