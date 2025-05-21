package com.google.android.gms.nearby.fastpair.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cign;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SassOnConnectionStateChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cign();
    public String a;
    public int b;
    public int c;

    public SassOnConnectionStateChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SassOnConnectionStateChangedParams) {
            SassOnConnectionStateChangedParams sassOnConnectionStateChangedParams = (SassOnConnectionStateChangedParams) obj;
            if (arwb.b(this.a, sassOnConnectionStateChangedParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(sassOnConnectionStateChangedParams.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(sassOnConnectionStateChangedParams.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    public SassOnConnectionStateChangedParams(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }
}
