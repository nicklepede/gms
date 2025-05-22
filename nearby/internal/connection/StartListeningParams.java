package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cliq;
import defpackage.clis;
import defpackage.cljs;
import defpackage.clju;
import defpackage.cljy;
import defpackage.clka;
import defpackage.clmd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class StartListeningParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clmd();
    public clju a;
    public String b;
    public ConnectionListeningOptions c;
    public clis d;
    public clka e;
    public String f;

    public StartListeningParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartListeningParams) {
            StartListeningParams startListeningParams = (StartListeningParams) obj;
            if (atyq.b(this.a, startListeningParams.a) && atyq.b(this.b, startListeningParams.b) && atyq.b(this.c, startListeningParams.c) && atyq.b(this.d, startListeningParams.d) && atyq.b(this.e, startListeningParams.e) && atyq.b(this.f, startListeningParams.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        clis clisVar = this.d;
        atzr.D(parcel, 4, clisVar == null ? null : clisVar.asBinder());
        clka clkaVar = this.e;
        atzr.D(parcel, 5, clkaVar != null ? clkaVar.asBinder() : null);
        atzr.v(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }

    public StartListeningParams(IBinder iBinder, String str, ConnectionListeningOptions connectionListeningOptions, IBinder iBinder2, IBinder iBinder3, String str2) {
        clju cljsVar;
        clis cliqVar;
        clka clkaVar = null;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        if (iBinder2 == null) {
            cliqVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            cliqVar = queryLocalInterface2 instanceof clis ? (clis) queryLocalInterface2 : new cliq(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartListeningForIncomingConnectionsResultListener");
            clkaVar = queryLocalInterface3 instanceof clka ? (clka) queryLocalInterface3 : new cljy(iBinder3);
        }
        this.a = cljsVar;
        this.b = str;
        this.c = connectionListeningOptions;
        this.d = cliqVar;
        this.e = clkaVar;
        this.f = str2;
    }
}
