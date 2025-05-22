package com.google.android.gms.ads.identifier.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b extends qmp implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final Bundle a() {
        Parcel fF = fF(10, fE());
        Bundle bundle = (Bundle) qmr.a(fF, Bundle.CREATOR);
        fF.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String b(String str) {
        Parcel fE = fE();
        fE.writeString(str);
        Parcel fF = fF(3, fE);
        String readString = fF.readString();
        fF.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String c() {
        Parcel fF = fF(1, fE());
        String readString = fF.readString();
        fF.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String d(int i) {
        Parcel fE = fE();
        fE.writeInt(i);
        Parcel fF = fF(11, fE);
        String readString = fF.readString();
        fF.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final String e(String str, boolean z) {
        Parcel fE = fE();
        fE.writeString(str);
        int i = qmr.a;
        fE.writeInt(z ? 1 : 0);
        Parcel fF = fF(5, fE);
        String readString = fF.readString();
        fF.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final void f(int i) {
        Parcel fE = fE();
        fE.writeInt(i);
        fG(9, fE);
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final void g(int i, boolean z) {
        Parcel fE = fE();
        fE.writeInt(i);
        int i2 = qmr.a;
        fE.writeInt(1);
        fG(8, fE);
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final void h(String str, boolean z) {
        Parcel fE = fE();
        fE.writeString(str);
        int i = qmr.a;
        fE.writeInt(z ? 1 : 0);
        fG(4, fE);
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final boolean m() {
        Parcel fF = fF(6, fE());
        boolean h = qmr.h(fF);
        fF.recycle();
        return h;
    }

    @Override // com.google.android.gms.ads.identifier.internal.d
    public final boolean n() {
        Parcel fE = fE();
        int i = qmr.a;
        fE.writeInt(1);
        Parcel fF = fF(2, fE);
        boolean h = qmr.h(fF);
        fF.recycle();
        return h;
    }
}
