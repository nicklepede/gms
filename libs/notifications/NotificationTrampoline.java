package com.google.android.gms.libs.notifications;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bzit;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NotificationTrampoline extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bzit();
    public final PendingIntent a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final int h;

    public NotificationTrampoline(PendingIntent pendingIntent, int i, String str, String str2, String str3, int i2, String str4, int i3) {
        this.a = pendingIntent;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i2;
        this.g = str4;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationTrampoline)) {
            return false;
        }
        NotificationTrampoline notificationTrampoline = (NotificationTrampoline) obj;
        return this.b == notificationTrampoline.b && this.f == notificationTrampoline.f && Objects.equals(this.a, notificationTrampoline.a) && Objects.equals(this.c, notificationTrampoline.c) && Objects.equals(this.d, notificationTrampoline.d) && Objects.equals(this.e, notificationTrampoline.e) && Objects.equals(this.g, notificationTrampoline.g);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, this.e, Integer.valueOf(this.f), this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, pendingIntent, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.o(parcel, 6, this.f);
        atzr.v(parcel, 7, this.g, false);
        atzr.o(parcel, 8, this.h);
        atzr.c(parcel, a);
    }
}
