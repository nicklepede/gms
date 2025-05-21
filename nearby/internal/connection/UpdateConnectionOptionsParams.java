package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjei;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class UpdateConnectionOptionsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjei();
    public cjbp a;
    public String b;
    public String c;
    public ConnectionOptions d;
    public int e;
    public PresenceDevice f;

    public UpdateConnectionOptionsParams() {
        this.e = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateConnectionOptionsParams) {
            UpdateConnectionOptionsParams updateConnectionOptionsParams = (UpdateConnectionOptionsParams) obj;
            if (arwb.b(this.a, updateConnectionOptionsParams.a) && arwb.b(this.b, updateConnectionOptionsParams.b) && arwb.b(this.c, updateConnectionOptionsParams.c) && arwb.b(this.d, updateConnectionOptionsParams.d) && arwb.b(Integer.valueOf(this.e), Integer.valueOf(updateConnectionOptionsParams.e)) && arwb.b(this.f, updateConnectionOptionsParams.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(this.e), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.o(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }

    public UpdateConnectionOptionsParams(IBinder iBinder, String str, String str2, ConnectionOptions connectionOptions, int i, PresenceDevice presenceDevice) {
        arwm.s(iBinder);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
        this.a = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        this.b = str;
        this.c = str2;
        this.d = connectionOptions;
        this.e = i;
        this.f = presenceDevice;
    }
}
