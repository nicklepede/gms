package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctch;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetOutstandingPurchaseOrderIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctch();
    public long a;

    private GetOutstandingPurchaseOrderIdResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOutstandingPurchaseOrderIdResponse) {
            return arwb.b(Long.valueOf(this.a), Long.valueOf(((GetOutstandingPurchaseOrderIdResponse) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.c(parcel, a);
    }

    public GetOutstandingPurchaseOrderIdResponse(long j) {
        this.a = j;
    }
}
