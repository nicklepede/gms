package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.RangingData;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpiu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OnShareTargetDistanceChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpiu();
    public ShareTarget a;
    public int b;
    public RangingData c;

    public OnShareTargetDistanceChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnShareTargetDistanceChangedParams) {
            OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams = (OnShareTargetDistanceChangedParams) obj;
            if (atyq.b(this.a, onShareTargetDistanceChangedParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(onShareTargetDistanceChangedParams.b)) && atyq.b(this.c, onShareTargetDistanceChangedParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public OnShareTargetDistanceChangedParams(ShareTarget shareTarget, int i, RangingData rangingData) {
        this.a = shareTarget;
        this.b = i;
        this.c = rangingData;
    }
}
