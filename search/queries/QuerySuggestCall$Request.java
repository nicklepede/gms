package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cypr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class QuerySuggestCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cypr();
    public String a;
    public String b;
    public String[] c;
    public int d;
    public SuggestSpecification e;
    public Bundle f;

    public QuerySuggestCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.w(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.g(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }

    public QuerySuggestCall$Request(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = i;
        this.e = suggestSpecification;
        this.f = bundle;
    }
}
