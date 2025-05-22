package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvna;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PresentationConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvna();
    public int a;
    public GridConfig b;

    private PresentationConfig() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PresentationConfig) {
            PresentationConfig presentationConfig = (PresentationConfig) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(presentationConfig.a)) && atyq.b(this.b, presentationConfig.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public PresentationConfig(int i, GridConfig gridConfig) {
        this.a = i;
        this.b = gridConfig;
    }
}
