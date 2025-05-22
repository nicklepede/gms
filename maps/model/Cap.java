package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.ceml;
import defpackage.cemo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cemo();
    private static final String c = "Cap";
    public final int a;
    public final Float b;
    private final ceml d;

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
        ceml cemlVar = this.d;
        atzb.m(cemlVar != null, "bitmapDescriptor must not be null");
        Float f = this.b;
        atzb.m(f != null, "bitmapRefWidth must not be null");
        return new CustomCap(cemlVar, f.floatValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.a == cap.a && atyq.b(this.d, cap.d) && atyq.b(this.b, cap.b);
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        ceml cemlVar = this.d;
        atzr.D(parcel, 3, cemlVar == null ? null : cemlVar.a.asBinder());
        atzr.C(parcel, 4, this.b);
        atzr.c(parcel, a);
    }

    public Cap(int i, ceml cemlVar, Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            z = cemlVar != null && z2;
            i = 3;
        } else {
            z = true;
        }
        atzb.c(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), cemlVar, f));
        this.a = i;
        this.d = cemlVar;
        this.b = f;
    }
}
