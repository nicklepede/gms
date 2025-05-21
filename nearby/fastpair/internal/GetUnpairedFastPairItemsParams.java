package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cifi;
import defpackage.cifr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GetUnpairedFastPairItemsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cifi();
    public cifr a;

    private GetUnpairedFastPairItemsParams() {
    }

    public final IBinder a() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetUnpairedFastPairItemsParams) {
            return arwb.b(this.a, ((GetUnpairedFastPairItemsParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, a());
        arxc.c(parcel, a);
    }

    public GetUnpairedFastPairItemsParams(IBinder iBinder) {
        cifr cifrVar;
        if (iBinder == null) {
            cifrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairGetUnpairedFastPairItemsCallback");
            cifrVar = queryLocalInterface instanceof cifr ? (cifr) queryLocalInterface : new cifr(iBinder);
        }
        this.a = cifrVar;
    }
}
