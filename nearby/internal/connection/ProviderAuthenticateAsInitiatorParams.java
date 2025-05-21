package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cizz;
import defpackage.cjab;
import defpackage.cjac;
import defpackage.cjae;
import defpackage.cjdi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ProviderAuthenticateAsInitiatorParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdi();
    public cjab a;
    public PresenceDevice b;
    public ConnectionsDevice c;
    public byte[] d;
    public cjae e;

    public ProviderAuthenticateAsInitiatorParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderAuthenticateAsInitiatorParams) {
            ProviderAuthenticateAsInitiatorParams providerAuthenticateAsInitiatorParams = (ProviderAuthenticateAsInitiatorParams) obj;
            if (arwb.b(this.a, providerAuthenticateAsInitiatorParams.a) && arwb.b(this.b, providerAuthenticateAsInitiatorParams.b) && arwb.b(this.c, providerAuthenticateAsInitiatorParams.c) && Arrays.equals(this.d, providerAuthenticateAsInitiatorParams.d) && arwb.b(this.e, providerAuthenticateAsInitiatorParams.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.D(parcel, 5, this.e.asBinder());
        arxc.c(parcel, a);
    }

    public ProviderAuthenticateAsInitiatorParams(IBinder iBinder, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, byte[] bArr, IBinder iBinder2) {
        cjab cizzVar;
        cjae cjaeVar = null;
        if (iBinder == null) {
            cizzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAuthenticationStatusResultListener");
            cizzVar = queryLocalInterface instanceof cjab ? (cjab) queryLocalInterface : new cizz(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAuthenticationTransport");
            cjaeVar = queryLocalInterface2 instanceof cjae ? (cjae) queryLocalInterface2 : new cjac(iBinder2);
        }
        this.a = cizzVar;
        this.b = presenceDevice;
        this.c = connectionsDevice;
        this.d = bArr;
        this.e = cjaeVar;
    }
}
