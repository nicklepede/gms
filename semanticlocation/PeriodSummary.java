package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czgh;
import defpackage.eitj;
import defpackage.ejcb;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PeriodSummary extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czgh();
    public static final eitj a;
    public final List b;
    public final List c;
    public final Date d;

    static {
        int i = eitj.d;
        a = ejcb.a;
    }

    public PeriodSummary(List list, List list2, Date date) {
        this.b = list;
        this.c = list2;
        this.d = date;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int a2 = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.y(parcel, 2, this.c, false);
        arxc.t(parcel, 3, this.d, i, false);
        arxc.c(parcel, a2);
    }
}
