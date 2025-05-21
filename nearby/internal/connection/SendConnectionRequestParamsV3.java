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
import defpackage.cjal;
import defpackage.cjan;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjdr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SendConnectionRequestParamsV3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdr();
    public cjbp a;
    public cjan b;
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
            if (arwb.b(this.a, sendConnectionRequestParamsV3.a) && arwb.b(this.b, sendConnectionRequestParamsV3.b) && arwb.b(this.c, sendConnectionRequestParamsV3.c) && arwb.b(this.d, sendConnectionRequestParamsV3.d) && arwb.b(Integer.valueOf(this.e), Integer.valueOf(sendConnectionRequestParamsV3.e)) && arwb.b(this.f, sendConnectionRequestParamsV3.f) && arwb.b(this.g, sendConnectionRequestParamsV3.g) && arwb.b(this.h, sendConnectionRequestParamsV3.h) && arwb.b(this.i, sendConnectionRequestParamsV3.i)) {
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
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        cjan cjanVar = this.b;
        arxc.D(parcel, 2, cjanVar != null ? cjanVar.asBinder() : null);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.o(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.v(parcel, 8, this.i, false);
        arxc.t(parcel, 9, this.h, i, false);
        arxc.c(parcel, a);
    }

    public SendConnectionRequestParamsV3(IBinder iBinder, IBinder iBinder2, com.google.android.gms.nearby.connection.v3.ConnectionOptions connectionOptions, ConnectionsDevice connectionsDevice, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice2, DctDevice dctDevice, String str) {
        cjbp cjbnVar;
        cjan cjanVar = null;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            cjanVar = queryLocalInterface2 instanceof cjan ? (cjan) queryLocalInterface2 : new cjal(iBinder2);
        }
        this.a = cjbnVar;
        this.b = cjanVar;
        this.c = connectionOptions;
        this.d = connectionsDevice;
        this.e = i;
        this.f = presenceDevice;
        this.g = connectionsDevice2;
        this.h = dctDevice;
        this.i = str;
    }
}
