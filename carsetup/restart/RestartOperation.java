package com.google.android.gms.carsetup.restart;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.carsetup.BinderParcel;
import defpackage.ancy;
import defpackage.ansu;
import defpackage.answ;
import defpackage.anth;
import defpackage.anxf;
import defpackage.ekvl;
import defpackage.eluq;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class RestartOperation extends IntentOperation {
    public static final eluq a = ancy.a("CAR.SETUP.RESTART");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        answ ansuVar;
        a.h().ai(2867).x("Beginning restart process");
        BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("binder");
        ekvl.y(binderParcel);
        Semaphore semaphore = new Semaphore(0);
        IBinder iBinder = binderParcel.a;
        try {
            iBinder.linkToDeath(new anxf(semaphore, iBinder), 0);
            if (iBinder == null) {
                ansuVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IRestartCallback");
                ansuVar = queryLocalInterface instanceof answ ? (answ) queryLocalInterface : new ansu(iBinder);
            }
            ansuVar.a();
        } catch (RemoteException unused) {
            semaphore.release();
        }
        eluq eluqVar = a;
        eluqVar.h().ai(2868).x("Waiting for remote death");
        semaphore.acquireUninterruptibly();
        eluqVar.h().ai(2869).x("Firing restart intent");
        Intent intent2 = (Intent) intent.getParcelableExtra("restart_intent");
        ekvl.y(intent2);
        intent2.setFlags(intent2.getFlags() | 268435456);
        intent2.putExtra("0p_checker", new BinderParcel(new anth()));
        startActivity(intent2);
    }
}
