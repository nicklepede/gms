package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clde;
import defpackage.cljs;
import defpackage.clju;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CancelPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clde();
    public clju a;
    public long b;
    public final int c;

    public CancelPayloadParams() {
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CancelPayloadParams) {
            CancelPayloadParams cancelPayloadParams = (CancelPayloadParams) obj;
            if (atyq.b(this.a, cancelPayloadParams.a) && atyq.b(Long.valueOf(this.b), Long.valueOf(cancelPayloadParams.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(cancelPayloadParams.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        atzr.q(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public CancelPayloadParams(IBinder iBinder, long j, int i) {
        clju cljsVar;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        this.a = cljsVar;
        this.b = j;
        this.c = i;
    }
}
