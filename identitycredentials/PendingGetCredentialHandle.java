package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bmmz;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PendingGetCredentialHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmmz();
    public final PendingIntent a;

    public PendingGetCredentialHandle(PendingIntent pendingIntent) {
        fvbo.f(pendingIntent, "pendingIntent");
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        PendingIntent pendingIntent = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, pendingIntent, i, false);
        arxc.c(parcel, a);
    }
}
