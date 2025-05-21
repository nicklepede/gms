package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dexl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class IsDeviceRecentlyUnlockedResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dexl();
    public boolean a;

    private IsDeviceRecentlyUnlockedResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IsDeviceRecentlyUnlockedResponse) {
            return arwb.b(Boolean.valueOf(this.a), Boolean.valueOf(((IsDeviceRecentlyUnlockedResponse) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.c(parcel, a);
    }

    public IsDeviceRecentlyUnlockedResponse(boolean z) {
        this.a = z;
    }
}
