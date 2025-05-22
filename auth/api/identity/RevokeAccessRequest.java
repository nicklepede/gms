package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abdb;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.elgo;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class RevokeAccessRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new abdb();
    public final elgo a;
    public final Account b;
    public final String c;

    public RevokeAccessRequest(List list, Account account, String str) {
        this.a = elgo.i(list);
        this.b = account;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            elgo elgoVar = this.a;
            int size = elgoVar.size();
            elgo elgoVar2 = revokeAccessRequest.a;
            if (size == elgoVar2.size() && elgoVar.containsAll(elgoVar2) && atyq.b(this.b, revokeAccessRequest.b) && atyq.b(this.c, revokeAccessRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        elgo elgoVar = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, elgoVar, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
