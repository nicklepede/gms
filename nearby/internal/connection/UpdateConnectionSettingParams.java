package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.SettingOptions;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjej;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class UpdateConnectionSettingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjej();
    public cjbp a;
    public SettingOptions b;

    public UpdateConnectionSettingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateConnectionSettingParams) {
            UpdateConnectionSettingParams updateConnectionSettingParams = (UpdateConnectionSettingParams) obj;
            if (arwb.b(this.a, updateConnectionSettingParams.a) && arwb.b(this.b, updateConnectionSettingParams.b)) {
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
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public UpdateConnectionSettingParams(IBinder iBinder, SettingOptions settingOptions) {
        arwm.s(iBinder);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
        this.a = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        this.b = settingOptions;
    }
}
