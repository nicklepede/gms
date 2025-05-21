package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aayh;
import defpackage.arxc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GoogleAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aayh();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.x(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.c(parcel, a);
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
