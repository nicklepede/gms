package com.google.android.gms.auth.api.accounttransfer.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.vpj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UserChallengeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vpj();
    public final String a;
    public final PendingIntent b;

    public UserChallengeRequest(String str, PendingIntent pendingIntent) {
        arwm.s(str);
        this.a = str;
        arwm.s(pendingIntent);
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, 1);
        arxc.v(parcel, 2, this.a, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.c(parcel, a);
    }
}
