package com.google.android.gms.nearby.presence.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cknw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class EncryptedIdentityMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cknw();
    public final byte[] a;
    public final byte[] b;

    public EncryptedIdentityMetadata(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EncryptedIdentityMetadata)) {
            return this == obj;
        }
        EncryptedIdentityMetadata encryptedIdentityMetadata = (EncryptedIdentityMetadata) obj;
        return Arrays.equals(this.a, encryptedIdentityMetadata.a) && Arrays.equals(this.b, encryptedIdentityMetadata.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
