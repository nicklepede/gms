package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dgzl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class GetWifiCredentialsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgzl();
    public int a;
    public String b;
    public String c;
    public boolean d;

    private GetWifiCredentialsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetWifiCredentialsResponse) {
            GetWifiCredentialsResponse getWifiCredentialsResponse = (GetWifiCredentialsResponse) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(getWifiCredentialsResponse.a)) && atyq.b(this.b, getWifiCredentialsResponse.b) && atyq.b(this.c, getWifiCredentialsResponse.c) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(getWifiCredentialsResponse.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public GetWifiCredentialsResponse(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
