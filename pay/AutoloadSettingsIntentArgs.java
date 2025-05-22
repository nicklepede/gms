package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvkt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class AutoloadSettingsIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvkt();
    public GooglePaymentMethodId a;
    public IntentSource b;
    public String c;

    private AutoloadSettingsIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutoloadSettingsIntentArgs) {
            AutoloadSettingsIntentArgs autoloadSettingsIntentArgs = (AutoloadSettingsIntentArgs) obj;
            if (atyq.b(this.a, autoloadSettingsIntentArgs.a) && atyq.b(this.b, autoloadSettingsIntentArgs.b) && atyq.b(this.c, autoloadSettingsIntentArgs.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public AutoloadSettingsIntentArgs(GooglePaymentMethodId googlePaymentMethodId, IntentSource intentSource, String str) {
        this.a = googlePaymentMethodId;
        this.b = intentSource;
        this.c = str;
    }
}
