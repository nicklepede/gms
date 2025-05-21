package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dezo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class TokenStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dezo();
    final String a;
    final int b;
    final boolean c;

    public TokenStatus(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.o(parcel, 3, this.b);
        arxc.e(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}
