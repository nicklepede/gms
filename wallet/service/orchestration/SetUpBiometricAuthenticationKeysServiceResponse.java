package com.google.android.gms.wallet.service.orchestration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import defpackage.atzs;
import defpackage.dlng;
import defpackage.dlpo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SetUpBiometricAuthenticationKeysServiceResponse implements Parcelable, dlpo {
    public static final Parcelable.Creator CREATOR = new dlng();
    public final SetUpBiometricAuthenticationKeysResponse a;
    public final Status b;

    public SetUpBiometricAuthenticationKeysServiceResponse(SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Status status) {
        this.a = setUpBiometricAuthenticationKeysResponse;
        this.b = status;
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
        parcel.writeByteArray(atzs.n(this.a));
        parcel.writeParcelable(this.b, i);
    }
}
