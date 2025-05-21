package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkjr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GetFastpairAccountKeyByAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkjr();
    public final int a;
    public final FastPairAccountKeyParcelable b;

    public GetFastpairAccountKeyByAccountResponse(int i, FastPairAccountKeyParcelable fastPairAccountKeyParcelable) {
        this.a = i;
        this.b = fastPairAccountKeyParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
