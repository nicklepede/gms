package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.catb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class IneligibilityRationale extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new catb();
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public IneligibilityRationale(String str, boolean z, String str2, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.e(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.e(parcel, 6, this.f);
        arxc.c(parcel, a);
    }
}
