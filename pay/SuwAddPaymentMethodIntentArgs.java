package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvnp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SuwAddPaymentMethodIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnp();
    public int a;

    private SuwAddPaymentMethodIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuwAddPaymentMethodIntentArgs) {
            return atyq.b(Integer.valueOf(this.a), Integer.valueOf(((SuwAddPaymentMethodIntentArgs) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.c(parcel, a);
    }

    public SuwAddPaymentMethodIntentArgs(int i) {
        this.a = i;
    }
}
