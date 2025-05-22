package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bexe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetOwnerKeyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bexe();
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
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(getOwnerKeyResponse.a)) && Arrays.equals(this.b, getOwnerKeyResponse.b)) {
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public GetOwnerKeyResponse(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }
}
