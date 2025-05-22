package com.google.android.gms.learning.internal.training;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bsqp;
import defpackage.bsqu;
import defpackage.bsqv;
import defpackage.bsqw;
import defpackage.bsrg;
import defpackage.bsrs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class InAppTrainingService extends Service {
    private static final String TAG = "brella.InAppTrngSvc";
    bsrs dynamiteImpl;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        bsrs bsrsVar = this.dynamiteImpl;
        if (bsrsVar != null) {
            try {
                return bsrsVar.b(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onBind", e);
                }
            }
        }
        return new bsqp("No IInAppTrainingService implementation found");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            bsrs bsrsVar = (bsrs) bsqw.a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", new bsqv() { // from class: bsrz
                @Override // defpackage.bsqv
                public final IInterface a(IBinder iBinder) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
                    return queryLocalInterface instanceof bsrs ? (bsrs) queryLocalInterface : new bsrr(iBinder);
                }
            });
            try {
                bsrsVar.d(new ObjectWrapper(this));
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during onCreate", e);
                }
            }
            try {
                bsrsVar.c("cronet", new bsrg(getApplicationContext()));
            } catch (RemoteException e2) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during addHttpUrlConnectionFactory", e2);
                }
            }
            this.dynamiteImpl = bsrsVar;
        } catch (bsqu e3) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during onCreate", e3);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        bsrs bsrsVar = this.dynamiteImpl;
        if (bsrsVar != null) {
            try {
                bsrsVar.e();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        bsrs bsrsVar = this.dynamiteImpl;
        if (bsrsVar != null) {
            try {
                bsrsVar.f(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        bsrs bsrsVar = this.dynamiteImpl;
        if (bsrsVar != null) {
            try {
                return bsrsVar.a(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        bsrs bsrsVar = this.dynamiteImpl;
        if (bsrsVar != null) {
            try {
                bsrsVar.g(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onTrimMemory", e);
                }
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        bsrs bsrsVar = this.dynamiteImpl;
        if (bsrsVar != null) {
            try {
                return bsrsVar.h(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
