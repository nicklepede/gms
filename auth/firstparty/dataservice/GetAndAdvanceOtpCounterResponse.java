package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aayg;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GetAndAdvanceOtpCounterResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aayg();
    final int a;
    public final Long b;

    public GetAndAdvanceOtpCounterResponse(int i, Long l) {
        this.a = i;
        this.b = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.I(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
