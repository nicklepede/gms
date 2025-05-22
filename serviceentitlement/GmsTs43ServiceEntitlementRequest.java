package com.google.android.gms.serviceentitlement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ddzo;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GmsTs43ServiceEntitlementRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddzo();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public GmsTs43ServiceEntitlementRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = str13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GmsTs43ServiceEntitlementRequest) {
            GmsTs43ServiceEntitlementRequest gmsTs43ServiceEntitlementRequest = (GmsTs43ServiceEntitlementRequest) obj;
            if (this.a == gmsTs43ServiceEntitlementRequest.a && this.b.equals(gmsTs43ServiceEntitlementRequest.b) && this.c.equals(gmsTs43ServiceEntitlementRequest.c) && this.d.equals(gmsTs43ServiceEntitlementRequest.d) && this.e.equals(gmsTs43ServiceEntitlementRequest.e) && this.f.equals(gmsTs43ServiceEntitlementRequest.f) && this.g.equals(gmsTs43ServiceEntitlementRequest.g) && this.h.equals(gmsTs43ServiceEntitlementRequest.h) && this.i.equals(gmsTs43ServiceEntitlementRequest.i) && this.j.equals(gmsTs43ServiceEntitlementRequest.j) && this.k.equals(gmsTs43ServiceEntitlementRequest.k) && this.l.equals(gmsTs43ServiceEntitlementRequest.l) && this.m.equals(gmsTs43ServiceEntitlementRequest.m) && this.n.equals(gmsTs43ServiceEntitlementRequest.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "GmsTs43ServiceEntitlementRequest[configurationVersion=%d, entitlementVersion=%s, authenticationToken=%s, temporaryToken=%s, terminalId=%s, terminalVendor=%s, terminalModel=%s, terminalSoftwareVersion=%s, appName=%s, appId=%s, appVersion=%s, acceptContentType=%s, boostType=%s, gid1=%s]", Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 10, this.j, false);
        atzr.v(parcel, 11, this.k, false);
        atzr.v(parcel, 12, this.l, false);
        atzr.v(parcel, 13, this.m, false);
        atzr.v(parcel, 14, this.n, false);
        atzr.c(parcel, a);
    }
}
