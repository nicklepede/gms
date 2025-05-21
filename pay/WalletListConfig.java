package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctfe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class WalletListConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctfe();
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
            if (Arrays.equals(this.a, walletListConfig.a) && arwb.b(this.b, walletListConfig.b) && arwb.b(this.c, walletListConfig.c)) {
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
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }

    public WalletListConfig(ApiLoaderConfig[] apiLoaderConfigArr, PresentationConfig presentationConfig, SortOrderInfo sortOrderInfo) {
        this.a = apiLoaderConfigArr;
        this.b = presentationConfig;
        this.c = sortOrderInfo;
    }
}
