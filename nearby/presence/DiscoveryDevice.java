package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ckjl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DiscoveryDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckjl();
    public final long a;
    public final PresenceAction[] b;
    public final int c;

    public DiscoveryDevice(long j, PresenceAction[] presenceActionArr, int i) {
        this.a = j;
        this.b = presenceActionArr;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DiscoveryDevice) {
            return arwb.b(Long.valueOf(this.a), Long.valueOf(((DiscoveryDevice) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    public final String toString() {
        return String.format("DiscoveryDevice:<deviceId: %s>", Long.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.J(parcel, 2, this.b, i);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
