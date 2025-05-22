package com.google.android.gms.presencemanager.communal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.presencemanager.ActiveUser;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.czch;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czch();
    public final ActiveUser a;
    public final int b;
    public final String c;
    public final Account d;

    public GetTokenRequest(ActiveUser activeUser, int i, String str, Account account) {
        this.a = activeUser;
        this.b = i;
        this.c = str;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetTokenRequest)) {
            return false;
        }
        GetTokenRequest getTokenRequest = (GetTokenRequest) obj;
        return atyq.b(this.a, getTokenRequest.a) && this.b == getTokenRequest.b && TextUtils.equals(this.c, getTokenRequest.c) && atyq.b(this.d, getTokenRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ActiveUser activeUser = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, activeUser, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }
}
