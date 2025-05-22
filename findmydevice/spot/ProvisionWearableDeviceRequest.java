package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bexs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ProvisionWearableDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bexs();
    public String a;
    public boolean b;

    private ProvisionWearableDeviceRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProvisionWearableDeviceRequest) {
            ProvisionWearableDeviceRequest provisionWearableDeviceRequest = (ProvisionWearableDeviceRequest) obj;
            if (atyq.b(this.a, provisionWearableDeviceRequest.a) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(provisionWearableDeviceRequest.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public ProvisionWearableDeviceRequest(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
