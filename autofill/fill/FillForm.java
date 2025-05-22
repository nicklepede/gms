package com.google.android.gms.autofill.fill;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import defpackage.aftc;
import defpackage.aftf;
import defpackage.agkg;
import defpackage.agnp;
import defpackage.agnq;
import defpackage.agns;
import defpackage.agnt;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ekvi;
import defpackage.elcq;
import defpackage.elgc;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elhx;
import defpackage.elhz;
import defpackage.elia;
import defpackage.elid;
import defpackage.elpp;
import defpackage.elsn;
import defpackage.elso;
import defpackage.fnyu;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class FillForm implements Parcelable {
    public final elgo c;
    public final elid d;
    public final ekvi e;
    public final aftc f;
    public final ekvi g;
    public final int h;
    private final elid i;
    public static final ausn a = ausn.b("FillForm", auid.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new agns();
    public static final Parcelable.Creator b = new agnt();

    public FillForm(int i, elgo elgoVar, ekvi ekviVar, aftc aftcVar, ekvi ekviVar2) {
        this(i, elgoVar, ekviVar, aftcVar, ekviVar2, fnyu.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ekvi a(elgc elgcVar) {
        elso it = ((elgo) elgcVar).iterator();
        FillField fillField = null;
        while (it.hasNext()) {
            agkg agkgVar = (agkg) it.next();
            if (g(agkgVar)) {
                elgo d = d(agkgVar);
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    FillField fillField2 = (FillField) d.get(i);
                    if (agnq.d(fillField2)) {
                        return ekvi.j(fillField2);
                    }
                    if (fillField == null) {
                        fillField = fillField2;
                    }
                }
            }
        }
        return ekvi.i(fillField);
    }

    public final elgo b(agkg agkgVar) {
        return this.i.g(agkgVar).v();
    }

    public final elgo c(elgc elgcVar) {
        Stream filter = Collection.EL.stream(f(elgcVar)).filter(new Predicate() { // from class: agnr
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo478negate() {
                return Predicate$CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                ausn ausnVar = FillForm.a;
                return ((FillField) obj).e.size() == 1;
            }
        });
        int i = elgo.d;
        return (elgo) filter.collect(elcq.a);
    }

    public final elgo d(agkg agkgVar) {
        return this.d.g(agkgVar).v();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final elhz e() {
        return this.d.z();
    }

    public final elhz f(elgc elgcVar) {
        elhx elhxVar = new elhx();
        elsn listIterator = elgcVar.listIterator();
        while (listIterator.hasNext()) {
            elhxVar.k(d((agkg) listIterator.next()));
        }
        return elhxVar.g();
    }

    public final boolean g(agkg agkgVar) {
        return this.d.u(agkgVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.h);
        parcel.writeTypedList(this.c);
        ekvi ekviVar = this.e;
        parcel.writeInt(ekviVar.h() ? 1 : 0);
        if (ekviVar.h()) {
            parcel.writeTypedObject((FillField) ekviVar.c(), i);
        }
        aftf.c(this.f, parcel);
        ekvi ekviVar2 = this.g;
        parcel.writeInt(ekviVar2.h() ? 1 : 0);
        if (ekviVar2.h()) {
            aftf.c((aftc) ekviVar2.c(), parcel);
        }
    }

    @Deprecated
    public FillForm(int i, elgo elgoVar, ekvi ekviVar, aftc aftcVar, ekvi ekviVar2, boolean z) {
        this(i, elgoVar, ekviVar, aftcVar, ekviVar2, z, elpp.a);
    }

    @Deprecated
    public FillForm(int i, elgo elgoVar, ekvi ekviVar, aftc aftcVar, ekvi ekviVar2, boolean z, elhz elhzVar) {
        this.e = ekviVar;
        this.f = aftcVar;
        this.g = ekviVar2;
        this.h = i;
        elia eliaVar = new elia();
        elia eliaVar2 = new elia();
        int size = elgoVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            FillField fillField = (FillField) elgoVar.get(i2);
            elsn listIterator = fillField.e.listIterator();
            while (listIterator.hasNext()) {
                eliaVar.b((agkg) listIterator.next(), fillField);
            }
            if (z) {
                elsn listIterator2 = fillField.f.listIterator();
                while (listIterator2.hasNext()) {
                    eliaVar2.b((agkg) listIterator2.next(), fillField);
                }
            }
        }
        elgj elgjVar = new elgj();
        elgjVar.k(elgoVar);
        elsn listIterator3 = elhzVar.listIterator();
        while (listIterator3.hasNext()) {
            agkg agkgVar = (agkg) listIterator3.next();
            agnp agnpVar = new agnp();
            agnpVar.h = true;
            agnpVar.f(agkgVar);
            agnpVar.c = 1;
            FillField a2 = agnpVar.a();
            eliaVar.b(agkgVar, a2);
            elgjVar.i(a2);
        }
        this.d = eliaVar.a();
        this.c = elgjVar.g();
        this.i = eliaVar2.a();
    }
}
