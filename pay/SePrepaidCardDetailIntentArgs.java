package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvng;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SePrepaidCardDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvng();
    public SeServiceProvider a;
    public String b;
    public GooglePaymentMethodId c;

    private SePrepaidCardDetailIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SePrepaidCardDetailIntentArgs) {
            SePrepaidCardDetailIntentArgs sePrepaidCardDetailIntentArgs = (SePrepaidCardDetailIntentArgs) obj;
            if (atyq.b(this.a, sePrepaidCardDetailIntentArgs.a) && atyq.b(this.b, sePrepaidCardDetailIntentArgs.b) && atyq.b(this.c, sePrepaidCardDetailIntentArgs.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public SePrepaidCardDetailIntentArgs(SeServiceProvider seServiceProvider, String str, GooglePaymentMethodId googlePaymentMethodId) {
        this.a = seServiceProvider;
        this.b = str;
        this.c = googlePaymentMethodId;
    }
}
