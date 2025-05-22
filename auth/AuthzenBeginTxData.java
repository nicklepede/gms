package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wjl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated(forRemoval = true)
/* loaded from: classes2.dex */
public class AuthzenBeginTxData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wjl();
    final int a;
    final int b;
    public final byte[] c;

    public AuthzenBeginTxData(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthzenBeginTxData)) {
            return false;
        }
        AuthzenBeginTxData authzenBeginTxData = (AuthzenBeginTxData) obj;
        return this.b == authzenBeginTxData.b && Arrays.equals(this.c, authzenBeginTxData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.i(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
