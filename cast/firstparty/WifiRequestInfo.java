package com.google.android.gms.cast.firstparty;

import android.net.wifi.WifiConfiguration;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amuk;
import defpackage.amxr;
import defpackage.arxc;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class WifiRequestInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amuk();
    public final String a;
    public final String b;
    public final int c;

    public WifiRequestInfo(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WifiRequestInfo)) {
            return false;
        }
        WifiRequestInfo wifiRequestInfo = (WifiRequestInfo) obj;
        return amxr.u(this.a, wifiRequestInfo.a) && amxr.u(this.b, wifiRequestInfo.b) && this.c == wifiRequestInfo.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "%s - %s - %s", this.a, this.b, WifiConfiguration.KeyMgmt.strings[this.c]);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.o(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}
