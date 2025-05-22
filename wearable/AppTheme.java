package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dlvb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AppTheme extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dlvb();
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public AppTheme() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final int a() {
        int i = this.a;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int b() {
        int i = this.b;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int c() {
        int i = this.c;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int d() {
        int i = this.d;
        if (i == 0) {
            return 3;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppTheme)) {
            return false;
        }
        AppTheme appTheme = (AppTheme) obj;
        return this.b == appTheme.b && this.a == appTheme.a && this.c == appTheme.c && this.d == appTheme.d && this.e == appTheme.e;
    }

    public final int hashCode() {
        return (((((((this.b * 31) + this.a) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "AppTheme {, deviceExperience =" + this.e + ", colorTheme =" + this.a + "dynamicColor =" + this.b + ", screenItemsSize =" + this.d + ", screenAlignment =" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, a());
        atzr.o(parcel, 2, b());
        atzr.o(parcel, 3, c());
        atzr.o(parcel, 4, d());
        atzr.o(parcel, 5, this.e);
        atzr.c(parcel, a);
    }

    public AppTheme(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }
}
