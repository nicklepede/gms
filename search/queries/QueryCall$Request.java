package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dazn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class QueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dazn();
    public String a;
    public String b;
    public String[] c;
    public int d;
    public int e;
    public QuerySpecification f;
    public Bundle g;

    public QueryCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.w(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.g(parcel, 7, this.g, false);
        atzr.c(parcel, a);
    }

    public QueryCall$Request(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = i;
        this.e = i2;
        this.f = querySpecification;
        this.g = bundle;
    }
}
