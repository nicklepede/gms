package com.google.android.gms.presencemanager.communal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.presencemanager.ActiveUser;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cwsk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwsk();
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
        return arwb.b(this.a, getTokenRequest.a) && this.b == getTokenRequest.b && TextUtils.equals(this.c, getTokenRequest.c) && arwb.b(this.d, getTokenRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ActiveUser activeUser = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, activeUser, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }
}
