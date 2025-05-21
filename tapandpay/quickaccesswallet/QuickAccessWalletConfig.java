package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dezp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class QuickAccessWalletConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dezp();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(quickAccessWalletConfig.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(quickAccessWalletConfig.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(quickAccessWalletConfig.c)) && Arrays.equals(this.d, quickAccessWalletConfig.d)) {
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.w(parcel, 5, this.d, false);
        arxc.c(parcel, a);
    }

    public QuickAccessWalletConfig(int i, int i2, int i3, String[] strArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = strArr;
    }
}
