package com.google.android.gms.nearby.fastpair.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.fastpair.Peripheral;
import defpackage.arxc;
import defpackage.cigd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnActiveStateChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cigd();
    public Peripheral[] a;

    public OnActiveStateChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnActiveStateChangedParams) {
            return Arrays.equals(this.a, ((OnActiveStateChangedParams) obj).a);
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

    public OnActiveStateChangedParams(Peripheral[] peripheralArr) {
        this.a = peripheralArr;
    }
}
