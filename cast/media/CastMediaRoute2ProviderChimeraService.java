package com.google.android.gms.cast.media;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.cast.media.CastMediaRoute2ProviderChimeraService;
import defpackage.aoca;
import defpackage.aoji;
import defpackage.apbo;
import defpackage.appp;
import defpackage.bjmq;
import defpackage.ekvl;
import defpackage.itk;
import defpackage.lsu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastMediaRoute2ProviderChimeraService extends Service {
    public aoca c;
    public bjmq d;
    private itk f;
    public final appp a = new appp("CastMR2PService");
    public final Object b = new Object();
    private final apbo e = new apbo();

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.e.attachBaseContext(context);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        this.a.n("onBind %s", intent);
        IBinder onBind = this.e.onBind(intent);
        ekvl.y(onBind);
        return onBind;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a.m("onCreate");
        this.e.onCreate();
        synchronized (this.b) {
            this.c = aoca.a(getApplicationContext(), "CastMR2PService");
        }
        this.f = new itk() { // from class: apbb
            @Override // defpackage.itk
            public final void a(Object obj) {
                List list = (List) obj;
                CastMediaRoute2ProviderChimeraService castMediaRoute2ProviderChimeraService = CastMediaRoute2ProviderChimeraService.this;
                synchronized (castMediaRoute2ProviderChimeraService.b) {
                    if (castMediaRoute2ProviderChimeraService.c == null) {
                        return;
                    }
                    eixs o = bjmq.o(castMediaRoute2ProviderChimeraService.d, "onClientInfoChanged");
                    try {
                        final ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((lsj) it.next()).a);
                        }
                        castMediaRoute2ProviderChimeraService.a.n("Binding with packages %s", arrayList.toString());
                        aoca aocaVar = castMediaRoute2ProviderChimeraService.c;
                        ekvl.y(aocaVar);
                        final aoho aohoVar = aocaVar.e;
                        aohoVar.d.execute(new Runnable() { // from class: aohd
                            @Override // java.lang.Runnable
                            public final void run() {
                                aoho.this.r.a(arrayList);
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
        this.d = new bjmq(getApplicationContext(), getClass(), 14, "CastMediaRoute2ProviderChimeraService");
        apbo apboVar = this.e;
        ScheduledExecutorService a = aoji.a();
        itk itkVar = this.f;
        ekvl.y(itkVar);
        lsu lsuVar = apboVar.d;
        synchronized (lsuVar.i) {
            lsuVar.h.put(itkVar, a);
            lsuVar.h();
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.a.m("onDestroy");
        itk itkVar = this.f;
        if (itkVar != null) {
            lsu lsuVar = this.e.d;
            synchronized (lsuVar.i) {
                lsuVar.h.remove(itkVar);
            }
            synchronized (this.b) {
                if (this.c != null) {
                    aoca.b("CastMR2PService");
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
