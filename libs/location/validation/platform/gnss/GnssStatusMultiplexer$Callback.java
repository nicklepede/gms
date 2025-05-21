package com.google.android.gms.libs.location.validation.platform.gnss;

import android.os.SystemClock;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingGnssStatusCallback;
import defpackage.bqpn;
import defpackage.bwwb;
import defpackage.bwxo;
import defpackage.bwxr;
import defpackage.fuyx;
import defpackage.fvgt;
import defpackage.fvic;
import defpackage.fvid;
import defpackage.ioe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GnssStatusMultiplexer$Callback extends TracingGnssStatusCallback {
    public final fvic a;
    final /* synthetic */ bwxr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnssStatusMultiplexer$Callback(bwxr bwxrVar) {
        super(AppContextProvider.a());
        this.b = bwxrVar;
        fuyx fuyxVar = bqpn.a;
        this.a = fvid.b(bqpn.f);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingGnssStatusCallback
    protected final void e(ioe ioeVar) {
        fvgt.b(this.a, null, null, new bwxo(this.b, bwwb.a(ioeVar, SystemClock.elapsedRealtimeNanos()), null), 3);
    }
}
