package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dfhy;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ConnectionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfhy();
    public final D2DDevice a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;

    public ConnectionRequest(D2DDevice d2DDevice, String str, String str2, byte[] bArr, String str3, int i, boolean z, boolean z2, boolean z3, int i2, int i3) {
        this.a = d2DDevice;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = str3;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = i2;
        this.k = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectionRequest) {
            ConnectionRequest connectionRequest = (ConnectionRequest) obj;
            D2DDevice d2DDevice = connectionRequest.a;
            String str = connectionRequest.b;
            String str2 = connectionRequest.c;
            byte[] bArr = connectionRequest.d;
            String str3 = connectionRequest.e;
            int i = connectionRequest.f;
            boolean z = connectionRequest.g;
            boolean z2 = connectionRequest.h;
            int i2 = connectionRequest.j;
            int i3 = connectionRequest.k;
            if (atyq.b(d2DDevice, this.a) && atyq.b(str, this.b) && atyq.b(str2, this.c) && Arrays.equals(bArr, this.d) && atyq.b(str3, this.e) && i == this.f && z == this.g && z2 == this.h && connectionRequest.i == this.i && i2 == this.j && i3 == this.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.d)), this.c, this.e, Integer.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k)});
    }

    public final String toString() {
        return String.format(Locale.US, "device: %s, pin: %s, deeplinkPairingCode: %s, fastpairCode: %s, outOfBandKey: %s, triggerType: %d, isQuickStartReconnect: %b, isQuickStartConnection: %b, requiresLongTimeout: %b, oemType: %s, targetDeviceType: %s", this.a, this.b, this.c, Arrays.toString(this.d), this.e, Integer.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D2DDevice d2DDevice = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, d2DDevice, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.i(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.o(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.e(parcel, 9, this.i);
        atzr.o(parcel, 10, this.j);
        atzr.o(parcel, 11, this.k);
        atzr.c(parcel, a);
    }
}
