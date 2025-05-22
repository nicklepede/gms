package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.auzp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GetIidTokenResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new auzp();
    public final String a;
    public final String b;
    public final byte[] c;
    public final long d;

    public GetIidTokenResponse(String str, String str2, byte[] bArr, long j) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.q(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
