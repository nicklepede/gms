package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cifj;
import defpackage.cigb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class IsMusicMutedBySassParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cigb();
    public cifj a;

    private IsMusicMutedBySassParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IsMusicMutedBySassParams) {
            return arwb.b(this.a, ((IsMusicMutedBySassParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.a);
        arxc.c(parcel, a);
    }

    public IsMusicMutedBySassParams(IBinder iBinder) {
        cifj cifjVar;
        if (iBinder == null) {
            cifjVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IBooleanCallback");
            cifjVar = queryLocalInterface instanceof cifj ? (cifj) queryLocalInterface : new cifj(iBinder);
        }
        this.a = cifjVar;
    }
}
