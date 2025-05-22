package com.google.android.gms.usonia;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkez;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class PeerAddress extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkez();
    public final byte[] a;
    public final int b;
    public final String c;
    public final int d;

    private PeerAddress() {
        this.a = new byte[0];
        this.b = 0;
        this.c = "";
        this.d = 0;
    }

    public final String a() {
        try {
            byte[] bArr = this.a;
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (byAddress != null) {
                return String.format(Locale.ENGLISH, "%s:%d:%d", byAddress.getHostAddress(), Integer.valueOf(this.b), Integer.valueOf(this.d));
            }
            return "[invalid ip: " + Arrays.toString(bArr) + "]";
        } catch (UnknownHostException unused) {
            return "[illegal length: " + Arrays.toString(this.a) + "]";
        }
    }

    public final InetAddress b() {
        try {
            return InetAddress.getByAddress(this.a);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PeerAddress) {
            PeerAddress peerAddress = (PeerAddress) obj;
            if (Arrays.equals(this.a, peerAddress.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(peerAddress.b)) && atyq.b(this.c, peerAddress.c) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(peerAddress.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b), this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        return this.c + "@" + a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, Arrays.copyOf(bArr, bArr.length), false);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public PeerAddress(byte[] bArr, int i, String str, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = str;
        this.d = i2;
    }
}
