package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czgg;
import defpackage.eitj;
import defpackage.ejcb;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class Path extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czgg();
    public static final List a;
    public final List b;

    static {
        int i = eitj.d;
        a = ejcb.a;
    }

    public Path(List list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int a2 = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.c(parcel, a2);
    }
}
