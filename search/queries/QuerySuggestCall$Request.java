package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dazp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class QuerySuggestCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dazp();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.w(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.g(parcel, 6, this.f, false);
        atzr.c(parcel, a);
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
