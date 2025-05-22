package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wkx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppRestriction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wkx();
    public final AppRestrictionState a;
    public final AppRestrictionInfo b;

    public AppRestriction(AppRestrictionState appRestrictionState, AppRestrictionInfo appRestrictionInfo) {
        this.a = appRestrictionState;
        this.b = appRestrictionInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppRestrictionState appRestrictionState = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, appRestrictionState, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
