package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.auxt;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class FetchConfigIpcRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new auxt();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.q(parcel, 3, this.b);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.v(parcel, 7, this.f, false);
        atzr.x(parcel, 8, this.g, false);
        atzr.o(parcel, 9, this.h);
        atzr.y(parcel, 10, this.i, false);
        atzr.o(parcel, 11, this.j);
        atzr.o(parcel, 12, this.k);
        atzr.c(parcel, a);
    }

    public FetchConfigIpcRequest(String str) {
        this(str, 43200L, null, null, null, null, null, 0, null, -1, -1);
    }
}
