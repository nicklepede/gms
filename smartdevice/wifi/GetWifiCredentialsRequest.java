package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dgzk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class GetWifiCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgzk();
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
            if (atyq.b(this.a, getWifiCredentialsRequest.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(getWifiCredentialsRequest.b))) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public GetWifiCredentialsRequest(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
