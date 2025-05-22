package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpes;
import defpackage.cpeu;
import defpackage.cpjm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RegisterInstallCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpjm();
    public cpeu a;
    public int b;
    public atee c;

    public RegisterInstallCallbackParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterInstallCallbackParams) {
            RegisterInstallCallbackParams registerInstallCallbackParams = (RegisterInstallCallbackParams) obj;
            if (atyq.b(this.a, registerInstallCallbackParams.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(registerInstallCallbackParams.b)) && atyq.b(this.c, registerInstallCallbackParams.c)) {
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
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.o(parcel, 2, this.b);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.c(parcel, a);
    }

    public RegisterInstallCallbackParams(IBinder iBinder, int i, IBinder iBinder2) {
        cpeu cpesVar;
        atee ateeVar = null;
        if (iBinder == null) {
            cpesVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IInstallUpdateCallback");
            cpesVar = queryLocalInterface instanceof cpeu ? (cpeu) queryLocalInterface : new cpes(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface2 instanceof atee ? (atee) queryLocalInterface2 : new atec(iBinder2);
        }
        this.a = cpesVar;
        this.b = i;
        this.c = ateeVar;
    }
}
