package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.beyi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class UpdateFastPairDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new beyi();
    public Account a;
    public byte[] b;
    public FastPairDeviceMetadata c;

    public UpdateFastPairDeviceRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateFastPairDeviceRequest) {
            UpdateFastPairDeviceRequest updateFastPairDeviceRequest = (UpdateFastPairDeviceRequest) obj;
            if (atyq.b(this.a, updateFastPairDeviceRequest.a) && Arrays.equals(this.b, updateFastPairDeviceRequest.b) && atyq.b(this.c, updateFastPairDeviceRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public UpdateFastPairDeviceRequest(Account account, byte[] bArr, FastPairDeviceMetadata fastPairDeviceMetadata) {
        this.a = account;
        this.b = bArr;
        this.c = fastPairDeviceMetadata;
    }
}
