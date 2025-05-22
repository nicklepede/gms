package com.google.android.gms.significantplaces;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dequ;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SignificantPlaceParceable extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dequ();
    public final String a;
    public final String b;
    public final String c;
    public final double d;
    public final double e;

    public SignificantPlaceParceable(String str, String str2, String str3, double d, double d2) {
        fxxm.f(str, "id");
        fxxm.f(str2, "name");
        fxxm.f(str3, "address");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "parcel");
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.j(parcel, 4, this.d);
        atzr.j(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
