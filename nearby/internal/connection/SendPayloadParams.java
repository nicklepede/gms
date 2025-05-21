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
import defpackage.cjds;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SendPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjds();
    public cjbp a;
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
            if (arwb.b(this.a, sendPayloadParams.a) && Arrays.equals(this.b, sendPayloadParams.b) && arwb.b(this.c, sendPayloadParams.c) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(sendPayloadParams.d)) && arwb.b(Integer.valueOf(this.e), Integer.valueOf(sendPayloadParams.e)) && arwb.b(this.f, sendPayloadParams.f) && arwb.b(this.g, sendPayloadParams.g) && arwb.b(this.h, sendPayloadParams.h)) {
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
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        arxc.w(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.e(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.c(parcel, a);
    }

    public SendPayloadParams(IBinder iBinder, String[] strArr, ParcelablePayload parcelablePayload, boolean z, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        cjbp cjbnVar;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        this.a = cjbnVar;
        this.b = strArr;
        this.c = parcelablePayload;
        this.d = z;
        this.e = i;
        this.f = presenceDevice;
        this.g = connectionsDevice;
        this.h = dctDevice;
    }
}
