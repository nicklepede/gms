package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctcj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetPayCardArtResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctcj();
    public PayCardArt[] a;

    private GetPayCardArtResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPayCardArtResponse) {
            return Arrays.equals(this.a, ((GetPayCardArtResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 2, this.a, i);
        arxc.c(parcel, a);
    }

    public GetPayCardArtResponse(PayCardArt[] payCardArtArr) {
        this.a = payCardArtArr;
    }
}
