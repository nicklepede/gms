package com.google.android.gms.ads.signalsdk;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.aa;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.tcw;
import defpackage.tdg;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SignalSdkChimeraService extends bxgd {
    public SignalSdkChimeraService() {
        super(203, "com.google.android.gms.ads.service.SDK_SIGNAL", Collections.singleton("android.permission.INTERNET"), 3, 10);
        setWantIntentExtras(true);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        tdg a = tdg.a(this);
        bxgjVar.c(new o(tcw.c(a.a), new VersionInfoParcel(251661004, 251661004), (String) a.n.a(), com.google.android.gms.ads.nonagon.util.concurrent.b.b(), (ScheduledExecutorService) a.j.a(), (aa) a.k.a(), a.c()));
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        return intent.getBooleanExtra("non_gms", false) ? tdg.a(this).e() : super.onBind(intent);
    }
}
