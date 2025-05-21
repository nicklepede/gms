package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abat;
import defpackage.arxc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ScopeDetail extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abat();
    final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    final List g;
    public final FACLData h;

    public ScopeDetail(int i, String str, String str2, String str3, String str4, String str5, List list, FACLData fACLData) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = list;
        this.h = fACLData;
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.x(parcel, 7, this.g, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.c(parcel, a);
    }

    public ScopeDetail(String str, String str2, String str3, String str4, String str5, FACLData fACLData, List list) {
        this.a = 1;
        this.f = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.h = fACLData;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.addAll(list);
    }
}
