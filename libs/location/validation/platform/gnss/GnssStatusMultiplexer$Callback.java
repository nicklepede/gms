package com.google.android.gms.libs.location.validation.platform.gnss;

import android.os.SystemClock;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingGnssStatusCallback;
import defpackage.bsxe;
import defpackage.bzer;
import defpackage.bzge;
import defpackage.bzgh;
import defpackage.fxuv;
import defpackage.fycr;
import defpackage.fyea;
import defpackage.fyeb;
import defpackage.ipu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GnssStatusMultiplexer$Callback extends TracingGnssStatusCallback {
    public final fyea a;
    final /* synthetic */ bzgh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnssStatusMultiplexer$Callback(bzgh bzghVar) {
        super(AppContextProvider.a());
        this.b = bzghVar;
        fxuv fxuvVar = bsxe.a;
        this.a = fyeb.b(bsxe.f);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingGnssStatusCallback
    protected final void e(ipu ipuVar) {
        fycr.b(this.a, null, null, new bzge(this.b, bzer.a(ipuVar, SystemClock.elapsedRealtimeNanos()), null), 3);
    }
}
