package com.google.android.gms.significantplaces;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dcgo;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SignificantPlaceParceable extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dcgo();
    public final String a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;

    public SignificantPlaceParceable(String str, String str2, String str3, double d, double d2) {
        fvbo.f(str, "id");
        fvbo.f(str2, "name");
        fvbo.f(str3, "address");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "parcel");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.j(parcel, 4, this.d);
        arxc.j(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
