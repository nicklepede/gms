package com.google.android.gms.wallet.service.orchestration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import defpackage.cvrm;
import defpackage.dllb;
import defpackage.dlpo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FetchPaySeCardsResponse implements Parcelable, dlpo {
    public static final Parcelable.Creator CREATOR = new dllb();
    public final SecureElementStoredValue[] a;

    public FetchPaySeCardsResponse(SecureElementStoredValue[] secureElementStoredValueArr) {
        this.a = secureElementStoredValueArr;
    }

    @Override // defpackage.dlpo
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
            cvrm.a(secureElementStoredValue, parcel);
        }
    }
}
