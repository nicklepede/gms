package com.google.android.gms.location.persistent;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.location.persistent.LocationPersistentChimeraService;
import defpackage.aspo;
import defpackage.bry;
import defpackage.byhr;
import defpackage.cado;
import defpackage.eiig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationPersistentChimeraService extends Service {
    public static WeakReference a = new WeakReference(null);
    public final bry b = new bry();
    private Handler c;

    public static synchronized void a(final String str, final cado cadoVar) {
        synchronized (LocationPersistentChimeraService.class) {
            if (cadoVar == null) {
                return;
            }
            final LocationPersistentChimeraService locationPersistentChimeraService = (LocationPersistentChimeraService) a.get();
            if (locationPersistentChimeraService == null) {
                Log.w("LocationPersistentSvc", "unable to register client - no service");
            } else {
                locationPersistentChimeraService.c.post(new Runnable() { // from class: cadn
                    @Override // java.lang.Runnable
                    public final void run() {
                        synchronized (LocationPersistentChimeraService.class) {
                            Object obj = LocationPersistentChimeraService.a.get();
                            LocationPersistentChimeraService locationPersistentChimeraService2 = LocationPersistentChimeraService.this;
                            if (obj != locationPersistentChimeraService2) {
                                return;
                            }
                            cado cadoVar2 = cadoVar;
                            cado cadoVar3 = (cado) locationPersistentChimeraService2.b.put(str, cadoVar2);
                            if (cadoVar3 != null) {
                                cadoVar3.b();
                            }
                            cadoVar2.a(locationPersistentChimeraService2);
                        }
                    }
                });
            }
        }
    }

    private static synchronized void b(LocationPersistentChimeraService locationPersistentChimeraService) {
        synchronized (LocationPersistentChimeraService.class) {
            boolean z = true;
            eiig.p(Looper.myLooper() == Looper.getMainLooper());
            LocationPersistentChimeraService locationPersistentChimeraService2 = (LocationPersistentChimeraService) a.get();
            if (locationPersistentChimeraService2 != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    z = false;
                }
                eiig.p(z);
                bry bryVar = locationPersistentChimeraService2.b;
                Iterator it = bryVar.values().iterator();
                while (it.hasNext()) {
                    ((cado) it.next()).b();
                }
                bryVar.clear();
            }
            a = new WeakReference(locationPersistentChimeraService);
        }
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aspo aspoVar = new aspo(printWriter, "  ");
        for (Map.Entry entry : this.b.entrySet()) {
            printWriter.print((String) entry.getKey());
            printWriter.println(":");
            aspoVar.b();
            ((cado) entry.getValue()).d(aspoVar);
            aspoVar.a();
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.c = new byhr();
        b(this);
        Intent intent = new Intent("com.google.android.gms.location.persistent.REGISTER");
        intent.setPackage("com.google.android.gms");
        sendBroadcast(intent);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        b(null);
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
