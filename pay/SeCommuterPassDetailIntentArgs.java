package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctea;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SeCommuterPassDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctea();
    public SeServiceProvider a;
    public GooglePaymentMethodId b;
    public String c;
    public byte[] d;
    public int e;

    private SeCommuterPassDetailIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeCommuterPassDetailIntentArgs) {
            SeCommuterPassDetailIntentArgs seCommuterPassDetailIntentArgs = (SeCommuterPassDetailIntentArgs) obj;
            if (arwb.b(this.a, seCommuterPassDetailIntentArgs.a) && arwb.b(this.b, seCommuterPassDetailIntentArgs.b) && arwb.b(this.c, seCommuterPassDetailIntentArgs.c) && Arrays.equals(this.d, seCommuterPassDetailIntentArgs.d) && arwb.b(Integer.valueOf(this.e), Integer.valueOf(seCommuterPassDetailIntentArgs.e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.v(parcel, 5, this.c, false);
        arxc.i(parcel, 6, this.d, false);
        arxc.o(parcel, 7, this.e);
        arxc.c(parcel, a);
    }

    public SeCommuterPassDetailIntentArgs(SeServiceProvider seServiceProvider, GooglePaymentMethodId googlePaymentMethodId, String str, byte[] bArr, int i) {
        this.a = seServiceProvider;
        this.b = googlePaymentMethodId;
        this.c = str;
        this.d = bArr;
        this.e = i;
    }
}
