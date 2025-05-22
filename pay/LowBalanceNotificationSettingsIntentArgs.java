package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvmd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class LowBalanceNotificationSettingsIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvmd();
    public GooglePaymentMethodId a;
    public IntentSource b;

    private LowBalanceNotificationSettingsIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LowBalanceNotificationSettingsIntentArgs) {
            LowBalanceNotificationSettingsIntentArgs lowBalanceNotificationSettingsIntentArgs = (LowBalanceNotificationSettingsIntentArgs) obj;
            if (atyq.b(this.a, lowBalanceNotificationSettingsIntentArgs.a) && atyq.b(this.b, lowBalanceNotificationSettingsIntentArgs.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public LowBalanceNotificationSettingsIntentArgs(GooglePaymentMethodId googlePaymentMethodId, IntentSource intentSource) {
        this.a = googlePaymentMethodId;
        this.b = intentSource;
    }
}
