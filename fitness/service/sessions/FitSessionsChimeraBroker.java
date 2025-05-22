package com.google.android.gms.fitness.service.sessions;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Message;
import defpackage.atos;
import defpackage.aupp;
import defpackage.aupq;
import defpackage.ausn;
import defpackage.bien;
import defpackage.biky;
import defpackage.biwj;
import defpackage.biwp;
import defpackage.biwr;
import defpackage.bize;
import defpackage.bizr;
import defpackage.bjev;
import defpackage.bzqb;
import defpackage.eluo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitSessionsChimeraBroker extends biwr {
    private static final ausn i = bjev.a();
    private bien j;

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
            ((eluo) ((eluo) ((eluo) i.i()).s(e)).ai((char) 4836)).x("Found bad intent, had to clear it.");
        }
    }

    private final void r(Intent intent) {
        if (atos.m(intent) && atos.a(intent) == 1) {
            this.j.d(intent);
            i();
        }
    }

    @Override // defpackage.biwl
    public final /* bridge */ /* synthetic */ biwj b(String str) {
        return new bize(this, str, new bizr(this.j, str), this.f);
    }

    @Override // defpackage.biwl
    protected final bzqb c(Context context, biwp biwpVar) {
        return new bzqb(context, 58, d(), 3, biwpVar);
    }

    @Override // defpackage.biwl, com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        this.j.a.g(printWriter);
    }

    @Override // defpackage.biwr, defpackage.biwl
    public final void f(biky bikyVar, aupq aupqVar, aupp auppVar, ExecutorService executorService) {
        super.f(bikyVar, aupqVar, auppVar, executorService);
        this.j = bikyVar.E(this);
    }

    @Override // defpackage.biwl
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.SessionsApi".equals(intent.getAction());
    }

    @Override // defpackage.biwr, defpackage.biwl, android.os.Handler.Callback
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

    @Override // defpackage.biwr, com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        if (atos.m(intent)) {
            m(3, intent);
            return 1;
        }
        super.onStartCommand(intent, i2, i3);
        return 1;
    }

    @Override // defpackage.biwr
    protected final void k() {
    }
}
