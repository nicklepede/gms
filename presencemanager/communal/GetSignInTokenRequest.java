package com.google.android.gms.presencemanager.communal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.presencemanager.ActiveUser;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cwsj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GetSignInTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwsj();
    public final ActiveUser a;
    public final int b;

    public GetSignInTokenRequest(ActiveUser activeUser, int i) {
        this.a = activeUser;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInTokenRequest)) {
            return false;
        }
        GetSignInTokenRequest getSignInTokenRequest = (GetSignInTokenRequest) obj;
        return arwb.b(this.a, getSignInTokenRequest.a) && this.b == getSignInTokenRequest.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ActiveUser activeUser = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, activeUser, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
