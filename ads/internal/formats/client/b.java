package com.google.android.gms.ads.internal.formats.client;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b extends qmp implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final double a() {
        Parcel fF = fF(3, fE());
        double readDouble = fF.readDouble();
        fF.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final int b() {
        Parcel fF = fF(5, fE());
        int readInt = fF.readInt();
        fF.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final int c() {
        Parcel fF = fF(4, fE());
        int readInt = fF.readInt();
        fF.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final Uri d() {
        Parcel fF = fF(2, fE());
        Uri uri = (Uri) qmr.a(fF, Uri.CREATOR);
        fF.recycle();
        return uri;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final bblp e() {
        bblp bblnVar;
        Parcel fF = fF(1, fE());
        IBinder readStrongBinder = fF.readStrongBinder();
        if (readStrongBinder == null) {
            bblnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar = queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(readStrongBinder);
        }
        fF.recycle();
        return bblnVar;
    }
}
