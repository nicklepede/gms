package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkmc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PutDataResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkmc();
    public final int a;
    public final DataItemParcelable b;

    public PutDataResponse(int i, DataItemParcelable dataItemParcelable) {
        this.a = i;
        this.b = dataItemParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.c(parcel, a);
    }
}
