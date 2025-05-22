package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.bipi;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataUpdateListenerRegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipi();
    public final DataSource a;
    public final DataType b;
    public final PendingIntent c;
    public final binm d;

    public DataUpdateListenerRegistrationRequest(DataSource dataSource, DataType dataType, PendingIntent pendingIntent, IBinder iBinder) {
        binm binkVar;
        this.a = dataSource;
        this.b = dataType;
        this.c = pendingIntent;
        if (iBinder == null) {
            binkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binkVar = queryLocalInterface instanceof binm ? (binm) queryLocalInterface : new bink(iBinder);
        }
        this.d = binkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataUpdateListenerRegistrationRequest)) {
            return false;
        }
        DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest = (DataUpdateListenerRegistrationRequest) obj;
        return atyq.b(this.a, dataUpdateListenerRegistrationRequest.a) && atyq.b(this.b, dataUpdateListenerRegistrationRequest.b) && atyq.b(this.c, dataUpdateListenerRegistrationRequest.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("dataSource", this.a, arrayList);
        atyp.b("dataType", this.b, arrayList);
        atyp.b("pendingIntent", this.c, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataSource dataSource = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, dataSource, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        binm binmVar = this.d;
        atzr.D(parcel, 4, binmVar == null ? null : binmVar.asBinder());
        atzr.c(parcel, a);
    }
}
