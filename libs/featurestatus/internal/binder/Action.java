package com.google.android.gms.libs.featurestatus.internal.binder;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bqqg;
import defpackage.bqqh;
import defpackage.bqqi;
import defpackage.bqqj;
import defpackage.bqtq;
import defpackage.bzan;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class Action extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqtq();
    public final Intent a;
    public final PendingIntent b;
    public final int c;
    public final Integer d;

    public Action(Intent intent, PendingIntent pendingIntent, int i, Integer num) {
        this.a = intent;
        this.b = pendingIntent;
        this.c = i;
        this.d = num;
    }

    public final bqqj a() {
        Integer num;
        bzan b = bzan.b(this.c);
        if (b == null) {
            b = bzan.ACTION_UNKNOWN;
        }
        Intent intent = this.a;
        if (intent != null && (num = this.d) != null) {
            return new bqqi(intent, b, num.intValue());
        }
        if (intent != null) {
            return new bqqh(intent, b);
        }
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return new bqqg(pendingIntent, b);
        }
        throw new IllegalStateException("Action must have an Intent.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        if (this.c != action.c || !fvbo.n(this.d, action.d)) {
            return false;
        }
        Intent intent = this.a;
        if (intent != null) {
            return intent.filterEquals(action.a);
        }
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return fvbo.n(pendingIntent, action.b);
        }
        throw new IllegalStateException("Action must have an Intent.");
    }

    public final int hashCode() {
        Intent intent = this.a;
        if (intent != null) {
            int filterHashCode = intent.filterHashCode() ^ this.c;
            Integer num = this.d;
            return filterHashCode ^ (num != null ? num.hashCode() : 0);
        }
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode() ^ this.c;
        }
        throw new IllegalStateException("Action must have an Intent.");
    }

    public final String toString() {
        return "Action(startActivity=" + this.a + ", sendIntent=" + this.b + ", actionIdNumber=" + this.c + ", requestCode=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        Intent intent = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, intent, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.o(parcel, 3, this.c);
        arxc.F(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}
