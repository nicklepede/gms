package com.google.android.gms.location.geofencer.manager;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.arxc;
import defpackage.bzxq;
import defpackage.fvbo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GeofenceKey extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bzxq();
    public final String a;
    public final String b;
    public final PendingIntent c;
    private final String d;

    public GeofenceKey(String str, String str2, String str3, PendingIntent pendingIntent) {
        fvbo.f(str3, "geofenceId");
        fvbo.f(pendingIntent, "pendingIntent");
        if (str == null && pendingIntent.getCreatorPackage() == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.d = true == fvbo.n(str, pendingIntent.getCreatorPackage()) ? null : str;
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
        fvbo.c(creatorPackage);
        return creatorPackage;
    }

    public final boolean b(ClientIdentity clientIdentity, String str) {
        fvbo.f(clientIdentity, "identity");
        fvbo.f(str, "geofenceId");
        String str2 = clientIdentity.e;
        fvbo.f(str2, "packageName");
        fvbo.f(str, "geofenceId");
        if (fvbo.n(a(), str2)) {
            return fvbo.n(this.a, clientIdentity.f) && fvbo.n(this.b, str);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GeofenceKey) {
            GeofenceKey geofenceKey = (GeofenceKey) obj;
            if (fvbo.n(a(), geofenceKey.a()) && fvbo.n(this.a, geofenceKey.a) && fvbo.n(this.b, geofenceKey.b) && fvbo.n(this.c, geofenceKey.c)) {
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
        fvbo.f(parcel, "parcel");
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, a(), false);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.c(parcel, a);
    }
}
