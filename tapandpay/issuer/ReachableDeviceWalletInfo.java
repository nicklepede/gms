package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhks;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class ReachableDeviceWalletInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhks();
    public String a;
    public String b;

    private ReachableDeviceWalletInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReachableDeviceWalletInfo) {
            ReachableDeviceWalletInfo reachableDeviceWalletInfo = (ReachableDeviceWalletInfo) obj;
            if (atyq.b(this.a, reachableDeviceWalletInfo.a) && atyq.b(this.b, reachableDeviceWalletInfo.b)) {
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
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public ReachableDeviceWalletInfo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
