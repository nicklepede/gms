package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.eito;
import defpackage.eits;
import defpackage.zcf;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountWithZuulKeyRetrievalIntent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zcf();
    public final Account a;
    public final PendingIntent b;

    public AccountWithZuulKeyRetrievalIntent(Account account, PendingIntent pendingIntent) {
        arwm.s(account);
        this.a = account;
        arwm.s(pendingIntent);
        this.b = pendingIntent;
    }

    public static eits a(List list) {
        arwm.s(list);
        eito i = eits.i(list.size());
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, account, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
