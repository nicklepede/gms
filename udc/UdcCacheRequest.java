package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.djgu;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UdcCacheRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djgu();
    public final int[] a;

    public UdcCacheRequest(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof UdcCacheRequest)) {
            return Arrays.equals(this.a, ((UdcCacheRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("SettingId", Arrays.toString(this.a), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr = this.a;
        int a = atzr.a(parcel);
        atzr.p(parcel, 2, iArr, false);
        atzr.c(parcel, a);
    }
}
