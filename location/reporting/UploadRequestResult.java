package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.ccua;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UploadRequestResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccua();
    public final int a;
    public final long b;

    public UploadRequestResult(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UploadRequestResult)) {
            return false;
        }
        UploadRequestResult uploadRequestResult = (UploadRequestResult) obj;
        return this.b == uploadRequestResult.b && this.a == uploadRequestResult.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        return "Result{, mResultCode=" + this.a + ", mRequestId=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.q(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
