package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.clze;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RangingData extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new clze();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(rangingData.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(rangingData.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(rangingData.c)) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(rangingData.d))) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public RangingData(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }
}
