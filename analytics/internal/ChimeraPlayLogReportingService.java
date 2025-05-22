package com.google.android.gms.analytics.internal;

import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.vkd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ChimeraPlayLogReportingService extends TracingIntentService {
    public ChimeraPlayLogReportingService() {
        super("PlayLogReportingService");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        vkd.a(this).b();
    }
}
