package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cvnd;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SaveImagesForValuableResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnd();
    public String[] a;

    private SaveImagesForValuableResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveImagesForValuableResponse) {
            return Arrays.equals(this.a, ((SaveImagesForValuableResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.w(parcel, 1, this.a, false);
        atzr.c(parcel, a);
    }

    public SaveImagesForValuableResponse(String[] strArr) {
        this.a = strArr;
    }
}
