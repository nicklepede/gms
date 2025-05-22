package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpiw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OnShareTargetUpdatedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpiw();
    public ShareTarget a;

    public OnShareTargetUpdatedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnShareTargetUpdatedParams) {
            return atyq.b(this.a, ((OnShareTargetUpdatedParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.c(parcel, a);
    }

    public OnShareTargetUpdatedParams(ShareTarget shareTarget) {
        this.a = shareTarget;
    }
}
