package com.google.android.gms.nearby.fastpair.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ckoq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SassBlockSwitchForUsageParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckoq();
    public int a;

    public SassBlockSwitchForUsageParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SassBlockSwitchForUsageParams) {
            return atyq.b(Integer.valueOf(this.a), Integer.valueOf(((SassBlockSwitchForUsageParams) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.c(parcel, a);
    }

    public SassBlockSwitchForUsageParams(int i) {
        this.a = i;
    }
}
