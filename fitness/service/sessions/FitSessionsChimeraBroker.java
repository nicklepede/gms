package com.google.android.gms.fitness.service.sessions;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Message;
import defpackage.armd;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asot;
import defpackage.bfzx;
import defpackage.bggi;
import defpackage.bgrt;
import defpackage.bgrz;
import defpackage.bgsb;
import defpackage.bguo;
import defpackage.bgvb;
import defpackage.bhaf;
import defpackage.bxhl;
import defpackage.ejhf;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitSessionsChimeraBroker extends bgsb {
    private static final asot i = bhaf.a();
    private bfzx j;

    public FitSessionsChimeraBroker() {
        super("com.google.android.gms.fitness.service.sessions.FitSessionsBroker");
    }

    private final void q(Intent intent) {
        try {
            r(intent);
        } catch (BadParcelableException e) {
            Bundle bundle = new Bundle();
            bundle.putInt("com.google.android.location.cache.cache_type", 2);
            bundle.putBoolean("com.google.android.location.cache.is_cache", true);
            intent.replaceExtras(bundle);
            r(intent);
            this.j.c();
            ((ejhf) ((ejhf) ((ejhf) i.i()).s(e)).ah((char) 4826)).x("Found bad intent, had to clear it.");
        }
    }

    private final void r(Intent intent) {
        if (armd.m(intent) && armd.a(intent) == 1) {
            this.j.d(intent);
            i();
        }
    }

    @Override // defpackage.bgrv
    public final /* bridge */ /* synthetic */ bgrt b(String str) {
        return new bguo(this, str, new bgvb(this.j, str), this.f);
    }

    @Override // defpackage.bgrv
    protected final bxhl c(Context context, bgrz bgrzVar) {
        return new bxhl(context, 58, d(), 3, bgrzVar);
    }

    @Override // defpackage.bgrv, com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        this.j.a.g(printWriter);
    }

    @Override // defpackage.bgsb, defpackage.bgrv
    public final void f(bggi bggiVar, aslw aslwVar, aslv aslvVar, ExecutorService executorService) {
        super.f(bggiVar, aslwVar, aslvVar, executorService);
        this.j = bggiVar.E(this);
    }

    @Override // defpackage.bgrv
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.SessionsApi".equals(intent.getAction());
    }

    @Override // defpackage.bgsb, defpackage.bgrv, android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what <= 2) {
            return super.handleMessage(message);
        }
        if (message.what != 3) {
            throw new IllegalArgumentException("Unexpected message ".concat(String.valueOf(String.valueOf(message))));
        }
        q((Intent) message.obj);
        if (o()) {
            return true;
        }
        stopSelf();
        return true;
    }

    @Override // defpackage.bgsb, com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        if (armd.m(intent)) {
            m(3, intent);
            return 1;
        }
        super.onStartCommand(intent, i2, i3);
        return 1;
    }

    @Override // defpackage.bgsb
    protected final void k() {
    }
}
