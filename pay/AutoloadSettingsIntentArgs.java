package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctbp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class AutoloadSettingsIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctbp();
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
            if (arwb.b(this.a, autoloadSettingsIntentArgs.a) && arwb.b(this.b, autoloadSettingsIntentArgs.b) && arwb.b(this.c, autoloadSettingsIntentArgs.c)) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public AutoloadSettingsIntentArgs(GooglePaymentMethodId googlePaymentMethodId, IntentSource intentSource, String str) {
        this.a = googlePaymentMethodId;
        this.b = intentSource;
        this.c = str;
    }
}
