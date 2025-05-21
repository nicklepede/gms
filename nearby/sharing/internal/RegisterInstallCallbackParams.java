package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmwk;
import defpackage.cmwm;
import defpackage.cnbe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RegisterInstallCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnbe();
    public cmwm a;
    public int b;
    public arbp c;

    public RegisterInstallCallbackParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterInstallCallbackParams) {
            RegisterInstallCallbackParams registerInstallCallbackParams = (RegisterInstallCallbackParams) obj;
            if (arwb.b(this.a, registerInstallCallbackParams.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(registerInstallCallbackParams.b)) && arwb.b(this.c, registerInstallCallbackParams.c)) {
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
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.o(parcel, 2, this.b);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.c(parcel, a);
    }

    public RegisterInstallCallbackParams(IBinder iBinder, int i, IBinder iBinder2) {
        cmwm cmwkVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            cmwkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IInstallUpdateCallback");
            cmwkVar = queryLocalInterface instanceof cmwm ? (cmwm) queryLocalInterface : new cmwk(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface2 instanceof arbp ? (arbp) queryLocalInterface2 : new arbn(iBinder2);
        }
        this.a = cmwkVar;
        this.b = i;
        this.c = arbpVar;
    }
}
