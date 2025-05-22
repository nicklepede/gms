package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chbq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GetPhoneNumbersResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chbq();
    public String a;
    public String[] b;
    public Bundle c;

    public GetPhoneNumbersResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPhoneNumbersResponse) {
            GetPhoneNumbersResponse getPhoneNumbersResponse = (GetPhoneNumbersResponse) obj;
            if (atyq.b(this.a, getPhoneNumbersResponse.a) && Arrays.equals(this.b, getPhoneNumbersResponse.b) && atyq.b(this.c, getPhoneNumbersResponse.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.w(parcel, 2, this.b, false);
        atzr.g(parcel, 63, this.c, false);
        atzr.c(parcel, a);
    }

    public GetPhoneNumbersResponse(String str, String[] strArr, Bundle bundle) {
        this.a = str;
        this.b = strArr;
        this.c = bundle;
    }
}
