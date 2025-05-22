package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aszm;
import defpackage.atzr;
import defpackage.cfks;
import defpackage.cfkt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdnsSearchOptions extends AbstractSafeParcelable implements aszm {
    public static final Parcelable.Creator CREATOR = new cfkt();
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
                j = new cfks().a();
            }
            mdnsSearchOptions = j;
        }
        return mdnsSearchOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.x(parcel, 2, list, false);
        atzr.e(parcel, 3, this.b);
        atzr.e(parcel, 4, this.c);
        atzr.e(parcel, 5, this.d);
        atzr.o(parcel, 6, this.e);
        atzr.o(parcel, 7, this.f);
        atzr.v(parcel, 8, this.g, false);
        atzr.e(parcel, 9, this.h);
        atzr.q(parcel, 10, this.i);
        atzr.c(parcel, a);
    }
}
