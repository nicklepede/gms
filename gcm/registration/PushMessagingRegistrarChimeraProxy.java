package com.google.android.gms.gcm.registration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.gcm.GcmProxyIntentOperation;
import defpackage.bhvo;
import defpackage.bhwz;
import defpackage.bhyh;
import defpackage.bhzg;
import defpackage.bimi;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PushMessagingRegistrarChimeraProxy extends TracingIntentService {
    public PushMessagingRegistrarChimeraProxy() {
        super("PushMessagingRegistrarChimeraProxy");
    }

    public static void b(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                if (str.startsWith("GOOG.")) {
                    intent.removeExtra(str);
                }
            }
        }
        bhwz b = bhwz.b();
        if (intent.getStringExtra("cliv") == null) {
            if (bhvo.d() != 0) {
                bhyh f = b.f();
                String c = f.c();
                String e = f.e();
                if (c != null) {
                    intent.putExtra("GOOG.USER_AID", c);
                }
                if (e != null) {
                    intent.putExtra("GOOG.USER_TOKEN", e);
                }
            }
            GcmProxyIntentOperation.a(context, intent);
            return;
        }
        bhzg g = b.g();
        Messenger e2 = bimi.e(intent);
        if (e2 == null) {
            Log.w("GCM", "Request missing reply messenger, dropping");
            return;
        }
        try {
            Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTRATION");
            intent2.putExtra("google.messenger", g.a);
            intent2.putExtra("registration_id", String.valueOf(intent.getStringExtra("kid")).concat(":MESSENGER"));
            Message obtain = Message.obtain();
            obtain.obj = intent2;
            e2.send(obtain);
        } catch (RemoteException unused) {
            Log.w("GCM", "Application making request no longer running");
        }
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        if (intent == null) {
            return;
        }
        b(this, intent);
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if (Objects.equals(action, "com.google.android.c2dm.intent.REGISTER")) {
            return bhwz.b().g().a.getBinder();
        }
        Objects.equals(action, "com.google.android.gms.gcm.WEARABLE");
        return null;
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        bhvo.i(this);
    }
}
