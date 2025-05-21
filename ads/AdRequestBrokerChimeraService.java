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
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxhc;
import defpackage.ejck;
import defpackage.tdg;
import java.util.ArrayDeque;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdRequestBrokerChimeraService extends bxgd {
    public static final /* synthetic */ int a = 0;

    public AdRequestBrokerChimeraService() {
        super(8, "com.google.android.gms.ads.service.START", ejck.a, 3, 10);
    }

    private final void c() {
        b.a(this).a();
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        c();
        final tdg a2 = tdg.a(this);
        bxgjVar.c(new bxhc() { // from class: tcc
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                int i = AdRequestBrokerChimeraService.a;
                tdg tdgVar = tdg.this;
                tcq tcqVar = tdgVar.a;
                Context c = tcw.c(tcqVar);
                ensv b = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
                if (tdgVar == null) {
                    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                Context c2 = tcw.c(tcqVar);
                return new e(c, b, tdgVar, new x(new l(c2, new h(c2, (n) tdgVar.g.a()).a, new VersionInfoParcel(251661004, 251661004))), (ArrayDeque) tdgVar.h.a(), (n) tdgVar.g.a());
            }
        });
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        p.c(this);
        c();
        int i = c.a;
        com.google.android.gms.ads.internal.util.client.h.d("Binding to the ad request service.");
        return super.onBind(intent);
    }
}
