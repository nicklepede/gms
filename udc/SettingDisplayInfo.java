package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dgvg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SettingDisplayInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgvg();
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
        return arwb.b(this.b, settingDisplayInfo.b) && arwb.b(this.c, settingDisplayInfo.c) && arwb.b(this.a, settingDisplayInfo.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }

    public SettingDisplayInfo(SettingState settingState, String str, String str2) {
        this.a = settingState;
        this.b = str;
        this.c = str2;
    }
}
