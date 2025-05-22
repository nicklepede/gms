package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkgs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class TrustedId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkgs();
    public String a;
    public byte[] b;

    private TrustedId() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrustedId) {
            TrustedId trustedId = (TrustedId) obj;
            if (atyq.b(this.a, trustedId.a) && Arrays.equals(this.b, trustedId.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public TrustedId(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }
}
