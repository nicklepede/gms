package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dgzi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ConnectToWifiNetworkRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgzi();
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
            if (atyq.b(this.a, connectToWifiNetworkRequest.a) && atyq.b(this.b, connectToWifiNetworkRequest.b) && atyq.b(this.c, connectToWifiNetworkRequest.c) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(connectToWifiNetworkRequest.d))) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public ConnectToWifiNetworkRequest(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }
}
