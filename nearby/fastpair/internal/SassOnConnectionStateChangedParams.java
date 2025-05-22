package com.google.android.gms.nearby.fastpair.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ckos;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SassOnConnectionStateChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckos();
    public String a;
    public int b;
    public int c;

    public SassOnConnectionStateChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SassOnConnectionStateChangedParams) {
            SassOnConnectionStateChangedParams sassOnConnectionStateChangedParams = (SassOnConnectionStateChangedParams) obj;
            if (atyq.b(this.a, sassOnConnectionStateChangedParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(sassOnConnectionStateChangedParams.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(sassOnConnectionStateChangedParams.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public SassOnConnectionStateChangedParams(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }
}
