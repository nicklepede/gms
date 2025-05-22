package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceDevice;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cljs;
import defpackage.clju;
import defpackage.clmn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UpdateConnectionOptionsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clmn();
    public clju a;
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
            if (atyq.b(this.a, updateConnectionOptionsParams.a) && atyq.b(this.b, updateConnectionOptionsParams.b) && atyq.b(this.c, updateConnectionOptionsParams.c) && atyq.b(this.d, updateConnectionOptionsParams.d) && atyq.b(Integer.valueOf(this.e), Integer.valueOf(updateConnectionOptionsParams.e)) && atyq.b(this.f, updateConnectionOptionsParams.f)) {
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
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.o(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.c(parcel, a);
    }

    public UpdateConnectionOptionsParams(IBinder iBinder, String str, String str2, ConnectionOptions connectionOptions, int i, PresenceDevice presenceDevice) {
        atzb.s(iBinder);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
        this.a = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        this.b = str;
        this.c = str2;
        this.d = connectionOptions;
        this.e = i;
        this.f = presenceDevice;
    }
}
