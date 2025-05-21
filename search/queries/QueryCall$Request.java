package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cypp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class QueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cypp();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.w(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.g(parcel, 7, this.g, false);
        arxc.c(parcel, a);
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
