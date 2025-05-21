package com.google.android.gms.learning.training.background;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bqem;
import defpackage.bqex;
import defpackage.bqja;
import defpackage.bqjf;
import defpackage.bqjg;
import defpackage.bqjh;
import defpackage.bqjk;
import defpackage.bqkd;
import defpackage.bqld;
import defpackage.bqmm;
import defpackage.byln;
import defpackage.dtgd;
import defpackage.dtge;
import defpackage.dtgj;
import java.util.logging.Level;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class TrainingGcmTaskChimeraService extends GmsTaskChimeraService {
    private static final dtgj a = dtge.b("brella", "TrainingService");
    private dtgd b;
    private bqex c;
    private volatile bqkd d;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.learning.training.background.START".equals(intent.getAction())) {
            this.c.c(1601);
            return super.onBind(intent);
        }
        try {
            bqkd bqkdVar = (bqkd) bqjh.a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", new bqjg() { // from class: bqmt
                @Override // defpackage.bqjg
                public final IInterface a(IBinder iBinder) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
                    return queryLocalInterface instanceof bqkd ? (bqkd) queryLocalInterface : new bqkc(iBinder);
                }
            });
            try {
                bqkdVar.d(new ObjectWrapper(this));
            } catch (RemoteException e) {
                a.h(e, "RemoteException during onCreate");
            }
            try {
                bqkdVar.c("gms", new bqmm());
                bqkdVar.m(new bqjk(getApplicationContext(), (bqem) this.b.c(bqem.class)));
            } catch (RemoteException e2) {
                a.h(e2, "RemoteException during setHttpUrlConnectionFactory");
            }
            this.d = bqkdVar;
        } catch (bqjf e3) {
            a.h(e3, "LoadingException during onCreate");
        }
        if (this.d != null) {
            try {
                return this.d.b(intent);
            } catch (RemoteException e4) {
                a.h(e4, "RemoteException in IInAppTrainingService.onBind");
            }
        }
        return new bqja("No IInAppTrainingService implementation found");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        dtgj dtgjVar = a;
        dtgjVar.c(Level.INFO, dtgjVar.a, null, "onCreate()", new Object[0]);
        super.onCreate();
        bqld.a();
        dtgd b = dtgd.b(getApplicationContext());
        this.b = b;
        this.c = (bqex) b.c(bqex.class);
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
