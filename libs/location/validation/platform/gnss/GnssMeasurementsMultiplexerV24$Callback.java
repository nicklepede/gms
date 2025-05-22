package com.google.android.gms.libs.location.validation.platform.gnss;

import android.location.GnssMeasurementsEvent;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingGnssMeasurementsCallback;
import defpackage.bsxe;
import defpackage.bzfq;
import defpackage.bzfs;
import defpackage.fxuv;
import defpackage.fxxm;
import defpackage.fycr;
import defpackage.fyea;
import defpackage.fyeb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GnssMeasurementsMultiplexerV24$Callback extends TracingGnssMeasurementsCallback {
    public final fyea a;
    final /* synthetic */ bzfs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnssMeasurementsMultiplexerV24$Callback(bzfs bzfsVar) {
        super(AppContextProvider.a());
        this.b = bzfsVar;
        fxuv fxuvVar = bsxe.a;
        this.a = fyeb.b(bsxe.f);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingGnssMeasurementsCallback
    protected final void a(GnssMeasurementsEvent gnssMeasurementsEvent) {
        fxxm.f(gnssMeasurementsEvent, "event");
        fycr.b(this.a, null, null, new bzfq(this.b, gnssMeasurementsEvent, null), 3);
    }
}
