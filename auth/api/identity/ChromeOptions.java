package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abch;
import defpackage.abci;
import defpackage.atzr;
import defpackage.elgx;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ChromeOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abci();
    public static final elgx a = elgx.p("org.chromium.chrome", "built_locally", "com.chrome.canary", "canary", "com.chrome.dev", "dev", "com.chrome.beta", "beta", "com.android.chrome", "stable");
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

    public static abch a() {
        abch abchVar = new abch();
        abchVar.b = null;
        abchVar.e(false);
        abchVar.b(false);
        abchVar.c(false);
        abchVar.d(false);
        return abchVar;
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
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.c, false);
        atzr.e(parcel, 3, this.d);
        atzr.e(parcel, 4, this.e);
        atzr.e(parcel, 5, this.f);
        atzr.e(parcel, 6, this.g);
        atzr.c(parcel, a2);
    }
}
