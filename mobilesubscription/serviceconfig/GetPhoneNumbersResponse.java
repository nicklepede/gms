package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cesi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GetPhoneNumbersResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cesi();
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
            if (arwb.b(this.a, getPhoneNumbersResponse.a) && Arrays.equals(this.b, getPhoneNumbersResponse.b) && arwb.b(this.c, getPhoneNumbersResponse.c)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.w(parcel, 2, this.b, false);
        arxc.g(parcel, 63, this.c, false);
        arxc.c(parcel, a);
    }

    public GetPhoneNumbersResponse(String str, String[] strArr, Bundle bundle) {
        this.a = str;
        this.b = strArr;
        this.c = bundle;
    }
}
