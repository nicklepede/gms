package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bgkt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataUpdateListenerUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgkt();
    public final PendingIntent a;
    public final bgiw b;

    public DataUpdateListenerUnregistrationRequest(PendingIntent pendingIntent, IBinder iBinder) {
        bgiw bgiuVar;
        this.a = pendingIntent;
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.b = bgiuVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof DataUpdateListenerUnregistrationRequest) && arwb.b(this.a, ((DataUpdateListenerUnregistrationRequest) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "DataUpdateListenerUnregistrationRequest";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, pendingIntent, i, false);
        bgiw bgiwVar = this.b;
        arxc.D(parcel, 2, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.c(parcel, a);
    }
}
