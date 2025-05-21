package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cakw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class Deletion extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new cakw();
    public final Account a;
    public final long b;
    public final long c;
    public final long d;

    public Deletion(Account account, long j, long j2, long j3) {
        this.a = account;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Deletion)) {
            return false;
        }
        Deletion deletion = (Deletion) obj;
        return this.b == deletion.b && this.c == deletion.c && this.d == deletion.d && arwb.b(this.a, deletion.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        return "Deletion{mAccount=" + String.valueOf(this.a) + ", mStartTimeMs=" + this.b + ", mEndTimeMs=" + this.c + ", mTimestampMs=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, account, i, false);
        arxc.q(parcel, 3, this.b);
        arxc.q(parcel, 4, this.c);
        arxc.q(parcel, 5, this.d);
        arxc.c(parcel, a);
    }
}
