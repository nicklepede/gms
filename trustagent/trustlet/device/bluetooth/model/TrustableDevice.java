package com.google.android.gms.trustagent.trustlet.device.bluetooth.model;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.djbn;
import defpackage.djec;
import defpackage.ekvl;
import defpackage.elkk;
import j$.util.Optional;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TrustableDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new djbn();
    private static final ClassLoader c = TrustableDevice.class.getClassLoader();
    public final List a;
    public final boolean b;

    public TrustableDevice(BluetoothDevice bluetoothDevice, boolean z) {
        this(elkk.d(bluetoothDevice), z);
    }

    public static Optional b(Bundle bundle, String str) {
        if (bundle == null) {
            return Optional.empty();
        }
        ClassLoader classLoader = c;
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        return Optional.ofNullable((TrustableDevice) bundle.getParcelable(str));
    }

    public static Optional e(Intent intent) {
        return b(intent.getExtras(), "trustable_device");
    }

    public final BluetoothDevice a() {
        return (BluetoothDevice) this.a.get(0);
    }

    public final String c() {
        return a().getAddress();
    }

    public final String d() {
        return djec.b(a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public TrustableDevice(List list, boolean z) {
        ekvl.b(!list.isEmpty(), "Cannot create empty TrustableDevice");
        ekvl.b(list.get(0) != null, "Cannot create with null device");
        this.a = list;
        this.b = z;
    }
}
