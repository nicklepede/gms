package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cear;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PurchasePlanActivation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cear();
    public String a;
    public String b;
    public int c;

    public PurchasePlanActivation() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasePlanActivation)) {
            return false;
        }
        PurchasePlanActivation purchasePlanActivation = (PurchasePlanActivation) obj;
        return arwb.b(this.a, purchasePlanActivation.a) && arwb.b(this.b, purchasePlanActivation.b) && this.c == purchasePlanActivation.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("transactionId", this.a, arrayList);
        arwa.b("planId", this.b, arrayList);
        arwa.b("state", Integer.valueOf(this.c), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    public PurchasePlanActivation(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
