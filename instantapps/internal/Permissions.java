package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bqnx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class Permissions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqnx();
    public final String[] a;
    public final String[] b;
    public final String[] c;
    public final String[] d;

    public Permissions(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        this.a = strArr;
        this.b = strArr2;
        this.d = strArr3;
        this.c = strArr4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.a;
        int a = atzr.a(parcel);
        atzr.w(parcel, 1, strArr, false);
        atzr.w(parcel, 2, this.b, false);
        atzr.w(parcel, 3, this.c, false);
        atzr.w(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}
