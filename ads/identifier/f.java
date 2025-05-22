package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import defpackage.aszt;
import defpackage.atzm;
import defpackage.atzn;
import defpackage.auab;
import defpackage.dhln;
import j$.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class f {
    public static volatile f a;
    public static final Object b = new Object();
    private static final Duration d = Duration.ofMinutes(30);
    public final AtomicLong c = new AtomicLong(-1);
    private final atzm e;

    public f(Context context) {
        this.e = new auab(context, new atzn("ads_identifier:api"));
    }

    public final synchronized void a(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.c;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= d.toMillis()) {
            return;
        }
        this.e.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0, i3)))).y(new dhln() { // from class: com.google.android.gms.ads.identifier.e
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ConnectionResult connectionResult;
                Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
                if ((exc instanceof aszt) && (connectionResult = ((aszt) exc).a.l) != null && connectionResult.c == 24) {
                    f.this.c.set(elapsedRealtime);
                }
            }
        });
    }
}
