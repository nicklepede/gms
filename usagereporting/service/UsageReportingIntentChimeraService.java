package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import defpackage.asej;
import defpackage.asot;
import defpackage.dfbl;
import defpackage.dhqf;
import defpackage.fsrp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UsageReportingIntentChimeraService extends TracingIntentService {
    static {
        asot.b("UsageReportingService", asej.USAGE_REPORTING);
    }

    public UsageReportingIntentChimeraService() {
        super("UsageReportingIntentService");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.usagereporting.OPTIN_UR".equals(action)) {
            b(1);
        } else if ("com.google.android.gms.usagereporting.OPTOUT_UR".equals(action)) {
            b(2);
        }
    }

    protected final void b(int i) {
        try {
            dfbl.o(dhqf.a(this).aN(new UsageReportingOptInOptions(i)), fsrp.b(), TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException | TimeoutException unused2) {
        }
    }
}
