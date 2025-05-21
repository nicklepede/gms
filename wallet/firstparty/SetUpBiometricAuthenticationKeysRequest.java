package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dipi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class SetUpBiometricAuthenticationKeysRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dipi();
    public byte[] a;

    public SetUpBiometricAuthenticationKeysRequest(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a, false);
        arxc.c(parcel, a);
    }

    public SetUpBiometricAuthenticationKeysRequest() {
        this(null);
    }
}
