package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.unu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GetHubTokenInternalResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new unu();
    public final TokenData a;
    public final String b;
    public final Intent c;
    public final PendingIntent d;

    public GetHubTokenInternalResponse(TokenData tokenData, String str, Intent intent, PendingIntent pendingIntent) {
        this.a = tokenData;
        this.b = str;
        this.c = intent;
        this.d = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }
}
