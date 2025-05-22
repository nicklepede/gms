package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.djgn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SettingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djgn();
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
        return atyq.b(Integer.valueOf(this.a), Integer.valueOf(settingState.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(settingState.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.o(parcel, 3, this.b);
        atzr.c(parcel, a);
    }

    public SettingState(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
