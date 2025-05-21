package com.google.android.gms.scheduler;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.scheduler.AppContextProvider;
import defpackage.asmf;
import defpackage.asoj;
import defpackage.asok;
import defpackage.cxzz;
import defpackage.cybn;
import defpackage.ensv;
import defpackage.fnbr;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SchedulerChimeraService extends Service {
    final ensv a;

    public SchedulerChimeraService() {
        this.a = new asmf(1, 10);
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        asok.a(printWriter, strArr, new asoj() { // from class: cyaz
            @Override // defpackage.asoj
            public final void a(PrintWriter printWriter2, String[] strArr2) {
                cyas cyasVar = cybn.b().d;
                if (cyasVar == null) {
                    printWriter2.println("GmsTaskScheduler unavailable.");
                } else {
                    printWriter2.println("NTS task filter is ".concat(String.valueOf(fncr.c())));
                    cyasVar.b.e(printWriter2, strArr2);
                }
            }
        }, "SchedulerChimeraService", fnbr.a.a().g());
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a.execute(new Runnable() { // from class: cyax
            @Override // java.lang.Runnable
            public final void run() {
                cybn.b();
            }
        });
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        cybn.b().g.a(3);
        this.a.shutdownNow();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        if (intent != null) {
            intent.getAction();
        }
        if (cxzz.h()) {
            this.a.execute(new Runnable() { // from class: cyay
                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent2 = intent;
                    if ("com.google.android.gms.scheduler.intent.USER_UNLOCKED".equals(intent2 != null ? intent2.getAction() : null) && dnnr.j() && cybn.e()) {
                        cybn.b().c(AppContextProvider.a(), asnz.a);
                    }
                }
            });
            return 1;
        }
        Log.e("NetworkScheduler", "Unexpected SchedulerService started as secondary user !");
        stopSelf(i2);
        return 2;
    }

    SchedulerChimeraService(ensv ensvVar) {
        this.a = ensvVar;
    }
}
