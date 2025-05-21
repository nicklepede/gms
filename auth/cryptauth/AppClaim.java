package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaol;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppClaim extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaol();
    final int a;
    public final String b;
    public final boolean c;
    public final byte[] d;

    public AppClaim(int i, String str, boolean z, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.i(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
