package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dhpd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ElCapitanOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhpd();
    public final boolean a;
    public final int b;

    public ElCapitanOptions(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 2, this.a);
        arxc.o(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
