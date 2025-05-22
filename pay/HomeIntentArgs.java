package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvma;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class HomeIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvma();
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
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(homeIntentArgs.a)) && atyq.b(this.b, homeIntentArgs.b) && atyq.b(this.c, homeIntentArgs.c) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(homeIntentArgs.d))) {
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
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public HomeIntentArgs(boolean z, IntentSource intentSource, HomescreenConfig homescreenConfig, boolean z2) {
        this.a = z;
        this.b = intentSource;
        this.c = homescreenConfig;
        this.d = z2;
    }
}
