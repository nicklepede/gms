package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bcvh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetCanonicDeviceIdFromAccountKeyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcvh();
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
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a, false);
        arxc.c(parcel, a);
    }

    public GetCanonicDeviceIdFromAccountKeyRequest(byte[] bArr) {
        this.a = bArr;
    }
}
