package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.avaw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class VerifyPhoneNumberResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avaw();
    public final PhoneNumberVerification[] a;
    public final Bundle b;

    public VerifyPhoneNumberResponse(PhoneNumberVerification[] phoneNumberVerificationArr, Bundle bundle) {
        this.a = phoneNumberVerificationArr;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PhoneNumberVerification[] phoneNumberVerificationArr = this.a;
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, phoneNumberVerificationArr, i);
        atzr.g(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
