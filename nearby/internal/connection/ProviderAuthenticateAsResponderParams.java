package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cizz;
import defpackage.cjab;
import defpackage.cjac;
import defpackage.cjae;
import defpackage.cjdj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ProviderAuthenticateAsResponderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdj();
    public cjab a;
    public byte[] b;
    public cjae c;

    public ProviderAuthenticateAsResponderParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderAuthenticateAsResponderParams) {
            ProviderAuthenticateAsResponderParams providerAuthenticateAsResponderParams = (ProviderAuthenticateAsResponderParams) obj;
            if (arwb.b(this.a, providerAuthenticateAsResponderParams.a) && Arrays.equals(this.b, providerAuthenticateAsResponderParams.b) && arwb.b(this.c, providerAuthenticateAsResponderParams.c)) {
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
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.i(parcel, 2, this.b, false);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.c(parcel, a);
    }

    public ProviderAuthenticateAsResponderParams(IBinder iBinder, byte[] bArr, IBinder iBinder2) {
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
        this.b = bArr;
        this.c = cjaeVar;
    }
}
