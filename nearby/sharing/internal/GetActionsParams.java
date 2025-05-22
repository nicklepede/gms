package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpdn;
import defpackage.cpfh;
import defpackage.cpfj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GetActionsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpdn();
    public ShareTarget a;
    public cpfj b;

    public GetActionsParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetActionsParams) {
            GetActionsParams getActionsParams = (GetActionsParams) obj;
            if (atyq.b(this.a, getActionsParams.a) && atyq.b(this.b, getActionsParams.b)) {
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

    public GetActionsParams(ShareTarget shareTarget, IBinder iBinder) {
        cpfj cpfhVar;
        if (iBinder == null) {
            cpfhVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IShareTargetActionListResultListener");
            cpfhVar = queryLocalInterface instanceof cpfj ? (cpfj) queryLocalInterface : new cpfh(iBinder);
        }
        this.a = shareTarget;
        this.b = cpfhVar;
    }
}
