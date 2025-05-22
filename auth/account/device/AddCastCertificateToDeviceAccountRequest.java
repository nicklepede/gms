package com.google.android.gms.auth.account.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.xev;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AddCastCertificateToDeviceAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xev();
    public final String a;
    public final byte[][] b;

    public AddCastCertificateToDeviceAccountRequest(String str, byte[][] bArr) {
        atzb.q(str);
        this.a = str;
        atzb.s(bArr);
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.A(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
