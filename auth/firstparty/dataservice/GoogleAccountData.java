package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acyh;
import defpackage.atzr;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GoogleAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acyh();
    final int a;

    @Deprecated
    String b;
    final boolean c;
    public final List d;
    public final String e;
    public final String f;
    public final Account g;

    public GoogleAccountData(int i, String str, boolean z, List list, String str2, String str3, Account account) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = str2;
        this.f = str3;
        if (account != null || TextUtils.isEmpty(str)) {
            this.g = account;
        } else {
            this.g = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.e(parcel, 3, this.c);
        atzr.x(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.c(parcel, a);
    }

    public GoogleAccountData(Account account, boolean z, List list, String str, String str2) {
        this.a = 2;
        this.g = account;
        this.c = z;
        this.d = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.e = str;
        this.f = str2;
    }
}
