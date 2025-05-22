package com.google.android.gms.gcm.gmsproc.cm;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import defpackage.bkjz;
import defpackage.bkka;
import defpackage.casd;
import defpackage.ejhq;
import defpackage.ejhw;
import defpackage.ejhz;
import defpackage.ekvl;
import defpackage.fgrc;
import defpackage.fgri;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    private bkjz a;
    private bkka b;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        bkjz bkjzVar = this.a;
        ekvl.y(string2);
        ekvl.y(string3);
        synchronized (bkjz.class) {
            LevelDb b = bkjzVar.b();
            if (b != null) {
                try {
                    bArr = (string2 + "@" + string3 + "@" + System.currentTimeMillis()).getBytes("UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    bArr = new byte[0];
                }
                try {
                    ejhw ejhwVar = (ejhw) ejhz.a.v();
                    if (!ejhwVar.b.L()) {
                        ejhwVar.U();
                    }
                    ejhz ejhzVar = (ejhz) ejhwVar.b;
                    ejhzVar.b |= 16;
                    ejhzVar.f = ".";
                    if (!ejhwVar.b.L()) {
                        ejhwVar.U();
                    }
                    ejhz ejhzVar2 = (ejhz) ejhwVar.b;
                    ejhzVar2.b |= 4;
                    ejhzVar2.d = ".";
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj instanceof String) {
                            fgrc v = ejhq.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            fgri fgriVar = v.b;
                            ejhq ejhqVar = (ejhq) fgriVar;
                            str.getClass();
                            ejhqVar.b |= 1;
                            ejhqVar.c = str;
                            String str2 = (String) obj;
                            if (!fgriVar.L()) {
                                v.U();
                            }
                            ejhq ejhqVar2 = (ejhq) v.b;
                            str2.getClass();
                            ejhqVar2.b |= 2;
                            ejhqVar2.d = str2;
                            ejhwVar.a(v);
                        }
                    }
                    b.put(bArr, ((ejhz) ejhwVar.Q()).r());
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
        this.b = new bkka(this, casd.a(this));
        this.a = new bkjz(this, new bkka(this, casd.a(this)));
    }

    @Override // com.google.android.chimera.IntentService, com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        bkjz.d();
    }
}
