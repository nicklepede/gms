package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.otn;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class bj extends otn implements bk {
    private final Object a;
    private volatile bl b;

    public bj() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        bl blVar;
        bl blVar2;
        switch (i) {
            case 1:
                throw new RemoteException();
            case 2:
                throw new RemoteException();
            case 3:
                oto.h(parcel);
                fq(parcel);
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
                fq(parcel);
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
                oto.g(parcel2, blVar2);
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
