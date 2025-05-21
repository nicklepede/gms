package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqxs;
import defpackage.aqxw;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.atnr;
import defpackage.atot;
import defpackage.atou;
import defpackage.atrm;
import defpackage.atrn;
import defpackage.atro;
import defpackage.fddj;
import defpackage.fddr;
import defpackage.fdds;
import defpackage.fddv;
import defpackage.fdea;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.qoh;
import defpackage.qoi;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class InterestUpdateBatchImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atrn();
    public final ArrayList a;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Operation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new atro();
        public final int a;
        public final InterestRecordStub b;
        public final String c;

        public Operation(int i, InterestRecordStub interestRecordStub, String str) {
            this.a = i;
            this.b = interestRecordStub;
            this.c = str;
        }

        public final InterestRecordStub a() {
            arwm.l(this.a == 1);
            InterestRecordStub interestRecordStub = this.b;
            arwm.s(interestRecordStub);
            return interestRecordStub;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = arxc.a(parcel);
            arxc.o(parcel, 2, this.a);
            arxc.t(parcel, 3, this.b, i, false);
            arxc.v(parcel, 4, this.c, false);
            arxc.c(parcel, a);
        }
    }

    public InterestUpdateBatchImpl(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final aqxw a(aqxs aqxsVar) {
        atrm atrmVar = new atrm(this, aqxsVar);
        aqxsVar.d(atrmVar);
        return atrmVar;
    }

    public final void b(String str, int i, atot atotVar, atou atouVar) {
        arwm.q(str);
        arwm.c(true, "At least one of production, retention, or dispatch policy must be set.");
        fecj v = fdds.a.v();
        fddj a = atnr.a(i);
        if (!v.b.L()) {
            v.U();
        }
        fdds fddsVar = (fdds) v.b;
        fddsVar.d = a.gh;
        fddsVar.b |= 2;
        fecj v2 = fddr.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fddr fddrVar = (fddr) v2.b;
        str.getClass();
        fddrVar.b |= 4;
        fddrVar.e = str;
        if (!v.b.L()) {
            v.U();
        }
        fdds fddsVar2 = (fdds) v.b;
        fddr fddrVar2 = (fddr) v2.Q();
        fddrVar2.getClass();
        fddsVar2.i = fddrVar2;
        fddsVar2.b |= 64;
        if (!v.b.L()) {
            v.U();
        }
        fdea fdeaVar = ((qoi) atouVar).a;
        fecp fecpVar = v.b;
        fdds fddsVar3 = (fdds) fecpVar;
        fddsVar3.f = fdeaVar;
        fddsVar3.b |= 8;
        if (!fecpVar.L()) {
            v.U();
        }
        fddv fddvVar = ((qoh) atotVar).a;
        ArrayList arrayList = this.a;
        fdds fddsVar4 = (fdds) v.b;
        fddsVar4.e = fddvVar;
        fddsVar4.b |= 4;
        arrayList.add(new Operation(1, new InterestRecordStub((fdds) v.Q()), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 2, arrayList, false);
        arxc.c(parcel, a);
    }

    public InterestUpdateBatchImpl() {
        this.a = new ArrayList();
    }
}
