package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.usonia.PeerAddress;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkik;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class OnDistributedServiceAvailableParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkik();
    public String a;
    public PeerAddress b;

    private OnDistributedServiceAvailableParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnDistributedServiceAvailableParams) {
            OnDistributedServiceAvailableParams onDistributedServiceAvailableParams = (OnDistributedServiceAvailableParams) obj;
            if (atyq.b(this.a, onDistributedServiceAvailableParams.a) && atyq.b(this.b, onDistributedServiceAvailableParams.b)) {
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
        atzr.v(parcel, 1, this.a, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public OnDistributedServiceAvailableParams(String str, PeerAddress peerAddress) {
        this.a = str;
        this.b = peerAddress;
    }
}
