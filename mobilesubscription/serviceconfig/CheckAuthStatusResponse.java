package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cesb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class CheckAuthStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cesb();
    public String a;
    public CarrierInfo b;
    public AuthType c;
    public AuthStatus d;
    public UserKey e;
    public Bundle f;

    public CheckAuthStatusResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckAuthStatusResponse) {
            CheckAuthStatusResponse checkAuthStatusResponse = (CheckAuthStatusResponse) obj;
            if (arwb.b(this.a, checkAuthStatusResponse.a) && arwb.b(this.b, checkAuthStatusResponse.b) && arwb.b(this.c, checkAuthStatusResponse.c) && arwb.b(this.d, checkAuthStatusResponse.d) && arwb.b(this.e, checkAuthStatusResponse.e) && arwb.b(this.f, checkAuthStatusResponse.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.g(parcel, 63, this.f, false);
        arxc.c(parcel, a);
    }

    public CheckAuthStatusResponse(String str, CarrierInfo carrierInfo, AuthType authType, AuthStatus authStatus, UserKey userKey, Bundle bundle) {
        this.a = str;
        this.b = carrierInfo;
        this.c = authType;
        this.d = authStatus;
        this.e = userKey;
        this.f = bundle;
    }
}
