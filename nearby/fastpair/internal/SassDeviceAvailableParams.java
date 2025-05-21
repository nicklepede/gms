package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cifj;
import defpackage.cigm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SassDeviceAvailableParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cigm();
    public int a;
    public cifj b;

    private SassDeviceAvailableParams() {
    }

    public final IBinder a() {
        return this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SassDeviceAvailableParams) {
            SassDeviceAvailableParams sassDeviceAvailableParams = (SassDeviceAvailableParams) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(sassDeviceAvailableParams.a)) && arwb.b(this.b, sassDeviceAvailableParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.D(parcel, 2, a());
        arxc.c(parcel, a);
    }

    public SassDeviceAvailableParams(int i, IBinder iBinder) {
        cifj cifjVar;
        if (iBinder == null) {
            cifjVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IBooleanCallback");
            cifjVar = queryLocalInterface instanceof cifj ? (cifj) queryLocalInterface : new cifj(iBinder);
        }
        this.a = i;
        this.b = cifjVar;
    }
}
