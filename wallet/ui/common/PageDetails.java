package com.google.android.gms.wallet.ui.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwm;
import defpackage.djes;
import defpackage.efdk;
import defpackage.ehma;
import defpackage.ehmk;
import defpackage.ehml;
import defpackage.ehmp;
import defpackage.ehwq;
import defpackage.eicq;
import defpackage.farq;
import defpackage.fatp;
import defpackage.fatq;
import defpackage.feeg;
import defpackage.feen;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PageDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = new djes();
    public boolean a;
    public byte[] b;
    public farq c;
    public List d;
    public ehma e;
    public List f;
    public fatq g;
    public long h;
    public Object i;
    public Object j;
    public fatp k;
    public ehwq l;
    public Parcelable m;
    public ehmk n;
    public Parcelable o;
    public ehml p;
    public ehmp q;
    public byte[] r;
    public int s;

    public PageDetails() {
        this.c = farq.UNKNOWN_FLOW_INSTRUCTION;
        this.d = new ArrayList();
        this.s = 1;
    }

    protected feen a() {
        throw new UnsupportedOperationException("Must be implemented by subclasses to properly parse their Page protos.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [feeg, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        efdk.n(this.f, parcel);
        parcel.writeLong(this.h);
        parcel.writeByteArray(this.b);
        parcel.writeByteArray(this.r);
        parcel.writeParcelable(this.m, i);
        parcel.writeInt(this.c.w);
        int i2 = this.s;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i3);
        efdk.o(this.e, parcel);
        efdk.o(this.g, parcel);
        efdk.o((feeg) this.i, parcel);
        efdk.o(this.j, parcel);
        efdk.o(this.k, parcel);
        efdk.o(this.l, parcel);
        parcel.writeList(this.d);
        efdk.o(this.n, parcel);
        parcel.writeParcelable(this.o, i);
        efdk.o(this.p, parcel);
        parcel.writeInt(this.a ? 1 : 0);
        efdk.o(this.q, parcel);
    }

    public PageDetails(Parcel parcel) {
        farq farqVar = farq.UNKNOWN_FLOW_INSTRUCTION;
        this.c = farqVar;
        this.d = new ArrayList();
        this.s = 1;
        ClassLoader classLoader = PageDetails.class.getClassLoader();
        this.f = efdk.h(parcel, a());
        this.h = parcel.readLong();
        this.b = parcel.createByteArray();
        this.r = parcel.createByteArray();
        this.m = parcel.readParcelable(classLoader);
        farq b = farq.b(parcel.readInt());
        this.c = b;
        if (b == null) {
            this.c = farqVar;
        }
        this.s = eicq.a(parcel.readInt());
        this.e = (ehma) efdk.f(parcel, (feen) ehma.a.iB(7, null));
        this.g = (fatq) efdk.f(parcel, (feen) fatq.a.iB(7, null));
        this.i = efdk.f(parcel, a());
        this.j = efdk.f(parcel, a());
        this.k = (fatp) efdk.f(parcel, (feen) fatp.a.iB(7, null));
        this.l = (ehwq) efdk.f(parcel, (feen) ehwq.a.iB(7, null));
        parcel.readList(this.d, Integer.class.getClassLoader());
        this.n = (ehmk) efdk.f(parcel, (feen) ehmk.c.iB(7, null));
        this.o = parcel.readParcelable(classLoader);
        this.p = (ehml) efdk.f(parcel, (feen) ehml.a.iB(7, null));
        this.a = parcel.readInt() == 1;
        this.q = (ehmp) efdk.f(parcel, (feen) ehmp.a.iB(7, null));
    }

    public PageDetails(PageDetails pageDetails) {
        this.c = farq.UNKNOWN_FLOW_INSTRUCTION;
        this.d = new ArrayList();
        this.s = 1;
        this.f = pageDetails.f;
        this.h = pageDetails.h;
        this.b = pageDetails.b;
        this.r = pageDetails.r;
        this.m = pageDetails.m;
        farq farqVar = pageDetails.c;
        arwm.s(farqVar);
        this.c = farqVar;
        this.s = pageDetails.s;
        this.e = pageDetails.e;
        this.g = pageDetails.g;
        this.i = pageDetails.i;
        this.j = pageDetails.j;
        this.k = pageDetails.k;
        this.l = pageDetails.l;
        this.d = pageDetails.d;
        this.n = pageDetails.n;
        this.o = pageDetails.o;
        this.p = pageDetails.p;
        this.a = pageDetails.a;
        this.q = pageDetails.q;
    }
}
