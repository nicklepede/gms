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
import defpackage.clcz;
import defpackage.clin;
import defpackage.clip;
import defpackage.cljp;
import defpackage.cljr;
import defpackage.cljs;
import defpackage.clju;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class AcceptConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clcz();
    public clju a;
    public clip b;
    public String c;
    public byte[] d;
    public cljr e;
    public int f;
    public PresenceDevice g;
    public ConnectionsDevice h;
    public DctDevice i;

    public AcceptConnectionRequestParams() {
        this.f = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AcceptConnectionRequestParams) {
            AcceptConnectionRequestParams acceptConnectionRequestParams = (AcceptConnectionRequestParams) obj;
            if (atyq.b(this.a, acceptConnectionRequestParams.a) && atyq.b(this.b, acceptConnectionRequestParams.b) && atyq.b(this.c, acceptConnectionRequestParams.c) && Arrays.equals(this.d, acceptConnectionRequestParams.d) && atyq.b(this.e, acceptConnectionRequestParams.e) && atyq.b(Integer.valueOf(this.f), Integer.valueOf(acceptConnectionRequestParams.f)) && atyq.b(this.g, acceptConnectionRequestParams.g) && atyq.b(this.h, acceptConnectionRequestParams.h) && atyq.b(this.i, acceptConnectionRequestParams.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e, Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        clip clipVar = this.b;
        atzr.D(parcel, 2, clipVar == null ? null : clipVar.asBinder());
        atzr.v(parcel, 3, this.c, false);
        atzr.i(parcel, 4, this.d, false);
        cljr cljrVar = this.e;
        atzr.D(parcel, 5, cljrVar != null ? cljrVar.asBinder() : null);
        atzr.o(parcel, 6, this.f);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.c(parcel, a);
    }

    public AcceptConnectionRequestParams(IBinder iBinder, IBinder iBinder2, String str, byte[] bArr, IBinder iBinder3, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        clju cljsVar;
        clip clinVar;
        cljr cljrVar = null;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        if (iBinder2 == null) {
            clinVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            clinVar = queryLocalInterface2 instanceof clip ? (clip) queryLocalInterface2 : new clin(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IPayloadListener");
            cljrVar = queryLocalInterface3 instanceof cljr ? (cljr) queryLocalInterface3 : new cljp(iBinder3);
        }
        this.a = cljsVar;
        this.b = clinVar;
        this.c = str;
        this.d = bArr;
        this.e = cljrVar;
        this.f = i;
        this.g = presenceDevice;
        this.h = connectionsDevice;
        this.i = dctDevice;
    }
}
