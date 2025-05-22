package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bazw;
import defpackage.bban;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GetMediaTransferEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bazw();
    public bban a;

    public GetMediaTransferEnabledParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetMediaTransferEnabledParams) {
            return atyq.b(this.a, ((GetMediaTransferEnabledParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.a);
        atzr.c(parcel, a);
    }

    public GetMediaTransferEnabledParams(IBinder iBinder) {
        bban bbanVar;
        if (iBinder == null) {
            bbanVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.IMediaTransferStatusCallback");
            bbanVar = queryLocalInterface instanceof bban ? (bban) queryLocalInterface : new bban(iBinder);
        }
        this.a = bbanVar;
    }
}
