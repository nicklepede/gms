package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctdv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PresentationConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctdv();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(presentationConfig.a)) && arwb.b(this.b, presentationConfig.b)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public PresentationConfig(int i, GridConfig gridConfig) {
        this.a = i;
        this.b = gridConfig;
    }
}
