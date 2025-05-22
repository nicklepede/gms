package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.djgj;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DeviceDataUploadOptedInAccountsParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djgj();
    public final List a;
    public final List b;

    public DeviceDataUploadOptedInAccountsParcelable(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceDataUploadOptedInAccountsParcelable) {
            DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable = (DeviceDataUploadOptedInAccountsParcelable) obj;
            if (atyq.b(this.a, deviceDataUploadOptedInAccountsParcelable.a) && atyq.b(this.b, deviceDataUploadOptedInAccountsParcelable.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.x(parcel, 2, list, false);
        atzr.x(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}
