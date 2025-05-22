package com.google.android.gms.games.internal.popup;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bjug;
import defpackage.bjuh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PopupLocationInfoParcelable extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bjuh();
    public final Bundle a;
    public final IBinder b;

    public PopupLocationInfoParcelable(Bundle bundle, IBinder iBinder) {
        this.a = bundle;
        this.b = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.a;
        int a = atzr.a(parcel);
        atzr.g(parcel, 1, bundle, false);
        atzr.D(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public PopupLocationInfoParcelable(bjug bjugVar) {
        this.a = bjugVar.a();
        this.b = bjugVar.a;
    }
}
