package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjdo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class RejectConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdo();
    public cjbp a;
    public String b;
    public final int c;
    public PresenceDevice d;
    public ConnectionsDevice e;
    public DctDevice f;

    public RejectConnectionRequestParams() {
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RejectConnectionRequestParams) {
            RejectConnectionRequestParams rejectConnectionRequestParams = (RejectConnectionRequestParams) obj;
            if (arwb.b(this.a, rejectConnectionRequestParams.a) && arwb.b(this.b, rejectConnectionRequestParams.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(rejectConnectionRequestParams.c)) && arwb.b(this.d, rejectConnectionRequestParams.d) && arwb.b(this.e, rejectConnectionRequestParams.e) && arwb.b(this.f, rejectConnectionRequestParams.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }

    public RejectConnectionRequestParams(IBinder iBinder, String str, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        cjbp cjbnVar;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        this.a = cjbnVar;
        this.b = str;
        this.c = i;
        this.d = presenceDevice;
        this.e = connectionsDevice;
        this.f = dctDevice;
    }
}
