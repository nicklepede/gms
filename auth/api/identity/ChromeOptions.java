package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.eits;
import defpackage.zcm;
import defpackage.zcn;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ChromeOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zcn();
    public static final eits a = eits.p("org.chromium.chrome", "built_locally", "com.chrome.canary", "canary", "com.chrome.dev", "dev", "com.chrome.beta", "beta", "com.android.chrome", "stable");
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public ChromeOptions(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public static zcm a() {
        zcm zcmVar = new zcm();
        zcmVar.b = null;
        zcmVar.e(false);
        zcmVar.b(false);
        zcmVar.c(false);
        zcmVar.d(false);
        return zcmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChromeOptions)) {
            return false;
        }
        ChromeOptions chromeOptions = (ChromeOptions) obj;
        return Objects.equals(this.b, chromeOptions.b) && Objects.equals(this.c, chromeOptions.c) && this.d == chromeOptions.d && this.e == chromeOptions.e && this.f == chromeOptions.f && this.g == chromeOptions.g;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a2 = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.c, false);
        arxc.e(parcel, 3, this.d);
        arxc.e(parcel, 4, this.e);
        arxc.e(parcel, 5, this.f);
        arxc.e(parcel, 6, this.g);
        arxc.c(parcel, a2);
    }
}
