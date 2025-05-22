package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.bipj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataUpdateListenerUnregistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipj();
    public final PendingIntent a;
    public final binm b;

    public DataUpdateListenerUnregistrationRequest(PendingIntent pendingIntent, IBinder iBinder) {
        binm binkVar;
        this.a = pendingIntent;
        if (iBinder == null) {
            binkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binkVar = queryLocalInterface instanceof binm ? (binm) queryLocalInterface : new bink(iBinder);
        }
        this.b = binkVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof DataUpdateListenerUnregistrationRequest) && atyq.b(this.a, ((DataUpdateListenerUnregistrationRequest) obj).a);
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, pendingIntent, i, false);
        binm binmVar = this.b;
        atzr.D(parcel, 2, binmVar == null ? null : binmVar.asBinder());
        atzr.c(parcel, a);
    }
}
