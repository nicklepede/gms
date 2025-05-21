package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czfq;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class DebugData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czfq();
    public final List a;
    public final int b;
    public final List c;
    public final boolean d;
    public final List e;

    public DebugData(List list, int i, List list2, boolean z, List list3) {
        this.a = list;
        this.b = i;
        this.c = list2;
        this.d = z;
        this.e = list3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.o(parcel, 2, this.b);
        arxc.y(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.x(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
