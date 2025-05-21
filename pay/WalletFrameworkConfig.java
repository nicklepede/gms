package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctfc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class WalletFrameworkConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctfc();
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
            if (arwb.b(this.a, walletFrameworkConfig.a) && arwb.b(this.b, walletFrameworkConfig.b) && arwb.b(this.c, walletFrameworkConfig.c) && arwb.b(this.d, walletFrameworkConfig.d)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }

    public WalletFrameworkConfig(NavigationConfig navigationConfig, WalletListConfig walletListConfig, OnboardingConfig onboardingConfig, AddItemsConfig addItemsConfig) {
        this.a = navigationConfig;
        this.b = walletListConfig;
        this.c = onboardingConfig;
        this.d = addItemsConfig;
    }
}
