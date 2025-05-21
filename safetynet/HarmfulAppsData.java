package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cxyf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxyf();
    public final String a;
    public final byte[] b;
    public final int c;

    public HarmfulAppsData(String str, byte[] bArr, int i) {
        this.a = str;
        this.b = bArr;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.i(parcel, 3, this.b, false);
        arxc.o(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}
