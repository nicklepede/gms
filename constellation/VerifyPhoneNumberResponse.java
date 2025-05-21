package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aswu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class VerifyPhoneNumberResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aswu();
    public final PhoneNumberVerification[] a;
    public final Bundle b;

    public VerifyPhoneNumberResponse(PhoneNumberVerification[] phoneNumberVerificationArr, Bundle bundle) {
        this.a = phoneNumberVerificationArr;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PhoneNumberVerification[] phoneNumberVerificationArr = this.a;
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, phoneNumberVerificationArr, i);
        arxc.g(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
