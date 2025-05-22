package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clkv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnStartAdvertisingResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clkv();
    public int a;
    public String b;

    public OnStartAdvertisingResultParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnStartAdvertisingResultParams) {
            OnStartAdvertisingResultParams onStartAdvertisingResultParams = (OnStartAdvertisingResultParams) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(onStartAdvertisingResultParams.a)) && atyq.b(this.b, onStartAdvertisingResultParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public OnStartAdvertisingResultParams(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
