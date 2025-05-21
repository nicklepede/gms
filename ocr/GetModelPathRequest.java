package com.google.android.gms.ocr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.csfx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetModelPathRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new csfx();
    public final int a;
    public final boolean b;
    public final int c;

    public GetModelPathRequest(int i, boolean z, int i2) {
        this.a = i;
        this.b = z;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.e(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
