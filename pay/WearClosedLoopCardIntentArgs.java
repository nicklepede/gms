package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvom;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class WearClosedLoopCardIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvom();
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
            if (atyq.b(this.a, wearClosedLoopCardIntentArgs.a) && atyq.b(this.b, wearClosedLoopCardIntentArgs.b) && atyq.b(this.c, wearClosedLoopCardIntentArgs.c) && atyq.b(this.d, wearClosedLoopCardIntentArgs.d) && atyq.b(this.e, wearClosedLoopCardIntentArgs.e)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.e, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.c, i, false);
        atzr.c(parcel, a);
    }

    public WearClosedLoopCardIntentArgs(String str, ProtoSafeParcelable protoSafeParcelable, GooglePaymentMethodId googlePaymentMethodId, ProtoSafeParcelable protoSafeParcelable2, String str2) {
        this.a = str;
        this.b = protoSafeParcelable;
        this.c = googlePaymentMethodId;
        this.d = protoSafeParcelable2;
        this.e = str2;
    }
}
