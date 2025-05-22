package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.botu;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RegisterCreationOptionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new botu();
    public final byte[] a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final String e;

    public RegisterCreationOptionsRequest(byte[] bArr, byte[] bArr2, String str, String str2, String str3) {
        fxxm.f(bArr, "createOptions");
        fxxm.f(bArr2, "matcher");
        fxxm.f(str, "type");
        fxxm.f(str2, "id");
        fxxm.f(str3, "fulfillmentActionName");
        this.a = bArr;
        this.b = bArr2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
