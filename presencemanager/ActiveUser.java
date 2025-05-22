package com.google.android.gms.presencemanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.czbx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ActiveUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czbx();
    public final IBinder a;

    public ActiveUser(IBinder iBinder) {
        this.a = iBinder;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActiveUser)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return atyq.b(this.a, ((ActiveUser) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder = this.a;
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, iBinder);
        atzr.c(parcel, a);
    }
}
