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
import defpackage.bhyx;
import defpackage.bhyz;
import defpackage.byiz;
import defpackage.byju;
import defpackage.byjv;
import defpackage.bykf;
import defpackage.bykh;
import defpackage.byln;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.enss;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public abstract class GmsTaskChimeraService extends Service implements GmsTaskServiceInterface {
    final eijr g = eijy.a(new eijr() { // from class: byjb
        @Override // defpackage.eijr
        public final Object a() {
            return new byjv(GmsTaskChimeraService.this);
        }
    });

    public int a(byln bylnVar) {
        throw null;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final boolean hs(String str) {
        return "com.google.android.gms.gcm.ACTION_TASK_READY".equals(str) || str.endsWith(".ACTION_TASK_READY");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        return ((byjv) this.g.a()).b(bylnVar);
    }

    @Override // com.google.android.chimera.Service
    public IBinder onBind(Intent intent) {
        return ((byjv) this.g.a()).a(intent);
    }

    @Override // com.google.android.chimera.Service
    public void onCreate() {
        super.onCreate();
        ((byjv) this.g.a()).f();
    }

    @Override // com.google.android.chimera.Service
    public void onDestroy() {
        super.onDestroy();
        ((byjv) this.g.a()).i();
    }

    @Override // com.google.android.chimera.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        byju byjuVar;
        String str;
        byjv byjvVar = (byjv) this.g.a();
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
                        byiz b = byiz.b(intent.getBundleExtra("engine_flags"));
                        bhyz bhyzVar = null;
                        bykh bykfVar = null;
                        if (parcelableExtra instanceof PendingCallback) {
                            IBinder iBinder = ((PendingCallback) parcelableExtra).a;
                            if (iBinder != null) {
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.libs.scheduler.IGmsTaskCallback");
                                bykfVar = queryLocalInterface instanceof bykh ? (bykh) queryLocalInterface : new bykf(iBinder);
                            }
                            byjuVar = new byju(byjvVar, stringExtra, bykfVar, bundleExtra, parcelableArrayListExtra, b);
                            str = stringExtra;
                        } else if (parcelableExtra instanceof com.google.android.gms.gcm.PendingCallback) {
                            IBinder iBinder2 = ((com.google.android.gms.gcm.PendingCallback) parcelableExtra).a;
                            if (iBinder2 != null) {
                                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                                bhyzVar = queryLocalInterface2 instanceof bhyz ? (bhyz) queryLocalInterface2 : new bhyx(iBinder2);
                            }
                            byjuVar = new byju(byjvVar, stringExtra, bhyzVar, bundleExtra, parcelableArrayListExtra, b);
                            str = stringExtra;
                        } else {
                            Log.e("GmsTaskChimeraService", byjvVar.getPackageName() + " " + stringExtra + ": Could not process request, invalid callback.");
                        }
                        if (!byjvVar.l(str)) {
                            byjvVar.d(byjuVar);
                        }
                    }
                } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    byjvVar.g();
                } else {
                    Log.e("GmsTaskChimeraService", a.a(action, "Unknown action received ", ", terminating"));
                }
            } catch (Throwable th) {
                byjvVar.k(i2);
                throw th;
            }
        }
        byjvVar.k(i2);
        return 2;
    }

    @Override // com.google.android.chimera.Service
    public boolean onUnbind(Intent intent) {
        ((byjv) this.g.a()).h(intent);
        return false;
    }

    @Deprecated
    public void fR() {
    }
}
