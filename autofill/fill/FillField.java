package com.google.android.gms.autofill.fill;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import defpackage.aedv;
import defpackage.aeju;
import defpackage.aena;
import defpackage.aenc;
import defpackage.afqw;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.eite;
import defpackage.eitj;
import defpackage.eiuu;
import defpackage.ejcb;
import defpackage.ejfh;
import defpackage.ejqd;
import defpackage.ejqg;
import defpackage.flhh;
import j$.util.Collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.ToIntFunction;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class FillField implements Parcelable {
    public final AutofillId b;
    public final int c;
    public final eitj d;
    public final eiuu e;
    public final eiuu f;
    public final int g;
    public final afqw h;
    public final eitj i;
    public final int j;
    public final int k;
    public final String l;
    public final boolean m;
    public static final Parcelable.Creator a = new aena();
    public static final Parcelable.Creator CREATOR = new aenc();

    public FillField(AutofillId autofillId, int i, eitj eitjVar, eiuu eiuuVar, eiuu eiuuVar2, int i2, afqw afqwVar, eitj eitjVar2, int i3, int i4, String str, boolean z) {
        this.b = autofillId;
        this.c = i;
        this.d = eitjVar;
        this.e = eiuuVar;
        this.f = eiuuVar2;
        this.g = i2;
        this.h = afqwVar;
        this.i = eitjVar2;
        this.j = i3;
        this.k = i4;
        this.l = str;
        this.m = z;
    }

    public static List b(Parcel parcel) {
        int readInt = parcel.readInt();
        eite e = eitj.e(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            byte[] bArr = new byte[readInt3];
            parcel.readByteArray(bArr);
            boolean z = readInt3 > 0;
            int i2 = ejqg.b;
            eiig.b(z, "A HashCode must contain at least 1 byte.");
            e.i(new aedv(new ejqd((byte[]) bArr.clone()), readInt2));
        }
        return e.g();
    }

    public final eiid a() {
        aedv aedvVar = null;
        int i = -1;
        int i2 = 0;
        while (true) {
            eitj eitjVar = this.i;
            if (i2 >= ((ejcb) eitjVar).c) {
                return eiid.i(aedvVar);
            }
            aedv aedvVar2 = (aedv) eitjVar.get(i2);
            int i3 = aedvVar2.b;
            if (i < i3) {
                aedvVar = aedvVar2;
            }
            if (i < i3) {
                i = i3;
            }
            i2++;
        }
    }

    public final boolean c(aeju... aejuVarArr) {
        return !Collections.disjoint(this.e, Arrays.asList(aejuVarArr));
    }

    public final boolean d(aeju aejuVar) {
        return this.f.contains(aejuVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e(aeju aejuVar) {
        return this.e.contains(aejuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedObject(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeStringArray((String[]) this.d.toArray(new String[0]));
        parcel.writeIntArray(Collection.EL.stream(this.e).mapToInt(new ToIntFunction() { // from class: aemy
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((aeju) obj).a();
            }
        }).toArray());
        parcel.writeInt(this.g);
        parcel.writeInt(this.h.a());
        eitj eitjVar = this.i;
        parcel.writeInt(((ejcb) eitjVar).c);
        ejfh it = eitjVar.iterator();
        while (it.hasNext()) {
            aedv aedvVar = (aedv) it.next();
            parcel.writeInt(aedvVar.b);
            byte[] e = aedvVar.a.e();
            parcel.writeInt(e.length);
            parcel.writeByteArray(e);
        }
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeString(this.l);
        if (flhh.e()) {
            parcel.writeIntArray(Collection.EL.stream(this.f).mapToInt(new ToIntFunction() { // from class: aemy
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((aeju) obj).a();
                }
            }).toArray());
        }
        parcel.writeInt(this.m ? 1 : 0);
    }
}
