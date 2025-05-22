package com.google.android.gms.fitness.sessions.registration;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bizq;
import defpackage.ekus;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SessionRegistration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bizq();
    public final String a;
    public final String b;
    public final int c;
    public final PendingIntent d;

    public SessionRegistration(String str, String str2, int i, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionRegistration)) {
            return false;
        }
        SessionRegistration sessionRegistration = (SessionRegistration) obj;
        return this.c == sessionRegistration.c && ekus.a(this.a, sessionRegistration.a) && ekus.a(this.b, sessionRegistration.b) && ekus.a(this.d, sessionRegistration.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d});
    }

    public final String toString() {
        return String.format("SessionRegistration{accountName=%s, packageName=%s, uid=%s, pendingIntent=%s}", this.a, this.b, Integer.valueOf(this.c), this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }
}
