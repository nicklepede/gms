package com.google.android.gms.wallet.bender3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dihc;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class Bender3RedirectExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dihc();
    public final String a;
    public final int b;
    public final int c;

    public Bender3RedirectExtras(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    private static void a(Bundle bundle, String str, int i) {
        if (i != -1) {
            bundle.putInt(str, i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bender3RedirectExtras)) {
            return false;
        }
        Bender3RedirectExtras bender3RedirectExtras = (Bender3RedirectExtras) obj;
        return this.b == bender3RedirectExtras.b && this.c == bender3RedirectExtras.c && Objects.equals(this.a, bender3RedirectExtras.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String str = this.a;
        return String.format(locale, "{o1SessionId: %s, billableService: %d, regionCode: %d}", str != null ? String.format(Locale.ROOT, "\"%s\"", str.replaceAll("\"", "\\\"")) : null, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        String str = this.a;
        if (str != null) {
            bundle.putString("session_id", str);
        }
        a(bundle, "billable_service", this.b);
        a(bundle, "region_code", this.c);
        bundle.writeToParcel(parcel, i);
    }

    public Bender3RedirectExtras(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.a = readBundle.getString("session_id");
        this.b = readBundle.getInt("billable_service", -1);
        this.c = readBundle.getInt("region_code", -1);
    }
}
