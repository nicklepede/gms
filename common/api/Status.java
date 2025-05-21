package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqxi;
import defpackage.aqyf;
import defpackage.aqyi;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, aqyf {
    public final int i;
    public final String j;
    public final PendingIntent k;
    public final ConnectionResult l;
    public static final Status a = new Status(-1);
    public static final Status b = new Status(0);
    public static final Status c = new Status(14);
    public static final Status d = new Status(8);
    public static final Status e = new Status(15);
    public static final Status f = new Status(16);
    public static final Status g = new Status(17);
    public static final Status h = new Status(18);
    public static final Parcelable.Creator CREATOR = new aqyi();

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.i = i;
        this.j = str;
        this.k = pendingIntent;
        this.l = connectionResult;
    }

    public final String b() {
        String str = this.j;
        return str != null ? str : aqxi.d(this.i);
    }

    public final void c(Activity activity, int i) {
        if (d()) {
            PendingIntent pendingIntent = this.k;
            arwm.s(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0, null);
        }
    }

    public final boolean d() {
        return this.k != null;
    }

    public final boolean e() {
        return this.i <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.i == status.i && arwb.b(this.j, status.j) && arwb.b(this.k, status.k) && arwb.b(this.l, status.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i), this.j, this.k, this.l});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("statusCode", b(), arrayList);
        arwa.b("resolution", this.k, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.i;
        int a2 = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.j, false);
        arxc.t(parcel, 3, this.k, i, false);
        arxc.t(parcel, 4, this.l, i, false);
        arxc.c(parcel, a2);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(17, str, connectionResult.d, connectionResult);
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this;
    }
}
