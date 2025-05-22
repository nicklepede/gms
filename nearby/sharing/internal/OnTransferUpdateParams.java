package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.internal.connection.ParcelByteArray;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpiy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OnTransferUpdateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpiy();
    public ShareTarget a;
    public TransferMetadata b;
    public ParcelByteArray c;

    public OnTransferUpdateParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnTransferUpdateParams) {
            OnTransferUpdateParams onTransferUpdateParams = (OnTransferUpdateParams) obj;
            if (atyq.b(this.a, onTransferUpdateParams.a) && atyq.b(this.b, onTransferUpdateParams.b) && atyq.b(this.c, onTransferUpdateParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public OnTransferUpdateParams(ShareTarget shareTarget, TransferMetadata transferMetadata, ParcelByteArray parcelByteArray) {
        this.a = shareTarget;
        this.b = transferMetadata;
        this.c = parcelByteArray;
    }
}
