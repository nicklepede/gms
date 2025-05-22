package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bewm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DeviceComponentImages extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bewm();
    public String a;
    public String b;
    public String c;

    public DeviceComponentImages() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceComponentImages) {
            DeviceComponentImages deviceComponentImages = (DeviceComponentImages) obj;
            if (atyq.b(this.a, deviceComponentImages.a) && atyq.b(this.b, deviceComponentImages.b) && atyq.b(this.c, deviceComponentImages.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public DeviceComponentImages(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
