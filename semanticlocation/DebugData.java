package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbpo;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DebugData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbpo();
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
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.o(parcel, 2, this.b);
        atzr.y(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.x(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
