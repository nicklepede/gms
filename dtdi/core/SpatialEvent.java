package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aydd;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SpatialEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aydd();
    public final String a;
    public final int b;
    public final int c;

    public SpatialEvent(String str, int i, int i2) {
        fvbo.f(str, "deviceId");
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
