package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cnak;
import defpackage.cnbw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RetrieveDeviceMetadataParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnbw();
    public String a;
    public PresenceDevice b;
    public cnak c;

    private RetrieveDeviceMetadataParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RetrieveDeviceMetadataParams) {
            RetrieveDeviceMetadataParams retrieveDeviceMetadataParams = (RetrieveDeviceMetadataParams) obj;
            if (atyq.b(this.c, retrieveDeviceMetadataParams.c) && atyq.b(this.a, retrieveDeviceMetadataParams.a) && atyq.b(this.b, retrieveDeviceMetadataParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.c.a);
        atzr.v(parcel, 2, this.a, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.c(parcel, a);
    }

    public RetrieveDeviceMetadataParams(IBinder iBinder, String str, PresenceDevice presenceDevice) {
        cnak cnakVar;
        if (iBinder == null) {
            cnakVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IRetrieveDeviceMetadataCallback");
            cnakVar = queryLocalInterface instanceof cnak ? (cnak) queryLocalInterface : new cnak(iBinder);
        }
        this.c = cnakVar;
        this.a = str;
        this.b = presenceDevice;
    }
}
