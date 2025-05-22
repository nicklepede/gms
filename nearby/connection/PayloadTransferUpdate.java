package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chni;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class PayloadTransferUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chni();
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
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(payloadTransferUpdate.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(payloadTransferUpdate.b)) && atyq.b(Long.valueOf(this.c), Long.valueOf(payloadTransferUpdate.c)) && atyq.b(Long.valueOf(this.d), Long.valueOf(payloadTransferUpdate.d))) {
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.q(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public PayloadTransferUpdate(long j, int i, long j2, long j3) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
    }
}
