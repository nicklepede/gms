package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acif;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WireMessageParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acif();
    final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public WireMessageParams(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.i(parcel, 2, this.c, false);
        arxc.v(parcel, 3, this.d, false);
        arxc.o(parcel, 10000, this.a);
        arxc.c(parcel, a);
    }

    public WireMessageParams(String str, byte[] bArr, String str2) {
        this(1, str, bArr, str2);
    }
}
