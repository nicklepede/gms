package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcvu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetWearableProvisioningStateResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcvu();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(getWearableProvisioningStateResponse.a)) && arwb.b(this.b, getWearableProvisioningStateResponse.b) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(getWearableProvisioningStateResponse.c)) && arwb.b(this.d, getWearableProvisioningStateResponse.d)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.b, i, false);
        arxc.e(parcel, 2, this.c);
        arxc.o(parcel, 3, this.a);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public GetWearableProvisioningStateResponse(int i, Account account, boolean z, String str) {
        this.a = i;
        this.b = account;
        this.c = z;
        this.d = str;
    }
}
