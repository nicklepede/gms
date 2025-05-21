package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjco;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OnPayloadReceivedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjco();
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
            if (arwb.b(this.a, onPayloadReceivedParams.a) && arwb.b(this.b, onPayloadReceivedParams.b) && arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(onPayloadReceivedParams.c)) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(onPayloadReceivedParams.d)) && arwb.b(this.e, onPayloadReceivedParams.e) && arwb.b(this.f, onPayloadReceivedParams.f) && arwb.b(this.g, onPayloadReceivedParams.g)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.e(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.c(parcel, a);
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
