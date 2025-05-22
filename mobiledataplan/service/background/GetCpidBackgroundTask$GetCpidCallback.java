package com.google.android.gms.mobiledataplan.service.background;

import android.content.Context;
import android.net.Network;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import defpackage.cakd;
import defpackage.cake;
import defpackage.cakp;
import defpackage.cakz;
import defpackage.cala;
import defpackage.cald;
import defpackage.cgna;
import defpackage.cgnb;
import defpackage.cgzp;
import defpackage.eluo;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GetCpidBackgroundTask$GetCpidCallback extends NetworkCallbackWrapper {
    final String a;
    public final CountDownLatch b;
    public Boolean c;
    public boolean d;
    public final /* synthetic */ cgnb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCpidBackgroundTask$GetCpidCallback(cgnb cgnbVar, String str) {
        super("mobiledataplan", "GetCpidCallback");
        this.e = cgnbVar;
        this.b = new CountDownLatch(1);
        this.d = false;
        this.a = str;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void a(Network network) {
        cgnb.a.f(cgzp.h()).x("Using UNS Http Library.");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cakz d = cala.d(this.a, cake.a, cakd.a);
        cgnb cgnbVar = this.e;
        Context context = cgnbVar.b;
        cald e = cakp.a(context).e(d, new cgna(this, byteArrayOutputStream, byteArrayOutputStream), cgnbVar.d, context.getApplicationInfo().uid, 24832);
        e.n("GET");
        e.k(network);
        try {
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            ((eluo) ((eluo) cgnb.a.j()).s(e2)).x("Error occurred while background fetching CPID through UNS.");
            this.c = false;
        }
        this.b.countDown();
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void e() {
        cgnb.a.f(cgzp.h()).B("%s Cellular network is unavailable while querying CPID endpoint", "BgTaskGetCpid:");
        this.e.a(27046L);
        this.b.countDown();
    }
}
