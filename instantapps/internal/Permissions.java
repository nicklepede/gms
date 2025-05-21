package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bogh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class Permissions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bogh();
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
        int a = arxc.a(parcel);
        arxc.w(parcel, 1, strArr, false);
        arxc.w(parcel, 2, this.b, false);
        arxc.w(parcel, 3, this.c, false);
        arxc.w(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
