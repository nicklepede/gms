package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctxi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class CallingCardFontData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctxi();
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
        int a = arxc.a(parcel);
        arxc.l(parcel, 1, f);
        arxc.l(parcel, 2, this.b);
        arxc.l(parcel, 3, this.c);
        arxc.l(parcel, 4, this.d);
        arxc.l(parcel, 5, this.e);
        arxc.l(parcel, 6, this.f);
        arxc.o(parcel, 7, this.g);
        arxc.o(parcel, 8, this.h);
        arxc.l(parcel, 9, this.i);
        arxc.c(parcel, a);
    }
}
