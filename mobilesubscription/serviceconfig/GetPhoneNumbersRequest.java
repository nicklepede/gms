package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cesh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GetPhoneNumbersRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cesh();
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
            if (arwb.b(this.a, getPhoneNumbersRequest.a) && arwb.b(this.b, getPhoneNumbersRequest.b) && arwb.b(this.c, getPhoneNumbersRequest.c)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.g(parcel, 63, this.c, false);
        arxc.c(parcel, a);
    }

    public GetPhoneNumbersRequest(String str, UserKey userKey, Bundle bundle) {
        this.a = str;
        this.b = userKey;
        this.c = bundle;
    }
}
