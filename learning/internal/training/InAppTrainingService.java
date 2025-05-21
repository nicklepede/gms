package com.google.android.gms.learning.internal.training;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bqja;
import defpackage.bqjf;
import defpackage.bqjg;
import defpackage.bqjh;
import defpackage.bqjr;
import defpackage.bqkd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class InAppTrainingService extends Service {
    private static final String TAG = "brella.InAppTrngSvc";
    bqkd dynamiteImpl;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        bqkd bqkdVar = this.dynamiteImpl;
        if (bqkdVar != null) {
            try {
                return bqkdVar.b(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onBind", e);
                }
            }
        }
        return new bqja("No IInAppTrainingService implementation found");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            bqkd bqkdVar = (bqkd) bqjh.a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", new bqjg() { // from class: bqkk
                @Override // defpackage.bqjg
                public final IInterface a(IBinder iBinder) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
                    return queryLocalInterface instanceof bqkd ? (bqkd) queryLocalInterface : new bqkc(iBinder);
                }
            });
            try {
                bqkdVar.d(new ObjectWrapper(this));
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during onCreate", e);
                }
            }
            try {
                bqkdVar.c("cronet", new bqjr(getApplicationContext()));
            } catch (RemoteException e2) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during addHttpUrlConnectionFactory", e2);
                }
            }
            this.dynamiteImpl = bqkdVar;
        } catch (bqjf e3) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during onCreate", e3);
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        bqkd bqkdVar = this.dynamiteImpl;
        if (bqkdVar != null) {
            try {
                bqkdVar.e();
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
        bqkd bqkdVar = this.dynamiteImpl;
        if (bqkdVar != null) {
            try {
                bqkdVar.f(intent);
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
        bqkd bqkdVar = this.dynamiteImpl;
        if (bqkdVar != null) {
            try {
                return bqkdVar.a(intent, i, i2);
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
        bqkd bqkdVar = this.dynamiteImpl;
        if (bqkdVar != null) {
            try {
                bqkdVar.g(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onTrimMemory", e);
                }
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        bqkd bqkdVar = this.dynamiteImpl;
        if (bqkdVar != null) {
            try {
                return bqkdVar.h(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
