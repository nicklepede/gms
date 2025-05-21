package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cksf;
import defpackage.cktr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class RetrieveDeviceMetadataParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cktr();
    public String a;
    public PresenceDevice b;
    public cksf c;

    private RetrieveDeviceMetadataParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RetrieveDeviceMetadataParams) {
            RetrieveDeviceMetadataParams retrieveDeviceMetadataParams = (RetrieveDeviceMetadataParams) obj;
            if (arwb.b(this.c, retrieveDeviceMetadataParams.c) && arwb.b(this.a, retrieveDeviceMetadataParams.a) && arwb.b(this.b, retrieveDeviceMetadataParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.c.a);
        arxc.v(parcel, 2, this.a, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.c(parcel, a);
    }

    public RetrieveDeviceMetadataParams(IBinder iBinder, String str, PresenceDevice presenceDevice) {
        cksf cksfVar;
        if (iBinder == null) {
            cksfVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IRetrieveDeviceMetadataCallback");
            cksfVar = queryLocalInterface instanceof cksf ? (cksf) queryLocalInterface : new cksf(iBinder);
        }
        this.c = cksfVar;
        this.a = str;
        this.b = presenceDevice;
    }
}
