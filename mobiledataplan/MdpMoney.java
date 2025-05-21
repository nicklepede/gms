package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ceaf;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdpMoney extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceaf();
    public final String a;
    public final long b;
    public final int c;

    public MdpMoney(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpMoney)) {
            return false;
        }
        MdpMoney mdpMoney = (MdpMoney) obj;
        return arwb.b(this.a, mdpMoney.a) && arwb.b(Long.valueOf(this.b), Long.valueOf(mdpMoney.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(mdpMoney.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("currencyCode", this.a, arrayList);
        arwa.b("units", Long.valueOf(this.b), arrayList);
        arwa.b("nanos", Integer.valueOf(this.c), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.q(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
