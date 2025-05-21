package com.google.android.gms.wallet.service.orchestration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import defpackage.arxd;
import defpackage.djbn;
import defpackage.djdv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SetUpBiometricAuthenticationKeysServiceResponse implements Parcelable, djdv {
    public static final Parcelable.Creator CREATOR = new djbn();
    public final SetUpBiometricAuthenticationKeysResponse a;
    public final Status b;

    public SetUpBiometricAuthenticationKeysServiceResponse(SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse, Status status) {
        this.a = setUpBiometricAuthenticationKeysResponse;
        this.b = status;
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
        parcel.writeByteArray(arxd.n(this.a));
        parcel.writeParcelable(this.b, i);
    }
}
