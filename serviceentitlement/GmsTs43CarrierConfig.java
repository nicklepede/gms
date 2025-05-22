package com.google.android.gms.serviceentitlement;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ddzm;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GmsTs43CarrierConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddzm();
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final Network f;

    public GmsTs43CarrierConfig(String str, String str2, boolean z, int i, String str3, Network network) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = network;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GmsTs43CarrierConfig) {
            GmsTs43CarrierConfig gmsTs43CarrierConfig = (GmsTs43CarrierConfig) obj;
            if (Objects.equals(this.a, gmsTs43CarrierConfig.a) && Objects.equals(this.b, gmsTs43CarrierConfig.b) && this.c == gmsTs43CarrierConfig.c && this.d == gmsTs43CarrierConfig.d && Objects.equals(this.e, gmsTs43CarrierConfig.e) && Objects.equals(this.f, gmsTs43CarrierConfig.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "GmsTs43CarrierConfig[serverUrl=%s, clientTs43=%s, useHttpPost=%b, timeoutInSec=%d, eapAkaRealm=%s]", this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.c(parcel, a);
    }
}
