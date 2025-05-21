package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dezm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class ReachableDeviceWalletInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dezm();
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
            if (arwb.b(this.a, reachableDeviceWalletInfo.a) && arwb.b(this.b, reachableDeviceWalletInfo.b)) {
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
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public ReachableDeviceWalletInfo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
