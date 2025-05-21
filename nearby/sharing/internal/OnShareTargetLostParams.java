package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cnan;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OnShareTargetLostParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnan();
    public ShareTarget a;

    public OnShareTargetLostParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnShareTargetLostParams) {
            return arwb.b(this.a, ((OnShareTargetLostParams) obj).a);
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

    public OnShareTargetLostParams(ShareTarget shareTarget) {
        this.a = shareTarget;
    }
}
