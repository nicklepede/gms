package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.deyb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class GetGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new deyb();
    public GlobalActionCard[] a;
    public int b;

    private GetGlobalActionCardsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) obj;
            if (Arrays.equals(this.a, getGlobalActionCardsResponse.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(getGlobalActionCardsResponse.b))) {
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

    public GetGlobalActionCardsResponse(GlobalActionCard[] globalActionCardArr, int i) {
        this.a = globalActionCardArr;
        this.b = i;
    }
}
