package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dids;
import defpackage.didt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class IsReadyToPayResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new didt();
    public boolean a;
    public String b;

    public IsReadyToPayResponse() {
    }

    public static dids a() {
        return new dids(new IsReadyToPayResponse());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public IsReadyToPayResponse(boolean z, String str) {
        this.a = z;
        this.b = str;
    }
}
