package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgcy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataPointChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgcy();
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
        return arwb.b(this.a, dataPointChange.a) && arwb.b(this.b, dataPointChange.b) && arwb.b(this.c, dataPointChange.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InsertionDataPointChange insertionDataPointChange = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, insertionDataPointChange, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
