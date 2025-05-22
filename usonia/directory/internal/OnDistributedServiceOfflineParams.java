package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.usonia.PeerAddress;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkil;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class OnDistributedServiceOfflineParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkil();
    public String a;
    public PeerAddress b;

    private OnDistributedServiceOfflineParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnDistributedServiceOfflineParams) {
            OnDistributedServiceOfflineParams onDistributedServiceOfflineParams = (OnDistributedServiceOfflineParams) obj;
            if (atyq.b(this.a, onDistributedServiceOfflineParams.a) && atyq.b(this.b, onDistributedServiceOfflineParams.b)) {
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

    public OnDistributedServiceOfflineParams(String str, PeerAddress peerAddress) {
        this.a = str;
        this.b = peerAddress;
    }
}
