package com.google.android.gms.ads.signalsdk;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.aa;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.uyw;
import defpackage.uzg;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SignalSdkChimeraService extends bzot {
    public SignalSdkChimeraService() {
        super(203, "com.google.android.gms.ads.service.SDK_SIGNAL", Collections.singleton("android.permission.INTERNET"), 3, 10);
        setWantIntentExtras(true);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        uzg a = uzg.a(this);
        bzozVar.c(new o(uyw.c(a.a), new VersionInfoParcel(251864004, 251864004), (String) a.n.a(), com.google.android.gms.ads.nonagon.util.concurrent.b.b(), (ScheduledExecutorService) a.j.a(), (aa) a.k.a(), a.c()));
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        return intent.getBooleanExtra("non_gms", false) ? uzg.a(this).e() : super.onBind(intent);
    }
}
