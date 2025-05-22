package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clie;
import defpackage.clig;
import defpackage.clih;
import defpackage.clij;
import defpackage.cllo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ProviderAuthenticateAsResponderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllo();
    public clig a;
    public byte[] b;
    public clij c;

    public ProviderAuthenticateAsResponderParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderAuthenticateAsResponderParams) {
            ProviderAuthenticateAsResponderParams providerAuthenticateAsResponderParams = (ProviderAuthenticateAsResponderParams) obj;
            if (atyq.b(this.a, providerAuthenticateAsResponderParams.a) && Arrays.equals(this.b, providerAuthenticateAsResponderParams.b) && atyq.b(this.c, providerAuthenticateAsResponderParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.i(parcel, 2, this.b, false);
        atzr.D(parcel, 3, this.c.asBinder());
        atzr.c(parcel, a);
    }

    public ProviderAuthenticateAsResponderParams(IBinder iBinder, byte[] bArr, IBinder iBinder2) {
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
        this.b = bArr;
        this.c = clijVar;
    }
}
