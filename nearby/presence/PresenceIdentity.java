package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmsq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PresenceIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmsq();
    public static final PresenceIdentity a = new PresenceIdentity(2, "");
    public static final PresenceIdentity b = new PresenceIdentity(0, "");
    public static final PresenceIdentity c = new PresenceIdentity(1, "");
    public static final PresenceIdentity d = new PresenceIdentity(-1, "");
    public final int e;
    public final String f;

    public PresenceIdentity(int i, String str) {
        this.e = i;
        this.f = str;
    }

    public static String a(int i) {
        return i != -1 ? i != 0 ? i != 1 ? i != 2 ? "not recognizable" : "public" : "contacts group" : "private group" : "unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PresenceIdentity) {
            PresenceIdentity presenceIdentity = (PresenceIdentity) obj;
            String str = this.f;
            if (str != null && !str.isEmpty()) {
                return this.e == presenceIdentity.e && str.equals(presenceIdentity.f);
            }
            if (this.e == presenceIdentity.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f;
        if (str == null || str.isEmpty()) {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.e)});
        }
        return Arrays.hashCode(new Object[]{this.e + str});
    }

    public final String toString() {
        return "Identity[type=" + a(this.e) + ", provider name =" + this.f + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.e;
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.f, false);
        atzr.c(parcel, a2);
    }
}
