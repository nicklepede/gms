package com.google.android.gms.location.geofencer.manager;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.atzr;
import defpackage.ccgh;
import defpackage.fxxm;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GeofenceKey extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ccgh();
    public final String a;
    public final String b;
    public final PendingIntent c;
    private final String d;

    public GeofenceKey(String str, String str2, String str3, PendingIntent pendingIntent) {
        fxxm.f(str3, "geofenceId");
        fxxm.f(pendingIntent, "pendingIntent");
        if (str == null && pendingIntent.getCreatorPackage() == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.d = true == fxxm.n(str, pendingIntent.getCreatorPackage()) ? null : str;
        this.a = str2;
        this.b = str3;
        this.c = pendingIntent;
    }

    public final String a() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String creatorPackage = this.c.getCreatorPackage();
        fxxm.c(creatorPackage);
        return creatorPackage;
    }

    public final boolean b(ClientIdentity clientIdentity, String str) {
        fxxm.f(clientIdentity, "identity");
        fxxm.f(str, "geofenceId");
        String str2 = clientIdentity.e;
        fxxm.f(str2, "packageName");
        fxxm.f(str, "geofenceId");
        if (fxxm.n(a(), str2)) {
            return fxxm.n(this.a, clientIdentity.f) && fxxm.n(this.b, str);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GeofenceKey) {
            GeofenceKey geofenceKey = (GeofenceKey) obj;
            if (fxxm.n(a(), geofenceKey.a()) && fxxm.n(this.a, geofenceKey.a) && fxxm.n(this.b, geofenceKey.b) && fxxm.n(this.c, geofenceKey.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "parcel");
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, a(), false);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.c(parcel, a);
    }
}
