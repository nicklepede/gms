package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abdk;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class VerifyWithGoogleResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abdk();
    public final String a;
    public final String b;
    public final List c;
    public final PendingIntent d;

    public VerifyWithGoogleResult(String str, String str2, List list, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        atzb.s(list);
        this.c = list;
        this.d = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VerifyWithGoogleResult)) {
            return false;
        }
        VerifyWithGoogleResult verifyWithGoogleResult = (VerifyWithGoogleResult) obj;
        return atyq.b(this.a, verifyWithGoogleResult.a) && atyq.b(this.b, verifyWithGoogleResult.b) && atyq.b(this.c, verifyWithGoogleResult.c) && atyq.b(this.d, verifyWithGoogleResult.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.x(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }
}
