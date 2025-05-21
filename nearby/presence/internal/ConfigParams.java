package com.google.android.gms.nearby.presence.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ckrf;
import defpackage.eitj;
import defpackage.ejcb;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ConfigParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckrf();
    public Account a;
    public String b;
    public List c;

    public ConfigParams() {
        int i = eitj.d;
        this.c = ejcb.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfigParams) {
            ConfigParams configParams = (ConfigParams) obj;
            if (arwb.b(this.a, configParams.a) && arwb.b(this.b, configParams.b) && this.c.equals(configParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c.toString()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.y(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public ConfigParams(Account account, String str, List list) {
        this.a = account;
        this.b = str;
        this.c = eitj.i(list);
    }
}
