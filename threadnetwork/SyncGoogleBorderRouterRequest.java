package com.google.android.gms.threadnetwork;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dffx;
import defpackage.enmp;
import java.net.InetAddress;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class SyncGoogleBorderRouterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dffx();
    public final InetAddress a;
    public final String b;
    public final Account c;

    public SyncGoogleBorderRouterRequest(String str, String str2, Account account) {
        this.a = enmp.b(str);
        this.b = str2;
        this.c = account;
    }

    public final String a() {
        return enmp.a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncGoogleBorderRouterRequest)) {
            return false;
        }
        SyncGoogleBorderRouterRequest syncGoogleBorderRouterRequest = (SyncGoogleBorderRouterRequest) obj;
        return this.a.equals(syncGoogleBorderRouterRequest.a) && this.b.equals(syncGoogleBorderRouterRequest.b) && this.c.equals(syncGoogleBorderRouterRequest.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, a(), false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
