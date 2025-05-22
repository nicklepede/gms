package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bsmp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class TrainingInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bsmp();
    public final int a;
    public final long b;

    public TrainingInterval(int i, long j) {
        boolean z = true;
        if (i == 0) {
            if (j > 0) {
                i = 0;
            } else {
                i = 0;
                z = false;
            }
        }
        atzb.c(z, "Recurrent jobs cannot have non-positive minimal interval.");
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrainingInterval)) {
            return false;
        }
        TrainingInterval trainingInterval = (TrainingInterval) obj;
        return this.a == trainingInterval.a && this.b == trainingInterval.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.q(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
