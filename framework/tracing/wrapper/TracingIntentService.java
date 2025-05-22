package com.google.android.gms.framework.tracing.wrapper;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentService;
import defpackage.bjmq;
import defpackage.eixs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public abstract class TracingIntentService extends IntentService {
    private bjmq a;

    public TracingIntentService(String str) {
        super(str);
        this.a = null;
    }

    protected abstract void a(Intent intent);

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.a = new bjmq(context, getClass(), 11);
    }

    @Override // com.google.android.chimera.IntentService
    public final void onHandleIntent(Intent intent) {
        bjmq bjmqVar = this.a;
        eixs m = bjmqVar == null ? null : bjmqVar.m("onHandleIntent", intent);
        try {
            a(intent);
            if (m != null) {
                m.close();
            }
        } catch (Throwable th) {
            if (m != null) {
                try {
                    m.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
