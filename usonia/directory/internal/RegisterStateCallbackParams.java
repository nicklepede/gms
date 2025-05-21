package com.google.android.gms.usonia.directory.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dhwe;
import defpackage.dhwg;
import defpackage.dhwk;
import defpackage.dhwm;
import defpackage.dhxh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class RegisterStateCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhxh();
    public dhwm a;
    public String b;
    public dhwg c;

    public RegisterStateCallbackParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterStateCallbackParams) {
            RegisterStateCallbackParams registerStateCallbackParams = (RegisterStateCallbackParams) obj;
            if (arwb.b(this.a, registerStateCallbackParams.a) && arwb.b(this.b, registerStateCallbackParams.b) && arwb.b(this.c, registerStateCallbackParams.c)) {
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

    public RegisterStateCallbackParams(IBinder iBinder, String str, IBinder iBinder2) {
        dhwm dhwkVar;
        dhwg dhwgVar = null;
        if (iBinder == null) {
            dhwkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usonia.directory.internal.IUsoniaStatusCallback");
            dhwkVar = queryLocalInterface instanceof dhwm ? (dhwm) queryLocalInterface : new dhwk(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.usonia.directory.internal.IDirectoryStateCallback");
            dhwgVar = queryLocalInterface2 instanceof dhwg ? (dhwg) queryLocalInterface2 : new dhwe(iBinder2);
        }
        this.a = dhwkVar;
        this.b = str;
        this.c = dhwgVar;
    }
}
