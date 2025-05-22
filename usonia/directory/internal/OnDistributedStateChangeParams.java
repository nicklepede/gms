package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.usonia.DeviceInfo;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkim;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class OnDistributedStateChangeParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkim();
    public DeviceInfo a;
    public String b;
    public byte[] c;
    public boolean d;

    private OnDistributedStateChangeParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnDistributedStateChangeParams) {
            OnDistributedStateChangeParams onDistributedStateChangeParams = (OnDistributedStateChangeParams) obj;
            if (atyq.b(this.a, onDistributedStateChangeParams.a) && atyq.b(this.b, onDistributedStateChangeParams.b) && Arrays.equals(this.c, onDistributedStateChangeParams.c) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(onDistributedStateChangeParams.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public OnDistributedStateChangeParams(DeviceInfo deviceInfo, String str, byte[] bArr, boolean z) {
        this.a = deviceInfo;
        this.b = str;
        this.c = bArr;
        this.d = z;
    }
}
