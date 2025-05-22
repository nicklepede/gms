package com.google.android.gms.lockbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cdsh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LockboxOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdsh();
    public final int a;
    public final int b;

    public LockboxOptInOptions(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
