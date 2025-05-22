package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chbh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CarrierInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chbh();
    public Long a;
    public String b;
    public OauthRedirect c;

    public CarrierInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierInfo) {
            CarrierInfo carrierInfo = (CarrierInfo) obj;
            if (atyq.b(this.a, carrierInfo.a) && atyq.b(this.b, carrierInfo.b) && atyq.b(this.c, carrierInfo.c)) {
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
        atzr.I(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public CarrierInfo(Long l, String str, OauthRedirect oauthRedirect) {
        this.a = l;
        this.b = str;
        this.c = oauthRedirect;
    }
}
