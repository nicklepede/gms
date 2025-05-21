package com.google.android.gms.payse.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import defpackage.arxc;
import defpackage.ctil;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetSeCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctil();
    public final SecureElementStoredValue[] a;

    public GetSeCardsResponse(SecureElementStoredValue[] secureElementStoredValueArr) {
        this.a = secureElementStoredValueArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.c(parcel, a);
    }
}
