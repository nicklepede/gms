package com.google.android.gms.apperrors;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vsb;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SetFilterParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vsb();
    public final List a;
    public final int b;

    public SetFilterParameters(List list, int i) {
        this.a = list;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
