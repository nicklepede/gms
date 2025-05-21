package com.google.android.gms.ads.internal.formats.client;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.azhr;
import defpackage.azht;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b extends otm implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final double a() {
        Parcel fs = fs(3, fr());
        double readDouble = fs.readDouble();
        fs.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final int b() {
        Parcel fs = fs(5, fr());
        int readInt = fs.readInt();
        fs.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final int c() {
        Parcel fs = fs(4, fr());
        int readInt = fs.readInt();
        fs.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final Uri d() {
        Parcel fs = fs(2, fr());
        Uri uri = (Uri) oto.a(fs, Uri.CREATOR);
        fs.recycle();
        return uri;
    }

    @Override // com.google.android.gms.ads.internal.formats.client.d
    public final azht e() {
        azht azhrVar;
        Parcel fs = fs(1, fr());
        IBinder readStrongBinder = fs.readStrongBinder();
        if (readStrongBinder == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(readStrongBinder);
        }
        fs.recycle();
        return azhrVar;
    }
}
