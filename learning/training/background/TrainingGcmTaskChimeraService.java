package com.google.android.gms.learning.training.background;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bsmc;
import defpackage.bsmn;
import defpackage.bsqp;
import defpackage.bsqu;
import defpackage.bsqv;
import defpackage.bsqw;
import defpackage.bsqz;
import defpackage.bsrs;
import defpackage.bsss;
import defpackage.bsub;
import defpackage.cauf;
import defpackage.dvql;
import defpackage.dvqm;
import defpackage.dvqr;
import java.util.logging.Level;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class TrainingGcmTaskChimeraService extends GmsTaskChimeraService {
    private static final dvqr a = dvqm.b("brella", "TrainingService");
    private dvql b;
    private bsmn c;
    private volatile bsrs d;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.learning.training.background.START".equals(intent.getAction())) {
            this.c.c(1601);
            return super.onBind(intent);
        }
        try {
            bsrs bsrsVar = (bsrs) bsqw.a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", new bsqv() { // from class: bsui
                @Override // defpackage.bsqv
                public final IInterface a(IBinder iBinder) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
                    return queryLocalInterface instanceof bsrs ? (bsrs) queryLocalInterface : new bsrr(iBinder);
                }
            });
            try {
                bsrsVar.d(new ObjectWrapper(this));
            } catch (RemoteException e) {
                a.h(e, "RemoteException during onCreate");
            }
            try {
                bsrsVar.c("gms", new bsub());
                bsrsVar.m(new bsqz(getApplicationContext(), (bsmc) this.b.c(bsmc.class)));
            } catch (RemoteException e2) {
                a.h(e2, "RemoteException during setHttpUrlConnectionFactory");
            }
            this.d = bsrsVar;
        } catch (bsqu e3) {
            a.h(e3, "LoadingException during onCreate");
        }
        if (this.d != null) {
            try {
                return this.d.b(intent);
            } catch (RemoteException e4) {
                a.h(e4, "RemoteException in IInAppTrainingService.onBind");
            }
        }
        return new bsqp("No IInAppTrainingService implementation found");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        dvqr dvqrVar = a;
        dvqrVar.c(Level.INFO, dvqrVar.a, null, "onCreate()", new Object[0]);
        super.onCreate();
        bsss.a();
        dvql b = dvql.b(getApplicationContext());
        this.b = b;
        this.c = (bsmn) b.c(bsmn.class);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        if (this.d != null) {
            try {
                this.d.e();
            } catch (RemoteException e) {
                a.h(e, "RemoteException in IInAppTrainingService.onDestroy");
            }
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final void onRebind(Intent intent) {
        if (this.d != null) {
            try {
                this.d.f(intent);
            } catch (RemoteException e) {
                a.h(e, "RemoteException in IInAppTrainingService.onRebind");
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onTrimMemory(int i) {
        if (this.d != null) {
            try {
                this.d.g(i);
            } catch (RemoteException e) {
                a.h(e, "RemoteException in IInAppTrainingService.onTrimMemory");
            }
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        if (this.d != null) {
            try {
                return this.d.h(intent);
            } catch (RemoteException e) {
                a.h(e, "RemoteException in IInAppTrainingService.onUnbind");
            }
        }
        super.onUnbind(intent);
        return false;
    }
}
