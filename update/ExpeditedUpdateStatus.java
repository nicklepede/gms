package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.djnw;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ExpeditedUpdateStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djnw();
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
        atyp.b("isInExpeditedPhase", Boolean.valueOf(this.a), arrayList);
        atyp.b("delayUntilExpeditedPhase", Long.valueOf(this.b), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.q(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
