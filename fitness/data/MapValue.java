package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.biio;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class MapValue extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new biio();
    public final int a;
    public final float b;

    public MapValue(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final float a() {
        atzb.m(this.a == 2, "Value is not in float format");
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapValue)) {
            return false;
        }
        MapValue mapValue = (MapValue) obj;
        int i = this.a;
        if (i != mapValue.a) {
            return false;
        }
        if (i != 2) {
            if (this.b != mapValue.b) {
                return false;
            }
        } else if (a() != mapValue.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (int) this.b;
    }

    public final String toString() {
        return this.a != 2 ? "unknown" : Float.toString(a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.l(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
