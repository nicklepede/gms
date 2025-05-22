package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chbt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UserKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chbt();
    public Long a;
    public AuthType b;
    public String c;
    public Long d;

    private UserKey() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserKey) {
            UserKey userKey = (UserKey) obj;
            if (atyq.b(this.a, userKey.a) && atyq.b(this.b, userKey.b) && atyq.b(this.c, userKey.c) && atyq.b(this.d, userKey.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.I(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.I(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public UserKey(Long l, AuthType authType, String str, Long l2) {
        this.a = l;
        this.b = authType;
        this.c = str;
        this.d = l2;
    }
}
