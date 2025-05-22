package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vnr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PIMEUpdateResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vnr();
    final String a;
    public final byte[] b;
    public final PIMEUpdate[] c;

    public PIMEUpdateResponse(String str, byte[] bArr, PIMEUpdate[] pIMEUpdateArr) {
        this.a = str;
        this.b = bArr;
        this.c = pIMEUpdateArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.J(parcel, 3, this.c, i);
        atzr.c(parcel, a);
    }
}
