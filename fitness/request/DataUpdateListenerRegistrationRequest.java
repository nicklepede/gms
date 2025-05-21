package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bgks;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataUpdateListenerRegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgks();
    public final DataSource a;
    public final DataType b;
    public final PendingIntent c;
    public final bgiw d;

    public DataUpdateListenerRegistrationRequest(DataSource dataSource, DataType dataType, PendingIntent pendingIntent, IBinder iBinder) {
        bgiw bgiuVar;
        this.a = dataSource;
        this.b = dataType;
        this.c = pendingIntent;
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.d = bgiuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataUpdateListenerRegistrationRequest)) {
            return false;
        }
        DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest = (DataUpdateListenerRegistrationRequest) obj;
        return arwb.b(this.a, dataUpdateListenerRegistrationRequest.a) && arwb.b(this.b, dataUpdateListenerRegistrationRequest.b) && arwb.b(this.c, dataUpdateListenerRegistrationRequest.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("dataSource", this.a, arrayList);
        arwa.b("dataType", this.b, arrayList);
        arwa.b("pendingIntent", this.c, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DataSource dataSource = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, dataSource, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        bgiw bgiwVar = this.d;
        arxc.D(parcel, 4, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.c(parcel, a);
    }
}
