package com.google.android.gms.libs.location.validation.platform.gnss;

import android.location.GnssMeasurementsEvent;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingGnssMeasurementsCallback;
import defpackage.bqpn;
import defpackage.bwxa;
import defpackage.bwxc;
import defpackage.fuyx;
import defpackage.fvbo;
import defpackage.fvgt;
import defpackage.fvic;
import defpackage.fvid;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GnssMeasurementsMultiplexerV24$Callback extends TracingGnssMeasurementsCallback {
    public final fvic a;
    final /* synthetic */ bwxc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnssMeasurementsMultiplexerV24$Callback(bwxc bwxcVar) {
        super(AppContextProvider.a());
        this.b = bwxcVar;
        fuyx fuyxVar = bqpn.a;
        this.a = fvid.b(bqpn.f);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingGnssMeasurementsCallback
    protected final void a(GnssMeasurementsEvent gnssMeasurementsEvent) {
        fvbo.f(gnssMeasurementsEvent, "event");
        fvgt.b(this.a, null, null, new bwxa(this.b, gnssMeasurementsEvent, null), 3);
    }
}
