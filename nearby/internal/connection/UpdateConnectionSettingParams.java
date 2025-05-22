package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.SettingOptions;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cljs;
import defpackage.clju;
import defpackage.clmo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UpdateConnectionSettingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clmo();
    public clju a;
    public SettingOptions b;

    public UpdateConnectionSettingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateConnectionSettingParams) {
            UpdateConnectionSettingParams updateConnectionSettingParams = (UpdateConnectionSettingParams) obj;
            if (atyq.b(this.a, updateConnectionSettingParams.a) && atyq.b(this.b, updateConnectionSettingParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }

    public UpdateConnectionSettingParams(IBinder iBinder, SettingOptions settingOptions) {
        atzb.s(iBinder);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
        this.a = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        this.b = settingOptions;
    }
}
