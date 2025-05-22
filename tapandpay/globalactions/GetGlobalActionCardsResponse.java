package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhjf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class GetGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhjf();
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
            if (Arrays.equals(this.a, getGlobalActionCardsResponse.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(getGlobalActionCardsResponse.b))) {
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

    public GetGlobalActionCardsResponse(GlobalActionCard[] globalActionCardArr, int i) {
        this.a = globalActionCardArr;
        this.b = i;
    }
}
