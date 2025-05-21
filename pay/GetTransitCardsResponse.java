package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctcp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetTransitCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctcp();
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
            if (Arrays.equals(this.a, getTransitCardsResponse.a) && arwb.b(this.b, getTransitCardsResponse.b) && arwb.b(this.c, getTransitCardsResponse.c) && Arrays.equals(this.d, getTransitCardsResponse.d) && arwb.b(this.e, getTransitCardsResponse.e)) {
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
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.J(parcel, 4, this.d, i);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }

    public GetTransitCardsResponse(TransitCard[] transitCardArr, Bitmap bitmap, Bitmap bitmap2, TransitPaymentOption[] transitPaymentOptionArr, GetTransitPassResponse getTransitPassResponse) {
        this.a = transitCardArr;
        this.b = bitmap;
        this.c = bitmap2;
        this.d = transitPaymentOptionArr;
        this.e = getTransitPassResponse;
    }
}
