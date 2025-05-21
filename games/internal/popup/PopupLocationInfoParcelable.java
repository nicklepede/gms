package com.google.android.gms.games.internal.popup;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bhpr;
import defpackage.bhps;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PopupLocationInfoParcelable extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bhps();
    public final Bundle a;
    public final IBinder b;

    public PopupLocationInfoParcelable(Bundle bundle, IBinder iBinder) {
        this.a = bundle;
        this.b = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.a;
        int a = arxc.a(parcel);
        arxc.g(parcel, 1, bundle, false);
        arxc.D(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public PopupLocationInfoParcelable(bhpr bhprVar) {
        this.a = bhprVar.a();
        this.b = bhprVar.a;
    }
}
