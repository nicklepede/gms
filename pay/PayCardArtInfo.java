package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctdq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PayCardArtInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctdq();
    public int a;
    public String b;

    private PayCardArtInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayCardArtInfo) {
            PayCardArtInfo payCardArtInfo = (PayCardArtInfo) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(payCardArtInfo.a)) && arwb.b(this.b, payCardArtInfo.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public PayCardArtInfo(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
