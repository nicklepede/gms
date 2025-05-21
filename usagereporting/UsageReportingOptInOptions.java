package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dhqi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UsageReportingOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhqi();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.e(parcel, 3, this.b);
        arxc.x(parcel, 4, this.c, false);
        arxc.o(parcel, 5, this.d);
        arxc.v(parcel, 6, this.e, false);
        arxc.e(parcel, 7, this.f);
        arxc.c(parcel, a);
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
