package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bexq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ProvisionFastPairDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bexq();
    public Account a;
    public byte[] b;
    public byte[] c;
    public FastPairDeviceMetadata d;
    public byte[] e;

    public ProvisionFastPairDeviceRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProvisionFastPairDeviceRequest) {
            ProvisionFastPairDeviceRequest provisionFastPairDeviceRequest = (ProvisionFastPairDeviceRequest) obj;
            if (atyq.b(this.a, provisionFastPairDeviceRequest.a) && Arrays.equals(this.b, provisionFastPairDeviceRequest.b) && Arrays.equals(this.c, provisionFastPairDeviceRequest.c) && atyq.b(this.d, provisionFastPairDeviceRequest.d) && Arrays.equals(this.e, provisionFastPairDeviceRequest.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), this.d, Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.i(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public ProvisionFastPairDeviceRequest(Account account, byte[] bArr, byte[] bArr2, FastPairDeviceMetadata fastPairDeviceMetadata, byte[] bArr3) {
        this.a = account;
        this.b = bArr;
        this.c = bArr2;
        this.d = fastPairDeviceMetadata;
        this.e = bArr3;
    }
}
