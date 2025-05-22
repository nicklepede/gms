package com.google.android.gms.libs.featurestatus.internal.binder;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bsxx;
import defpackage.bsxy;
import defpackage.bsxz;
import defpackage.bsya;
import defpackage.btbh;
import defpackage.cbje;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class Action extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new btbh();
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

    public final bsya a() {
        Integer num;
        cbje b = cbje.b(this.c);
        if (b == null) {
            b = cbje.ACTION_UNKNOWN;
        }
        Intent intent = this.a;
        if (intent != null && (num = this.d) != null) {
            return new bsxz(intent, b, num.intValue());
        }
        if (intent != null) {
            return new bsxy(intent, b);
        }
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return new bsxx(pendingIntent, b);
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
        if (this.c != action.c || !fxxm.n(this.d, action.d)) {
            return false;
        }
        Intent intent = this.a;
        if (intent != null) {
            return intent.filterEquals(action.a);
        }
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return fxxm.n(pendingIntent, action.b);
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
        fxxm.f(parcel, "dest");
        Intent intent = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, intent, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.o(parcel, 3, this.c);
        atzr.F(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
