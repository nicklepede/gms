package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clie;
import defpackage.clig;
import defpackage.clih;
import defpackage.clij;
import defpackage.clln;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ProviderAuthenticateAsInitiatorParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clln();
    public clig a;
    public PresenceDevice b;
    public ConnectionsDevice c;
    public byte[] d;
    public clij e;

    public ProviderAuthenticateAsInitiatorParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderAuthenticateAsInitiatorParams) {
            ProviderAuthenticateAsInitiatorParams providerAuthenticateAsInitiatorParams = (ProviderAuthenticateAsInitiatorParams) obj;
            if (atyq.b(this.a, providerAuthenticateAsInitiatorParams.a) && atyq.b(this.b, providerAuthenticateAsInitiatorParams.b) && atyq.b(this.c, providerAuthenticateAsInitiatorParams.c) && Arrays.equals(this.d, providerAuthenticateAsInitiatorParams.d) && atyq.b(this.e, providerAuthenticateAsInitiatorParams.e)) {
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
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.i(parcel, 4, this.d, false);
        atzr.D(parcel, 5, this.e.asBinder());
        atzr.c(parcel, a);
    }

    public ProviderAuthenticateAsInitiatorParams(IBinder iBinder, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, byte[] bArr, IBinder iBinder2) {
        clig clieVar;
        clij clijVar = null;
        if (iBinder == null) {
            clieVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAuthenticationStatusResultListener");
            clieVar = queryLocalInterface instanceof clig ? (clig) queryLocalInterface : new clie(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAuthenticationTransport");
            clijVar = queryLocalInterface2 instanceof clij ? (clij) queryLocalInterface2 : new clih(iBinder2);
        }
        this.a = clieVar;
        this.b = presenceDevice;
        this.c = connectionsDevice;
        this.d = bArr;
        this.e = clijVar;
    }
}
