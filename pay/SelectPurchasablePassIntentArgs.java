package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cteg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SelectPurchasablePassIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cteg();
    public ProtoSafeParcelable a;
    public long b;
    public String c;

    private SelectPurchasablePassIntentArgs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectPurchasablePassIntentArgs) {
            SelectPurchasablePassIntentArgs selectPurchasablePassIntentArgs = (SelectPurchasablePassIntentArgs) obj;
            if (arwb.b(this.a, selectPurchasablePassIntentArgs.a) && arwb.b(Long.valueOf(this.b), Long.valueOf(selectPurchasablePassIntentArgs.b)) && arwb.b(this.c, selectPurchasablePassIntentArgs.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.q(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public SelectPurchasablePassIntentArgs(ProtoSafeParcelable protoSafeParcelable, long j, String str) {
        this.a = protoSafeParcelable;
        this.b = j;
        this.c = str;
    }
}
