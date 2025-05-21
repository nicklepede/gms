package com.google.android.gms.ads.play;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.util.future.e;
import com.google.android.gms.ads.internal.util.future.i;
import defpackage.byij;
import defpackage.nip;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class c extends byij {
    public final i a;
    public final Context b;

    public c(Context context, i iVar) {
        super("admob");
        this.a = iVar;
        this.b = context;
    }

    @Override // defpackage.byij
    public final void a(ComponentName componentName, IBinder iBinder) {
        final nip nipVar;
        if (iBinder == null) {
            nipVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.contentfilters.IContentFiltersService");
            nipVar = queryLocalInterface instanceof nip ? (nip) queryLocalInterface : new nip(iBinder);
        }
        e.a.execute(new Runnable() { // from class: com.google.android.gms.ads.play.b
            /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r9 = this;
                    java.lang.String r0 = "is_service_available"
                    java.lang.String r1 = "is_cacheable"
                    java.lang.String r2 = "success"
                    com.google.android.gms.ads.play.c r3 = com.google.android.gms.ads.play.c.this
                    nip r4 = r2
                    r5 = 1
                    int[] r6 = new int[]{r5}     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
                    android.os.Bundle r4 = r4.a(r6)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L30
                    java.lang.String r6 = "Successfully received play store parental controls the result."
                    int r7 = com.google.android.gms.ads.internal.util.c.a     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2e
                    com.google.android.gms.ads.internal.util.client.h.i(r6)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2e
                    if (r4 != 0) goto L22
                    android.os.Bundle r6 = new android.os.Bundle     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2e
                    r6.<init>()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2e
                    r4 = r6
                L22:
                    r4.putBoolean(r2, r5)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2e
                    r4.putBoolean(r1, r5)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2e
                    r4.putBoolean(r0, r5)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L2e
                    goto L3a
                L2c:
                    r6 = move-exception
                    goto L33
                L2e:
                    r0 = move-exception
                    goto L5a
                L30:
                    r4 = move-exception
                    r6 = r4
                    r4 = 0
                L33:
                    java.lang.String r7 = "Error while retrieving parental controls."
                    int r8 = com.google.android.gms.ads.internal.util.c.a     // Catch: java.lang.Throwable -> L2e
                    com.google.android.gms.ads.internal.util.client.h.h(r7, r6)     // Catch: java.lang.Throwable -> L2e
                L3a:
                    android.content.Context r6 = r3.b
                    asiu r7 = defpackage.asiu.a()
                    r7.c(r6, r3)
                    if (r4 != 0) goto L54
                    android.os.Bundle r4 = new android.os.Bundle
                    r4.<init>()
                    r6 = 0
                    r4.putBoolean(r2, r6)
                    r4.putBoolean(r1, r6)
                    r4.putBoolean(r0, r5)
                L54:
                    com.google.android.gms.ads.internal.util.future.i r0 = r3.a
                    r0.a(r4)
                    return
                L5a:
                    android.content.Context r1 = r3.b
                    asiu r2 = defpackage.asiu.a()
                    r2.c(r1, r3)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.play.b.run():void");
            }
        });
    }

    @Override // defpackage.byij
    public final void b(ComponentName componentName) {
    }
}
