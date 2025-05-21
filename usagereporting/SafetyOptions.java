package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dhqb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SafetyOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhqb();
    public final boolean a;
    public final boolean b;
    public final int c;

    public SafetyOptions(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 2, this.a);
        arxc.e(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}
