package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bewt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetCanonicDeviceIdFromAccountKeyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bewt();
    public byte[] a;

    public GetCanonicDeviceIdFromAccountKeyRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCanonicDeviceIdFromAccountKeyRequest) {
            return Arrays.equals(this.a, ((GetCanonicDeviceIdFromAccountKeyRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.c(parcel, a);
    }

    public GetCanonicDeviceIdFromAccountKeyRequest(byte[] bArr) {
        this.a = bArr;
    }
}
