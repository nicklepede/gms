package com.google.android.gms.appinvite.ui.context;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.tyu;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public class SelectionFragmentOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tyu();
    public final String a;
    public final int b;
    public final ArrayList c;
    public final boolean d;
    public final String[] e;
    public final int f;
    public final int g;
    public final String h;

    @Deprecated
    public final String i;
    public final boolean j;
    public final ArrayList k;
    public final boolean l;
    public final boolean m;
    public final Bundle n;

    public SelectionFragmentOptions(String str, int i, ArrayList arrayList, boolean z, String[] strArr, int i2, int i3, String str2, String str3, boolean z2, ArrayList arrayList2, boolean z3, boolean z4, Bundle bundle) {
        this.a = str;
        this.b = i;
        this.c = arrayList;
        this.d = z;
        this.e = strArr;
        this.f = i2;
        this.g = i3;
        this.h = str2;
        this.i = str3;
        this.j = z2;
        this.k = arrayList2;
        this.l = z3;
        this.m = z4;
        this.n = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.o(parcel, 3, this.b);
        arxc.y(parcel, 4, this.c, false);
        arxc.e(parcel, 5, this.d);
        arxc.w(parcel, 6, this.e, false);
        arxc.o(parcel, 7, this.f);
        arxc.o(parcel, 8, this.g);
        arxc.v(parcel, 9, this.h, false);
        arxc.v(parcel, 10, this.i, false);
        arxc.e(parcel, 11, this.j);
        arxc.y(parcel, 12, this.k, false);
        arxc.e(parcel, 13, this.l);
        arxc.e(parcel, 14, this.m);
        arxc.g(parcel, 15, this.n, false);
        arxc.c(parcel, a);
    }
}
