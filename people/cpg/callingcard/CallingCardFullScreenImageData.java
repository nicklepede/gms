package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwgp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class CallingCardFullScreenImageData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwgp();
    public final float a;
    public final float b;
    public final float c;

    public CallingCardFullScreenImageData(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallingCardFullScreenImageData) {
            CallingCardFullScreenImageData callingCardFullScreenImageData = (CallingCardFullScreenImageData) obj;
            if (this.a == callingCardFullScreenImageData.a && this.b == callingCardFullScreenImageData.b && this.c == callingCardFullScreenImageData.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = atzr.a(parcel);
        atzr.l(parcel, 1, f);
        atzr.l(parcel, 2, this.b);
        atzr.l(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
