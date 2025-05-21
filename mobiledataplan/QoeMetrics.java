package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ceas;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class QoeMetrics extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceas();
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
        return arwb.b(this.a, qoeMetrics.a) && arwb.b(this.b, qoeMetrics.b) && arwb.b(this.c, qoeMetrics.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("uptime", this.a, arrayList);
        arwa.b("networkScore", this.b, arrayList);
        arwa.b("timeConnectedPercent", this.c, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int a = arxc.a(parcel);
        arxc.I(parcel, 1, l);
        arxc.C(parcel, 2, this.b);
        arxc.C(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
