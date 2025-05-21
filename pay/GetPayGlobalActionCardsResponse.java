package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctck;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetPayGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctck();
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
            if (Arrays.equals(this.a, getPayGlobalActionCardsResponse.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(getPayGlobalActionCardsResponse.b))) {
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
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public GetPayGlobalActionCardsResponse(PayGlobalActionCard[] payGlobalActionCardArr, int i) {
        this.a = payGlobalActionCardArr;
        this.b = i;
    }
}
