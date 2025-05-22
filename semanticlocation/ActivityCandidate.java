package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbpe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ActivityCandidate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbpe();
    public final int a;
    public final float b;

    @Deprecated
    public final float c;

    public ActivityCandidate(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.l(parcel, 2, this.b);
        atzr.l(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
