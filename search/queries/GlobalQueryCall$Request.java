package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cypk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GlobalQueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cypk();
    public String a;
    public int b;
    public int c;
    public GlobalSearchQuerySpecification d;
    public Bundle e;

    public GlobalQueryCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.g(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public GlobalQueryCall$Request(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification, Bundle bundle) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = globalSearchQuerySpecification;
        this.e = bundle;
    }
}
