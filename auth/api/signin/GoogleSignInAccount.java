package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abou;
import defpackage.atzb;
import defpackage.atzr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new abou();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public String f;
    public final long g;
    public final String h;
    public final List i;
    public final String j;
    public final String k;
    private final Set l = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = j;
        this.h = str6;
        this.i = list;
        this.j = str7;
        this.k = str8;
    }

    public static GoogleSignInAccount b(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        long longValue = (l == null ? Long.valueOf(System.currentTimeMillis() / 1000) : l).longValue();
        atzb.q(str7);
        return new GoogleSignInAccount(str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
    }

    public static GoogleSignInAccount c(Account account, Set set) {
        return b(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    public static GoogleSignInAccount d(Account account, Scope scope, Scope... scopeArr) {
        atzb.s(account);
        atzb.s(scope);
        HashSet hashSet = new HashSet();
        hashSet.add(scope);
        hashSet.addAll(Arrays.asList(scopeArr));
        return c(account, hashSet);
    }

    public final Account a() {
        String str = this.c;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public final Set e() {
        HashSet hashSet = new HashSet(this.i);
        hashSet.addAll(this.l);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.h.equals(this.h) && googleSignInAccount.e().equals(e());
    }

    public final int hashCode() {
        return ((this.h.hashCode() + 527) * 31) + e().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.v(parcel, 7, this.f, false);
        atzr.q(parcel, 8, this.g);
        atzr.v(parcel, 9, this.h, false);
        atzr.y(parcel, 10, this.i, false);
        atzr.v(parcel, 11, this.j, false);
        atzr.v(parcel, 12, this.k, false);
        atzr.c(parcel, a);
    }
}
