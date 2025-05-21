package com.google.android.gms.auth.frp;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aboh;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public final class PersistentDeviceOwnerState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aboh();
    public final ComponentName a;
    public final String b;

    public PersistentDeviceOwnerState(ComponentName componentName, String str) {
        this.a = componentName;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
