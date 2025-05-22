package com.google.android.gms.usonia.directory.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkhp;
import defpackage.dkhr;
import defpackage.dkhs;
import defpackage.dkhu;
import defpackage.dkit;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class UnregisterDistributedServiceAvailabilityCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkit();
    public dkhu a;
    public String b;
    public dkhr c;

    public UnregisterDistributedServiceAvailabilityCallbackParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterDistributedServiceAvailabilityCallbackParams) {
            UnregisterDistributedServiceAvailabilityCallbackParams unregisterDistributedServiceAvailabilityCallbackParams = (UnregisterDistributedServiceAvailabilityCallbackParams) obj;
            if (atyq.b(this.a, unregisterDistributedServiceAvailabilityCallbackParams.a) && atyq.b(this.b, unregisterDistributedServiceAvailabilityCallbackParams.b) && atyq.b(this.c, unregisterDistributedServiceAvailabilityCallbackParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.c(parcel, a);
    }

    public UnregisterDistributedServiceAvailabilityCallbackParams(IBinder iBinder, String str, IBinder iBinder2) {
        dkhu dkhsVar;
        dkhr dkhrVar = null;
        if (iBinder == null) {
            dkhsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usonia.directory.internal.IUsoniaStatusCallback");
            dkhsVar = queryLocalInterface instanceof dkhu ? (dkhu) queryLocalInterface : new dkhs(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.usonia.directory.internal.IDistributedServiceAvailabilityCallback");
            dkhrVar = queryLocalInterface2 instanceof dkhr ? (dkhr) queryLocalInterface2 : new dkhp(iBinder2);
        }
        this.a = dkhsVar;
        this.b = str;
        this.c = dkhrVar;
    }
}
