package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjcp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnPayloadTransferUpdateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjcp();
    public String a;
    public PayloadTransferUpdate b;
    public int c;
    public PresenceDevice d;
    public ConnectionsDevice e;
    public DctDevice f;

    public OnPayloadTransferUpdateParams() {
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnPayloadTransferUpdateParams) {
            OnPayloadTransferUpdateParams onPayloadTransferUpdateParams = (OnPayloadTransferUpdateParams) obj;
            if (arwb.b(this.a, onPayloadTransferUpdateParams.a) && arwb.b(this.b, onPayloadTransferUpdateParams.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(onPayloadTransferUpdateParams.c)) && arwb.b(this.d, onPayloadTransferUpdateParams.d) && arwb.b(this.e, onPayloadTransferUpdateParams.e) && arwb.b(this.f, onPayloadTransferUpdateParams.f)) {
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
        arxc.v(parcel, 1, this.a, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.o(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }

    public OnPayloadTransferUpdateParams(String str, PayloadTransferUpdate payloadTransferUpdate, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        this.a = str;
        this.b = payloadTransferUpdate;
        this.c = i;
        this.d = presenceDevice;
        this.e = connectionsDevice;
        this.f = dctDevice;
    }
}
