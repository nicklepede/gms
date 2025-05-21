package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjar;
import defpackage.cjat;
import defpackage.cjdn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class RegisterDeviceProviderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdn();
    public cjat a;

    public RegisterDeviceProviderParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterDeviceProviderParams) {
            return arwb.b(this.a, ((RegisterDeviceProviderParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        cjat cjatVar = this.a;
        arxc.D(parcel, 1, cjatVar == null ? null : cjatVar.asBinder());
        arxc.c(parcel, a);
    }

    public RegisterDeviceProviderParams(IBinder iBinder) {
        cjat cjarVar;
        if (iBinder == null) {
            cjarVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDeviceProvider");
            cjarVar = queryLocalInterface instanceof cjat ? (cjat) queryLocalInterface : new cjar(iBinder);
        }
        this.a = cjarVar;
    }
}
