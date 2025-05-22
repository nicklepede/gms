package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dknv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FrameMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dknv();
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public FrameMetadataParcel() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.q(parcel, 5, this.d);
        atzr.o(parcel, 6, this.e);
        atzr.c(parcel, a);
    }

    public FrameMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = i4;
    }
}
