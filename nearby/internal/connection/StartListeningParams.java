package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjal;
import defpackage.cjan;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjbt;
import defpackage.cjbv;
import defpackage.cjdy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class StartListeningParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdy();
    public cjbp a;
    public String b;
    public ConnectionListeningOptions c;
    public cjan d;
    public cjbv e;
    public String f;

    public StartListeningParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartListeningParams) {
            StartListeningParams startListeningParams = (StartListeningParams) obj;
            if (arwb.b(this.a, startListeningParams.a) && arwb.b(this.b, startListeningParams.b) && arwb.b(this.c, startListeningParams.c) && arwb.b(this.d, startListeningParams.d) && arwb.b(this.e, startListeningParams.e) && arwb.b(this.f, startListeningParams.f)) {
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
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        cjan cjanVar = this.d;
        arxc.D(parcel, 4, cjanVar == null ? null : cjanVar.asBinder());
        cjbv cjbvVar = this.e;
        arxc.D(parcel, 5, cjbvVar != null ? cjbvVar.asBinder() : null);
        arxc.v(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }

    public StartListeningParams(IBinder iBinder, String str, ConnectionListeningOptions connectionListeningOptions, IBinder iBinder2, IBinder iBinder3, String str2) {
        cjbp cjbnVar;
        cjan cjalVar;
        cjbv cjbvVar = null;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        if (iBinder2 == null) {
            cjalVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            cjalVar = queryLocalInterface2 instanceof cjan ? (cjan) queryLocalInterface2 : new cjal(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartListeningForIncomingConnectionsResultListener");
            cjbvVar = queryLocalInterface3 instanceof cjbv ? (cjbv) queryLocalInterface3 : new cjbt(iBinder3);
        }
        this.a = cjbnVar;
        this.b = str;
        this.c = connectionListeningOptions;
        this.d = cjalVar;
        this.e = cjbvVar;
        this.f = str2;
    }
}
