package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctwz;
import defpackage.eihn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class CpgDocument extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctwz();
    public final int a;
    public final GroupContactOrder b;
    public final ActionPreference c;

    public CpgDocument(int i, GroupContactOrder groupContactOrder, ActionPreference actionPreference) {
        this.a = i;
        this.b = groupContactOrder;
        this.c = actionPreference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CpgDocument cpgDocument = (CpgDocument) obj;
            if (this.a == cpgDocument.a && eihn.a(this.b, cpgDocument.b) && eihn.a(this.c, cpgDocument.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
