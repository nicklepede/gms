package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chnl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class SettingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chnl();
    public boolean a;

    public SettingOptions() {
        this.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SettingOptions) {
            return atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(((SettingOptions) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.c(parcel, a);
    }

    public SettingOptions(boolean z) {
        this.a = z;
    }
}
