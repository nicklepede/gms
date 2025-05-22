package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cohm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RangingData extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new cohm();
    public int a;
    public int b;
    public int c;
    public boolean d;

    public RangingData() {
        this.d = true;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RangingData clone() {
        try {
            return (RangingData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RangingData) {
            RangingData rangingData = (RangingData) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(rangingData.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(rangingData.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(rangingData.c)) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(rangingData.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return String.format("RangingData<distance=%s, azimuthAngle=%s, polarAngle=%s, isValidAzimuthAngle=%s>", Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public RangingData(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }
}
