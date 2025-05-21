package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cffw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class PayloadTransferUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cffw();
    public long a;
    public int b;
    public long c;
    public long d;

    public PayloadTransferUpdate() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
            if (arwb.b(Long.valueOf(this.a), Long.valueOf(payloadTransferUpdate.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(payloadTransferUpdate.b)) && arwb.b(Long.valueOf(this.c), Long.valueOf(payloadTransferUpdate.c)) && arwb.b(Long.valueOf(this.d), Long.valueOf(payloadTransferUpdate.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public PayloadTransferUpdate(long j, int i, long j2, long j3) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
    }
}
