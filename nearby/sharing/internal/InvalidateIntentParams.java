package com.google.android.gms.nearby.sharing.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpey;
import defpackage.cpfa;
import defpackage.cpim;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class InvalidateIntentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpim();
    public Intent a;
    public cpfa b;

    public InvalidateIntentParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InvalidateIntentParams) {
            InvalidateIntentParams invalidateIntentParams = (InvalidateIntentParams) obj;
            if (atyq.b(this.a, invalidateIntentParams.a) && atyq.b(this.b, invalidateIntentParams.b)) {
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

    public InvalidateIntentParams(Intent intent, IBinder iBinder) {
        cpfa cpeyVar;
        if (iBinder == null) {
            cpeyVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IIntentResultListener");
            cpeyVar = queryLocalInterface instanceof cpfa ? (cpfa) queryLocalInterface : new cpey(iBinder);
        }
        this.a = intent;
        this.b = cpeyVar;
    }
}
