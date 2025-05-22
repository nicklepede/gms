package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvmc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class IntentSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvmc();
    public int a;
    public String b;

    public IntentSource() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntentSource) {
            IntentSource intentSource = (IntentSource) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(intentSource.a)) && atyq.b(this.b, intentSource.b)) {
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
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public IntentSource(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
