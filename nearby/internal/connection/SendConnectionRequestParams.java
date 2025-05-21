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
import defpackage.cjai;
import defpackage.cjak;
import defpackage.cjal;
import defpackage.cjan;
import defpackage.cjao;
import defpackage.cjaq;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjdq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class SendConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdq();
    public cjbp a;
    public cjak b;
    public cjaq c;
    public String d;
    public String e;
    public byte[] f;
    public cjan g;
    public byte[] h;
    public ConnectionOptions i;
    public int j;
    public PresenceDevice k;
    public ConnectionsDevice l;
    public DctDevice m;
    public byte[] n;
    public String o;

    public SendConnectionRequestParams() {
        this.j = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendConnectionRequestParams) {
            SendConnectionRequestParams sendConnectionRequestParams = (SendConnectionRequestParams) obj;
            if (arwb.b(this.a, sendConnectionRequestParams.a) && arwb.b(this.b, sendConnectionRequestParams.b) && arwb.b(this.c, sendConnectionRequestParams.c) && arwb.b(this.d, sendConnectionRequestParams.d) && arwb.b(this.e, sendConnectionRequestParams.e) && Arrays.equals(this.f, sendConnectionRequestParams.f) && arwb.b(this.g, sendConnectionRequestParams.g) && Arrays.equals(this.h, sendConnectionRequestParams.h) && arwb.b(this.i, sendConnectionRequestParams.i) && arwb.b(Integer.valueOf(this.j), Integer.valueOf(sendConnectionRequestParams.j)) && arwb.b(this.k, sendConnectionRequestParams.k) && arwb.b(this.l, sendConnectionRequestParams.l) && arwb.b(this.m, sendConnectionRequestParams.m) && Arrays.equals(this.n, sendConnectionRequestParams.n) && arwb.b(this.o, sendConnectionRequestParams.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, Integer.valueOf(Arrays.hashCode(this.f)), this.g, Integer.valueOf(Arrays.hashCode(this.h)), this.i, Integer.valueOf(this.j), this.k, this.l, this.m, Integer.valueOf(Arrays.hashCode(this.n)), this.o});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        cjak cjakVar = this.b;
        arxc.D(parcel, 2, cjakVar == null ? null : cjakVar.asBinder());
        cjaq cjaqVar = this.c;
        arxc.D(parcel, 3, cjaqVar == null ? null : cjaqVar.asBinder());
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.i(parcel, 6, this.f, false);
        cjan cjanVar = this.g;
        arxc.D(parcel, 7, cjanVar != null ? cjanVar.asBinder() : null);
        arxc.i(parcel, 8, this.h, false);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.o(parcel, 10, this.j);
        arxc.t(parcel, 11, this.k, i, false);
        arxc.i(parcel, 12, this.n, false);
        arxc.v(parcel, 13, this.o, false);
        arxc.t(parcel, 14, this.l, i, false);
        arxc.t(parcel, 15, this.m, i, false);
        arxc.c(parcel, a);
    }

    public SendConnectionRequestParams(IBinder iBinder, IBinder iBinder2, IBinder iBinder3, String str, String str2, byte[] bArr, IBinder iBinder4, byte[] bArr2, ConnectionOptions connectionOptions, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice, byte[] bArr3, String str3) {
        cjbp cjbnVar;
        cjak cjaiVar;
        cjaq cjaoVar;
        cjan cjanVar = null;
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
        if (iBinder3 == null) {
            cjaoVar = null;
        } else {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            cjaoVar = queryLocalInterface3 instanceof cjaq ? (cjaq) queryLocalInterface3 : new cjao(iBinder3);
        }
        if (iBinder4 != null) {
            IInterface queryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            cjanVar = queryLocalInterface4 instanceof cjan ? (cjan) queryLocalInterface4 : new cjal(iBinder4);
        }
        this.a = cjbnVar;
        this.b = cjaiVar;
        this.c = cjaoVar;
        this.d = str;
        this.e = str2;
        this.f = bArr;
        this.g = cjanVar;
        this.h = bArr2;
        this.i = connectionOptions;
        this.j = i;
        this.k = presenceDevice;
        this.l = connectionsDevice;
        this.m = dctDevice;
        this.n = bArr3;
        this.o = str3;
    }
}
