package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cype;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetDocumentsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cype();
    public String a;
    public String b;
    public String[] c;
    public QuerySpecification d;
    public Bundle e;

    public GetDocumentsCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.w(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.g(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public GetDocumentsCall$Request(String str, String str2, String[] strArr, QuerySpecification querySpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = querySpecification;
        this.e = bundle;
    }
}
