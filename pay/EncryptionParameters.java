package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctbz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class EncryptionParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctbz();
    public String a;
    public byte[] b;
    public byte[] c;

    private EncryptionParameters() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EncryptionParameters) {
            EncryptionParameters encryptionParameters = (EncryptionParameters) obj;
            if (arwb.b(this.a, encryptionParameters.a) && Arrays.equals(this.b, encryptionParameters.b) && Arrays.equals(this.c, encryptionParameters.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public EncryptionParameters(String str, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
    }
}
