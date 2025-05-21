package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dgvd;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DeviceDataUploadOptedInAccountsParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgvd();
    public final List a;
    public final List b;

    public DeviceDataUploadOptedInAccountsParcelable(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceDataUploadOptedInAccountsParcelable) {
            DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable = (DeviceDataUploadOptedInAccountsParcelable) obj;
            if (arwb.b(this.a, deviceDataUploadOptedInAccountsParcelable.a) && arwb.b(this.b, deviceDataUploadOptedInAccountsParcelable.b)) {
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
        int a = arxc.a(parcel);
        arxc.x(parcel, 2, list, false);
        arxc.x(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
