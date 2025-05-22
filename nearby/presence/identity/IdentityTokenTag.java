package com.google.android.gms.nearby.presence.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmwf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class IdentityTokenTag extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmwf();
    public final byte[] a;

    public IdentityTokenTag(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IdentityTokenTag) {
            return Arrays.equals(this.a, ((IdentityTokenTag) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.c(parcel, a);
    }
}
