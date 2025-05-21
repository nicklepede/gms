package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.deof;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ConnectToWifiNetworkRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new deof();
    public String a;
    public String b;
    public String c;
    public boolean d;

    public ConnectToWifiNetworkRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectToWifiNetworkRequest) {
            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = (ConnectToWifiNetworkRequest) obj;
            if (arwb.b(this.a, connectToWifiNetworkRequest.a) && arwb.b(this.b, connectToWifiNetworkRequest.b) && arwb.b(this.c, connectToWifiNetworkRequest.c) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(connectToWifiNetworkRequest.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public ConnectToWifiNetworkRequest(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }
}
