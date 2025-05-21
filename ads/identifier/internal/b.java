package com.google.android.gms.ads.identifier.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b extends otm implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final Bundle a() {
        Parcel fs = fs(10, fr());
        Bundle bundle = (Bundle) oto.a(fs, Bundle.CREATOR);
        fs.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String b(String str) {
        Parcel fr = fr();
        fr.writeString(str);
        Parcel fs = fs(3, fr);
        String readString = fs.readString();
        fs.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String c() {
        Parcel fs = fs(1, fr());
        String readString = fs.readString();
        fs.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String d(int i) {
        Parcel fr = fr();
        fr.writeInt(i);
        Parcel fs = fs(11, fr);
        String readString = fs.readString();
        fs.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String e(String str, boolean z) {
        Parcel fr = fr();
        fr.writeString(str);
        int i = oto.a;
        fr.writeInt(z ? 1 : 0);
        Parcel fs = fs(5, fr);
        String readString = fs.readString();
        fs.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final void f(int i) {
        Parcel fr = fr();
        fr.writeInt(i);
        ft(9, fr);
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final void g(int i, boolean z) {
        Parcel fr = fr();
        fr.writeInt(i);
        int i2 = oto.a;
        fr.writeInt(1);
        ft(8, fr);
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final void h(String str, boolean z) {
        Parcel fr = fr();
        fr.writeString(str);
        int i = oto.a;
        fr.writeInt(z ? 1 : 0);
        ft(4, fr);
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final boolean m() {
        Parcel fs = fs(6, fr());
        boolean h = oto.h(fs);
        fs.recycle();
        return h;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final boolean n() {
        Parcel fr = fr();
        int i = oto.a;
        fr.writeInt(1);
        Parcel fs = fs(2, fr);
        boolean h = oto.h(fs);
        fs.recycle();
        return h;
    }
}
