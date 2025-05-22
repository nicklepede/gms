package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bewh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ChangeFindMyDeviceSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bewh();
    public Boolean a;
    public Boolean b;
    public FindMyDeviceNetworkSettings c;
    public boolean d;

    public ChangeFindMyDeviceSettingsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangeFindMyDeviceSettingsRequest) {
            ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest = (ChangeFindMyDeviceSettingsRequest) obj;
            if (atyq.b(this.a, changeFindMyDeviceSettingsRequest.a) && atyq.b(this.b, changeFindMyDeviceSettingsRequest.b) && atyq.b(this.c, changeFindMyDeviceSettingsRequest.c) && atyq.b(Boolean.valueOf(this.d), Boolean.valueOf(changeFindMyDeviceSettingsRequest.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.z(parcel, 1, this.a);
        atzr.e(parcel, 3, this.d);
        atzr.z(parcel, 4, this.b);
        atzr.t(parcel, 5, this.c, i, false);
        atzr.c(parcel, a);
    }

    public ChangeFindMyDeviceSettingsRequest(Boolean bool, Boolean bool2, FindMyDeviceNetworkSettings findMyDeviceNetworkSettings, boolean z) {
        this.a = bool;
        this.b = bool2;
        this.c = findMyDeviceNetworkSettings;
        this.d = z;
    }
}
