package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvmi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NavigationConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvmi();
    public boolean a;
    public int b;
    public int c;

    private NavigationConfig() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NavigationConfig) {
            NavigationConfig navigationConfig = (NavigationConfig) obj;
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(navigationConfig.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(navigationConfig.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(navigationConfig.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public NavigationConfig(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }
}
