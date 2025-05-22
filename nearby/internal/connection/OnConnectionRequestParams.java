package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clkh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clkh();
    public String a;
    public String b;
    public byte[] c;

    public OnConnectionRequestParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnConnectionRequestParams) {
            OnConnectionRequestParams onConnectionRequestParams = (OnConnectionRequestParams) obj;
            if (atyq.b(this.a, onConnectionRequestParams.a) && atyq.b(this.b, onConnectionRequestParams.b) && Arrays.equals(this.c, onConnectionRequestParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public OnConnectionRequestParams(String str, String str2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
    }
}
