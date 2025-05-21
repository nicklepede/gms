package com.google.android.gms.gcm.gmsproc.cm;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import defpackage.bifk;
import defpackage.bifl;
import defpackage.byjl;
import defpackage.egul;
import defpackage.egur;
import defpackage.eguu;
import defpackage.eiig;
import defpackage.fecj;
import defpackage.fecp;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    private bifk a;
    private bifl b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class MessageTriggeredService extends GcmCmTriggerTaskService {
    }

    public GcmReceiverChimeraService() {
        super("GCM");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        Bundle extras;
        byte[] bArr;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("google.c.cm.cat");
        String string2 = extras.getString("google.c.cm.lt_start");
        String string3 = extras.getString("google.c.cm.lt_end");
        long a = this.a.a(string2);
        long a2 = this.a.a(string3);
        if (string == null || a == 0 || a2 == 0) {
            Log.e("GCM", "Discarded message with device-time due to lack of required fields");
            return;
        }
        if (a2 < System.currentTimeMillis()) {
            Log.w("GCM", "Message with device-time received past its expiry time.");
            return;
        }
        if (a <= System.currentTimeMillis()) {
            this.b.a(extras);
            return;
        }
        bifk bifkVar = this.a;
        eiig.x(string2);
        eiig.x(string3);
        synchronized (bifk.class) {
            LevelDb b = bifkVar.b();
            if (b != null) {
                try {
                    bArr = (string2 + "@" + string3 + "@" + System.currentTimeMillis()).getBytes("UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    bArr = new byte[0];
                }
                try {
                    egur egurVar = (egur) eguu.a.v();
                    if (!egurVar.b.L()) {
                        egurVar.U();
                    }
                    eguu eguuVar = (eguu) egurVar.b;
                    eguuVar.b |= 16;
                    eguuVar.f = ".";
                    if (!egurVar.b.L()) {
                        egurVar.U();
                    }
                    eguu eguuVar2 = (eguu) egurVar.b;
                    eguuVar2.b |= 4;
                    eguuVar2.d = ".";
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj instanceof String) {
                            fecj v = egul.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            fecp fecpVar = v.b;
                            egul egulVar = (egul) fecpVar;
                            str.getClass();
                            egulVar.b |= 1;
                            egulVar.c = str;
                            String str2 = (String) obj;
                            if (!fecpVar.L()) {
                                v.U();
                            }
                            egul egulVar2 = (egul) v.b;
                            str2.getClass();
                            egulVar2.b |= 2;
                            egulVar2.d = str2;
                            egurVar.a(v);
                        }
                    }
                    b.put(bArr, ((eguu) egurVar.Q()).r());
                } catch (LevelDbException e) {
                    Log.e("GCM", "Failed to persist device-time message", e);
                }
            }
        }
        this.a.c();
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.b = new bifl(this, byjl.a(this));
        this.a = new bifk(this, new bifl(this, byjl.a(this)));
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        bifk.d();
    }
}
