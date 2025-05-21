package com.google.android.gms.mobiledataplan.service.background;

import android.content.Context;
import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import defpackage.bybl;
import defpackage.bybm;
import defpackage.bybx;
import defpackage.bych;
import defpackage.byci;
import defpackage.bycl;
import defpackage.cedt;
import defpackage.cedu;
import defpackage.ceqi;
import defpackage.ejhf;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GetCpidBackgroundTask$GetCpidCallback extends NetworkCallbackWrapper {
    final String a;
    public final CountDownLatch b;
    public Boolean c;
    public boolean d;
    public final /* synthetic */ cedu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCpidBackgroundTask$GetCpidCallback(cedu ceduVar, String str) {
        super("mobiledataplan", "GetCpidCallback");
        this.e = ceduVar;
        this.b = new CountDownLatch(1);
        this.d = false;
        this.a = str;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network) {
        cedu.a.f(ceqi.h()).x("Using UNS Http Library.");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bych d = byci.d(this.a, bybm.a, bybl.a);
        cedu ceduVar = this.e;
        Context context = ceduVar.b;
        bycl e = bybx.a(context).e(d, new cedt(this, byteArrayOutputStream, byteArrayOutputStream), ceduVar.d, context.getApplicationInfo().uid, 24832);
        e.n("GET");
        e.k(network);
        try {
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            ((ejhf) ((ejhf) cedu.a.j()).s(e2)).x("Error occurred while background fetching CPID through UNS.");
            this.c = false;
        }
        this.b.countDown();
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void e() {
        cedu.a.f(ceqi.h()).B("%s Cellular network is unavailable while querying CPID endpoint", "BgTaskGetCpid:");
        this.e.a(27046L);
        this.b.countDown();
    }
}
