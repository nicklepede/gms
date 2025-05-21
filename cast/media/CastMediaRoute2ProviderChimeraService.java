package com.google.android.gms.cast.media;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.cast.media.CastMediaRoute2ProviderChimeraService;
import defpackage.amap;
import defpackage.amhy;
import defpackage.anac;
import defpackage.annw;
import defpackage.bhib;
import defpackage.eiig;
import defpackage.iru;
import defpackage.kak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastMediaRoute2ProviderChimeraService extends Service {
    public amap c;
    public bhib d;
    private iru f;
    public final annw a = new annw("CastMR2PService");
    public final Object b = new Object();
    private final anac e = new anac();

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.e.attachBaseContext(context);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        this.a.n("onBind %s", intent);
        IBinder onBind = this.e.onBind(intent);
        eiig.x(onBind);
        return onBind;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a.m("onCreate");
        this.e.onCreate();
        synchronized (this.b) {
            this.c = amap.a(getApplicationContext(), "CastMR2PService");
        }
        this.f = new iru() { // from class: amzq
            @Override // defpackage.iru
            public final void a(Object obj) {
                List list = (List) obj;
                CastMediaRoute2ProviderChimeraService castMediaRoute2ProviderChimeraService = CastMediaRoute2ProviderChimeraService.this;
                synchronized (castMediaRoute2ProviderChimeraService.b) {
                    if (castMediaRoute2ProviderChimeraService.c == null) {
                        return;
                    }
                    egkp o = bhib.o(castMediaRoute2ProviderChimeraService.d, "onClientInfoChanged");
                    try {
                        final ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((jzz) it.next()).a);
                        }
                        castMediaRoute2ProviderChimeraService.a.n("Binding with packages %s", arrayList.toString());
                        amap amapVar = castMediaRoute2ProviderChimeraService.c;
                        eiig.x(amapVar);
                        final amgd amgdVar = amapVar.e;
                        amgdVar.d.execute(new Runnable() { // from class: amfs
                            @Override // java.lang.Runnable
                            public final void run() {
                                amgd.this.r.a(arrayList);
                            }
                        });
                        if (o != null) {
                            o.close();
                        }
                    } finally {
                    }
                }
            }
        };
        this.d = new bhib(getApplicationContext(), getClass(), 14, "CastMediaRoute2ProviderChimeraService");
        anac anacVar = this.e;
        ScheduledExecutorService a = amhy.a();
        iru iruVar = this.f;
        eiig.x(iruVar);
        kak kakVar = anacVar.d;
        synchronized (kakVar.i) {
            kakVar.h.put(iruVar, a);
            kakVar.h();
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.a.m("onDestroy");
        iru iruVar = this.f;
        if (iruVar != null) {
            kak kakVar = this.e.d;
            synchronized (kakVar.i) {
                kakVar.h.remove(iruVar);
            }
            synchronized (this.b) {
                if (this.c != null) {
                    amap.b("CastMR2PService");
                    this.c = null;
                }
            }
            this.d = null;
        }
        this.e.onDestroy();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return this.e.onStartCommand(intent, i, i2);
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        this.a.n("onUnbind %s", intent);
        return this.e.onUnbind(intent);
    }
}
