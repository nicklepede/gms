package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvmu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PayCardArt extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvmu();
    public PayCardArtInfo a;
    public Bitmap b;

    private PayCardArt() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayCardArt) {
            PayCardArt payCardArt = (PayCardArt) obj;
            if (atyq.b(this.a, payCardArt.a) && atyq.b(this.b, payCardArt.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public PayCardArt(PayCardArtInfo payCardArtInfo, Bitmap bitmap) {
        this.a = payCardArtInfo;
        this.b = bitmap;
    }
}
