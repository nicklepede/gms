package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpfz;
import defpackage.cpgb;
import defpackage.cpkr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class UnregisterSendSurfaceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpkr();
    public cpgb a;
    public atee b;

    public UnregisterSendSurfaceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnregisterSendSurfaceParams) {
            UnregisterSendSurfaceParams unregisterSendSurfaceParams = (UnregisterSendSurfaceParams) obj;
            if (atyq.b(this.a, unregisterSendSurfaceParams.a) && atyq.b(this.b, unregisterSendSurfaceParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.c(parcel, a);
    }

    public UnregisterSendSurfaceParams(IBinder iBinder, IBinder iBinder2) {
        cpgb cpfzVar;
        atee ateeVar = null;
        if (iBinder == null) {
            cpfzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            cpfzVar = queryLocalInterface instanceof cpgb ? (cpgb) queryLocalInterface : new cpfz(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ateeVar = queryLocalInterface2 instanceof atee ? (atee) queryLocalInterface2 : new atec(iBinder2);
        }
        this.a = cpfzVar;
        this.b = ateeVar;
    }
}
