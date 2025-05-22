package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkbo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UsageReportingOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkbo();
    public final int a;
    public boolean b;
    public final List c;
    public int d;
    public String e;
    public boolean f;

    public UsageReportingOptInOptions(int i) {
        this.c = new ArrayList();
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.e(parcel, 3, this.b);
        atzr.x(parcel, 4, this.c, false);
        atzr.o(parcel, 5, this.d);
        atzr.v(parcel, 6, this.e, false);
        atzr.e(parcel, 7, this.f);
        atzr.c(parcel, a);
    }

    public UsageReportingOptInOptions(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }
}
