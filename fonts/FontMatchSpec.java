package com.google.android.gms.fonts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bjfu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FontMatchSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bjfu();
    public final int a;
    public String b;
    public float c;
    public int d;
    public float e;
    public boolean f;
    public final boolean g;

    public FontMatchSpec(int i, String str, float f, int i2, float f2, boolean z, boolean z2) {
        this.a = i;
        atzb.t(str, "family");
        this.b = str;
        this.c = f;
        this.d = i2;
        this.e = f2;
        this.f = z;
        this.g = z2;
        atzb.n(f > 0.0f, "invalid width %.01f", Float.valueOf(f));
        atzb.n(i2 > 0 && i2 <= 1000, "invalid weight %d", Integer.valueOf(i2));
        atzb.n(f2 >= 0.0f && f2 <= 1.0f, "invalid italic: %.01f", Float.valueOf(f2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FontMatchSpec)) {
            return false;
        }
        FontMatchSpec fontMatchSpec = (FontMatchSpec) obj;
        return atyq.b(this.b, fontMatchSpec.b) && Float.compare(this.c, fontMatchSpec.c) == 0 && this.d == fontMatchSpec.d && Float.compare(this.e, fontMatchSpec.e) == 0 && this.f == fontMatchSpec.f && this.g == fontMatchSpec.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Float.valueOf(this.c), Integer.valueOf(this.d), Float.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    public final String toString() {
        return "{" + this.b + ", wdth " + this.c + ", wght " + this.d + ", ital " + this.e + ", bestEffort " + this.f + "}, isVf " + this.g + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.l(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.l(parcel, 5, this.e);
        atzr.e(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.c(parcel, a);
    }

    public FontMatchSpec(String str) {
        this(1, str, 100.0f, 400, 0.0f, false, false);
    }

    public FontMatchSpec(String str, float f, int i, float f2, boolean z) {
        this(1, str, f, i, f2, z, false);
    }
}
