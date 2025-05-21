package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.deoh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class GetWifiCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new deoh();
    public String a;
    public int b;

    public GetWifiCredentialsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetWifiCredentialsRequest) {
            GetWifiCredentialsRequest getWifiCredentialsRequest = (GetWifiCredentialsRequest) obj;
            if (arwb.b(this.a, getWifiCredentialsRequest.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(getWifiCredentialsRequest.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public GetWifiCredentialsRequest(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
