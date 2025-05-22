package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adbo;
import defpackage.atyq;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class RecoveryResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adbo();
    public int a;
    public long b;

    public RecoveryResult() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecoveryResult) {
            RecoveryResult recoveryResult = (RecoveryResult) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(recoveryResult.a)) && atyq.b(Long.valueOf(this.b), Long.valueOf(recoveryResult.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.q(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public RecoveryResult(int i, long j) {
        this.a = i;
        this.b = j;
    }
}
