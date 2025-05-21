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
import defpackage.bqjf;
import defpackage.bqjg;
import defpackage.bqjh;
import defpackage.bqjs;
import defpackage.bqjy;
import defpackage.bqkj;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class InAppJobService extends JobService {
    static final String TAG = "brella.InAppJobSvc";
    bqjy dynamiteImpl;

    private boolean isIdleConstraintMet(JobParameters jobParameters) {
        return !((PowerManager) getSystemService("power")).isInteractive() || jobParameters.getExtras().getInt("waive_idle_requirement", 0) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDestroy$0() {
        bqjy bqjyVar = this.dynamiteImpl;
        if (bqjyVar != null) {
            try {
                bqjyVar.b();
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
            bqjs.a(context, jobParameters);
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
            bqjs.a(context, jobParameters);
            jobFinished(jobParameters, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStopJob$0(JobParameters jobParameters) {
        bqjy bqjyVar = this.dynamiteImpl;
        if (bqjyVar != null) {
            try {
                bqjyVar.h(jobParameters);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStopJob", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onTrimMemory$0(int i) {
        bqjy bqjyVar = this.dynamiteImpl;
        if (bqjyVar != null) {
            try {
                bqjyVar.d(i);
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
            bqjy bqjyVar = (bqjy) bqjh.a(this, "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl", new bqjg() { // from class: bqkg
                @Override // defpackage.bqjg
                public final IInterface a(IBinder iBinder) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppJobService");
                    return queryLocalInterface instanceof bqjy ? (bqjy) queryLocalInterface : new bqjx(iBinder);
                }
            });
            try {
                if (bqjyVar.e(new ObjectWrapper(this), new ObjectWrapper(getDynamiteBgExecutor()))) {
                    this.dynamiteImpl = bqjyVar;
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
        } catch (bqjf e2) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during tryLoadDynamiteImpl", e2);
            }
            return false;
        }
    }

    public ExecutorService getDynamiteBgExecutor() {
        return bqkj.a;
    }

    public ExecutorService getLifecycleCallbacksBgExecutor() {
        return bqkj.b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: bqke
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onDestroy$0();
            }
        });
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        bqjy bqjyVar = this.dynamiteImpl;
        if (bqjyVar != null) {
            try {
                bqjyVar.c(intent);
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
        bqjy bqjyVar = this.dynamiteImpl;
        if (bqjyVar != null) {
            try {
                return bqjyVar.a(intent, i, i2);
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
            bqjs.a(this, jobParameters);
            return false;
        }
        final Context applicationContext = getApplicationContext();
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: bqkh
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onStartJob$0(applicationContext, jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(final JobParameters jobParameters) {
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: bqki
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onStopJob$0(jobParameters);
            }
        });
        return false;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(final int i) {
        getLifecycleCallbacksBgExecutor().execute(new Runnable() { // from class: bqkf
            @Override // java.lang.Runnable
            public final void run() {
                InAppJobService.this.lambda$onTrimMemory$0(i);
            }
        });
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        bqjy bqjyVar = this.dynamiteImpl;
        if (bqjyVar != null) {
            try {
                return bqjyVar.g(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
