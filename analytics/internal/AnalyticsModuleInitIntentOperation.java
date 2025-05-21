package com.google.android.gms.analytics.internal;

import android.content.Intent;
import com.google.android.gms.analytics.service.ChimeraPlayLogMonitorIntervalService;
import defpackage.anya;
import defpackage.asng;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AnalyticsModuleInitIntentOperation extends anya {
    public static final String[] a = {"com.google.android.gms.analytics.AnalyticsTaskService", "com.google.android.gms.analytics.service.AnalyticsService"};

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if ((i & 4) == 0 && (i & 8) == 0 && (i & 2) == 0) {
            return;
        }
        String[] strArr = a;
        for (int i2 = 0; i2 < 2; i2++) {
            asng.H(this, strArr[i2], true);
        }
        ChimeraPlayLogMonitorIntervalService.a(this);
    }
}
