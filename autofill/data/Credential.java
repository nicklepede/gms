package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adso;
import defpackage.adsp;
import defpackage.adsv;
import defpackage.adsy;
import defpackage.adts;
import defpackage.adty;
import defpackage.eiid;
import defpackage.eiuu;
import defpackage.flhe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class Credential implements Parcelable {
    public static final Parcelable.Creator CREATOR = new adso();
    public final String a;
    public final adts b;
    public final adsv c;
    public final eiuu d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final eiid h;
    public final eiid i;
    public final int j;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public abstract class LeakedPasswordIssue implements Parcelable {
        public abstract long a();

        public abstract boolean b();
    }

    public Credential(String str, adts adtsVar, adsv adsvVar, eiuu eiuuVar, boolean z, boolean z2, int i, boolean z3, LeakedPasswordIssue leakedPasswordIssue, adsv adsvVar2, int i2) {
        if (!((i == 2 && (adsvVar instanceof adty)) ? adsy.e(eiuuVar, (adty) adsvVar) : eiuuVar.contains(adsvVar))) {
            throw new IllegalStateException();
        }
        if (str.isEmpty() && adtsVar.a.isEmpty()) {
            throw new IllegalStateException();
        }
        this.a = str;
        this.b = adtsVar;
        this.c = adsvVar;
        this.d = eiuuVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = eiid.i(leakedPasswordIssue);
        this.i = eiid.i(adsvVar2);
        this.j = i2;
    }

    public final adsp a() {
        adsp adspVar = new adsp(this.a, this.b, this.c);
        adspVar.c = this.d;
        adspVar.d = this.e;
        adspVar.e = this.f;
        adspVar.i = 2;
        adspVar.f = this.g;
        adspVar.b((LeakedPasswordIssue) this.h.f());
        adspVar.g = (adsv) this.i.f();
        adspVar.h = this.j;
        return adspVar;
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
        if (!flhe.g()) {
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
        return flhe.g() ? Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), this.h}) : Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.a);
        eiuu eiuuVar = this.d;
        int size = eiuuVar.size();
        adsv[] adsvVarArr = new adsv[size];
        eiuuVar.toArray(adsvVarArr);
        adsy.c(this.c, parcel);
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            adsy.c(adsvVarArr[i2], parcel);
        }
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        if (flhe.g()) {
            eiid eiidVar = this.h;
            if (eiidVar.h()) {
                parcel.writeByte((byte) 1);
                parcel.writeParcelable((Parcelable) eiidVar.c(), i);
            } else {
                parcel.writeByte((byte) 0);
            }
        }
        eiid eiidVar2 = this.i;
        if (!eiidVar2.h()) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            adsy.c((adsv) eiidVar2.c(), parcel);
        }
    }
}
