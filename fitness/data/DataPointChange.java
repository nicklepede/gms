package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biho;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataPointChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biho();
    public final InsertionDataPointChange a;
    public final DeletionDataPointChange b;
    public final DeletionByTimeDataPointChange c;

    public DataPointChange(InsertionDataPointChange insertionDataPointChange, DeletionDataPointChange deletionDataPointChange, DeletionByTimeDataPointChange deletionByTimeDataPointChange) {
        this.a = insertionDataPointChange;
        this.b = deletionDataPointChange;
        this.c = deletionByTimeDataPointChange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointChange)) {
            return false;
        }
        DataPointChange dataPointChange = (DataPointChange) obj;
        return atyq.b(this.a, dataPointChange.a) && atyq.b(this.b, dataPointChange.b) && atyq.b(this.c, dataPointChange.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InsertionDataPointChange insertionDataPointChange = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, insertionDataPointChange, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }
}
