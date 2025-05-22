package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvks;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ApiLoaderConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvks();
    public int a;
    public PaymentMethodsConfig b;
    public ValuablesConfig c;
    public ClosedLoopCardsConfig d;

    private ApiLoaderConfig() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApiLoaderConfig) {
            ApiLoaderConfig apiLoaderConfig = (ApiLoaderConfig) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(apiLoaderConfig.a)) && atyq.b(this.b, apiLoaderConfig.b) && atyq.b(this.c, apiLoaderConfig.c) && atyq.b(this.d, apiLoaderConfig.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    public ApiLoaderConfig(int i, PaymentMethodsConfig paymentMethodsConfig, ValuablesConfig valuablesConfig, ClosedLoopCardsConfig closedLoopCardsConfig) {
        this.a = i;
        this.b = paymentMethodsConfig;
        this.c = valuablesConfig;
        this.d = closedLoopCardsConfig;
    }
}
