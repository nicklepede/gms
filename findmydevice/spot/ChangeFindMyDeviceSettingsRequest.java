package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bcuv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ChangeFindMyDeviceSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bcuv();
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
            if (arwb.b(this.a, changeFindMyDeviceSettingsRequest.a) && arwb.b(this.b, changeFindMyDeviceSettingsRequest.b) && arwb.b(this.c, changeFindMyDeviceSettingsRequest.c) && arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(changeFindMyDeviceSettingsRequest.d))) {
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
        int a = arxc.a(parcel);
        arxc.z(parcel, 1, this.a);
        arxc.e(parcel, 3, this.d);
        arxc.z(parcel, 4, this.b);
        arxc.t(parcel, 5, this.c, i, false);
        arxc.c(parcel, a);
    }

    public ChangeFindMyDeviceSettingsRequest(Boolean bool, Boolean bool2, FindMyDeviceNetworkSettings findMyDeviceNetworkSettings, boolean z) {
        this.a = bool;
        this.b = bool2;
        this.c = findMyDeviceNetworkSettings;
        this.d = z;
    }
}
