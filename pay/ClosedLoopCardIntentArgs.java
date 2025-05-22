package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvkv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ClosedLoopCardIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvkv();
    public String a;
    public ProtoSafeParcelable b;
    public GooglePaymentMethodId c;
    public String d;
    public boolean e;
    public ProtoSafeParcelable f;
    public ProtoSafeParcelable g;
    public String h;

    private ClosedLoopCardIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosedLoopCardIntentArgs) {
            ClosedLoopCardIntentArgs closedLoopCardIntentArgs = (ClosedLoopCardIntentArgs) obj;
            if (atyq.b(this.a, closedLoopCardIntentArgs.a) && atyq.b(this.b, closedLoopCardIntentArgs.b) && atyq.b(this.c, closedLoopCardIntentArgs.c) && atyq.b(this.d, closedLoopCardIntentArgs.d) && atyq.b(Boolean.valueOf(this.e), Boolean.valueOf(closedLoopCardIntentArgs.e)) && atyq.b(this.f, closedLoopCardIntentArgs.f) && atyq.b(this.g, closedLoopCardIntentArgs.g) && atyq.b(this.h, closedLoopCardIntentArgs.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), this.f, this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.d, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.e(parcel, 4, this.e);
        atzr.t(parcel, 5, this.c, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.c(parcel, a);
    }

    public ClosedLoopCardIntentArgs(String str, ProtoSafeParcelable protoSafeParcelable, GooglePaymentMethodId googlePaymentMethodId, String str2, boolean z, ProtoSafeParcelable protoSafeParcelable2, ProtoSafeParcelable protoSafeParcelable3, String str3) {
        this.a = str;
        this.b = protoSafeParcelable;
        this.c = googlePaymentMethodId;
        this.d = str2;
        this.e = z;
        this.f = protoSafeParcelable2;
        this.g = protoSafeParcelable3;
        this.h = str3;
    }
}
