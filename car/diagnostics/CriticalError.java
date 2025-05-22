package com.google.android.gms.car.diagnostics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.anag;
import defpackage.atzr;
import defpackage.eoky;
import defpackage.eokz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CriticalError extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anag();
    public final int a;
    public final int b;

    public CriticalError(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static CriticalError a(eoky eokyVar, eokz eokzVar) {
        return new CriticalError(eokyVar.D, eokzVar.ax);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CriticalError) {
            CriticalError criticalError = (CriticalError) obj;
            if (criticalError.a == this.a && criticalError.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
