package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cyni;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetGlobalSearchSourcesCall$GlobalSearchSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cyni();
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public String f;
    public String g;
    public String h;
    public GetGlobalSearchSourcesCall$CorpusInfo[] i;
    public boolean j;

    public GetGlobalSearchSourcesCall$GlobalSearchSource() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.o(parcel, 2, this.c);
        arxc.o(parcel, 3, this.d);
        arxc.o(parcel, 4, this.e);
        arxc.v(parcel, 5, this.f, false);
        arxc.v(parcel, 6, this.g, false);
        arxc.v(parcel, 7, this.h, false);
        arxc.J(parcel, 8, this.i, i);
        arxc.e(parcel, 9, this.j);
        arxc.v(parcel, 10, this.b, false);
        arxc.c(parcel, a);
    }

    public GetGlobalSearchSourcesCall$GlobalSearchSource(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5, GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = getGlobalSearchSourcesCall$CorpusInfoArr;
        this.j = z;
    }
}
