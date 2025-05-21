package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctjv;
import defpackage.ctjx;
import defpackage.ctkb;
import defpackage.eihn;
import defpackage.eiib;
import defpackage.eiic;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ClassifyAccountTypeResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctkb();
    public final String a;
    public final String b;
    public final ctjv c;
    private final ctjx d;

    public ClassifyAccountTypeResult(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        ctjv b = ctjv.b(i);
        this.c = b == null ? ctjv.UNKNOWN : b;
        ctjx b2 = ctjx.b(i2);
        this.d = b2 == null ? ctjx.UNKNOWN : b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeResult classifyAccountTypeResult = (ClassifyAccountTypeResult) obj;
            if (eihn.a(this.a, classifyAccountTypeResult.a) && eihn.a(this.b, classifyAccountTypeResult.b) && this.c == classifyAccountTypeResult.c && this.d == classifyAccountTypeResult.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        eiib b = eiic.b(this);
        b.b("accountType", this.a);
        b.b("dataSet", this.b);
        b.b("category", this.c);
        b.b("matchTag", this.d);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c.k);
        arxc.o(parcel, 4, this.d.g);
        arxc.c(parcel, a);
    }

    public ClassifyAccountTypeResult(String str, String str2, ctjv ctjvVar, ctjx ctjxVar) {
        ctjvVar.getClass();
        ctjxVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = ctjvVar;
        this.d = ctjxVar;
    }
}
