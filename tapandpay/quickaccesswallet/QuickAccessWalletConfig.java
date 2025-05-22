package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhkv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class QuickAccessWalletConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhkv();
    public int a;
    public int b;
    public int c;
    public String[] d;

    private QuickAccessWalletConfig() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(quickAccessWalletConfig.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(quickAccessWalletConfig.b)) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(quickAccessWalletConfig.c)) && Arrays.equals(this.d, quickAccessWalletConfig.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.w(parcel, 5, this.d, false);
        atzr.c(parcel, a);
    }

    public QuickAccessWalletConfig(int i, int i2, int i3, String[] strArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = strArr;
    }
}
