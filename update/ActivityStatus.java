package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.djnk;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ActivityStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djnk();
    public final boolean a;
    public final boolean b;
    public final long c;
    public final long d;
    public final int e;

    public ActivityStatus(boolean z, boolean z2, long j, long j2, int i) {
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActivityStatus)) {
            return false;
        }
        ActivityStatus activityStatus = (ActivityStatus) obj;
        return this.a == activityStatus.a && this.b == activityStatus.b && this.c == activityStatus.c && this.d == activityStatus.d && this.e == activityStatus.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("isUp", Boolean.valueOf(this.a), arrayList);
        atyp.b("isSetupWizard", Boolean.valueOf(this.b), arrayList);
        atyp.b("activityLastForegroundedAt", Long.valueOf(this.c), arrayList);
        atyp.b("activityLastBackgroundedAt", Long.valueOf(this.d), arrayList);
        atyp.b("statusAtLastBackgrounding", Integer.valueOf(this.e), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.e(parcel, 2, this.b);
        atzr.q(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
