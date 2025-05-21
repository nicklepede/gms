package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctfg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class WearClosedLoopCardIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctfg();
    public String a;
    public ProtoSafeParcelable b;
    public GooglePaymentMethodId c;
    public ProtoSafeParcelable d;
    public String e;

    private WearClosedLoopCardIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WearClosedLoopCardIntentArgs) {
            WearClosedLoopCardIntentArgs wearClosedLoopCardIntentArgs = (WearClosedLoopCardIntentArgs) obj;
            if (arwb.b(this.a, wearClosedLoopCardIntentArgs.a) && arwb.b(this.b, wearClosedLoopCardIntentArgs.b) && arwb.b(this.c, wearClosedLoopCardIntentArgs.c) && arwb.b(this.d, wearClosedLoopCardIntentArgs.d) && arwb.b(this.e, wearClosedLoopCardIntentArgs.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.e, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.c, i, false);
        arxc.c(parcel, a);
    }

    public WearClosedLoopCardIntentArgs(String str, ProtoSafeParcelable protoSafeParcelable, GooglePaymentMethodId googlePaymentMethodId, ProtoSafeParcelable protoSafeParcelable2, String str2) {
        this.a = str;
        this.b = protoSafeParcelable;
        this.c = googlePaymentMethodId;
        this.d = protoSafeParcelable2;
        this.e = str2;
    }
}
