package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctdn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PayApiError extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctdn();
    public String a;
    public String b;
    public boolean c;
    public byte[] d;
    public int e;

    private PayApiError() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayApiError) {
            PayApiError payApiError = (PayApiError) obj;
            if (arwb.b(this.a, payApiError.a) && arwb.b(this.b, payApiError.b) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(payApiError.c)) && Arrays.equals(this.d, payApiError.d) && arwb.b(Integer.valueOf(this.e), Integer.valueOf(payApiError.e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.i(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }

    public PayApiError(String str, String str2, boolean z, byte[] bArr, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = bArr;
        this.e = i;
    }
}
