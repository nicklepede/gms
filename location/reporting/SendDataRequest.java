package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cctw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cctw();
    public final String a;
    public final byte[] b;

    public SendDataRequest(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
