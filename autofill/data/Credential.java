package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afsv;
import defpackage.afsw;
import defpackage.aftc;
import defpackage.aftf;
import defpackage.aftz;
import defpackage.afuf;
import defpackage.ekvi;
import defpackage.elhz;
import defpackage.fnyr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class Credential implements Parcelable {
    public static final Parcelable.Creator CREATOR = new afsv();
    public final String a;
    public final aftz b;
    public final aftc c;
    public final elhz d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ekvi h;
    public final ekvi i;
    public final int j;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public abstract class LeakedPasswordIssue implements Parcelable {
        public abstract long a();

        public abstract boolean b();
    }

    public Credential(String str, aftz aftzVar, aftc aftcVar, elhz elhzVar, boolean z, boolean z2, int i, boolean z3, LeakedPasswordIssue leakedPasswordIssue, aftc aftcVar2, int i2) {
        if (!((i == 2 && (aftcVar instanceof afuf)) ? aftf.e(elhzVar, (afuf) aftcVar) : elhzVar.contains(aftcVar))) {
            throw new IllegalStateException();
        }
        if (str.isEmpty() && aftzVar.a.isEmpty()) {
            throw new IllegalStateException();
        }
        this.a = str;
        this.b = aftzVar;
        this.c = aftcVar;
        this.d = elhzVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = ekvi.i(leakedPasswordIssue);
        this.i = ekvi.i(aftcVar2);
        this.j = i2;
    }

    public final afsw a() {
        afsw afswVar = new afsw(this.a, this.b, this.c);
        afswVar.c = this.d;
        afswVar.d = this.e;
        afswVar.e = this.f;
        afswVar.i = 2;
        afswVar.f = this.g;
        afswVar.b((LeakedPasswordIssue) this.h.f());
        afswVar.g = (aftc) this.i.f();
        afswVar.h = this.j;
        return afswVar;
    }

    public final boolean b() {
        return !this.b.a.isEmpty();
    }

    public final boolean c() {
        return !this.a.isEmpty();
    }

    public final boolean d() {
        return !c() && b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return c() && b();
    }

    public final boolean equals(Object obj) {
        if (!fnyr.g()) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Credential)) {
                return false;
            }
            Credential credential = (Credential) obj;
            return this.a.equals(credential.a) && this.b.equals(credential.b) && this.c.equals(credential.c) && this.d.equals(credential.d) && this.e == credential.e && this.f == credential.f;
        }
        if (obj instanceof Credential) {
            Credential credential2 = (Credential) obj;
            if (this.a.equals(credential2.a) && this.b.equals(credential2.b) && this.c.equals(credential2.c) && this.d.equals(credential2.d) && this.e == credential2.e && this.f == credential2.f && this.h.equals(credential2.h) && this.i.equals(credential2.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return fnyr.g() ? Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), this.h}) : Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.a);
        elhz elhzVar = this.d;
        int size = elhzVar.size();
        aftc[] aftcVarArr = new aftc[size];
        elhzVar.toArray(aftcVarArr);
        aftf.c(this.c, parcel);
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            aftf.c(aftcVarArr[i2], parcel);
        }
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        if (fnyr.g()) {
            ekvi ekviVar = this.h;
            if (ekviVar.h()) {
                parcel.writeByte((byte) 1);
                parcel.writeParcelable((Parcelable) ekviVar.c(), i);
            } else {
                parcel.writeByte((byte) 0);
            }
        }
        ekvi ekviVar2 = this.i;
        if (!ekviVar2.h()) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            aftf.c((aftc) ekviVar2.c(), parcel);
        }
    }
}
