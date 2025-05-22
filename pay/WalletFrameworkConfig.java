package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvoi;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class WalletFrameworkConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvoi();
    public NavigationConfig a;
    public WalletListConfig b;
    public OnboardingConfig c;
    public AddItemsConfig d;

    private WalletFrameworkConfig() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletFrameworkConfig) {
            WalletFrameworkConfig walletFrameworkConfig = (WalletFrameworkConfig) obj;
            if (atyq.b(this.a, walletFrameworkConfig.a) && atyq.b(this.b, walletFrameworkConfig.b) && atyq.b(this.c, walletFrameworkConfig.c) && atyq.b(this.d, walletFrameworkConfig.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    public WalletFrameworkConfig(NavigationConfig navigationConfig, WalletListConfig walletListConfig, OnboardingConfig onboardingConfig, AddItemsConfig addItemsConfig) {
        this.a = navigationConfig;
        this.b = walletListConfig;
        this.c = onboardingConfig;
        this.d = addItemsConfig;
    }
}
