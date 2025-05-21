package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dhcq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ExpeditedUpdateStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhcq();
    public final boolean a;
    public final long b;

    public ExpeditedUpdateStatus(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExpeditedUpdateStatus)) {
            return false;
        }
        ExpeditedUpdateStatus expeditedUpdateStatus = (ExpeditedUpdateStatus) obj;
        return this.a == expeditedUpdateStatus.a && this.b == expeditedUpdateStatus.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("isInExpeditedPhase", Boolean.valueOf(this.a), arrayList);
        arwa.b("delayUntilExpeditedPhase", Long.valueOf(this.b), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.q(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
