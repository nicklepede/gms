package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.ccdr;
import defpackage.ccdu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccdu();
    private static final String c = "Cap";
    public final int a;
    public final Float b;
    private final ccdr d;

    protected Cap(int i) {
        this(i, null, null);
    }

    final Cap a() {
        int i = this.a;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i != 3) {
            Log.w(c, a.j(i, "Unknown Cap type: "));
            return this;
        }
        ccdr ccdrVar = this.d;
        arwm.m(ccdrVar != null, "bitmapDescriptor must not be null");
        Float f = this.b;
        arwm.m(f != null, "bitmapRefWidth must not be null");
        return new CustomCap(ccdrVar, f.floatValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.a == cap.a && arwb.b(this.d, cap.d) && arwb.b(this.b, cap.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.d, this.b});
    }

    public String toString() {
        return "[Cap: type=" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        ccdr ccdrVar = this.d;
        arxc.D(parcel, 3, ccdrVar == null ? null : ccdrVar.a.asBinder());
        arxc.C(parcel, 4, this.b);
        arxc.c(parcel, a);
    }

    public Cap(int i, ccdr ccdrVar, Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            z = ccdrVar != null && z2;
            i = 3;
        } else {
            z = true;
        }
        arwm.c(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), ccdrVar, f));
        this.a = i;
        this.d = ccdrVar;
        this.b = f;
    }
}
