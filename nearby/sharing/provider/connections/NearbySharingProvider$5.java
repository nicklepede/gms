package com.google.android.gms.nearby.sharing.provider.connections;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.cqxd;
import defpackage.cqyr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class NearbySharingProvider$5 extends TracingBroadcastReceiver {
    final /* synthetic */ ShareTarget a;
    final /* synthetic */ Runnable b;
    public final /* synthetic */ cqyr c;
    final /* synthetic */ cqxd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbySharingProvider$5(cqyr cqyrVar, ShareTarget shareTarget, Runnable runnable, cqxd cqxdVar) {
        super("nearby", "CertificatesDownloadReceiver");
        this.a = shareTarget;
        this.b = runnable;
        this.d = cqxdVar;
        this.c = cqyrVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        final ShareTarget shareTarget = this.a;
        final Runnable runnable = this.b;
        final cqxd cqxdVar = this.d;
        this.c.aY(new Runnable() { // from class: cqxm
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
            
                r7 = r0.T(r6, r7, false);
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r12 = this;
                    com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$5 r0 = com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider$5.this
                    cqyr r0 = r0.c
                    com.google.android.gms.nearby.sharing.ShareTarget r1 = r2
                    boolean r2 = r0.bF(r1)
                    if (r2 != 0) goto Ld
                    goto L5b
                Ld:
                    java.util.Map r2 = r0.a
                    java.util.Set r3 = r2.keySet()
                    elgo r3 = defpackage.elgo.i(r3)
                    int r4 = r3.size()
                    r5 = 0
                L1c:
                    if (r5 >= r4) goto L5b
                    java.lang.Object r6 = r3.get(r5)
                    java.lang.String r6 = (java.lang.String) r6
                    java.lang.Object r7 = r2.remove(r6)
                    byte[] r7 = (byte[]) r7
                    if (r7 != 0) goto L2d
                    goto L58
                L2d:
                    cqyy r7 = defpackage.cqyy.c(r7)
                    if (r7 == 0) goto L5b
                    com.google.android.gms.nearby.sharing.ShareTarget r7 = defpackage.cqyr.bK(r0, r6, r7)
                    if (r7 == 0) goto L5b
                    long r8 = r1.a
                    long r10 = r7.a
                    int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                    if (r7 != 0) goto L58
                    cqxd r7 = r4
                    java.lang.Runnable r8 = r3
                    chet r9 = defpackage.conm.a
                    chet r9 = r9.b()
                    java.lang.String r10 = r1.b
                    java.lang.String r11 = "After a certificate sync, previously discovered EndpointID %s now matches ShareTarget %s."
                    r9.i(r11, r6, r10)
                    r8.run()
                    r7.a(r6)
                L58:
                    int r5 = r5 + 1
                    goto L1c
                L5b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cqxm.run():void");
            }
        });
    }
}
