package com.google.android.gms.ads.internal.formats.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.azhr;
import defpackage.azht;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class m {
    public final l a;

    public m(l lVar) {
        azht azhrVar;
        this.a = lVar;
        Context context = null;
        try {
            Parcel fs = lVar.fs(9, lVar.fr());
            IBinder readStrongBinder = fs.readStrongBinder();
            if (readStrongBinder == null) {
                azhrVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(readStrongBinder);
            }
            fs.recycle();
            context = (Context) ObjectWrapper.a(azhrVar);
        } catch (RemoteException | NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.h.g(e);
        }
        if (context != null) {
            com.google.android.gms.ads.formats.b bVar = new com.google.android.gms.ads.formats.b(context);
            try {
                l lVar2 = this.a;
                ObjectWrapper objectWrapper = new ObjectWrapper(bVar);
                Parcel fr = lVar2.fr();
                oto.g(fr, objectWrapper);
                Parcel fs2 = lVar2.fs(10, fr);
                oto.h(fs2);
                fs2.recycle();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.h.g(e2);
            }
        }
    }
}
