package com.google.android.gms.scheduler;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.scheduler.AppContextProvider;
import defpackage.aupz;
import defpackage.ausd;
import defpackage.ause;
import defpackage.dajw;
import defpackage.dall;
import defpackage.eqgo;
import defpackage.fptq;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SchedulerChimeraService extends Service {
    final eqgo a;

    public SchedulerChimeraService() {
        this.a = new aupz(1, 10);
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ause.a(printWriter, strArr, new ausd() { // from class: dakw
            @Override // defpackage.ausd
            public final void a(PrintWriter printWriter2, String[] strArr2) {
                dakp dakpVar = dall.b().d;
                if (dakpVar == null) {
                    printWriter2.println("GmsTaskScheduler unavailable.");
                } else {
                    printWriter2.println("NTS task filter is ".concat(fpuq.c()));
                    dakpVar.b.e(printWriter2, strArr2);
                }
            }
        }, "SchedulerChimeraService", fptq.a.lK().g());
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a.execute(new Runnable() { // from class: daku
            @Override // java.lang.Runnable
            public final void run() {
                dall.b();
            }
        });
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        dall.b().g.a(3);
        this.a.shutdownNow();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        if (intent != null) {
            intent.getAction();
        }
        if (dajw.h()) {
            this.a.execute(new Runnable() { // from class: dakv
                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent2 = intent;
                    if ("com.google.android.gms.scheduler.intent.USER_UNLOCKED".equals(intent2 != null ? intent2.getAction() : null) && dpya.j() && dall.e()) {
                        dall.b().c(AppContextProvider.a(), aurt.a);
                    }
                }
            });
            return 1;
        }
        Log.e("NetworkScheduler", "Unexpected SchedulerService started as secondary user !");
        stopSelf(i2);
        return 2;
    }

    SchedulerChimeraService(eqgo eqgoVar) {
        this.a = eqgoVar;
    }
}
