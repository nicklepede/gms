package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcvt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetWearableProvisioningStateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcvt();
    public String a;

    private GetWearableProvisioningStateRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetWearableProvisioningStateRequest) {
            return arwb.b(this.a, ((GetWearableProvisioningStateRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.c(parcel, a);
    }

    public GetWearableProvisioningStateRequest(String str) {
        this.a = str;
    }
}
