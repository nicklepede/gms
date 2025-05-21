package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcwq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class StartFinderAdvertisingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcwq();
    public String a;

    private StartFinderAdvertisingRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartFinderAdvertisingRequest) {
            return arwb.b(this.a, ((StartFinderAdvertisingRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.c(parcel, a);
    }

    public StartFinderAdvertisingRequest(String str) {
        this.a = str;
    }
}
