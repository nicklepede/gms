package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.TokenWrapper;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bazk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CloseDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bazk();
    public TokenWrapper a;
    public atee b;

    private CloseDeviceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CloseDeviceParams) {
            CloseDeviceParams closeDeviceParams = (CloseDeviceParams) obj;
            if (atyq.b(this.a, closeDeviceParams.a) && atyq.b(this.b, closeDeviceParams.b)) {
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
        atzr.t(parcel, 1, this.a, i, false);
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.c(parcel, a);
    }

    public CloseDeviceParams(TokenWrapper tokenWrapper, IBinder iBinder) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = tokenWrapper;
        this.b = atecVar;
    }
}
