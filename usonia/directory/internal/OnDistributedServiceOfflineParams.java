package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.usonia.PeerAddress;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dhxd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class OnDistributedServiceOfflineParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhxd();
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
            if (arwb.b(this.a, onDistributedServiceOfflineParams.a) && arwb.b(this.b, onDistributedServiceOfflineParams.b)) {
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
        arxc.v(parcel, 1, this.a, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public OnDistributedServiceOfflineParams(String str, PeerAddress peerAddress) {
        this.a = str;
        this.b = peerAddress;
    }
}
