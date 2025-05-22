package com.google.android.gms.dtdi.core.internal;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bbbd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SetRoutingInfoParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbbd();
    public ComponentName a;
    public atee b;

    private SetRoutingInfoParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetRoutingInfoParams) {
            SetRoutingInfoParams setRoutingInfoParams = (SetRoutingInfoParams) obj;
            if (atyq.b(this.a, setRoutingInfoParams.a) && atyq.b(this.b, setRoutingInfoParams.b)) {
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

    public SetRoutingInfoParams(ComponentName componentName, IBinder iBinder) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = componentName;
        this.b = atecVar;
    }
}
