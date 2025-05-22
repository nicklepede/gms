package com.google.android.gms.nearby.connection.v3.dct;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.chmp;
import defpackage.chmq;
import defpackage.cikn;
import defpackage.ciko;
import defpackage.elgo;
import defpackage.elpg;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DctDevice extends AbstractSafeParcelable implements chmq {
    public static final Parcelable.Creator CREATOR = new ciko();
    public final String a;
    public final List b;

    public DctDevice(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.chmq
    public final int a() {
        return 3;
    }

    @Override // defpackage.chmq
    public final int b() {
        return 0;
    }

    @Override // defpackage.chmq
    public final /* bridge */ /* synthetic */ chmp d() {
        cikn ciknVar = new cikn();
        ciknVar.a = this.a;
        ciknVar.b = this.b;
        return ciknVar;
    }

    @Override // defpackage.chmq
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DctDevice) {
            DctDevice dctDevice = (DctDevice) obj;
            if (atyq.b(this.a, dctDevice.a) && atyq.b(this.b, dctDevice.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.chmq
    public final List f() {
        int i = elgo.d;
        return elpg.a;
    }

    @Override // defpackage.chmq
    public final byte[] g() {
        for (DctDeviceDataElement dctDeviceDataElement : this.b) {
            if (dctDeviceDataElement.a == 7) {
                return dctDeviceDataElement.c;
            }
        }
        return new byte[0];
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        return String.format("DctDevice:<endpointId: %s, deviceDataElements: %s>", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ciko.a(this, parcel);
    }
}
