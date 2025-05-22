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
import defpackage.clin;
import defpackage.clip;
import defpackage.cliq;
import defpackage.clis;
import defpackage.clit;
import defpackage.cliv;
import defpackage.cljs;
import defpackage.clju;
import defpackage.cllv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SendConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllv();
    public clju a;
    public clip b;
    public cliv c;
    public String d;
    public String e;
    public byte[] f;
    public clis g;
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
            if (atyq.b(this.a, sendConnectionRequestParams.a) && atyq.b(this.b, sendConnectionRequestParams.b) && atyq.b(this.c, sendConnectionRequestParams.c) && atyq.b(this.d, sendConnectionRequestParams.d) && atyq.b(this.e, sendConnectionRequestParams.e) && Arrays.equals(this.f, sendConnectionRequestParams.f) && atyq.b(this.g, sendConnectionRequestParams.g) && Arrays.equals(this.h, sendConnectionRequestParams.h) && atyq.b(this.i, sendConnectionRequestParams.i) && atyq.b(Integer.valueOf(this.j), Integer.valueOf(sendConnectionRequestParams.j)) && atyq.b(this.k, sendConnectionRequestParams.k) && atyq.b(this.l, sendConnectionRequestParams.l) && atyq.b(this.m, sendConnectionRequestParams.m) && Arrays.equals(this.n, sendConnectionRequestParams.n) && atyq.b(this.o, sendConnectionRequestParams.o)) {
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
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        clip clipVar = this.b;
        atzr.D(parcel, 2, clipVar == null ? null : clipVar.asBinder());
        cliv clivVar = this.c;
        atzr.D(parcel, 3, clivVar == null ? null : clivVar.asBinder());
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.i(parcel, 6, this.f, false);
        clis clisVar = this.g;
        atzr.D(parcel, 7, clisVar != null ? clisVar.asBinder() : null);
        atzr.i(parcel, 8, this.h, false);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.o(parcel, 10, this.j);
        atzr.t(parcel, 11, this.k, i, false);
        atzr.i(parcel, 12, this.n, false);
        atzr.v(parcel, 13, this.o, false);
        atzr.t(parcel, 14, this.l, i, false);
        atzr.t(parcel, 15, this.m, i, false);
        atzr.c(parcel, a);
    }

    public SendConnectionRequestParams(IBinder iBinder, IBinder iBinder2, IBinder iBinder3, String str, String str2, byte[] bArr, IBinder iBinder4, byte[] bArr2, ConnectionOptions connectionOptions, int i, PresenceDevice presenceDevice, ConnectionsDevice connectionsDevice, DctDevice dctDevice, byte[] bArr3, String str3) {
        clju cljsVar;
        clip clinVar;
        cliv clitVar;
        clis clisVar = null;
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
        if (iBinder3 == null) {
            clitVar = null;
        } else {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            clitVar = queryLocalInterface3 instanceof cliv ? (cliv) queryLocalInterface3 : new clit(iBinder3);
        }
        if (iBinder4 != null) {
            IInterface queryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            clisVar = queryLocalInterface4 instanceof clis ? (clis) queryLocalInterface4 : new cliq(iBinder4);
        }
        this.a = cljsVar;
        this.b = clinVar;
        this.c = clitVar;
        this.d = str;
        this.e = str2;
        this.f = bArr;
        this.g = clisVar;
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
