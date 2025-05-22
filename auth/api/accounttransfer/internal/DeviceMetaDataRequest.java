package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.xla;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceMetaDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xla();
    public final String a;

    public DeviceMetaDataRequest(String str) {
        atzb.s(str);
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, 1);
        atzr.v(parcel, 2, this.a, false);
        atzr.c(parcel, a);
    }
}
