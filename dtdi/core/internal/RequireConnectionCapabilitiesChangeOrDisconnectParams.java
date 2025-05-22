package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.ConnectionCapabilities;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bbao;
import defpackage.bbaz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RequireConnectionCapabilitiesChangeOrDisconnectParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbaz();
    public TokenWrapper a;
    public ConnectionCapabilities b;
    public atee c;
    public bbao d;

    private RequireConnectionCapabilitiesChangeOrDisconnectParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequireConnectionCapabilitiesChangeOrDisconnectParams) {
            RequireConnectionCapabilitiesChangeOrDisconnectParams requireConnectionCapabilitiesChangeOrDisconnectParams = (RequireConnectionCapabilitiesChangeOrDisconnectParams) obj;
            if (atyq.b(this.a, requireConnectionCapabilitiesChangeOrDisconnectParams.a) && atyq.b(this.b, requireConnectionCapabilitiesChangeOrDisconnectParams.b) && atyq.b(this.d, requireConnectionCapabilitiesChangeOrDisconnectParams.d) && atyq.b(this.c, requireConnectionCapabilitiesChangeOrDisconnectParams.c)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        bbao bbaoVar = this.d;
        atzr.D(parcel, 3, bbaoVar == null ? null : bbaoVar.a);
        atee ateeVar = this.c;
        atzr.D(parcel, 4, ateeVar != null ? ateeVar.asBinder() : null);
        atzr.c(parcel, a);
    }

    public RequireConnectionCapabilitiesChangeOrDisconnectParams(TokenWrapper tokenWrapper, ConnectionCapabilities connectionCapabilities, IBinder iBinder, IBinder iBinder2) {
        bbao bbaoVar;
        atee ateeVar = null;
        if (iBinder == null) {
            bbaoVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnConnectionCapabilitiesChangedListener");
            bbaoVar = queryLocalInterface instanceof bbao ? (bbao) queryLocalInterface : new bbao(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface2 instanceof atee ? (atee) queryLocalInterface2 : new atec(iBinder2);
        }
        this.a = tokenWrapper;
        this.b = connectionCapabilities;
        this.d = bbaoVar;
        this.c = ateeVar;
    }
}
