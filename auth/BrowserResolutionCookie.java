package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.unn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class BrowserResolutionCookie extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new unn();
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
            if (arwb.b(this.a, browserResolutionCookie.a) && arwb.b(this.b, browserResolutionCookie.b) && arwb.b(this.c, browserResolutionCookie.c) && arwb.b(this.d, browserResolutionCookie.d) && arwb.b(Long.valueOf(this.e), Long.valueOf(browserResolutionCookie.e)) && arwb.b(Boolean.valueOf(this.f), Boolean.valueOf(browserResolutionCookie.f)) && arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(browserResolutionCookie.g))) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.q(parcel, 5, this.e);
        arxc.e(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.c(parcel, a);
    }

    public BrowserResolutionCookie(String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        this.d = "/";
        this.e = -1L;
        arwm.q(str);
        this.a = str;
        arwm.q(str2);
        this.b = str2;
        arwm.q(str3);
        this.c = str3;
        arwm.q(str4);
        this.d = str4;
        this.e = j;
        this.f = z;
        this.g = z2;
    }
}
