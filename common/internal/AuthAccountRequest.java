package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atvt;
import defpackage.atzr;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atvt();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.D(parcel, 2, this.b);
        atzr.J(parcel, 3, this.c, i);
        atzr.F(parcel, 4, this.d);
        atzr.F(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.e(parcel, 7, this.g);
        atzr.c(parcel, a);
    }

    public AuthAccountRequest(Account account, Set set) {
        this(3, null, (Scope[]) set.toArray(new Scope[set.size()]), null, null, account, false);
    }
}
