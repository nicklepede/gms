package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import defpackage.atzr;
import defpackage.bilw;
import defpackage.bioy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DailyTotalRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bioy();
    public final DataType a;
    public final boolean b;
    public final bilw c;

    public DailyTotalRequest(IBinder iBinder, DataType dataType, boolean z) {
        bilw bilwVar;
        if (iBinder == null) {
            bilwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDailyTotalCallback");
            bilwVar = queryLocalInterface instanceof bilw ? (bilw) queryLocalInterface : new bilw(iBinder);
        }
        this.c = bilwVar;
        this.a = dataType;
        this.b = z;
    }

    public final String toString() {
        DataType dataType = this.a;
        return String.format("DailyTotalRequest{%s}", dataType == null ? "null" : dataType.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.c.a);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.e(parcel, 4, this.b);
        atzr.c(parcel, a);
    }
}
