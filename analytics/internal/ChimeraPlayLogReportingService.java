package com.google.android.gms.analytics.internal;

import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.tod;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ChimeraPlayLogReportingService extends TracingIntentService {
    public ChimeraPlayLogReportingService() {
        super("PlayLogReportingService");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        tod.a(this).b();
    }
}
