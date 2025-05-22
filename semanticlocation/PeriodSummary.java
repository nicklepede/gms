package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbqf;
import defpackage.elgo;
import defpackage.elpg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PeriodSummary extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbqf();
    public static final elgo a;
    public final List b;
    public final List c;
    public final Date d;

    static {
        int i = elgo.d;
        a = elpg.a;
    }

    public PeriodSummary(List list, List list2, Date date) {
        this.b = list;
        this.c = list2;
        this.d = date;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int a2 = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.y(parcel, 2, this.c, false);
        atzr.t(parcel, 3, this.d, i, false);
        atzr.c(parcel, a2);
    }
}
