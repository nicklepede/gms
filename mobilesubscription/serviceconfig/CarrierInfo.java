package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cerz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class CarrierInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cerz();
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
            if (arwb.b(this.a, carrierInfo.a) && arwb.b(this.b, carrierInfo.b) && arwb.b(this.c, carrierInfo.c)) {
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
        int a = arxc.a(parcel);
        arxc.I(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }

    public CarrierInfo(Long l, String str, OauthRedirect oauthRedirect) {
        this.a = l;
        this.b = str;
        this.c = oauthRedirect;
    }
}
