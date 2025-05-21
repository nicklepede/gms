package com.google.android.gms.wallet.service.orchestration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import defpackage.ctig;
import defpackage.dizi;
import defpackage.djdv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FetchPaySeCardsResponse implements Parcelable, djdv {
    public static final Parcelable.Creator CREATOR = new dizi();
    public final SecureElementStoredValue[] a;

    public FetchPaySeCardsResponse(SecureElementStoredValue[] secureElementStoredValueArr) {
        this.a = secureElementStoredValueArr;
    }

    @Override // defpackage.djdv
    public final boolean a() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SecureElementStoredValue[] secureElementStoredValueArr = this.a;
        parcel.writeInt(secureElementStoredValueArr.length);
        for (SecureElementStoredValue secureElementStoredValue : secureElementStoredValueArr) {
            ctig.a(secureElementStoredValue, parcel);
        }
    }
}
