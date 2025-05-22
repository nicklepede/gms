package com.google.android.gms.home.matter.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bnha;
import defpackage.eqaj;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class NetworkLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bnha();
    public final int a;
    private final InetAddress b;

    public NetworkLocation(InetAddress inetAddress, int i) {
        atzb.s(inetAddress);
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
        return eqaj.a(this.b);
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.v(parcel, 3, a(), false);
        atzr.c(parcel, a);
    }
}
