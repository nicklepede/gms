package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.feay;
import defpackage.zaa;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class BrowserOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zaa();
    public final String a;
    public final feay b;
    public final ChromeOptions c;

    public BrowserOptions(String str, feay feayVar, ChromeOptions chromeOptions) {
        arwm.s(str);
        this.a = str;
        this.b = feayVar;
        this.c = chromeOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserOptions)) {
            return false;
        }
        BrowserOptions browserOptions = (BrowserOptions) obj;
        return arwb.b(this.a, browserOptions.a) && arwb.b(this.b, browserOptions.b) && arwb.b(this.c, browserOptions.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        feay feayVar = this.b;
        arxc.i(parcel, 3, feayVar == null ? null : feayVar.M(), false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.c(parcel, a);
    }
}
