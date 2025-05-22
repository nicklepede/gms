package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bilz;
import defpackage.bipd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataSourceChangesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipd();
    public final long a;
    public final bilz b;

    public DataSourceChangesRequest(IBinder iBinder, long j) {
        bilz bilzVar;
        if (iBinder == null) {
            bilzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataSourceChangesCallback");
            bilzVar = queryLocalInterface instanceof bilz ? (bilz) queryLocalInterface : new bilz(iBinder);
        }
        this.b = bilzVar;
        this.a = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        bilz bilzVar = this.b;
        atzr.D(parcel, 1, bilzVar == null ? null : bilzVar.a);
        atzr.q(parcel, 2, this.a);
        atzr.c(parcel, a);
    }
}
