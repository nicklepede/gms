package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bhub;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ProgramResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bhub();
    public final int a;
    public final byte[] b;
    public final int c;

    public ProgramResponse(int i, byte[] bArr, int i2) {
        this.a = i;
        this.b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.i(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    public ProgramResponse(byte[] bArr, int i) {
        this(1, bArr, i);
    }
}
