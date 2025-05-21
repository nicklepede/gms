package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctcv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class HomeIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctcv();
    public boolean a;
    public IntentSource b;
    public HomescreenConfig c;
    public boolean d;

    public HomeIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeIntentArgs) {
            HomeIntentArgs homeIntentArgs = (HomeIntentArgs) obj;
            if (arwb.b(Boolean.valueOf(this.a), Boolean.valueOf(homeIntentArgs.a)) && arwb.b(this.b, homeIntentArgs.b) && arwb.b(this.c, homeIntentArgs.c) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(homeIntentArgs.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public HomeIntentArgs(boolean z, IntentSource intentSource, HomescreenConfig homescreenConfig, boolean z2) {
        this.a = z;
        this.b = intentSource;
        this.c = homescreenConfig;
        this.d = z2;
    }
}
