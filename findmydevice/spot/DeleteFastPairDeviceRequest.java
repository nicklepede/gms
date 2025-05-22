package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bewk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class DeleteFastPairDeviceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bewk();
    public Account a;
    public byte[] b;

    public DeleteFastPairDeviceRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeleteFastPairDeviceRequest) {
            DeleteFastPairDeviceRequest deleteFastPairDeviceRequest = (DeleteFastPairDeviceRequest) obj;
            if (atyq.b(this.a, deleteFastPairDeviceRequest.a) && Arrays.equals(this.b, deleteFastPairDeviceRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public DeleteFastPairDeviceRequest(Account account, byte[] bArr) {
        this.a = account;
        this.b = bArr;
    }
}
