package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.scheduler.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aupz;
import defpackage.dajz;
import defpackage.dakq;
import defpackage.eqgo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DeviceStateReceiver extends TracingBroadcastReceiver {
    public dajz a;
    private final eqgo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceStateReceiver() {
        super("scheduler");
        aupz aupzVar = new aupz(1, 10);
        this.a = new dajz(new dakq(AppContextProvider.a()));
        this.b = aupzVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(final Context context, final Intent intent) {
        this.b.execute(new Runnable() { // from class: daka
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
            
                if (r8.c() == false) goto L27;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r10 = this;
                    android.content.Intent r0 = r2
                    java.lang.String r0 = r0.getAction()
                    if (r0 != 0) goto La
                    goto Lce
                La:
                    java.lang.String r1 = "android.os.action.DEVICE_IDLE_MODE_CHANGED"
                    boolean r1 = r1.equals(r0)
                    if (r1 == 0) goto L1d
                    dall r0 = defpackage.dall.b()
                    dale r0 = r0.g
                    r1 = 4
                    r0.a(r1)
                    return
                L1d:
                    java.lang.String r1 = "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED"
                    boolean r1 = r1.equals(r0)
                    if (r1 == 0) goto L30
                    dall r0 = defpackage.dall.b()
                    dale r0 = r0.g
                    r1 = 5
                    r0.a(r1)
                    return
                L30:
                    com.google.android.gms.scheduler.DeviceStateReceiver r1 = com.google.android.gms.scheduler.DeviceStateReceiver.this
                    dajz r1 = r1.a
                    java.lang.String r2 = "android.intent.action.DOCK_ACTIVE"
                    boolean r3 = r0.equals(r2)
                    java.lang.String r4 = "android.intent.action.SCREEN_OFF"
                    java.lang.String r5 = "android.intent.action.SCREEN_ON"
                    java.lang.String r6 = "android.intent.action.DOCK_IDLE"
                    if (r3 != 0) goto L48
                    boolean r3 = r0.equals(r6)
                    if (r3 == 0) goto L4d
                L48:
                    boolean r3 = r1.a
                    if (r3 != 0) goto L4d
                    goto La3
                L4d:
                    android.content.Context r3 = r3
                    aumn r7 = new aumn
                    r7.<init>(r3)
                    boolean r8 = r0.equals(r5)
                    if (r8 != 0) goto La0
                    java.lang.String r8 = "android.intent.action.DREAMING_STOPPED"
                    boolean r8 = r0.equals(r8)
                    if (r8 != 0) goto L63
                    goto L74
                L63:
                    dakq r8 = r1.b
                    fptq r9 = defpackage.fptq.a
                    fpud r9 = r9.lK()
                    r9.ao()
                    boolean r8 = r8.c()
                    if (r8 != 0) goto La0
                L74:
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto L7b
                    goto La0
                L7b:
                    boolean r2 = r0.equals(r4)
                    if (r2 != 0) goto L9c
                    java.lang.String r2 = "android.intent.action.DREAMING_STARTED"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L9c
                    boolean r2 = r0.equals(r6)
                    if (r2 == 0) goto L90
                    goto L9c
                L90:
                    java.lang.String r2 = "com.google.android.gms.gcm.TRIGGER_IDLE"
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto La3
                    r1.c()
                    goto La3
                L9c:
                    r1.d(r7, r0, r3)
                    goto La3
                La0:
                    r1.b(r7, r0)
                La3:
                    dall r1 = defpackage.dall.b()
                    dale r1 = r1.g
                    int r2 = r0.hashCode()
                    r3 = -2128145023(0xffffffff81271581, float:-3.0688484E-38)
                    r6 = 1
                    if (r2 == r3) goto Lc1
                    r3 = -1454123155(0xffffffffa953d76d, float:-4.7038264E-14)
                    if (r2 == r3) goto Lb9
                    goto Lc9
                Lb9:
                    boolean r0 = r0.equals(r5)
                    if (r0 == 0) goto Lc9
                    r0 = 0
                    goto Lca
                Lc1:
                    boolean r0 = r0.equals(r4)
                    if (r0 == 0) goto Lc9
                    r0 = r6
                    goto Lca
                Lc9:
                    r0 = -1
                Lca:
                    if (r0 == 0) goto Ld5
                    if (r0 == r6) goto Lcf
                Lce:
                    return
                Lcf:
                    r0 = 13
                    r1.a(r0)
                    return
                Ld5:
                    r0 = 12
                    r1.a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.daka.run():void");
            }
        });
    }
}
