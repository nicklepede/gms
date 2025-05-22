package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cljs;
import defpackage.clju;
import defpackage.cllt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class RejectConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllt();
    public clju a;
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
            if (atyq.b(this.a, rejectConnectionRequestParams.a) && atyq.b(this.b, rejectConnectionRequestParams.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(rejectConnectionRequestParams.c)) && atyq.b(this.d, rejectConnectionRequestParams.d) && atyq.b(this.e, rejectConnectionRequestParams.e) && atyq.b(this.f, rejectConnectionRequestParams.f)) {
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
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.c(parcel, a);
    }

    public RejectConnectionRequestParams(IBinder iBinder, String str, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        clju cljsVar;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        this.a = cljsVar;
        this.b = str;
        this.c = i;
        this.d = presenceDevice;
        this.e = connectionsDevice;
        this.f = dctDevice;
    }
}
