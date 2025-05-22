package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.internal.training.InAppJobService;
import defpackage.bsqu;
import defpackage.bsqv;
import defpackage.bsqw;
import defpackage.bsrh;
import defpackage.bsrn;
import defpackage.bsry;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class InAppJobService extends JobService {
    static final String TAG = "brella.InAppJobSvc";
    bsrn dynamiteImpl;

    private boolean isIdleConstraintMet(JobParameters jobParameters) {
        return !((PowerManager) getSystemService("power")).isInteractive() || jobParameters.getExtras().getInt("waive_idle_requirement", 0) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDestroy$0() {
        bsrn bsrnVar = this.dynamiteImpl;
        if (bsrnVar != null) {
            try {
                bsrnVar.b();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartJob$0(Context context, JobParameters jobParameters) {
        if (!tryLoadDynamiteImpl()) {
            bsrh.a(context, jobParameters);
            jobFinished(jobParameters, false);
            return;
        }
        try {
            if (this.dynamiteImpl.f(jobParameters)) {
                return;
            }
            jobFinished(jobParameters, false);
        } catch (RemoteException e) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "RemoteException in IInAppJobService.onStartJob", e);
            }
            bsrh.a(context, jobParameters);
            jobFinished(jobParameters, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStopJob$0(JobParameters jobParameters) {
        bsrn bsrnVar = this.dynamiteImpl;
        if (bsrnVar != null) {
            try {
                bsrnVar.h(jobParameters);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStopJob", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTrimMemory$0(int i) {
        bsrn bsrnVar = this.dynamiteImpl;
        if (bsrnVar != null) {
            try {
                bsrnVar.d(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onTrimMemory", e);
                }
            }
        }
    }

    private boolean tryLoadDynamiteImpl() {
        if (this.dynamiteImpl != null) {
            return true;
        }
        try {
            bsrn bsrnVar = (bsrn) bsqw.a(this, "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl", new bsqv() { // from class: bsrv
                @Override // defpackage.bsqv
                public final IInterface a(IBinder iBinder) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppJobService");
                    return queryLocalInterface instanceof bsrn ? (bsrn) queryLocalInterface : new bsrm(iBinder);
                }
            });
            try {
                if (bsrnVar.e(new ObjectWrapper(this), new ObjectWrapper(getDynamiteBgExecutor()))) {
                    this.dynamiteImpl = bsrnVar;
                    return true;
                }
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "IInAppJobService.init failed");
                }
                return false;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.init", e);
                }
                return false;
            }
        } catch (bsqu e2) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during tryLoadDynamiteImpl", e2);
            }
            return false;
        }
    }

    public ExecutorService getDynamiteBgExecutor() {
        return bsry.a;
    }

    public ExecutorService getLifecycleCallbacksBgExecutor() {
        return bsry.b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: bsrt
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onDestroy$0();
            }
        });
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        bsrn bsrnVar = this.dynamiteImpl;
        if (bsrnVar != null) {
            try {
                bsrnVar.c(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        bsrn bsrnVar = this.dynamiteImpl;
        if (bsrnVar != null) {
            try {
                return bsrnVar.a(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.job.JobService
    public synchronized boolean onStartJob(final JobParameters jobParameters) {
        if (!isIdleConstraintMet(jobParameters)) {
            bsrh.a(this, jobParameters);
            return false;
        }
        final Context applicationContext = getApplicationContext();
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: bsrw
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onStartJob$0(applicationContext, jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(final JobParameters jobParameters) {
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: bsrx
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onStopJob$0(jobParameters);
            }
        });
        return false;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(final int i) {
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: bsru
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onTrimMemory$0(i);
            }
        });
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        bsrn bsrnVar = this.dynamiteImpl;
        if (bsrnVar != null) {
            try {
                return bsrnVar.g(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
