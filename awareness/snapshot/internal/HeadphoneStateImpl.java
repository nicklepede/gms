package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajhc;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class HeadphoneStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajhc();
    public final int a;

    public HeadphoneStateImpl(int i) {
        this.a = i;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.c(parcel, a);
    }
}
