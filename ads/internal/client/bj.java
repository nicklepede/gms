package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class bj extends qmq implements bk {
    private final Object a;
    private volatile bl b;

    public bj() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        bl blVar;
        bl blVar2;
        switch (i) {
            case 1:
                throw new RemoteException();
            case 2:
                throw new RemoteException();
            case 3:
                qmr.h(parcel);
                fD(parcel);
                throw new RemoteException();
            case 4:
                throw new RemoteException();
            case 5:
                throw new RemoteException();
            case 6:
                throw new RemoteException();
            case 7:
                throw new RemoteException();
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    blVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    blVar = queryLocalInterface instanceof bl ? (bl) queryLocalInterface : new bl(readStrongBinder);
                }
                fD(parcel);
                synchronized (this.a) {
                    this.b = blVar;
                }
                parcel2.writeNoException();
                return true;
            case 9:
                throw new RemoteException();
            case 10:
                throw new RemoteException();
            case 11:
                synchronized (this.a) {
                    blVar2 = this.b;
                }
                parcel2.writeNoException();
                qmr.g(parcel2, blVar2);
                return true;
            case 12:
                throw new RemoteException();
            case 13:
                throw new RemoteException();
            default:
                return false;
        }
    }

    public bj(byte[] bArr) {
        super("com.google.android.gms.ads.internal.client.IVideoController");
        this.a = new Object();
    }
}
