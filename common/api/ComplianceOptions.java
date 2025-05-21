package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqxj;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public static final ComplianceOptions a = new ComplianceOptions(-1, -1, 0, true);
    public static final Parcelable.Creator CREATOR = new aqxj();

    public ComplianceOptions(int i, int i2, int i3, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.b == complianceOptions.b && this.c == complianceOptions.c && this.d == complianceOptions.d && this.e == complianceOptions.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.b + ", dataOwnerProductId=" + this.c + ", processingReason=" + this.d + ", isUserData=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int a2 = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.c);
        arxc.o(parcel, 3, this.d);
        arxc.e(parcel, 4, this.e);
        arxc.c(parcel, a2);
    }
}
