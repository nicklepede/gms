package com.google.android.gms.framework.tracing.wrapper;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentService;
import defpackage.bhib;
import defpackage.egkp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public abstract class TracingIntentService extends IntentService {
    private bhib a;

    public TracingIntentService(String str) {
        super(str);
        this.a = null;
    }

    protected abstract void a(Intent intent);

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.a = new bhib(context, getClass(), 11);
    }

    @Override // com.google.android.chimera.IntentService
    public final void onHandleIntent(Intent intent) {
        bhib bhibVar = this.a;
        egkp m = bhibVar == null ? null : bhibVar.m("onHandleIntent", intent);
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
