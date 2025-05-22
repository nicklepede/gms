package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acyg;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GetAndAdvanceOtpCounterResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acyg();
    final int a;
    public final Long b;

    public GetAndAdvanceOtpCounterResponse(int i, Long l) {
        this.a = i;
        this.b = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.I(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
