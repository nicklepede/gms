package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgjz;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class QoeMetrics extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjz();
    public final Long a;
    public final Float b;
    public final Float c;

    public QoeMetrics(Long l, Float f, Float f2) {
        this.a = l;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QoeMetrics)) {
            return false;
        }
        QoeMetrics qoeMetrics = (QoeMetrics) obj;
        return atyq.b(this.a, qoeMetrics.a) && atyq.b(this.b, qoeMetrics.b) && atyq.b(this.c, qoeMetrics.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("uptime", this.a, arrayList);
        atyp.b("networkScore", this.b, arrayList);
        atyp.b("timeConnectedPercent", this.c, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int a = atzr.a(parcel);
        atzr.I(parcel, 1, l);
        atzr.C(parcel, 2, this.b);
        atzr.C(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
