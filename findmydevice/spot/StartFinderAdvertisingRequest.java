package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.beyc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class StartFinderAdvertisingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new beyc();
    public String a;

    private StartFinderAdvertisingRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartFinderAdvertisingRequest) {
            return atyq.b(this.a, ((StartFinderAdvertisingRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.c(parcel, a);
    }

    public StartFinderAdvertisingRequest(String str) {
        this.a = str;
    }
}
