package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ambw;
import defpackage.amxr;
import defpackage.arxc;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class LaunchOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ambw();
    public boolean a;
    public String b;
    public boolean c;
    public CredentialsData d;

    public LaunchOptions(boolean z, String str, boolean z2, CredentialsData credentialsData) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = credentialsData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.a == launchOptions.a && amxr.u(this.b, launchOptions.b) && this.c == launchOptions.c && amxr.u(this.d, launchOptions.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 2, this.a);
        arxc.v(parcel, 3, this.b, false);
        arxc.e(parcel, 4, this.c);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.c(parcel, a);
    }

    public LaunchOptions() {
        this(false, amxr.i(Locale.getDefault()), false, null);
    }
}
