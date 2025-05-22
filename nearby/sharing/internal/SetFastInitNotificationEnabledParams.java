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
import defpackage.cpkb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SetFastInitNotificationEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpkb();
    public atee a;
    public boolean b;

    private SetFastInitNotificationEnabledParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetFastInitNotificationEnabledParams) {
            SetFastInitNotificationEnabledParams setFastInitNotificationEnabledParams = (SetFastInitNotificationEnabledParams) obj;
            if (atyq.b(this.a, setFastInitNotificationEnabledParams.a) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(setFastInitNotificationEnabledParams.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public SetFastInitNotificationEnabledParams(IBinder iBinder, boolean z) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = atecVar;
        this.b = z;
    }
}
