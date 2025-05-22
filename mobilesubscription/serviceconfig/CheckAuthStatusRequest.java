package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chbi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CheckAuthStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chbi();
    public String a;
    public ServiceType b;
    public Long c;
    public AuthType d;
    public String e;
    public Bundle f;

    public CheckAuthStatusRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckAuthStatusRequest) {
            CheckAuthStatusRequest checkAuthStatusRequest = (CheckAuthStatusRequest) obj;
            if (atyq.b(this.a, checkAuthStatusRequest.a) && atyq.b(this.b, checkAuthStatusRequest.b) && atyq.b(this.c, checkAuthStatusRequest.c) && atyq.b(this.d, checkAuthStatusRequest.d) && atyq.b(this.e, checkAuthStatusRequest.e) && atyq.b(this.f, checkAuthStatusRequest.f)) {
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
        atzr.I(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.g(parcel, 63, this.f, false);
        atzr.c(parcel, a);
    }

    public CheckAuthStatusRequest(String str, ServiceType serviceType, Long l, AuthType authType, String str2, Bundle bundle) {
        this.a = str;
        this.b = serviceType;
        this.c = l;
        this.d = authType;
        this.e = str2;
        this.f = bundle;
    }
}
