package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bsl;
import defpackage.cmkb;
import defpackage.cmnx;
import defpackage.cmny;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cmny();
    final int a;
    public final int b;
    public final Message c;
    public final DistanceImpl d;
    public final BleSignalImpl e;
    public final NearbyDevice f;
    public final byte[] g;

    public Update(int i, int i2, Message message, DistanceImpl distanceImpl, BleSignalImpl bleSignalImpl, NearbyDevice nearbyDevice, byte[] bArr) {
        this.a = i;
        boolean c = c(i2, 2);
        this.b = true == c ? 2 : i2;
        this.c = message;
        this.d = true == c ? null : distanceImpl;
        this.e = true == c ? null : bleSignalImpl;
        this.f = true == c ? null : nearbyDevice;
        this.g = true == c ? null : bArr;
    }

    public static boolean c(int i, int i2) {
        return (i & i2) != 0;
    }

    public final String a() {
        return "Update{address=" + this.c.a().d + ", distance=" + String.valueOf(this.d) + ", bleSignal=" + String.valueOf(this.e) + "}";
    }

    public final boolean b(int i) {
        return c(this.b, i);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        return this.b == update.b && atyq.b(this.c, update.c) && atyq.b(this.d, update.d) && atyq.b(this.e, update.e) && atyq.b(this.f, update.f) && Arrays.equals(this.g, update.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        bsl bslVar = new bsl();
        if (b(1)) {
            bslVar.add("FOUND");
        }
        if (b(2)) {
            bslVar.add("LOST");
        }
        if (b(4)) {
            bslVar.add("DISTANCE");
        }
        if (b(8)) {
            bslVar.add("BLE_SIGNAL");
        }
        if (b(16)) {
            bslVar.add("DEVICE");
        }
        if (b(32)) {
            bslVar.add("BLE_RECORD");
        }
        String obj = bslVar.toString();
        Message message = this.c;
        DistanceImpl distanceImpl = this.d;
        BleSignalImpl bleSignalImpl = this.e;
        NearbyDevice nearbyDevice = this.f;
        byte[] bArr = this.g;
        return "Update{types=" + obj + ", message=" + String.valueOf(message) + ", distance=" + String.valueOf(distanceImpl) + ", bleSignal=" + String.valueOf(bleSignalImpl) + ", device=" + String.valueOf(nearbyDevice) + ", bleRecord=" + String.valueOf(cmkb.a(bArr)) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.i(parcel, 7, this.g, false);
        atzr.c(parcel, a);
    }

    public Update(cmnx cmnxVar) {
        this(1, cmnxVar.a, cmnxVar.b, cmnxVar.c, cmnxVar.d, cmnxVar.e, cmnxVar.f);
    }
}
