package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.diej;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes7.dex */
public final class ProxyCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new diej();
    final String a;
    final String b;
    final int c;
    final int d;

    public ProxyCard(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.o(parcel, 4, this.c);
        arxc.o(parcel, 5, this.d);
        arxc.c(parcel, a);
    }
}
