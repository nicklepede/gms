package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvlu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetTransitCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvlu();
    public TransitCard[] a;
    public Bitmap b;
    public Bitmap c;
    public TransitPaymentOption[] d;
    public GetTransitPassResponse e;

    private GetTransitCardsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetTransitCardsResponse) {
            GetTransitCardsResponse getTransitCardsResponse = (GetTransitCardsResponse) obj;
            if (Arrays.equals(this.a, getTransitCardsResponse.a) && atyq.b(this.b, getTransitCardsResponse.b) && atyq.b(this.c, getTransitCardsResponse.c) && Arrays.equals(this.d, getTransitCardsResponse.d) && atyq.b(this.e, getTransitCardsResponse.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.J(parcel, 4, this.d, i);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }

    public GetTransitCardsResponse(TransitCard[] transitCardArr, Bitmap bitmap, Bitmap bitmap2, TransitPaymentOption[] transitPaymentOptionArr, GetTransitPassResponse getTransitPassResponse) {
        this.a = transitCardArr;
        this.b = bitmap;
        this.c = bitmap2;
        this.d = transitPaymentOptionArr;
        this.e = getTransitPassResponse;
    }
}
