package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chbp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GetPhoneNumbersRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chbp();
    public String a;
    public UserKey b;
    public Bundle c;

    public GetPhoneNumbersRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPhoneNumbersRequest) {
            GetPhoneNumbersRequest getPhoneNumbersRequest = (GetPhoneNumbersRequest) obj;
            if (atyq.b(this.a, getPhoneNumbersRequest.a) && atyq.b(this.b, getPhoneNumbersRequest.b) && atyq.b(this.c, getPhoneNumbersRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.g(parcel, 63, this.c, false);
        atzr.c(parcel, a);
    }

    public GetPhoneNumbersRequest(String str, UserKey userKey, Bundle bundle) {
        this.a = str;
        this.b = userKey;
        this.c = bundle;
    }
}
