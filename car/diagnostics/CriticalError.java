package com.google.android.gms.car.diagnostics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.akyv;
import defpackage.arxc;
import defpackage.elxk;
import defpackage.elxl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CriticalError extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akyv();
    public final int a;
    public final int b;

    public CriticalError(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static CriticalError a(elxk elxkVar, elxl elxlVar) {
        return new CriticalError(elxkVar.D, elxlVar.ax);
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
