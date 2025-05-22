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
import defpackage.dkio;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class RegisterDistributedServiceAvailabilityCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkio();
    public dkhu a;
    public String b;
    public dkhr c;

    public RegisterDistributedServiceAvailabilityCallbackParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterDistributedServiceAvailabilityCallbackParams) {
            RegisterDistributedServiceAvailabilityCallbackParams registerDistributedServiceAvailabilityCallbackParams = (RegisterDistributedServiceAvailabilityCallbackParams) obj;
            if (atyq.b(this.a, registerDistributedServiceAvailabilityCallbackParams.a) && atyq.b(this.b, registerDistributedServiceAvailabilityCallbackParams.b) && atyq.b(this.c, registerDistributedServiceAvailabilityCallbackParams.c)) {
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

    public RegisterDistributedServiceAvailabilityCallbackParams(IBinder iBinder, String str, IBinder iBinder2) {
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
