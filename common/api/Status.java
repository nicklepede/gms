package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aszx;
import defpackage.atau;
import defpackage.atax;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, atau {
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
    public static final Parcelable.Creator CREATOR = new atax();

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.i = i;
        this.j = str;
        this.k = pendingIntent;
        this.l = connectionResult;
    }

    public final String b() {
        String str = this.j;
        return str != null ? str : aszx.d(this.i);
    }

    public final void c(Activity activity, int i) {
        if (d()) {
            PendingIntent pendingIntent = this.k;
            atzb.s(pendingIntent);
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
        return this.i == status.i && atyq.b(this.j, status.j) && atyq.b(this.k, status.k) && atyq.b(this.l, status.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i), this.j, this.k, this.l});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("statusCode", b(), arrayList);
        atyp.b("resolution", this.k, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.i;
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.j, false);
        atzr.t(parcel, 3, this.k, i, false);
        atzr.t(parcel, 4, this.l, i, false);
        atzr.c(parcel, a2);
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

    @Override // defpackage.atau
    public final Status a() {
        return this;
    }
}
