package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahgy;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class WeatherImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahgy();
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final int[] e;

    public WeatherImpl(float f, float f2, float f3, int i, int[] iArr) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = iArr;
    }

    static float a(int i, float f) {
        return i != 1 ? ((f - 32.0f) * 5.0f) / 9.0f : f;
    }

    public final float b(int i) {
        return a(i, this.c);
    }

    public final float c(int i) {
        return a(i, this.b);
    }

    public final float d(int i) {
        return a(i, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Temp=");
        boolean z = true;
        sb.append(d(1));
        sb.append("F/");
        sb.append(d(2));
        sb.append("C, Feels=");
        sb.append(c(1));
        sb.append("F/");
        sb.append(c(2));
        sb.append("C, Dew=");
        sb.append(b(1));
        sb.append("F/");
        sb.append(b(2));
        sb.append("C, Humidity=");
        sb.append(this.d);
        sb.append(", Condition=");
        int[] iArr = this.e;
        if (iArr == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            int i = 0;
            while (i < iArr.length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(",");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = arxc.a(parcel);
        arxc.l(parcel, 2, f);
        arxc.l(parcel, 3, this.b);
        arxc.l(parcel, 4, this.c);
        arxc.o(parcel, 5, this.d);
        arxc.p(parcel, 6, this.e, false);
        arxc.c(parcel, a);
    }
}
