package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arte;
import defpackage.arxc;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new arte();
    final int a;

    @Deprecated
    public final IBinder b;
    public final Scope[] c;
    public Integer d;
    public Integer e;
    public Account f;
    public boolean g;

    public AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account, boolean z) {
        this.a = i;
        this.b = iBinder;
        this.c = scopeArr;
        this.d = num;
        this.e = num2;
        this.f = account;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.D(parcel, 2, this.b);
        arxc.J(parcel, 3, this.c, i);
        arxc.F(parcel, 4, this.d);
        arxc.F(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.e(parcel, 7, this.g);
        arxc.c(parcel, a);
    }

    public AuthAccountRequest(Account account, Set set) {
        this(3, null, (Scope[]) set.toArray(new Scope[set.size()]), null, null, account, false);
    }
}
