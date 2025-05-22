package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bbar;
import defpackage.bbax;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RegisterForSpatialEventsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbax();
    public atee a;
    private bbar b;

    private RegisterForSpatialEventsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterForSpatialEventsParams) {
            RegisterForSpatialEventsParams registerForSpatialEventsParams = (RegisterForSpatialEventsParams) obj;
            if (atyq.b(this.b, registerForSpatialEventsParams.b) && atyq.b(this.a, registerForSpatialEventsParams.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.b.a);
        atzr.D(parcel, 2, this.a.asBinder());
        atzr.c(parcel, a);
    }

    public RegisterForSpatialEventsParams(IBinder iBinder, IBinder iBinder2) {
        bbar bbarVar;
        atee ateeVar = null;
        if (iBinder == null) {
            bbarVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IOnSpatialEventListener");
            bbarVar = queryLocalInterface instanceof bbar ? (bbar) queryLocalInterface : new bbar(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface2 instanceof atee ? (atee) queryLocalInterface2 : new atec(iBinder2);
        }
        this.b = bbarVar;
        this.a = ateeVar;
    }
}
