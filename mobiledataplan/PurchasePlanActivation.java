package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgjy;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PurchasePlanActivation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjy();
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
        return atyq.b(this.a, purchasePlanActivation.a) && atyq.b(this.b, purchasePlanActivation.b) && this.c == purchasePlanActivation.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("transactionId", this.a, arrayList);
        atyp.b("planId", this.b, arrayList);
        atyp.b("state", Integer.valueOf(this.c), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public PurchasePlanActivation(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
