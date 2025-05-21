package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bcvm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GetHistoricalAccountKeysResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcvm();
    public HistoricalAccountKeyInformation[] a;

    public GetHistoricalAccountKeysResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetHistoricalAccountKeysResponse) {
            return Arrays.equals(this.a, ((GetHistoricalAccountKeysResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.J(parcel, 1, this.a, i);
        arxc.c(parcel, a);
    }

    public GetHistoricalAccountKeysResponse(HistoricalAccountKeyInformation[] historicalAccountKeyInformationArr) {
        this.a = historicalAccountKeyInformationArr;
    }
}
