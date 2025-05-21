package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.RangingData;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cnam;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OnShareTargetDistanceChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnam();
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
            if (arwb.b(this.a, onShareTargetDistanceChangedParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(onShareTargetDistanceChangedParams.b)) && arwb.b(this.c, onShareTargetDistanceChangedParams.c)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }

    public OnShareTargetDistanceChangedParams(ShareTarget shareTarget, int i, RangingData rangingData) {
        this.a = shareTarget;
        this.b = i;
        this.c = rangingData;
    }
}
