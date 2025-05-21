package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcvs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetOwnerKeyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcvs();
    public int a;
    public byte[] b;

    public GetOwnerKeyResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOwnerKeyResponse) {
            GetOwnerKeyResponse getOwnerKeyResponse = (GetOwnerKeyResponse) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(getOwnerKeyResponse.a)) && Arrays.equals(this.b, getOwnerKeyResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.i(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public GetOwnerKeyResponse(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }
}
