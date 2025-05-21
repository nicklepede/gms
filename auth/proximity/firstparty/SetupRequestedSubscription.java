package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.acnu;
import defpackage.arwm;
import defpackage.arxc;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SetupRequestedSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new acnu();
    public final PendingIntent a;
    public final String b;
    public final String c;

    public SetupRequestedSubscription(PendingIntent pendingIntent, String str, String str2) {
        arwm.s(pendingIntent);
        this.a = pendingIntent;
        arwm.s(str);
        this.b = str;
        arwm.b(!str.isEmpty());
        arwm.s(str2);
        this.c = str2;
        arwm.b(!str2.isEmpty());
    }

    @Override // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SetupRequestedSubscription setupRequestedSubscription = (SetupRequestedSubscription) obj;
            if (this.a.equals(setupRequestedSubscription.a) && this.b.equals(setupRequestedSubscription.b) && this.c.equals(setupRequestedSubscription.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return String.format(Locale.US, "SetupRequestedSubscription{mCallbackIntent=%s, mFeatureName=%s, mPackageName=%s}", this.a, this.b, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, pendingIntent, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
