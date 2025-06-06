package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bewj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ClockSyncMessageStreamData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bewj();
    public int a;
    public byte[] b;

    public ClockSyncMessageStreamData() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClockSyncMessageStreamData) {
            ClockSyncMessageStreamData clockSyncMessageStreamData = (ClockSyncMessageStreamData) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(clockSyncMessageStreamData.a)) && Arrays.equals(this.b, clockSyncMessageStreamData.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public ClockSyncMessageStreamData(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }
}
