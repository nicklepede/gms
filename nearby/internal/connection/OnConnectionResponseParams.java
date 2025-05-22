package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clki;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnConnectionResponseParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clki();
    public String a;
    public int b;
    public byte[] c;

    public OnConnectionResponseParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnConnectionResponseParams) {
            OnConnectionResponseParams onConnectionResponseParams = (OnConnectionResponseParams) obj;
            if (atyq.b(this.a, onConnectionResponseParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(onConnectionResponseParams.b)) && Arrays.equals(this.c, onConnectionResponseParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.o(parcel, 2, this.b);
        atzr.i(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public OnConnectionResponseParams(String str, int i, byte[] bArr) {
        this.a = str;
        this.b = i;
        this.c = bArr;
    }
}
