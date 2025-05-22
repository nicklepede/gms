package com.google.android.gms.threadnetwork;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhre;
import defpackage.eqaj;
import java.net.InetAddress;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class SyncGoogleBorderRouterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhre();
    public final InetAddress a;
    public final String b;
    public final Account c;

    public SyncGoogleBorderRouterRequest(String str, String str2, Account account) {
        this.a = eqaj.b(str);
        this.b = str2;
        this.c = account;
    }

    public final String a() {
        return eqaj.a(this.a);
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, a(), false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }
}
