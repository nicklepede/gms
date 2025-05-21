package com.google.android.gms.apperrors;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.twb;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SetFilterParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new twb();
    public final List a;
    public final int b;

    public SetFilterParameters(List list, int i) {
        this.a = list;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
