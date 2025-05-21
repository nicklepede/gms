package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctek;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SuwAddPaymentMethodIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctek();
    public int a;

    private SuwAddPaymentMethodIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuwAddPaymentMethodIntentArgs) {
            return arwb.b(Integer.valueOf(this.a), Integer.valueOf(((SuwAddPaymentMethodIntentArgs) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.c(parcel, a);
    }

    public SuwAddPaymentMethodIntentArgs(int i) {
        this.a = i;
    }
}
