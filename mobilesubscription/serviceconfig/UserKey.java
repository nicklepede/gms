package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cesl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class UserKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cesl();
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
            if (arwb.b(this.a, userKey.a) && arwb.b(this.b, userKey.b) && arwb.b(this.c, userKey.c) && arwb.b(this.d, userKey.d)) {
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
        int a = arxc.a(parcel);
        arxc.I(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.I(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public UserKey(Long l, AuthType authType, String str, Long l2) {
        this.a = l;
        this.b = authType;
        this.c = str;
        this.d = l2;
    }
}
