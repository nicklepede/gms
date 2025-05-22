package com.google.android.gms.idunderstanding.imagequality;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bqfl;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ImageQualityFinding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqfl();
    public final int a;
    public final float b;

    public ImageQualityFinding(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.l(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
