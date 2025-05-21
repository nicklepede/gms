package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmvf;
import defpackage.cmwz;
import defpackage.cmxb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetActionsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmvf();
    public ShareTarget a;
    public cmxb b;

    public GetActionsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetActionsParams) {
            GetActionsParams getActionsParams = (GetActionsParams) obj;
            if (arwb.b(this.a, getActionsParams.a) && arwb.b(this.b, getActionsParams.b)) {
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

    public GetActionsParams(ShareTarget shareTarget, IBinder iBinder) {
        cmxb cmwzVar;
        if (iBinder == null) {
            cmwzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IShareTargetActionListResultListener");
            cmwzVar = queryLocalInterface instanceof cmxb ? (cmxb) queryLocalInterface : new cmwz(iBinder);
        }
        this.a = shareTarget;
        this.b = cmwzVar;
    }
}
