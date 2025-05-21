package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.deoi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class GetWifiCredentialsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new deoi();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(getWifiCredentialsResponse.a)) && arwb.b(this.b, getWifiCredentialsResponse.b) && arwb.b(this.c, getWifiCredentialsResponse.c) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(getWifiCredentialsResponse.d))) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public GetWifiCredentialsResponse(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
