package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bilx;
import defpackage.bipb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataPointChangesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipb();
    public final long a;
    public final int b;
    public final bilx c;

    public DataPointChangesRequest(IBinder iBinder, long j, int i) {
        bilx bilxVar;
        if (iBinder == null) {
            bilxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataPointChangesCallback");
            bilxVar = queryLocalInterface instanceof bilx ? (bilx) queryLocalInterface : new bilx(iBinder);
        }
        this.c = bilxVar;
        this.a = j;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        bilx bilxVar = this.c;
        atzr.D(parcel, 1, bilxVar == null ? null : bilxVar.a);
        atzr.q(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
