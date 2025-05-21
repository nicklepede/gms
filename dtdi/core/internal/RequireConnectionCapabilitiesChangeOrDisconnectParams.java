package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.ConnectionCapabilities;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.aywu;
import defpackage.ayxf;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RequireConnectionCapabilitiesChangeOrDisconnectParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxf();
    public TokenWrapper a;
    public ConnectionCapabilities b;
    public arbp c;
    public aywu d;

    private RequireConnectionCapabilitiesChangeOrDisconnectParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequireConnectionCapabilitiesChangeOrDisconnectParams) {
            RequireConnectionCapabilitiesChangeOrDisconnectParams requireConnectionCapabilitiesChangeOrDisconnectParams = (RequireConnectionCapabilitiesChangeOrDisconnectParams) obj;
            if (arwb.b(this.a, requireConnectionCapabilitiesChangeOrDisconnectParams.a) && arwb.b(this.b, requireConnectionCapabilitiesChangeOrDisconnectParams.b) && arwb.b(this.d, requireConnectionCapabilitiesChangeOrDisconnectParams.d) && arwb.b(this.c, requireConnectionCapabilitiesChangeOrDisconnectParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        aywu aywuVar = this.d;
        arxc.D(parcel, 3, aywuVar == null ? null : aywuVar.a);
        arbp arbpVar = this.c;
        arxc.D(parcel, 4, arbpVar != null ? arbpVar.asBinder() : null);
        arxc.c(parcel, a);
    }

    public RequireConnectionCapabilitiesChangeOrDisconnectParams(TokenWrapper tokenWrapper, ConnectionCapabilities connectionCapabilities, IBinder iBinder, IBinder iBinder2) {
        aywu aywuVar;
        arbp arbpVar = null;
        if (iBinder == null) {
            aywuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnConnectionCapabilitiesChangedListener");
            aywuVar = queryLocalInterface instanceof aywu ? (aywu) queryLocalInterface : new aywu(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbpVar = queryLocalInterface2 instanceof arbp ? (arbp) queryLocalInterface2 : new arbn(iBinder2);
        }
        this.a = tokenWrapper;
        this.b = connectionCapabilities;
        this.d = aywuVar;
        this.c = arbpVar;
    }
}
