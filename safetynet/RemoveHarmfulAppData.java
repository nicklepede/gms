package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cxyi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RemoveHarmfulAppData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxyi();
    public final int a;
    public final boolean b;

    public RemoveHarmfulAppData(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.e(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
