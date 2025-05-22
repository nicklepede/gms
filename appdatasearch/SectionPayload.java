package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.voq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SectionPayload extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new voq();
    public final SparseArray a;

    public SectionPayload(SparseArray sparseArray) {
        this.a = sparseArray;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        SparseArray sparseArray = this.a;
        if (sparseArray != null) {
            int b = atzr.b(parcel, 1);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeByteArray((byte[]) sparseArray.valueAt(i2));
            }
            atzr.c(parcel, b);
        }
        atzr.c(parcel, a);
    }
}
