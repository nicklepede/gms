package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cteh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SmartTapTransmissionData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cteh();
    public String[] a;

    private SmartTapTransmissionData() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SmartTapTransmissionData) {
            return Arrays.equals(this.a, ((SmartTapTransmissionData) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.w(parcel, 1, this.a, false);
        arxc.c(parcel, a);
    }

    public SmartTapTransmissionData(String[] strArr) {
        this.a = strArr;
    }
}
