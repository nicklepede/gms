package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import defpackage.arxc;
import defpackage.bghg;
import defpackage.bgki;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DailyTotalRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgki();
    public final DataType a;
    public final boolean b;
    public final bghg c;

    public DailyTotalRequest(IBinder iBinder, DataType dataType, boolean z) {
        bghg bghgVar;
        if (iBinder == null) {
            bghgVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDailyTotalCallback");
            bghgVar = queryLocalInterface instanceof bghg ? (bghg) queryLocalInterface : new bghg(iBinder);
        }
        this.c = bghgVar;
        this.a = dataType;
        this.b = z;
    }

    public final String toString() {
        DataType dataType = this.a;
        return String.format("DailyTotalRequest{%s}", dataType == null ? "null" : dataType.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.c.a);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.e(parcel, 4, this.b);
        arxc.c(parcel, a);
    }
}
