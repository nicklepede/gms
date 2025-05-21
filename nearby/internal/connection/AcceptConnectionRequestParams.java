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
import defpackage.ciuu;
import defpackage.cjai;
import defpackage.cjak;
import defpackage.cjbk;
import defpackage.cjbm;
import defpackage.cjbn;
import defpackage.cjbp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class AcceptConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ciuu();
    public cjbp a;
    public cjak b;
    public String c;
    public byte[] d;
    public cjbm e;
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
            if (arwb.b(this.a, acceptConnectionRequestParams.a) && arwb.b(this.b, acceptConnectionRequestParams.b) && arwb.b(this.c, acceptConnectionRequestParams.c) && Arrays.equals(this.d, acceptConnectionRequestParams.d) && arwb.b(this.e, acceptConnectionRequestParams.e) && arwb.b(Integer.valueOf(this.f), Integer.valueOf(acceptConnectionRequestParams.f)) && arwb.b(this.g, acceptConnectionRequestParams.g) && arwb.b(this.h, acceptConnectionRequestParams.h) && arwb.b(this.i, acceptConnectionRequestParams.i)) {
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
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        cjak cjakVar = this.b;
        arxc.D(parcel, 2, cjakVar == null ? null : cjakVar.asBinder());
        arxc.v(parcel, 3, this.c, false);
        arxc.i(parcel, 4, this.d, false);
        cjbm cjbmVar = this.e;
        arxc.D(parcel, 5, cjbmVar != null ? cjbmVar.asBinder() : null);
        arxc.o(parcel, 6, this.f);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.c(parcel, a);
    }

    public AcceptConnectionRequestParams(IBinder iBinder, IBinder iBinder2, String str, byte[] bArr, IBinder iBinder3, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice) {
        cjbp cjbnVar;
        cjak cjaiVar;
        cjbm cjbmVar = null;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        if (iBinder2 == null) {
            cjaiVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            cjaiVar = queryLocalInterface2 instanceof cjak ? (cjak) queryLocalInterface2 : new cjai(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IPayloadListener");
            cjbmVar = queryLocalInterface3 instanceof cjbm ? (cjbm) queryLocalInterface3 : new cjbk(iBinder3);
        }
        this.a = cjbnVar;
        this.b = cjaiVar;
        this.c = str;
        this.d = bArr;
        this.e = cjbmVar;
        this.f = i;
        this.g = presenceDevice;
        this.h = connectionsDevice;
        this.i = dctDevice;
    }
}
