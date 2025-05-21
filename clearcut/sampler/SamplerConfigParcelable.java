package com.google.android.gms.clearcut.sampler;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqcp;
import defpackage.arxc;
import defpackage.ejpp;
import defpackage.ejqe;
import defpackage.ejqi;
import defpackage.ejqn;
import defpackage.ejrj;
import java.nio.charset.StandardCharsets;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SamplerConfigParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aqcp();
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
        int i = ejqn.b;
        ejqi h = ejrj.b.h();
        h.j(this.a);
        ((ejpp) h).g(Double.doubleToRawLongBits(this.b));
        h.j(this.c);
        h.j(this.d);
        String str = this.e;
        if (str != null) {
            h.m(str, StandardCharsets.UTF_8);
        }
        return ((ejqe) h.s()).a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.j(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
