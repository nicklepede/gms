package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.wjm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class BrowserResolutionCookie extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wjm();
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public boolean f;
    public boolean g;

    public BrowserResolutionCookie() {
        this.d = "/";
        this.e = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrowserResolutionCookie) {
            BrowserResolutionCookie browserResolutionCookie = (BrowserResolutionCookie) obj;
            if (atyq.b(this.a, browserResolutionCookie.a) && atyq.b(this.b, browserResolutionCookie.b) && atyq.b(this.c, browserResolutionCookie.c) && atyq.b(this.d, browserResolutionCookie.d) && atyq.b(Long.valueOf(this.e), Long.valueOf(browserResolutionCookie.e)) && atyq.b(Boolean.valueOf(this.f), Boolean.valueOf(browserResolutionCookie.f)) && atyq.b(Boolean.valueOf(this.g), Boolean.valueOf(browserResolutionCookie.g))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.q(parcel, 5, this.e);
        atzr.e(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.c(parcel, a);
    }

    public BrowserResolutionCookie(String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        this.d = "/";
        this.e = -1L;
        atzb.q(str);
        this.a = str;
        atzb.q(str2);
        this.b = str2;
        atzb.q(str3);
        this.c = str3;
        atzb.q(str4);
        this.d = str4;
        this.e = j;
        this.f = z;
        this.g = z2;
    }
}
