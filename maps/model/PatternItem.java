package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cceh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cceh();
    public final int b;
    public final Float c;

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        arwm.c(z, "Invalid PatternItem: type=" + i + " length=" + f);
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.b == patternItem.b && arwb.b(this.c, patternItem.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c});
    }

    public String toString() {
        return "[PatternItem: type=" + this.b + " length=" + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.C(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
