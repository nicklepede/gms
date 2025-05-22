package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cljs;
import defpackage.clju;
import defpackage.clmp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UpdateDiscoveryOptionsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clmp();
    public clju a;
    public String b;
    public DiscoveryOptions c;
    public String d;

    public UpdateDiscoveryOptionsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateDiscoveryOptionsParams) {
            UpdateDiscoveryOptionsParams updateDiscoveryOptionsParams = (UpdateDiscoveryOptionsParams) obj;
            if (atyq.b(this.a, updateDiscoveryOptionsParams.a) && atyq.b(this.b, updateDiscoveryOptionsParams.b) && atyq.b(this.c, updateDiscoveryOptionsParams.c) && atyq.b(this.d, updateDiscoveryOptionsParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public UpdateDiscoveryOptionsParams(IBinder iBinder, String str, DiscoveryOptions discoveryOptions, String str2) {
        clju cljsVar;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        this.a = cljsVar;
        this.b = str;
        this.c = discoveryOptions;
        this.d = str2;
    }
}
