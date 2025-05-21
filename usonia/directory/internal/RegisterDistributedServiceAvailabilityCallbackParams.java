package com.google.android.gms.usonia.directory.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dhwh;
import defpackage.dhwj;
import defpackage.dhwk;
import defpackage.dhwm;
import defpackage.dhxg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class RegisterDistributedServiceAvailabilityCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhxg();
    public dhwm a;
    public String b;
    public dhwj c;

    public RegisterDistributedServiceAvailabilityCallbackParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterDistributedServiceAvailabilityCallbackParams) {
            RegisterDistributedServiceAvailabilityCallbackParams registerDistributedServiceAvailabilityCallbackParams = (RegisterDistributedServiceAvailabilityCallbackParams) obj;
            if (arwb.b(this.a, registerDistributedServiceAvailabilityCallbackParams.a) && arwb.b(this.b, registerDistributedServiceAvailabilityCallbackParams.b) && arwb.b(this.c, registerDistributedServiceAvailabilityCallbackParams.c)) {
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
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.c(parcel, a);
    }

    public RegisterDistributedServiceAvailabilityCallbackParams(IBinder iBinder, String str, IBinder iBinder2) {
        dhwm dhwkVar;
        dhwj dhwjVar = null;
        if (iBinder == null) {
            dhwkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usonia.directory.internal.IUsoniaStatusCallback");
            dhwkVar = queryLocalInterface instanceof dhwm ? (dhwm) queryLocalInterface : new dhwk(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.usonia.directory.internal.IDistributedServiceAvailabilityCallback");
            dhwjVar = queryLocalInterface2 instanceof dhwj ? (dhwj) queryLocalInterface2 : new dhwh(iBinder2);
        }
        this.a = dhwkVar;
        this.b = str;
        this.c = dhwjVar;
    }
}
