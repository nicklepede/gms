package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctcy;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class LowBalanceNotificationSettingsIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctcy();
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
            if (arwb.b(this.a, lowBalanceNotificationSettingsIntentArgs.a) && arwb.b(this.b, lowBalanceNotificationSettingsIntentArgs.b)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public LowBalanceNotificationSettingsIntentArgs(GooglePaymentMethodId googlePaymentMethodId, IntentSource intentSource) {
        this.a = googlePaymentMethodId;
        this.b = intentSource;
    }
}
