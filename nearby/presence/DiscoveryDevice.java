package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmrq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DiscoveryDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmrq();
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
            return atyq.b(Long.valueOf(this.a), Long.valueOf(((DiscoveryDevice) obj).a));
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.J(parcel, 2, this.b, i);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
