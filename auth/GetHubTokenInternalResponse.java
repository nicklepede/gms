package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wjt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GetHubTokenInternalResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wjt();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }
}
