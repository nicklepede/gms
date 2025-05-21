package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.astz;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FetchConfigIpcRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new astz();
    public final String a;
    public final long b;
    public final DataHolder c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final int h;
    public final List i;
    public final int j;
    public final int k;

    public FetchConfigIpcRequest(String str, long j, DataHolder dataHolder, String str2, String str3, String str4, List list, int i, List list2, int i2, int i3) {
        this.a = str;
        this.b = j;
        this.c = dataHolder;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = i;
        this.i = list2;
        this.j = i2;
        this.k = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.q(parcel, 3, this.b);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.v(parcel, 6, this.e, false);
        arxc.v(parcel, 7, this.f, false);
        arxc.x(parcel, 8, this.g, false);
        arxc.o(parcel, 9, this.h);
        arxc.y(parcel, 10, this.i, false);
        arxc.o(parcel, 11, this.j);
        arxc.o(parcel, 12, this.k);
        arxc.c(parcel, a);
    }

    public FetchConfigIpcRequest(String str) {
        this(str, 43200L, null, null, null, null, null, 0, null, -1, -1);
    }
}
