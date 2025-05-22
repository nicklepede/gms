package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvlm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetOutstandingPurchaseOrderIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvlm();
    public long a;

    private GetOutstandingPurchaseOrderIdResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOutstandingPurchaseOrderIdResponse) {
            return atyq.b(Long.valueOf(this.a), Long.valueOf(((GetOutstandingPurchaseOrderIdResponse) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.c(parcel, a);
    }

    public GetOutstandingPurchaseOrderIdResponse(long j) {
        this.a = j;
    }
}
