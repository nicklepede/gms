package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkbh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SafetyOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkbh();
    public final boolean a;
    public final boolean b;
    public final int c;

    public SafetyOptions(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 2, this.a);
        atzr.e(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.c(parcel, a);
    }
}
