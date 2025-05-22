package com.google.android.gms.payse.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import defpackage.atzr;
import defpackage.cvrr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetSeCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvrr();
    public final SecureElementStoredValue[] a;

    public GetSeCardsResponse(SecureElementStoredValue[] secureElementStoredValueArr) {
        this.a = secureElementStoredValueArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.c(parcel, a);
    }
}
