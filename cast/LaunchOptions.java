package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aodh;
import defpackage.aozc;
import defpackage.atzr;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class LaunchOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aodh();
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
        return this.a == launchOptions.a && aozc.u(this.b, launchOptions.b) && this.c == launchOptions.c && aozc.u(this.d, launchOptions.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 2, this.a);
        atzr.v(parcel, 3, this.b, false);
        atzr.e(parcel, 4, this.c);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.c(parcel, a);
    }

    public LaunchOptions() {
        this(false, aozc.i(Locale.getDefault()), false, null);
    }
}
