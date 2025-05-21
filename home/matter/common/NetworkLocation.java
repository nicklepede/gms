package com.google.android.gms.home.matter.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.blaj;
import defpackage.enmp;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class NetworkLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new blaj();
    public final int a;
    private final InetAddress b;

    public NetworkLocation(InetAddress inetAddress, int i) {
        arwm.s(inetAddress);
        this.b = inetAddress;
        this.a = i;
    }

    public static InetAddress b(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            throw new IllegalArgumentException("Failed to parse IP address ".concat(String.valueOf(Arrays.toString(bArr))), e);
        }
    }

    public final String a() {
        return enmp.a(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkLocation)) {
            return false;
        }
        NetworkLocation networkLocation = (NetworkLocation) obj;
        if (this.a == networkLocation.a) {
            InetAddress inetAddress = this.b;
            InetAddress inetAddress2 = networkLocation.b;
            if (inetAddress.equals(inetAddress2) && (!(inetAddress instanceof Inet6Address) || !(inetAddress2 instanceof Inet6Address) || ((Inet6Address) inetAddress).getScopeId() == ((Inet6Address) inetAddress2).getScopeId())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.a)});
    }

    public final String toString() {
        return a() + "[" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.v(parcel, 3, a(), false);
        arxc.c(parcel, a);
    }
}
