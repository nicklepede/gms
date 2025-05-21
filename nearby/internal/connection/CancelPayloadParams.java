package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ciuz;
import defpackage.cjbn;
import defpackage.cjbp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class CancelPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ciuz();
    public cjbp a;
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
            if (arwb.b(this.a, cancelPayloadParams.a) && arwb.b(Long.valueOf(this.b), Long.valueOf(cancelPayloadParams.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(cancelPayloadParams.c))) {
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
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        arxc.q(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    public CancelPayloadParams(IBinder iBinder, long j, int i) {
        cjbp cjbnVar;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        this.a = cjbnVar;
        this.b = j;
        this.c = i;
    }
}
