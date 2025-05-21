package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcwe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ProvisionFastPairDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcwe();
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
            if (arwb.b(this.a, provisionFastPairDeviceRequest.a) && Arrays.equals(this.b, provisionFastPairDeviceRequest.b) && Arrays.equals(this.c, provisionFastPairDeviceRequest.c) && arwb.b(this.d, provisionFastPairDeviceRequest.d) && Arrays.equals(this.e, provisionFastPairDeviceRequest.e)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.i(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public ProvisionFastPairDeviceRequest(Account account, byte[] bArr, byte[] bArr2, FastPairDeviceMetadata fastPairDeviceMetadata, byte[] bArr3) {
        this.a = account;
        this.b = bArr;
        this.c = bArr2;
        this.d = fastPairDeviceMetadata;
        this.e = bArr3;
    }
}
