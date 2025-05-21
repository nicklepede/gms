package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctcf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetImagesForValuableResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctcf();
    public Bitmap[] a;

    private GetImagesForValuableResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetImagesForValuableResponse) {
            return Arrays.equals(this.a, ((GetImagesForValuableResponse) obj).a);
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

    public GetImagesForValuableResponse(Bitmap[] bitmapArr) {
        this.a = bitmapArr;
    }
}
