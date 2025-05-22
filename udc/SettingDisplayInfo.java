package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.djgm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SettingDisplayInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djgm();
    public SettingState a;
    public String b;
    public String c;

    public SettingDisplayInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingDisplayInfo)) {
            return false;
        }
        SettingDisplayInfo settingDisplayInfo = (SettingDisplayInfo) obj;
        return atyq.b(this.b, settingDisplayInfo.b) && atyq.b(this.c, settingDisplayInfo.c) && atyq.b(this.a, settingDisplayInfo.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }

    public SettingDisplayInfo(SettingState settingState, String str, String str2) {
        this.a = settingState;
        this.b = str;
        this.c = str2;
    }
}
