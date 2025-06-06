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
import defpackage.cpjv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SetAllowPermissionAutoParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpjv();
    public boolean a;
    public atee b;

    public SetAllowPermissionAutoParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetAllowPermissionAutoParams) {
            SetAllowPermissionAutoParams setAllowPermissionAutoParams = (SetAllowPermissionAutoParams) obj;
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(setAllowPermissionAutoParams.a)) && atyq.b(this.b, setAllowPermissionAutoParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.c(parcel, a);
    }

    public SetAllowPermissionAutoParams(boolean z, IBinder iBinder) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = z;
        this.b = atecVar;
    }
}
