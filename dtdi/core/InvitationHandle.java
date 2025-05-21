package com.google.android.gms.dtdi.core;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aycw;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class InvitationHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aycw();
    public final IBinder a;

    public InvitationHandle(IBinder iBinder) {
        fvbo.f(iBinder, "token");
        this.a = iBinder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvitationHandle) && fvbo.n(this.a, ((InvitationHandle) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InvitationHandle(token=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        IBinder iBinder = this.a;
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, iBinder);
        arxc.c(parcel, a);
    }
}
