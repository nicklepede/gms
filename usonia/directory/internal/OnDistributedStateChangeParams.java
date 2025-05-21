package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.usonia.DeviceInfo;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dhxe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class OnDistributedStateChangeParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhxe();
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
            if (arwb.b(this.a, onDistributedStateChangeParams.a) && arwb.b(this.b, onDistributedStateChangeParams.b) && Arrays.equals(this.c, onDistributedStateChangeParams.c) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(onDistributedStateChangeParams.d))) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public OnDistributedStateChangeParams(DeviceInfo deviceInfo, String str, byte[] bArr, boolean z) {
        this.a = deviceInfo;
        this.b = str;
        this.c = bArr;
        this.d = z;
    }
}
