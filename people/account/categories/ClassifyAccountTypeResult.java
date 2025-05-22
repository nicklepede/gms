package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cvtb;
import defpackage.cvtd;
import defpackage.cvth;
import defpackage.ekus;
import defpackage.ekvg;
import defpackage.ekvh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ClassifyAccountTypeResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvth();
    public final String a;
    public final String b;
    public final cvtb c;
    private final cvtd d;

    public ClassifyAccountTypeResult(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        cvtb b = cvtb.b(i);
        this.c = b == null ? cvtb.UNKNOWN : b;
        cvtd b2 = cvtd.b(i2);
        this.d = b2 == null ? cvtd.UNKNOWN : b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeResult classifyAccountTypeResult = (ClassifyAccountTypeResult) obj;
            if (ekus.a(this.a, classifyAccountTypeResult.a) && ekus.a(this.b, classifyAccountTypeResult.b) && this.c == classifyAccountTypeResult.c && this.d == classifyAccountTypeResult.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        ekvg b = ekvh.b(this);
        b.b("accountType", this.a);
        b.b("dataSet", this.b);
        b.b("category", this.c);
        b.b("matchTag", this.d);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c.k);
        atzr.o(parcel, 4, this.d.g);
        atzr.c(parcel, a);
    }

    public ClassifyAccountTypeResult(String str, String str2, cvtb cvtbVar, cvtd cvtdVar) {
        cvtbVar.getClass();
        cvtdVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = cvtbVar;
        this.d = cvtdVar;
    }
}
