package com.google.android.gms.nearby.presence.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmzk;
import defpackage.elgo;
import defpackage.elpg;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ConfigParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmzk();
    public Account a;
    public String b;
    public List c;

    public ConfigParams() {
        int i = elgo.d;
        this.c = elpg.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfigParams) {
            ConfigParams configParams = (ConfigParams) obj;
            if (atyq.b(this.a, configParams.a) && atyq.b(this.b, configParams.b) && this.c.equals(configParams.c)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.y(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public ConfigParams(Account account, String str, List list) {
        this.a = account;
        this.b = str;
        this.c = elgo.i(list);
    }
}
