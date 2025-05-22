package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aeif;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class WireMessageParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeif();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.i(parcel, 2, this.c, false);
        atzr.v(parcel, 3, this.d, false);
        atzr.o(parcel, 10000, this.a);
        atzr.c(parcel, a);
    }

    public WireMessageParams(String str, byte[] bArr, String str2) {
        this(1, str, bArr, str2);
    }
}
