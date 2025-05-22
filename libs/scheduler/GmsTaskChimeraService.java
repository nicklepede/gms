package com.google.android.gms.libs.scheduler;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.a;
import defpackage.bkdm;
import defpackage.bkdo;
import defpackage.carr;
import defpackage.casm;
import defpackage.casn;
import defpackage.casx;
import defpackage.casz;
import defpackage.cauf;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eqgl;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public abstract class GmsTaskChimeraService extends Service implements GmsTaskServiceInterface {
    final ekww g = ekxd.a(new ekww() { // from class: cart
        @Override // defpackage.ekww
        public final Object lK() {
            return new casn(GmsTaskChimeraService.this);
        }
    });

    public int a(cauf caufVar) {
        throw null;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final boolean hI(String str) {
        return "com.google.android.gms.gcm.ACTION_TASK_READY".equals(str) || str.endsWith(".ACTION_TASK_READY");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        return ((casn) this.g.lK()).b(caufVar);
    }

    @Override // com.google.android.chimera.Service
    public IBinder onBind(Intent intent) {
        return ((casn) this.g.lK()).a(intent);
    }

    @Override // com.google.android.chimera.Service
    public void onCreate() {
        super.onCreate();
        ((casn) this.g.lK()).f();
    }

    @Override // com.google.android.chimera.Service
    public void onDestroy() {
        super.onDestroy();
        ((casn) this.g.lK()).i();
    }

    @Override // com.google.android.chimera.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        casm casmVar;
        String str;
        casn casnVar = (casn) this.g.lK();
        if (intent != null) {
            try {
                intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
                String action = intent.getAction();
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                    String stringExtra = intent.getStringExtra("tag");
                    if (stringExtra != null) {
                        Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                        Bundle bundleExtra = intent.getBundleExtra("extras");
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                        intent.getLongExtra("max_exec_duration", 180L);
                        carr b = carr.b(intent.getBundleExtra("engine_flags"));
                        bkdo bkdoVar = null;
                        casz casxVar = null;
                        if (parcelableExtra instanceof PendingCallback) {
                            IBinder iBinder = ((PendingCallback) parcelableExtra).a;
                            if (iBinder != null) {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.libs.scheduler.IGmsTaskCallback");
                                casxVar = queryLocalInterface instanceof casz ? (casz) queryLocalInterface : new casx(iBinder);
                            }
                            casmVar = new casm(casnVar, stringExtra, casxVar, bundleExtra, parcelableArrayListExtra, b);
                            str = stringExtra;
                        } else if (parcelableExtra instanceof com.google.android.gms.gcm.PendingCallback) {
                            IBinder iBinder2 = ((com.google.android.gms.gcm.PendingCallback) parcelableExtra).a;
                            if (iBinder2 != null) {
                                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                                bkdoVar = queryLocalInterface2 instanceof bkdo ? (bkdo) queryLocalInterface2 : new bkdm(iBinder2);
                            }
                            casmVar = new casm(casnVar, stringExtra, bkdoVar, bundleExtra, parcelableArrayListExtra, b);
                            str = stringExtra;
                        } else {
                            Log.e("GmsTaskChimeraService", casnVar.getPackageName() + " " + stringExtra + ": Could not process request, invalid callback.");
                        }
                        if (!casnVar.l(str)) {
                            casnVar.d(casmVar);
                        }
                    }
                } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    casnVar.g();
                } else {
                    Log.e("GmsTaskChimeraService", a.a(action, "Unknown action received ", ", terminating"));
                }
            } catch (Throwable th) {
                casnVar.k(i2);
                throw th;
            }
        }
        casnVar.k(i2);
        return 2;
    }

    @Override // com.google.android.chimera.Service
    public boolean onUnbind(Intent intent) {
        ((casn) this.g.lK()).h(intent);
        return false;
    }

    @Deprecated
    public void gf() {
    }
}
