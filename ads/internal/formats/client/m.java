package com.google.android.gms.ads.internal.formats.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class m {
    public final l a;

    public m(l lVar) {
        bblp bblnVar;
        this.a = lVar;
        Context context = null;
        try {
            Parcel fF = lVar.fF(9, lVar.fE());
            IBinder readStrongBinder = fF.readStrongBinder();
            if (readStrongBinder == null) {
                bblnVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                bblnVar = queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(readStrongBinder);
            }
            fF.recycle();
            context = (Context) ObjectWrapper.a(bblnVar);
        } catch (RemoteException | NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.h.g(e);
        }
        if (context != null) {
            com.google.android.gms.ads.formats.b bVar = new com.google.android.gms.ads.formats.b(context);
            try {
                l lVar2 = this.a;
                ObjectWrapper objectWrapper = new ObjectWrapper(bVar);
                Parcel fE = lVar2.fE();
                qmr.g(fE, objectWrapper);
                Parcel fF2 = lVar2.fF(10, fE);
                qmr.h(fF2);
                fF2.recycle();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.h.g(e2);
            }
        }
    }
}
