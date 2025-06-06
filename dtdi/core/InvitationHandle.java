package com.google.android.gms.dtdi.core;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bagw;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class InvitationHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bagw();
    public final IBinder a;

    public InvitationHandle(IBinder iBinder) {
        fxxm.f(iBinder, "token");
        this.a = iBinder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvitationHandle) && fxxm.n(this.a, ((InvitationHandle) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InvitationHandle(token=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        IBinder iBinder = this.a;
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, iBinder);
        atzr.c(parcel, a);
    }
}
