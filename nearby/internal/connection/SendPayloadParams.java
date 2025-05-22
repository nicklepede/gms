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
import defpackage.cllx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SendPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllx();
    public clju a;
    public String[] b;
    public ParcelablePayload c;
    public boolean d;
    public int e;
    public PresenceDevice f;
    public ConnectionsDevice g;
    public DctDevice h;

    public SendPayloadParams() {
        this.e = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendPayloadParams) {
            SendPayloadParams sendPayloadParams = (SendPayloadParams) obj;
            if (atyq.b(this.a, sendPayloadParams.a) && Arrays.equals(this.b, sendPayloadParams.b) && atyq.b(this.c, sendPayloadParams.c) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(sendPayloadParams.d)) && atyq.b(Integer.valueOf(this.e), Integer.valueOf(sendPayloadParams.e)) && atyq.b(this.f, sendPayloadParams.f) && atyq.b(this.g, sendPayloadParams.g) && atyq.b(this.h, sendPayloadParams.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), this.f, this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        atzr.w(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.e(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.c(parcel, a);
    }

    public SendPayloadParams(IBinder iBinder, String[] strArr, ParcelablePayload parcelablePayload, boolean z, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        clju cljsVar;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        this.a = cljsVar;
        this.b = strArr;
        this.c = parcelablePayload;
        this.d = z;
        this.e = i;
        this.f = presenceDevice;
        this.g = connectionsDevice;
        this.h = dctDevice;
    }
}
