package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dick;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FrameMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dick();
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public FrameMetadataParcel() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.o(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.q(parcel, 5, this.d);
        arxc.o(parcel, 6, this.e);
        arxc.c(parcel, a);
    }

    public FrameMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = i4;
    }
}
