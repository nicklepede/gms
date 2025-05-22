package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.botw;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RegisterExportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new botw();
    public final byte[] a;
    public final byte[] b;
    public final String c;

    public RegisterExportRequest(byte[] bArr, byte[] bArr2, String str) {
        fxxm.f(bArr, "matcher");
        fxxm.f(bArr2, "data");
        fxxm.f(str, "id");
        this.a = bArr;
        this.b = bArr2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
