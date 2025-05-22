package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dazc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetDocumentsCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dazc();
    public String a;
    public String b;
    public String[] c;
    public QuerySpecification d;
    public Bundle e;

    public GetDocumentsCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.w(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.g(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public GetDocumentsCall$Request(String str, String str2, String[] strArr, QuerySpecification querySpecification, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = querySpecification;
        this.e = bundle;
    }
}
