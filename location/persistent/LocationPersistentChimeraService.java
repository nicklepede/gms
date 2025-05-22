package com.google.android.gms.location.persistent;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.location.persistent.LocationPersistentChimeraService;
import defpackage.auti;
import defpackage.bsj;
import defpackage.caqj;
import defpackage.ccmf;
import defpackage.ekvl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationPersistentChimeraService extends Service {
    public static WeakReference a = new WeakReference(null);
    public final bsj b = new bsj();
    private Handler c;

    public static synchronized void a(final String str, final ccmf ccmfVar) {
        synchronized (LocationPersistentChimeraService.class) {
            if (ccmfVar == null) {
                return;
            }
            final LocationPersistentChimeraService locationPersistentChimeraService = (LocationPersistentChimeraService) a.get();
            if (locationPersistentChimeraService == null) {
                Log.w("LocationPersistentSvc", "unable to register client - no service");
            } else {
                locationPersistentChimeraService.c.post(new Runnable() { // from class: ccme
                    @Override // java.lang.Runnable
                    public final void run() {
                        synchronized (LocationPersistentChimeraService.class) {
                            Object obj = LocationPersistentChimeraService.a.get();
                            LocationPersistentChimeraService locationPersistentChimeraService2 = LocationPersistentChimeraService.this;
                            if (obj != locationPersistentChimeraService2) {
                                return;
                            }
                            ccmf ccmfVar2 = ccmfVar;
                            ccmf ccmfVar3 = (ccmf) locationPersistentChimeraService2.b.put(str, ccmfVar2);
                            if (ccmfVar3 != null) {
                                ccmfVar3.b();
                            }
                            ccmfVar2.a(locationPersistentChimeraService2);
                        }
                    }
                });
            }
        }
    }

    private static synchronized void b(LocationPersistentChimeraService locationPersistentChimeraService) {
        synchronized (LocationPersistentChimeraService.class) {
            boolean z = true;
            ekvl.q(Looper.myLooper() == Looper.getMainLooper());
            LocationPersistentChimeraService locationPersistentChimeraService2 = (LocationPersistentChimeraService) a.get();
            if (locationPersistentChimeraService2 != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    z = false;
                }
                ekvl.q(z);
                bsj bsjVar = locationPersistentChimeraService2.b;
                Iterator it = bsjVar.values().iterator();
                while (it.hasNext()) {
                    ((ccmf) it.next()).b();
                }
                bsjVar.clear();
            }
            a = new WeakReference(locationPersistentChimeraService);
        }
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        auti autiVar = new auti(printWriter, "  ");
        for (Map.Entry entry : this.b.entrySet()) {
            printWriter.print((String) entry.getKey());
            printWriter.println(":");
            autiVar.b();
            ((ccmf) entry.getValue()).d(autiVar);
            autiVar.a();
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.c = new caqj();
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
