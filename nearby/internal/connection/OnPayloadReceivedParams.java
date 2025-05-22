package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clkt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OnPayloadReceivedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clkt();
    public String a;
    public ParcelablePayload b;
    public boolean c;
    public int d;
    public PresenceDevice e;
    public ConnectionsDevice f;
    public DctDevice g;

    public OnPayloadReceivedParams() {
        this.d = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnPayloadReceivedParams) {
            OnPayloadReceivedParams onPayloadReceivedParams = (OnPayloadReceivedParams) obj;
            if (atyq.b(this.a, onPayloadReceivedParams.a) && atyq.b(this.b, onPayloadReceivedParams.b) && atyq.b(Boolean.valueOf(this.c), Boolean.valueOf(onPayloadReceivedParams.c)) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(onPayloadReceivedParams.d)) && atyq.b(this.e, onPayloadReceivedParams.e) && atyq.b(this.f, onPayloadReceivedParams.f) && atyq.b(this.g, onPayloadReceivedParams.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.e(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.c(parcel, a);
    }

    public OnPayloadReceivedParams(String str, ParcelablePayload parcelablePayload, boolean z, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        this.a = str;
        this.b = parcelablePayload;
        this.c = z;
        this.d = i;
        this.e = presenceDevice;
        this.f = connectionsDevice;
        this.g = dctDevice;
    }
}
