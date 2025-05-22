package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.daif;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RemoveHarmfulAppData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new daif();
    public final int a;
    public final boolean b;

    public RemoveHarmfulAppData(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.e(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
