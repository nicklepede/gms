package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmvk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GetFastpairAccountKeyByAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmvk();
    public final int a;
    public final FastPairAccountKeyParcelable b;

    public GetFastpairAccountKeyByAccountResponse(int i, FastPairAccountKeyParcelable fastPairAccountKeyParcelable) {
        this.a = i;
        this.b = fastPairAccountKeyParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
