package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aszu;
import defpackage.atzr;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = aszu.a;
    public static final ApiMetadata a = new ApiMetadata(null);
    public final ComplianceOptions b;

    public ApiMetadata(ComplianceOptions complianceOptions) {
        this.b = complianceOptions;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ApiMetadata) {
            return Objects.equals(this.b, ((ApiMetadata) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b);
    }

    public final String toString() {
        return "ApiMetadata(complianceOptions=" + String.valueOf(this.b) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-204102970);
        ComplianceOptions complianceOptions = this.b;
        int a2 = atzr.a(parcel);
        atzr.t(parcel, 1, complianceOptions, i, false);
        atzr.c(parcel, a2);
    }
}
