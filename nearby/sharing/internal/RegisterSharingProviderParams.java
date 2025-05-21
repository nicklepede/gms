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
import defpackage.cmwj;
import defpackage.cnbh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class RegisterSharingProviderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnbh();
    public arbp a;
    public cmwj b;

    private RegisterSharingProviderParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterSharingProviderParams) {
            RegisterSharingProviderParams registerSharingProviderParams = (RegisterSharingProviderParams) obj;
            if (arwb.b(this.b, registerSharingProviderParams.b) && arwb.b(this.a, registerSharingProviderParams.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.b.a);
        arxc.D(parcel, 2, this.a.asBinder());
        arxc.c(parcel, a);
    }

    public RegisterSharingProviderParams(IBinder iBinder, IBinder iBinder2) {
        cmwj cmwjVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            cmwjVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IExternalSharingProvider");
            cmwjVar = queryLocalInterface instanceof cmwj ? (cmwj) queryLocalInterface : new cmwj(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface2 instanceof arbp ? (arbp) queryLocalInterface2 : new arbn(iBinder2);
        }
        this.b = cmwjVar;
        this.a = arbpVar;
    }
}
