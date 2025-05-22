package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgjm;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdpMoney extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjm();
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
        return atyq.b(this.a, mdpMoney.a) && atyq.b(Long.valueOf(this.b), Long.valueOf(mdpMoney.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(mdpMoney.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("currencyCode", this.a, arrayList);
        atyp.b("units", Long.valueOf(this.b), arrayList);
        atyp.b("nanos", Integer.valueOf(this.c), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.q(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
