package com.google.android.gms.nearby.presence.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmwe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class IdentityToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmwe();
    public final byte[] a;
    public final byte[] b;

    public IdentityToken(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 14) {
            throw new IllegalArgumentException("v0 identity token size is 14");
        }
        if (bArr2.length != 16) {
            throw new IllegalArgumentException("v1 identity token size is 16");
        }
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IdentityToken) {
            IdentityToken identityToken = (IdentityToken) obj;
            if (Arrays.equals(this.a, identityToken.a) && Arrays.equals(this.b, identityToken.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
