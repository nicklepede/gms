package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqxf;
import defpackage.arxc;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = aqxf.a;
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
        int a2 = arxc.a(parcel);
        arxc.t(parcel, 1, complianceOptions, i, false);
        arxc.c(parcel, a2);
    }
}
