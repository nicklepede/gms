package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dhhw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class CheckContactlessEligibilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhhw();
    public boolean a;
    public boolean b;

    private CheckContactlessEligibilityResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckContactlessEligibilityResponse) {
            CheckContactlessEligibilityResponse checkContactlessEligibilityResponse = (CheckContactlessEligibilityResponse) obj;
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(checkContactlessEligibilityResponse.a)) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(checkContactlessEligibilityResponse.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public CheckContactlessEligibilityResponse(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
