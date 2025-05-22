package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abbz;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.elgt;
import defpackage.elgx;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountWithZuulKeyRetrievalIntent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abbz();
    public final Account a;
    public final PendingIntent b;

    public AccountWithZuulKeyRetrievalIntent(Account account, PendingIntent pendingIntent) {
        atzb.s(account);
        this.a = account;
        atzb.s(pendingIntent);
        this.b = pendingIntent;
    }

    public static elgx a(List list) {
        atzb.s(list);
        elgt i = elgx.i(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AccountWithZuulKeyRetrievalIntent accountWithZuulKeyRetrievalIntent = (AccountWithZuulKeyRetrievalIntent) it.next();
            i.i(accountWithZuulKeyRetrievalIntent.a, accountWithZuulKeyRetrievalIntent.b);
        }
        return i.g();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, account, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
