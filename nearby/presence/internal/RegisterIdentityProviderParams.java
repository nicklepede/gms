package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmzy;
import defpackage.cnaa;
import defpackage.cnbv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RegisterIdentityProviderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnbv();
    public atee a;
    public cnaa b;

    public RegisterIdentityProviderParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterIdentityProviderParams) {
            RegisterIdentityProviderParams registerIdentityProviderParams = (RegisterIdentityProviderParams) obj;
            if (atyq.b(this.a, registerIdentityProviderParams.a) && atyq.b(this.b, registerIdentityProviderParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atee ateeVar = this.a;
        atzr.D(parcel, 1, ateeVar == null ? null : ateeVar.asBinder());
        cnaa cnaaVar = this.b;
        atzr.D(parcel, 2, cnaaVar != null ? cnaaVar.asBinder() : null);
        atzr.c(parcel, a);
    }

    public RegisterIdentityProviderParams(IBinder iBinder, IBinder iBinder2) {
        atee atecVar;
        cnaa cnaaVar = null;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IExternalIdentityProvider");
            cnaaVar = queryLocalInterface2 instanceof cnaa ? (cnaa) queryLocalInterface2 : new cmzy(iBinder2);
        }
        this.a = atecVar;
        this.b = cnaaVar;
    }
}
