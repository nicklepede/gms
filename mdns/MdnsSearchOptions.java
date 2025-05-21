package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqwx;
import defpackage.arxc;
import defpackage.cdbs;
import defpackage.cdbt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdnsSearchOptions extends AbstractSafeParcelable implements aqwx {
    public static final Parcelable.Creator CREATOR = new cdbt();
    private static MdnsSearchOptions j;
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final long i;

    public MdnsSearchOptions(List list, boolean z, boolean z2, boolean z3, int i, int i2, String str, boolean z4, long j2) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = str;
        this.h = z4;
        this.i = j2;
    }

    public static synchronized MdnsSearchOptions a() {
        MdnsSearchOptions mdnsSearchOptions;
        synchronized (MdnsSearchOptions.class) {
            if (j == null) {
                j = new cdbs().a();
            }
            mdnsSearchOptions = j;
        }
        return mdnsSearchOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.x(parcel, 2, list, false);
        arxc.e(parcel, 3, this.b);
        arxc.e(parcel, 4, this.c);
        arxc.e(parcel, 5, this.d);
        arxc.o(parcel, 6, this.e);
        arxc.o(parcel, 7, this.f);
        arxc.v(parcel, 8, this.g, false);
        arxc.e(parcel, 9, this.h);
        arxc.q(parcel, 10, this.i);
        arxc.c(parcel, a);
    }
}
