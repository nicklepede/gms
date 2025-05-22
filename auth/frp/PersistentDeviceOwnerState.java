package com.google.android.gms.auth.frp;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adoh;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public final class PersistentDeviceOwnerState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adoh();
    public final ComponentName a;
    public final String b;

    public PersistentDeviceOwnerState(ComponentName componentName, String str) {
        this.a = componentName;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}
