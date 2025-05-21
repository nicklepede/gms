package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cnar;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OpenParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnar();
    public ShareTarget a;
    public arbp b;

    public OpenParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OpenParams) {
            OpenParams openParams = (OpenParams) obj;
            if (arwb.b(this.a, openParams.a) && arwb.b(this.b, openParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.c(parcel, a);
    }

    public OpenParams(ShareTarget shareTarget, IBinder iBinder) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = shareTarget;
        this.b = arbnVar;
    }
}
