package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.binh;
import defpackage.biqa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SessionChangesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biqa();
    public final long a;
    public final int b;
    public final binh c;

    public SessionChangesRequest(IBinder iBinder, long j, int i) {
        binh binhVar;
        if (iBinder == null) {
            binhVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionChangesCallback");
            binhVar = queryLocalInterface instanceof binh ? (binh) queryLocalInterface : new binh(iBinder);
        }
        this.c = binhVar;
        this.a = j;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        binh binhVar = this.c;
        atzr.D(parcel, 1, binhVar == null ? null : binhVar.a);
        atzr.q(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
