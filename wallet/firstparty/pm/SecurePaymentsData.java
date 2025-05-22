package com.google.android.gms.wallet.firstparty.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.dlbj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SecurePaymentsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dlbj();
    public final int a;
    public final String b;

    public SecurePaymentsData(int i, String str) {
        this.a = i;
        this.b = str;
        atzb.c(i > 0, "SecurePaymentsData.key must be > 0");
        atzb.c(str != null, "SecurePaymentsData.value must not be null");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.v(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}
