package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abol;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UnlockFactoryResetProtectionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abol();
    final int a;
    public final int b;

    public UnlockFactoryResetProtectionResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public UnlockFactoryResetProtectionResponse(int i) {
        this(1, i);
    }
}
