package com.google.android.gms.clearcut.sampler;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.asfg;
import defpackage.atzr;
import defpackage.emcx;
import defpackage.emdn;
import defpackage.emdr;
import defpackage.emdw;
import defpackage.emes;
import java.nio.charset.StandardCharsets;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SamplerConfigParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asfg();
    public final int a;
    public final double b;
    public final int c;
    public final int d;
    public final String e;

    public SamplerConfigParcelable(int i, double d, int i2, int i3, String str) {
        this.a = i;
        this.b = d;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public final int hashCode() {
        int i = emdw.b;
        emdr h = emes.b.h();
        h.j(this.a);
        ((emcx) h).g(Double.doubleToRawLongBits(this.b));
        h.j(this.c);
        h.j(this.d);
        String str = this.e;
        if (str != null) {
            h.m(str, StandardCharsets.UTF_8);
        }
        return ((emdn) h.s()).a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.j(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
