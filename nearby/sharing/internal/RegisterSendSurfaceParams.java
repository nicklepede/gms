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
import defpackage.cmxc;
import defpackage.cmxe;
import defpackage.cmxr;
import defpackage.cmxt;
import defpackage.cnbg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RegisterSendSurfaceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnbg();
    public cmxt a;
    public cmxe b;
    public int c;
    public arbp d;
    public String e;
    public int f;

    public RegisterSendSurfaceParams() {
        this.f = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterSendSurfaceParams) {
            RegisterSendSurfaceParams registerSendSurfaceParams = (RegisterSendSurfaceParams) obj;
            if (arwb.b(this.a, registerSendSurfaceParams.a) && arwb.b(this.b, registerSendSurfaceParams.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(registerSendSurfaceParams.c)) && arwb.b(this.d, registerSendSurfaceParams.d) && arwb.b(this.e, registerSendSurfaceParams.e) && arwb.b(Integer.valueOf(this.f), Integer.valueOf(registerSendSurfaceParams.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.o(parcel, 3, this.c);
        arxc.D(parcel, 4, this.d.asBinder());
        arxc.v(parcel, 5, this.e, false);
        arxc.o(parcel, 6, this.f);
        arxc.c(parcel, a);
    }

    public RegisterSendSurfaceParams(IBinder iBinder, IBinder iBinder2, int i, IBinder iBinder3, String str, int i2) {
        cmxt cmxrVar;
        cmxe cmxcVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            cmxrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            cmxrVar = queryLocalInterface instanceof cmxt ? (cmxt) queryLocalInterface : new cmxr(iBinder);
        }
        if (iBinder2 == null) {
            cmxcVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IShareTargetDiscoveredCallback");
            cmxcVar = queryLocalInterface2 instanceof cmxe ? (cmxe) queryLocalInterface2 : new cmxc(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface3 instanceof arbp ? (arbp) queryLocalInterface3 : new arbn(iBinder3);
        }
        this.a = cmxrVar;
        this.b = cmxcVar;
        this.c = i;
        this.d = arbpVar;
        this.e = str;
        this.f = i2;
    }
}
