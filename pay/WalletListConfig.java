package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvok;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class WalletListConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvok();
    public ApiLoaderConfig[] a;
    public PresentationConfig b;
    public SortOrderInfo c;

    private WalletListConfig() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletListConfig) {
            WalletListConfig walletListConfig = (WalletListConfig) obj;
            if (Arrays.equals(this.a, walletListConfig.a) && atyq.b(this.b, walletListConfig.b) && atyq.b(this.c, walletListConfig.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public WalletListConfig(ApiLoaderConfig[] apiLoaderConfigArr, PresentationConfig presentationConfig, SortOrderInfo sortOrderInfo) {
        this.a = apiLoaderConfigArr;
        this.b = presentationConfig;
        this.c = sortOrderInfo;
    }
}
