package com.google.android.gms.appinvite.ui.context;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vut;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public class SelectionFragmentOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vut();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.o(parcel, 3, this.b);
        atzr.y(parcel, 4, this.c, false);
        atzr.e(parcel, 5, this.d);
        atzr.w(parcel, 6, this.e, false);
        atzr.o(parcel, 7, this.f);
        atzr.o(parcel, 8, this.g);
        atzr.v(parcel, 9, this.h, false);
        atzr.v(parcel, 10, this.i, false);
        atzr.e(parcel, 11, this.j);
        atzr.y(parcel, 12, this.k, false);
        atzr.e(parcel, 13, this.l);
        atzr.e(parcel, 14, this.m);
        atzr.g(parcel, 15, this.n, false);
        atzr.c(parcel, a);
    }
}
