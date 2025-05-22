package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhhv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class CheckContactlessEligibilityRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhhv();
    public String a;

    public CheckContactlessEligibilityRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckContactlessEligibilityRequest) {
            return atyq.b(this.a, ((CheckContactlessEligibilityRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.c(parcel, a);
    }

    public CheckContactlessEligibilityRequest(String str) {
        this.a = str;
    }
}
