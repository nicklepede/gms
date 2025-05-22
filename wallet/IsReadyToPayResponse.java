package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkpd;
import defpackage.dkpe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class IsReadyToPayResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkpe();
    public boolean a;
    public String b;

    public IsReadyToPayResponse() {
    }

    public static dkpd a() {
        return new dkpd(new IsReadyToPayResponse());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public IsReadyToPayResponse(boolean z, String str) {
        this.a = z;
        this.b = str;
    }
}
