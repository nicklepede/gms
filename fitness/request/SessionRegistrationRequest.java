package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.biqd;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SessionRegistrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biqd();
    public final PendingIntent a;
    public final binm b;

    public SessionRegistrationRequest(PendingIntent pendingIntent, binm binmVar) {
        this.a = pendingIntent;
        this.b = binmVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SessionRegistrationRequest) && atyq.b(this.a, ((SessionRegistrationRequest) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("pendingIntent", this.a, arrayList);
        return atyp.a(arrayList, this);
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

    public SessionRegistrationRequest(PendingIntent pendingIntent, IBinder iBinder) {
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
}
