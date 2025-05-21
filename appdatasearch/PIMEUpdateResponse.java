package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.trr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PIMEUpdateResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new trr();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.J(parcel, 3, this.c, i);
        arxc.c(parcel, a);
    }
}
