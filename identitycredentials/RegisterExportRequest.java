package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bmnd;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RegisterExportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmnd();
    public final byte[] a;
    public final byte[] b;
    public final String c;

    public RegisterExportRequest(byte[] bArr, byte[] bArr2, String str) {
        fvbo.f(bArr, "matcher");
        fvbo.f(bArr2, "data");
        fvbo.f(str, "id");
        this.a = bArr;
        this.b = bArr2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
