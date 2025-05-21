package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.uoy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppRestriction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uoy();
    public final AppRestrictionState a;
    public final AppRestrictionInfo b;

    public AppRestriction(AppRestrictionState appRestrictionState, AppRestrictionInfo appRestrictionInfo) {
        this.a = appRestrictionState;
        this.b = appRestrictionInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AppRestrictionState appRestrictionState = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, appRestrictionState, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
