package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.contextmanager.interest.InterestRecordStub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atah;
import defpackage.atal;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.avru;
import defpackage.avsw;
import defpackage.avsx;
import defpackage.avvp;
import defpackage.avvq;
import defpackage.avvr;
import defpackage.ffsa;
import defpackage.ffsi;
import defpackage.ffsj;
import defpackage.ffsm;
import defpackage.ffsr;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.shl;
import defpackage.shm;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class InterestUpdateBatchImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avvq();
    public final ArrayList a;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Operation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new avvr();
        public final int a;
        public final InterestRecordStub b;
        public final String c;

        public Operation(int i, InterestRecordStub interestRecordStub, String str) {
            this.a = i;
            this.b = interestRecordStub;
            this.c = str;
        }

        public final InterestRecordStub a() {
            atzb.l(this.a == 1);
            InterestRecordStub interestRecordStub = this.b;
            atzb.s(interestRecordStub);
            return interestRecordStub;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.o(parcel, 2, this.a);
            atzr.t(parcel, 3, this.b, i, false);
            atzr.v(parcel, 4, this.c, false);
            atzr.c(parcel, a);
        }
    }

    public InterestUpdateBatchImpl(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final atal a(atah atahVar) {
        avvp avvpVar = new avvp(this, atahVar);
        atahVar.d(avvpVar);
        return avvpVar;
    }

    public final void b(String str, int i, avsw avswVar, avsx avsxVar) {
        atzb.q(str);
        atzb.c(true, "At least one of production, retention, or dispatch policy must be set.");
        fgrc v = ffsj.a.v();
        ffsa a = avru.a(i);
        if (!v.b.L()) {
            v.U();
        }
        ffsj ffsjVar = (ffsj) v.b;
        ffsjVar.d = a.go;
        ffsjVar.b |= 2;
        fgrc v2 = ffsi.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        ffsi ffsiVar = (ffsi) v2.b;
        str.getClass();
        ffsiVar.b |= 4;
        ffsiVar.e = str;
        if (!v.b.L()) {
            v.U();
        }
        ffsj ffsjVar2 = (ffsj) v.b;
        ffsi ffsiVar2 = (ffsi) v2.Q();
        ffsiVar2.getClass();
        ffsjVar2.i = ffsiVar2;
        ffsjVar2.b |= 64;
        if (!v.b.L()) {
            v.U();
        }
        ffsr ffsrVar = ((shm) avsxVar).a;
        fgri fgriVar = v.b;
        ffsj ffsjVar3 = (ffsj) fgriVar;
        ffsjVar3.f = ffsrVar;
        ffsjVar3.b |= 8;
        if (!fgriVar.L()) {
            v.U();
        }
        ffsm ffsmVar = ((shl) avswVar).a;
        ArrayList arrayList = this.a;
        ffsj ffsjVar4 = (ffsj) v.b;
        ffsjVar4.e = ffsmVar;
        ffsjVar4.b |= 4;
        arrayList.add(new Operation(1, new InterestRecordStub((ffsj) v.Q()), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 2, arrayList, false);
        atzr.c(parcel, a);
    }

    public InterestUpdateBatchImpl() {
        this.a = new ArrayList();
    }
}
