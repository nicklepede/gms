package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ckrt;
import defpackage.ckrv;
import defpackage.cktq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class RegisterIdentityProviderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cktq();
    public arbp a;
    public ckrv b;

    public RegisterIdentityProviderParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterIdentityProviderParams) {
            RegisterIdentityProviderParams registerIdentityProviderParams = (RegisterIdentityProviderParams) obj;
            if (arwb.b(this.a, registerIdentityProviderParams.a) && arwb.b(this.b, registerIdentityProviderParams.b)) {
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
        int a = arxc.a(parcel);
        arbp arbpVar = this.a;
        arxc.D(parcel, 1, arbpVar == null ? null : arbpVar.asBinder());
        ckrv ckrvVar = this.b;
        arxc.D(parcel, 2, ckrvVar != null ? ckrvVar.asBinder() : null);
        arxc.c(parcel, a);
    }

    public RegisterIdentityProviderParams(IBinder iBinder, IBinder iBinder2) {
        arbp arbnVar;
        ckrv ckrvVar = null;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IExternalIdentityProvider");
            ckrvVar = queryLocalInterface2 instanceof ckrv ? (ckrv) queryLocalInterface2 : new ckrt(iBinder2);
        }
        this.a = arbnVar;
        this.b = ckrvVar;
    }
}
