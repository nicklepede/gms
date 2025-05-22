package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmru;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmru();
    public final boolean a;
    public final long b;
    public final boolean c;
    public final WorkSource d;
    private final int[] e;

    public DiscoveryOptions(boolean z, long j, boolean z2, int[] iArr, WorkSource workSource) {
        this.a = z;
        this.b = j;
        this.c = z2;
        this.e = iArr;
        if (workSource == null) {
            this.d = new WorkSource();
        } else {
            this.d = workSource;
        }
    }

    public final int[] a() {
        int[] iArr;
        int[] iArr2 = this.e;
        if (iArr2 == null || (iArr = (int[]) iArr2.clone()) == null) {
            return null;
        }
        int[] iArr3 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 4) {
                iArr3[i] = 4;
            } else if (i2 != 5) {
                iArr3[i] = 0;
            } else {
                iArr3[i] = 5;
            }
        }
        return iArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryOptions)) {
            return false;
        }
        DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
        return this.a == discoveryOptions.a && this.b == discoveryOptions.b && this.c == discoveryOptions.c && Arrays.equals(this.e, discoveryOptions.e) && this.d.equals(discoveryOptions.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.e)), this.d});
    }

    public final String toString() {
        WorkSource workSource = this.d;
        return "DiscoveryOptions{localWifiOnly=" + this.a + ", rangingReportingIntervalMillis=" + this.b + ", requestAllMotions=" + this.c + ", discoveryMediums=" + Arrays.toString(this.e) + ", workSource=" + workSource.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.q(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.p(parcel, 4, a(), false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.c(parcel, a);
    }
}
