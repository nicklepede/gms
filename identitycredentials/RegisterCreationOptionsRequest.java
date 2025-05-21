package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bmnb;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RegisterCreationOptionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmnb();
    public final byte[] a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final String e;

    public RegisterCreationOptionsRequest(byte[] bArr, byte[] bArr2, String str, String str2, String str3) {
        fvbo.f(bArr, "createOptions");
        fvbo.f(bArr2, "matcher");
        fvbo.f(str, "type");
        fvbo.f(str2, "id");
        fvbo.f(str3, "fulfillmentActionName");
        this.a = bArr;
        this.b = bArr2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
