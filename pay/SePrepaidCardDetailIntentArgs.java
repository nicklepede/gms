package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cteb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SePrepaidCardDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cteb();
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
            if (arwb.b(this.a, sePrepaidCardDetailIntentArgs.a) && arwb.b(this.b, sePrepaidCardDetailIntentArgs.b) && arwb.b(this.c, sePrepaidCardDetailIntentArgs.c)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }

    public SePrepaidCardDetailIntentArgs(SeServiceProvider seServiceProvider, String str, GooglePaymentMethodId googlePaymentMethodId) {
        this.a = seServiceProvider;
        this.b = str;
        this.c = googlePaymentMethodId;
    }
}
