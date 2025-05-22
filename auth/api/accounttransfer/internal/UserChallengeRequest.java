package com.google.android.gms.auth.api.accounttransfer.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.xlk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UserChallengeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xlk();
    public final String a;
    public final PendingIntent b;

    public UserChallengeRequest(String str, PendingIntent pendingIntent) {
        atzb.s(str);
        this.a = str;
        atzb.s(pendingIntent);
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, 1);
        atzr.v(parcel, 2, this.a, false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.c(parcel, a);
    }
}
