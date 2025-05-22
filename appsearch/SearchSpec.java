package com.google.android.gms.appsearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wam;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SearchSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wam();
    public final int a;
    final Bundle b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    final Bundle i;
    public final int j;
    public final int k;
    final Bundle l;
    public final JoinSpec m;
    public final String n;
    public final List o;
    public final String p;
    private final List q;
    private final List r;
    private final List s;

    public SearchSpec(int i, List list, List list2, Bundle bundle, List list3, int i2, int i3, int i4, int i5, int i6, int i7, Bundle bundle2, int i8, int i9, Bundle bundle3, JoinSpec joinSpec, String str, List list4, String str2) {
        this.a = i;
        this.q = (List) Objects.requireNonNull(list);
        this.r = (List) Objects.requireNonNull(list2);
        this.b = (Bundle) Objects.requireNonNull(bundle);
        this.s = (List) Objects.requireNonNull(list3);
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = (Bundle) Objects.requireNonNull(bundle2);
        this.j = i8;
        this.k = i9;
        this.l = (Bundle) Objects.requireNonNull(bundle3);
        this.m = joinSpec;
        this.n = (String) Objects.requireNonNull(str);
        this.o = (List) Objects.requireNonNull(list4);
        this.p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        List list = this.q;
        atzr.x(parcel, 2, list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list), false);
        List list2 = this.r;
        atzr.x(parcel, 3, list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2), false);
        atzr.g(parcel, 4, this.b, false);
        List list3 = this.s;
        atzr.x(parcel, 5, list3 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list3), false);
        atzr.o(parcel, 6, this.c);
        atzr.o(parcel, 7, this.d);
        atzr.o(parcel, 8, this.e);
        atzr.o(parcel, 9, this.f);
        atzr.o(parcel, 10, this.g);
        atzr.o(parcel, 11, this.h);
        atzr.g(parcel, 12, this.i, false);
        atzr.o(parcel, 13, this.j);
        atzr.o(parcel, 14, this.k);
        atzr.g(parcel, 15, this.l, false);
        atzr.t(parcel, 16, this.m, i, false);
        atzr.v(parcel, 17, this.n, false);
        atzr.x(parcel, 18, this.o, false);
        atzr.v(parcel, 19, this.p, false);
        atzr.c(parcel, a);
    }
}
