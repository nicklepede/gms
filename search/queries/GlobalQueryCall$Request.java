package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dazi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GlobalQueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dazi();
    public String a;
    public int b;
    public int c;
    public GlobalSearchQuerySpecification d;
    public Bundle e;

    public GlobalQueryCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.g(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public GlobalQueryCall$Request(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification, Bundle bundle) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = globalSearchQuerySpecification;
        this.e = bundle;
    }
}
