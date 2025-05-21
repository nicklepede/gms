package com.google.android.gms.usagereporting.service;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.byiv;
import defpackage.byiw;
import defpackage.byjl;
import defpackage.byln;
import defpackage.dhqz;
import defpackage.dhrq;
import defpackage.dnnr;
import defpackage.ejhf;
import defpackage.fssf;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UsageReportingChimeraService extends bxgd {
    public static final asot a = asot.b("UsageReportingService", asej.USAGE_REPORTING);

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class CheckboxRestoringTaskBoundService extends GmsTaskBoundService {
        static void d(Context context) {
            byjl a = byjl.a(context);
            byiw byiwVar = new byiw();
            byiwVar.t("CheckboxRestoringTask");
            byiwVar.w(CheckboxRestoringTaskBoundService.class.getName());
            byiwVar.c(new byiv(Settings.Global.getUriFor("multi_cb"), 0));
            byiwVar.v(1);
            byiwVar.g(2);
            a.f(byiwVar.b());
        }

        @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
        public final int a(byln bylnVar) {
            UsageReportingChimeraService.c(this);
            d(this);
            return 0;
        }
    }

    public UsageReportingChimeraService() {
        super(41, "com.google.android.gms.usagereporting.service.START", Collections.EMPTY_SET, 3, true != fssf.d() ? 10 : 9);
    }

    public static void c(Context context) {
        if (dnnr.i(context) && Settings.Global.getInt(context.getContentResolver(), "multi_cb", -1) == -1) {
            ((ejhf) a.h()).x("Device wide opt in was reset, re-populating");
            dhrq.c(context);
        }
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new dhqz(getServiceRequest.f, this, l(), getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        if (dhrq.f()) {
            c(this);
            CheckboxRestoringTaskBoundService.d(this);
        }
    }
}
