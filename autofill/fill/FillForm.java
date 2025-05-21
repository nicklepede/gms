package com.google.android.gms.autofill.fill;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import defpackage.adsv;
import defpackage.adsy;
import defpackage.aeju;
import defpackage.aend;
import defpackage.aene;
import defpackage.aeng;
import defpackage.aenh;
import defpackage.asej;
import defpackage.asot;
import defpackage.eiid;
import defpackage.eipl;
import defpackage.eisx;
import defpackage.eite;
import defpackage.eitj;
import defpackage.eius;
import defpackage.eiuu;
import defpackage.eiuv;
import defpackage.eiuy;
import defpackage.ejck;
import defpackage.ejfg;
import defpackage.ejfh;
import defpackage.flhh;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FillForm implements Parcelable {
    public final eitj c;
    public final eiuy d;
    public final eiid e;
    public final adsv f;
    public final eiid g;
    public final int h;
    private final eiuy i;
    public static final asot a = asot.b("FillForm", asej.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new aeng();
    public static final Parcelable.Creator b = new aenh();

    @Deprecated
    public FillForm(int i, eitj eitjVar, eiid eiidVar, adsv adsvVar, eiid eiidVar2) {
        this(i, eitjVar, eiidVar, adsvVar, eiidVar2, flhh.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eiid a(eisx eisxVar) {
        ejfh it = ((eitj) eisxVar).iterator();
        FillField fillField = null;
        while (it.hasNext()) {
            aeju aejuVar = (aeju) it.next();
            if (g(aejuVar)) {
                eitj d = d(aejuVar);
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    FillField fillField2 = (FillField) d.get(i);
                    if (aene.d(fillField2)) {
                        return eiid.j(fillField2);
                    }
                    if (fillField == null) {
                        fillField = fillField2;
                    }
                }
            }
        }
        return eiid.i(fillField);
    }

    public final eitj b(aeju aejuVar) {
        return this.i.g(aejuVar).v();
    }

    public final eitj c(eisx eisxVar) {
        Stream filter = Collection.EL.stream(f(eisxVar)).filter(new Predicate() { // from class: aenf
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo463negate() {
                return Predicate$CC.$default$negate(this);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                asot asotVar = FillForm.a;
                return ((FillField) obj).e.size() == 1;
            }
        });
        int i = eitj.d;
        return (eitj) filter.collect(eipl.a);
    }

    public final eitj d(aeju aejuVar) {
        return this.d.g(aejuVar).v();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final eiuu e() {
        return this.d.z();
    }

    public final eiuu f(eisx eisxVar) {
        eius eiusVar = new eius();
        ejfg listIterator = eisxVar.listIterator();
        while (listIterator.hasNext()) {
            eiusVar.k(d((aeju) listIterator.next()));
        }
        return eiusVar.g();
    }

    public final boolean g(aeju aejuVar) {
        return this.d.u(aejuVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.h);
        parcel.writeTypedList(this.c);
        eiid eiidVar = this.e;
        parcel.writeInt(eiidVar.h() ? 1 : 0);
        if (eiidVar.h()) {
            parcel.writeTypedObject((FillField) eiidVar.c(), i);
        }
        adsy.c(this.f, parcel);
        eiid eiidVar2 = this.g;
        parcel.writeInt(eiidVar2.h() ? 1 : 0);
        if (eiidVar2.h()) {
            adsy.c((adsv) eiidVar2.c(), parcel);
        }
    }

    public FillForm(int i, eitj eitjVar, eiid eiidVar, adsv adsvVar, eiid eiidVar2, boolean z) {
        this(i, eitjVar, eiidVar, adsvVar, eiidVar2, z, ejck.a);
    }

    public FillForm(int i, eitj eitjVar, eiid eiidVar, adsv adsvVar, eiid eiidVar2, boolean z, eiuu eiuuVar) {
        this.e = eiidVar;
        this.f = adsvVar;
        this.g = eiidVar2;
        this.h = i;
        eiuv eiuvVar = new eiuv();
        eiuv eiuvVar2 = new eiuv();
        int size = eitjVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            FillField fillField = (FillField) eitjVar.get(i2);
            ejfg listIterator = fillField.e.listIterator();
            while (listIterator.hasNext()) {
                eiuvVar.b((aeju) listIterator.next(), fillField);
            }
            if (z) {
                ejfg listIterator2 = fillField.f.listIterator();
                while (listIterator2.hasNext()) {
                    eiuvVar2.b((aeju) listIterator2.next(), fillField);
                }
            }
        }
        eite eiteVar = new eite();
        eiteVar.k(eitjVar);
        ejfg listIterator3 = eiuuVar.listIterator();
        while (listIterator3.hasNext()) {
            aeju aejuVar = (aeju) listIterator3.next();
            aend aendVar = new aend();
            aendVar.h = true;
            aendVar.f(aejuVar);
            aendVar.c = 1;
            FillField a2 = aendVar.a();
            eiuvVar.b(aejuVar, a2);
            eiteVar.i(a2);
        }
        this.d = eiuvVar.a();
        this.c = eiteVar.g();
        this.i = eiuvVar2.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FillForm(defpackage.eitj r7, defpackage.adsv r8) {
        /*
            r6 = this;
            r1 = 0
            eigb r3 = defpackage.eigb.a
            r5 = r3
            r0 = r6
            r2 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.autofill.fill.FillForm.<init>(eitj, adsv):void");
    }
}
