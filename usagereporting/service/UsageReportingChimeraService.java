package com.google.android.gms.usagereporting.service;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.carn;
import defpackage.caro;
import defpackage.casd;
import defpackage.cauf;
import defpackage.dkcf;
import defpackage.dkcw;
import defpackage.dpya;
import defpackage.eluo;
import defpackage.fvnv;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UsageReportingChimeraService extends bzot {
    public static final ausn a = ausn.b("UsageReportingService", auid.USAGE_REPORTING);

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class CheckboxRestoringTaskBoundService extends GmsTaskBoundService {
        static void d(Context context) {
            casd a = casd.a(context);
            caro caroVar = new caro();
            caroVar.t("CheckboxRestoringTask");
            caroVar.w(CheckboxRestoringTaskBoundService.class.getName());
            caroVar.c(new carn(Settings.Global.getUriFor("multi_cb"), 0));
            caroVar.v(1);
            caroVar.g(2);
            a.f(caroVar.b());
        }

        @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
        public final int a(cauf caufVar) {
            UsageReportingChimeraService.c(this);
            d(this);
            return 0;
        }
    }

    public UsageReportingChimeraService() {
        super(41, "com.google.android.gms.usagereporting.service.START", Collections.EMPTY_SET, 3, true != fvnv.d() ? 10 : 9);
    }

    public static void c(Context context) {
        if (dpya.i(context) && Settings.Global.getInt(context.getContentResolver(), "multi_cb", -1) == -1) {
            ((eluo) a.h()).x("Device wide opt in was reset, re-populating");
            dkcw.c(context);
        }
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new dkcf(getServiceRequest.f, this, l(), getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        if (dkcw.f()) {
            c(this);
            CheckboxRestoringTaskBoundService.d(this);
        }
    }
}
