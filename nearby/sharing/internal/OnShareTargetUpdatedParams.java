package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cnao;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OnShareTargetUpdatedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnao();
    public ShareTarget a;

    public OnShareTargetUpdatedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnShareTargetUpdatedParams) {
            return arwb.b(this.a, ((OnShareTargetUpdatedParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.c(parcel, a);
    }

    public OnShareTargetUpdatedParams(ShareTarget shareTarget) {
        this.a = shareTarget;
    }
}
