package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvmv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PayCardArtInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvmv();
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
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(payCardArtInfo.a)) && atyq.b(this.b, payCardArtInfo.b)) {
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public PayCardArtInfo(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
