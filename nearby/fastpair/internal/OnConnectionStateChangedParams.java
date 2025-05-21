package com.google.android.gms.nearby.fastpair.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.fastpair.Peripheral;
import defpackage.arxc;
import defpackage.cige;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnConnectionStateChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cige();
    public Peripheral[] a;

    public OnConnectionStateChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnConnectionStateChangedParams) {
            return Arrays.equals(this.a, ((OnConnectionStateChangedParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.c(parcel, a);
    }

    public OnConnectionStateChangedParams(Peripheral[] peripheralArr) {
        this.a = peripheralArr;
    }
}
