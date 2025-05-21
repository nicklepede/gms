package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.zdp;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class VerifyWithGoogleResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zdp();
    public final String a;
    public final String b;
    public final List c;
    public final PendingIntent d;

    public VerifyWithGoogleResult(String str, String str2, List list, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        arwm.s(list);
        this.c = list;
        this.d = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VerifyWithGoogleResult)) {
            return false;
        }
        VerifyWithGoogleResult verifyWithGoogleResult = (VerifyWithGoogleResult) obj;
        return arwb.b(this.a, verifyWithGoogleResult.a) && arwb.b(this.b, verifyWithGoogleResult.b) && arwb.b(this.c, verifyWithGoogleResult.c) && arwb.b(this.d, verifyWithGoogleResult.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.x(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }
}
