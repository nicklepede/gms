package com.google.android.gms.nearby.sharing.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmwq;
import defpackage.cmws;
import defpackage.cnae;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class InvalidateIntentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnae();
    public Intent a;
    public cmws b;

    public InvalidateIntentParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InvalidateIntentParams) {
            InvalidateIntentParams invalidateIntentParams = (InvalidateIntentParams) obj;
            if (arwb.b(this.a, invalidateIntentParams.a) && arwb.b(this.b, invalidateIntentParams.b)) {
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

    public InvalidateIntentParams(Intent intent, IBinder iBinder) {
        cmws cmwqVar;
        if (iBinder == null) {
            cmwqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IIntentResultListener");
            cmwqVar = queryLocalInterface instanceof cmws ? (cmws) queryLocalInterface : new cmwq(iBinder);
        }
        this.a = intent;
        this.b = cmwqVar;
    }
}
