package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chbj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CheckAuthStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chbj();
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
            if (atyq.b(this.a, checkAuthStatusResponse.a) && atyq.b(this.b, checkAuthStatusResponse.b) && atyq.b(this.c, checkAuthStatusResponse.c) && atyq.b(this.d, checkAuthStatusResponse.d) && atyq.b(this.e, checkAuthStatusResponse.e) && atyq.b(this.f, checkAuthStatusResponse.f)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.g(parcel, 63, this.f, false);
        atzr.c(parcel, a);
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
