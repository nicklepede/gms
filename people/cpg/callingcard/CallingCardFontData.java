package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwgo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class CallingCardFontData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwgo();
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;

    public CallingCardFontData(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, float f7) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = i;
        this.h = i2;
        this.i = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallingCardFontData) {
            CallingCardFontData callingCardFontData = (CallingCardFontData) obj;
            if (this.a == callingCardFontData.a && this.b == callingCardFontData.b && this.c == callingCardFontData.c && this.d == callingCardFontData.d && this.e == callingCardFontData.e && this.f == callingCardFontData.f && this.g == callingCardFontData.g && this.h == callingCardFontData.h && this.i == callingCardFontData.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Float.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = atzr.a(parcel);
        atzr.l(parcel, 1, f);
        atzr.l(parcel, 2, this.b);
        atzr.l(parcel, 3, this.c);
        atzr.l(parcel, 4, this.d);
        atzr.l(parcel, 5, this.e);
        atzr.l(parcel, 6, this.f);
        atzr.o(parcel, 7, this.g);
        atzr.o(parcel, 8, this.h);
        atzr.l(parcel, 9, this.i);
        atzr.c(parcel, a);
    }
}
