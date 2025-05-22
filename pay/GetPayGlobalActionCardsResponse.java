package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvlp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetPayGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvlp();
    public PayGlobalActionCard[] a;
    public int b;

    private GetPayGlobalActionCardsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPayGlobalActionCardsResponse) {
            GetPayGlobalActionCardsResponse getPayGlobalActionCardsResponse = (GetPayGlobalActionCardsResponse) obj;
            if (Arrays.equals(this.a, getPayGlobalActionCardsResponse.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(getPayGlobalActionCardsResponse.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public GetPayGlobalActionCardsResponse(PayGlobalActionCard[] payGlobalActionCardArr, int i) {
        this.a = payGlobalActionCardArr;
        this.b = i;
    }
}
