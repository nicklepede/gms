package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctbq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ClosedLoopCardIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctbq();
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
            if (arwb.b(this.a, closedLoopCardIntentArgs.a) && arwb.b(this.b, closedLoopCardIntentArgs.b) && arwb.b(this.c, closedLoopCardIntentArgs.c) && arwb.b(this.d, closedLoopCardIntentArgs.d) && arwb.b(Boolean.valueOf(this.e), Boolean.valueOf(closedLoopCardIntentArgs.e)) && arwb.b(this.f, closedLoopCardIntentArgs.f) && arwb.b(this.g, closedLoopCardIntentArgs.g) && arwb.b(this.h, closedLoopCardIntentArgs.h)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.d, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.e(parcel, 4, this.e);
        arxc.t(parcel, 5, this.c, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.c(parcel, a);
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
