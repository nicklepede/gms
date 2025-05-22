package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbqe;
import defpackage.elgo;
import defpackage.elpg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class Path extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbqe();
    public static final List a;
    public final List b;

    static {
        int i = elgo.d;
        a = elpg.a;
    }

    public Path(List list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.b;
        int a2 = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.c(parcel, a2);
    }
}
