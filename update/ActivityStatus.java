package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dhce;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ActivityStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhce();
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
        arwa.b("isUp", Boolean.valueOf(this.a), arrayList);
        arwa.b("isSetupWizard", Boolean.valueOf(this.b), arrayList);
        arwa.b("activityLastForegroundedAt", Long.valueOf(this.c), arrayList);
        arwa.b("activityLastBackgroundedAt", Long.valueOf(this.d), arrayList);
        arwa.b("statusAtLastBackgrounding", Integer.valueOf(this.e), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.e(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
