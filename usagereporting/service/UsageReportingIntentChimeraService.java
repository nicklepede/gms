package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dhmr;
import defpackage.dkbl;
import defpackage.fvnf;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UsageReportingIntentChimeraService extends TracingIntentService {
    static {
        ausn.b("UsageReportingService", auid.USAGE_REPORTING);
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
            dhmr.o(dkbl.a(this).aM(new UsageReportingOptInOptions(i)), fvnf.b(), TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException | TimeoutException unused2) {
        }
    }
}
