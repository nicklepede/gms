package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.usonia.PeerAddress;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dhxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class OnDistributedServiceAvailableParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhxc();
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
            if (arwb.b(this.a, onDistributedServiceAvailableParams.a) && arwb.b(this.b, onDistributedServiceAvailableParams.b)) {
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

    public OnDistributedServiceAvailableParams(String str, PeerAddress peerAddress) {
        this.a = str;
        this.b = peerAddress;
    }
}
