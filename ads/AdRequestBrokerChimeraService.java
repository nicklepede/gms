package com.google.android.gms.ads;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.ads.AdRequestBrokerChimeraService;
import com.google.android.gms.ads.eventattestation.b;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.request.e;
import com.google.android.gms.ads.internal.request.l;
import com.google.android.gms.ads.internal.request.service.h;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.load.service.x;
import com.google.android.gms.ads.nonagon.util.logging.cui.n;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzps;
import defpackage.elpp;
import defpackage.uzg;
import java.util.ArrayDeque;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdRequestBrokerChimeraService extends bzot {
    public static final /* synthetic */ int a = 0;

    public AdRequestBrokerChimeraService() {
        super(8, "com.google.android.gms.ads.service.START", elpp.a, 3, 10);
    }

    private final void c() {
        b.a(this).a();
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        c();
        final uzg a2 = uzg.a(this);
        bzozVar.c(new bzps() { // from class: uyc
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                int i = AdRequestBrokerChimeraService.a;
                uzg uzgVar = uzg.this;
                uyq uyqVar = uzgVar.a;
                Context c = uyw.c(uyqVar);
                eqgo b = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
                if (uzgVar == null) {
                    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                Context c2 = uyw.c(uyqVar);
                return new e(c, b, uzgVar, new x(new l(c2, new h(c2, (n) uzgVar.g.a()).a, new VersionInfoParcel(251864004, 251864004))), (ArrayDeque) uzgVar.h.a(), (n) uzgVar.g.a());
            }
        });
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        p.c(this);
        c();
        int i = c.a;
        com.google.android.gms.ads.internal.util.client.h.d("Binding to the ad request service.");
        return super.onBind(intent);
    }
}
