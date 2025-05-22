package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.xlj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xlj();
    public final String a;
    public final byte[] b;

    public SendDataRequest(String str, byte[] bArr) {
        atzb.s(str);
        this.a = str;
        atzb.s(bArr);
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, 1);
        atzr.v(parcel, 2, this.a, false);
        atzr.i(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}
