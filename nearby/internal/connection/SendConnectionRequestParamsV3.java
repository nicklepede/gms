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
import defpackage.cliq;
import defpackage.clis;
import defpackage.cljs;
import defpackage.clju;
import defpackage.cllw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SendConnectionRequestParamsV3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllw();
    public clju a;
    public clis b;
    public com.google.android.gms.nearby.connection.v3.ConnectionOptions c;
    public ConnectionsDevice d;
    public final int e;
    public PresenceDevice f;
    public ConnectionsDevice g;
    public DctDevice h;
    public String i;

    private SendConnectionRequestParamsV3() {
        this.e = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendConnectionRequestParamsV3) {
            SendConnectionRequestParamsV3 sendConnectionRequestParamsV3 = (SendConnectionRequestParamsV3) obj;
            if (atyq.b(this.a, sendConnectionRequestParamsV3.a) && atyq.b(this.b, sendConnectionRequestParamsV3.b) && atyq.b(this.c, sendConnectionRequestParamsV3.c) && atyq.b(this.d, sendConnectionRequestParamsV3.d) && atyq.b(Integer.valueOf(this.e), Integer.valueOf(sendConnectionRequestParamsV3.e)) && atyq.b(this.f, sendConnectionRequestParamsV3.f) && atyq.b(this.g, sendConnectionRequestParamsV3.g) && atyq.b(this.h, sendConnectionRequestParamsV3.h) && atyq.b(this.i, sendConnectionRequestParamsV3.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(this.e), this.f, this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        clis clisVar = this.b;
        atzr.D(parcel, 2, clisVar != null ? clisVar.asBinder() : null);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.o(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.v(parcel, 8, this.i, false);
        atzr.t(parcel, 9, this.h, i, false);
        atzr.c(parcel, a);
    }

    public SendConnectionRequestParamsV3(IBinder iBinder, IBinder iBinder2, com.google.android.gms.nearby.connection.v3.ConnectionOptions connectionOptions, ConnectionsDevice connectionsDevice, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice2, DctDevice dctDevice, String str) {
        clju cljsVar;
        clis clisVar = null;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            clisVar = queryLocalInterface2 instanceof clis ? (clis) queryLocalInterface2 : new cliq(iBinder2);
        }
        this.a = cljsVar;
        this.b = clisVar;
        this.c = connectionOptions;
        this.d = connectionsDevice;
        this.e = i;
        this.f = presenceDevice;
        this.g = connectionsDevice2;
        this.h = dctDevice;
        this.i = str;
    }
}
