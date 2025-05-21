package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bsa;
import defpackage.ckbw;
import defpackage.ckfs;
import defpackage.ckft;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ckft();
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
        return this.b == update.b && arwb.b(this.c, update.c) && arwb.b(this.d, update.d) && arwb.b(this.e, update.e) && arwb.b(this.f, update.f) && Arrays.equals(this.g, update.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        bsa bsaVar = new bsa();
        if (b(1)) {
            bsaVar.add("FOUND");
        }
        if (b(2)) {
            bsaVar.add("LOST");
        }
        if (b(4)) {
            bsaVar.add("DISTANCE");
        }
        if (b(8)) {
            bsaVar.add("BLE_SIGNAL");
        }
        if (b(16)) {
            bsaVar.add("DEVICE");
        }
        if (b(32)) {
            bsaVar.add("BLE_RECORD");
        }
        String obj = bsaVar.toString();
        Message message = this.c;
        DistanceImpl distanceImpl = this.d;
        BleSignalImpl bleSignalImpl = this.e;
        NearbyDevice nearbyDevice = this.f;
        byte[] bArr = this.g;
        return "Update{types=" + obj + ", message=" + String.valueOf(message) + ", distance=" + String.valueOf(distanceImpl) + ", bleSignal=" + String.valueOf(bleSignalImpl) + ", device=" + String.valueOf(nearbyDevice) + ", bleRecord=" + String.valueOf(ckbw.a(bArr)) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.i(parcel, 7, this.g, false);
        arxc.c(parcel, a);
    }

    public Update(ckfs ckfsVar) {
        this(1, ckfsVar.a, ckfsVar.b, ckfsVar.c, ckfsVar.d, ckfsVar.e, ckfsVar.f);
    }
}
