package com.google.android.gms.wallet.ui.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzb;
import defpackage.dlql;
import defpackage.ehqn;
import defpackage.ejzg;
import defpackage.ejzq;
import defpackage.ejzr;
import defpackage.ejzv;
import defpackage.ekjw;
import defpackage.ekpw;
import defpackage.fdgf;
import defpackage.fdie;
import defpackage.fdif;
import defpackage.fgsz;
import defpackage.fgtg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PageDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dlql();
    public boolean a;
    public byte[] b;
    public fdgf c;
    public List d;
    public ejzg e;
    public List f;
    public fdif g;
    public long h;
    public Object i;
    public Object j;
    public fdie k;
    public ekjw l;
    public Parcelable m;
    public ejzq n;
    public Parcelable o;
    public ejzr p;
    public ejzv q;
    public byte[] r;
    public int s;

    public PageDetails() {
        this.c = fdgf.UNKNOWN_FLOW_INSTRUCTION;
        this.d = new ArrayList();
        this.s = 1;
    }

    protected fgtg a() {
        throw new UnsupportedOperationException("Must be implemented by subclasses to properly parse their Page protos.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [fgsz, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ehqn.n(this.f, parcel);
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
        ehqn.o(this.e, parcel);
        ehqn.o(this.g, parcel);
        ehqn.o((fgsz) this.i, parcel);
        ehqn.o(this.j, parcel);
        ehqn.o(this.k, parcel);
        ehqn.o(this.l, parcel);
        parcel.writeList(this.d);
        ehqn.o(this.n, parcel);
        parcel.writeParcelable(this.o, i);
        ehqn.o(this.p, parcel);
        parcel.writeInt(this.a ? 1 : 0);
        ehqn.o(this.q, parcel);
    }

    public PageDetails(Parcel parcel) {
        fdgf fdgfVar = fdgf.UNKNOWN_FLOW_INSTRUCTION;
        this.c = fdgfVar;
        this.d = new ArrayList();
        this.s = 1;
        ClassLoader classLoader = PageDetails.class.getClassLoader();
        this.f = ehqn.h(parcel, a());
        this.h = parcel.readLong();
        this.b = parcel.createByteArray();
        this.r = parcel.createByteArray();
        this.m = parcel.readParcelable(classLoader);
        fdgf b = fdgf.b(parcel.readInt());
        this.c = b;
        if (b == null) {
            this.c = fdgfVar;
        }
        this.s = ekpw.a(parcel.readInt());
        this.e = (ejzg) ehqn.f(parcel, (fgtg) ejzg.a.iQ(7, null));
        this.g = (fdif) ehqn.f(parcel, (fgtg) fdif.a.iQ(7, null));
        this.i = ehqn.f(parcel, a());
        this.j = ehqn.f(parcel, a());
        this.k = (fdie) ehqn.f(parcel, (fgtg) fdie.a.iQ(7, null));
        this.l = (ekjw) ehqn.f(parcel, (fgtg) ekjw.a.iQ(7, null));
        parcel.readList(this.d, Integer.class.getClassLoader());
        this.n = (ejzq) ehqn.f(parcel, (fgtg) ejzq.c.iQ(7, null));
        this.o = parcel.readParcelable(classLoader);
        this.p = (ejzr) ehqn.f(parcel, (fgtg) ejzr.a.iQ(7, null));
        this.a = parcel.readInt() == 1;
        this.q = (ejzv) ehqn.f(parcel, (fgtg) ejzv.a.iQ(7, null));
    }

    public PageDetails(PageDetails pageDetails) {
        this.c = fdgf.UNKNOWN_FLOW_INSTRUCTION;
        this.d = new ArrayList();
        this.s = 1;
        this.f = pageDetails.f;
        this.h = pageDetails.h;
        this.b = pageDetails.b;
        this.r = pageDetails.r;
        this.m = pageDetails.m;
        fdgf fdgfVar = pageDetails.c;
        atzb.s(fdgfVar);
        this.c = fdgfVar;
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
