package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bexg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetWearableProvisioningStateResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bexg();
    public int a;
    public Account b;
    public boolean c;
    public String d;

    public GetWearableProvisioningStateResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetWearableProvisioningStateResponse) {
            GetWearableProvisioningStateResponse getWearableProvisioningStateResponse = (GetWearableProvisioningStateResponse) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(getWearableProvisioningStateResponse.a)) && atyq.b(this.b, getWearableProvisioningStateResponse.b) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(getWearableProvisioningStateResponse.c)) && atyq.b(this.d, getWearableProvisioningStateResponse.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.b, i, false);
        atzr.e(parcel, 2, this.c);
        atzr.o(parcel, 3, this.a);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public GetWearableProvisioningStateResponse(int i, Account account, boolean z, String str) {
        this.a = i;
        this.b = account;
        this.c = z;
        this.d = str;
    }
}
