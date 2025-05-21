package com.google.android.gms.carsetup.restart;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.carsetup.BinderParcel;
import defpackage.albn;
import defpackage.alrj;
import defpackage.alrl;
import defpackage.alrw;
import defpackage.alvu;
import defpackage.eiig;
import defpackage.ejhh;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RestartOperation extends IntentOperation {
    public static final ejhh a = albn.a("CAR.SETUP.RESTART");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        alrl alrjVar;
        a.h().ah(2863).x("Beginning restart process");
        BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("binder");
        eiig.x(binderParcel);
        Semaphore semaphore = new Semaphore(0);
        IBinder iBinder = binderParcel.a;
        try {
            iBinder.linkToDeath(new alvu(semaphore, iBinder), 0);
            if (iBinder == null) {
                alrjVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IRestartCallback");
                alrjVar = queryLocalInterface instanceof alrl ? (alrl) queryLocalInterface : new alrj(iBinder);
            }
            alrjVar.a();
        } catch (RemoteException unused) {
            semaphore.release();
        }
        ejhh ejhhVar = a;
        ejhhVar.h().ah(2864).x("Waiting for remote death");
        semaphore.acquireUninterruptibly();
        ejhhVar.h().ah(2865).x("Firing restart intent");
        Intent intent2 = (Intent) intent.getParcelableExtra("restart_intent");
        eiig.x(intent2);
        intent2.setFlags(intent2.getFlags() | 268435456);
        intent2.putExtra("0p_checker", new BinderParcel(new alrw()));
        startActivity(intent2);
    }
}
