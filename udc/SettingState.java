package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dgvh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SettingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgvh();
    public int a;
    public int b;

    public SettingState() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingState)) {
            return false;
        }
        SettingState settingState = (SettingState) obj;
        return arwb.b(Integer.valueOf(this.a), Integer.valueOf(settingState.a)) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(settingState.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.o(parcel, 3, this.b);
        arxc.c(parcel, a);
    }

    public SettingState(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
