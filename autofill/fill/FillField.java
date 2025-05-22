package com.google.android.gms.autofill.fill;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import defpackage.ageh;
import defpackage.agkg;
import defpackage.agnm;
import defpackage.agno;
import defpackage.ahri;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elhz;
import defpackage.elpg;
import defpackage.elso;
import defpackage.emdm;
import defpackage.emdp;
import defpackage.fnyu;
import j$.util.Collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.ToIntFunction;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class FillField implements Parcelable {
    public final AutofillId b;
    public final int c;
    public final elgo d;
    public final elhz e;
    public final elhz f;
    public final int g;
    public final ahri h;
    public final elgo i;
    public final int j;
    public final int k;
    public final String l;
    public final boolean m;
    public static final Parcelable.Creator a = new agnm();
    public static final Parcelable.Creator CREATOR = new agno();

    public FillField(AutofillId autofillId, int i, elgo elgoVar, elhz elhzVar, elhz elhzVar2, int i2, ahri ahriVar, elgo elgoVar2, int i3, int i4, String str, boolean z) {
        this.b = autofillId;
        this.c = i;
        this.d = elgoVar;
        this.e = elhzVar;
        this.f = elhzVar2;
        this.g = i2;
        this.h = ahriVar;
        this.i = elgoVar2;
        this.j = i3;
        this.k = i4;
        this.l = str;
        this.m = z;
    }

    public static List b(Parcel parcel) {
        int readInt = parcel.readInt();
        elgj e = elgo.e(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            byte[] bArr = new byte[readInt3];
            parcel.readByteArray(bArr);
            boolean z = readInt3 > 0;
            int i2 = emdp.b;
            ekvl.b(z, "A HashCode must contain at least 1 byte.");
            e.i(new ageh(new emdm((byte[]) bArr.clone()), readInt2));
        }
        return e.g();
    }

    public final ekvi a() {
        ageh agehVar = null;
        int i = -1;
        int i2 = 0;
        while (true) {
            elgo elgoVar = this.i;
            if (i2 >= ((elpg) elgoVar).c) {
                return ekvi.i(agehVar);
            }
            ageh agehVar2 = (ageh) elgoVar.get(i2);
            int i3 = agehVar2.b;
            if (i < i3) {
                agehVar = agehVar2;
            }
            if (i < i3) {
                i = i3;
            }
            i2++;
        }
    }

    public final boolean c(agkg... agkgVarArr) {
        return !Collections.disjoint(this.e, Arrays.asList(agkgVarArr));
    }

    public final boolean d(agkg agkgVar) {
        return this.f.contains(agkgVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e(agkg agkgVar) {
        return this.e.contains(agkgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedObject(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeStringArray((String[]) this.d.toArray(new String[0]));
        parcel.writeIntArray(Collection.EL.stream(this.e).mapToInt(new ToIntFunction() { // from class: agnk
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((agkg) obj).a();
            }
        }).toArray());
        parcel.writeInt(this.g);
        parcel.writeInt(this.h.a());
        elgo elgoVar = this.i;
        parcel.writeInt(((elpg) elgoVar).c);
        elso it = elgoVar.iterator();
        while (it.hasNext()) {
            ageh agehVar = (ageh) it.next();
            parcel.writeInt(agehVar.b);
            byte[] e = agehVar.a.e();
            parcel.writeInt(e.length);
            parcel.writeByteArray(e);
        }
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeString(this.l);
        if (fnyu.e()) {
            parcel.writeIntArray(Collection.EL.stream(this.f).mapToInt(new ToIntFunction() { // from class: agnk
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((agkg) obj).a();
                }
            }).toArray());
        }
        parcel.writeInt(this.m ? 1 : 0);
    }
}
