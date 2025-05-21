package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.zcj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zcj();
    public final PendingIntent a;

    public BeginSignInResult(PendingIntent pendingIntent) {
        arwm.s(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, pendingIntent, i, false);
        arxc.c(parcel, a);
    }
}
