package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abow;
import defpackage.abox;
import defpackage.aboy;
import defpackage.abpn;
import defpackage.aszm;
import defpackage.aszo;
import defpackage.atzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements ReflectedParcelable, aszm, aszo {
    public static final Parcelable.Creator CREATOR;
    public static final Scope a;
    public static final Scope b;
    public static final Scope c;
    public static final Scope d;
    public static final Scope e;
    public static final GoogleSignInOptions f;
    public static final Comparator g;
    final int h;
    public final ArrayList i;
    public final Account j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;
    public final ArrayList p;
    public final String q;
    public final Map r;

    static {
        Scope scope = new Scope("profile");
        a = scope;
        b = new Scope("email");
        c = new Scope("openid");
        Scope scope2 = new Scope("https://www.googleapis.com/auth/games_lite");
        d = scope2;
        e = new Scope("https://www.googleapis.com/auth/games");
        abox aboxVar = new abox();
        aboxVar.b();
        aboxVar.a.add(scope);
        f = aboxVar.a();
        abox aboxVar2 = new abox();
        aboxVar2.c(scope2, new Scope[0]);
        aboxVar2.a();
        CREATOR = new aboy();
        g = new abow();
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.h = i;
        this.i = arrayList;
        this.j = account;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = str;
        this.o = str2;
        this.p = new ArrayList(map.values());
        this.r = map;
        this.q = str3;
    }

    public static Map b(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.b), googleSignInOptionsExtensionParcelable);
            }
        }
        return hashMap;
    }

    public final ArrayList a() {
        return new ArrayList(this.i);
    }

    public final Scope[] c() {
        ArrayList arrayList = this.i;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0041, code lost:
    
        if (r1.equals(r5.j) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r5 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r5     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r1 = r4.p     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L7b
            java.util.ArrayList r1 = r5.p     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L17
            goto L7b
        L17:
            java.util.ArrayList r1 = r4.i     // Catch: java.lang.ClassCastException -> L7b
            int r2 = r1.size()     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r3 = r5.a()     // Catch: java.lang.ClassCastException -> L7b
            int r3 = r3.size()     // Catch: java.lang.ClassCastException -> L7b
            if (r2 != r3) goto L7b
            java.util.ArrayList r2 = r5.a()     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L32
            goto L7b
        L32:
            android.accounts.Account r1 = r4.j     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L3b
            android.accounts.Account r1 = r5.j     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L7b
            goto L43
        L3b:
            android.accounts.Account r2 = r5.j     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L7b
        L43:
            java.lang.String r1 = r4.n     // Catch: java.lang.ClassCastException -> L7b
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7b
            if (r2 == 0) goto L54
            java.lang.String r1 = r5.n     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L7b
            goto L5d
        L54:
            java.lang.String r2 = r5.n     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L5d
            goto L7b
        L5d:
            boolean r1 = r4.m     // Catch: java.lang.ClassCastException -> L7b
            boolean r2 = r5.m     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != r2) goto L7b
            boolean r1 = r4.k     // Catch: java.lang.ClassCastException -> L7b
            boolean r2 = r5.k     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != r2) goto L7b
            boolean r1 = r4.l     // Catch: java.lang.ClassCastException -> L7b
            boolean r2 = r5.l     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != r2) goto L7b
            java.lang.String r1 = r4.q     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r5 = r5.q     // Catch: java.lang.ClassCastException -> L7b
            boolean r5 = android.text.TextUtils.equals(r1, r5)     // Catch: java.lang.ClassCastException -> L7b
            if (r5 == 0) goto L7b
            r5 = 1
            return r5
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.i;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).b);
        }
        Collections.sort(arrayList);
        abpn abpnVar = new abpn();
        abpnVar.b(arrayList);
        abpnVar.b(this.j);
        abpnVar.b(this.n);
        abpnVar.a(this.m);
        abpnVar.a(this.k);
        abpnVar.a(this.l);
        abpnVar.b(this.q);
        return abpnVar.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 1, this.h);
        atzr.y(parcel, 2, a(), false);
        atzr.t(parcel, 3, this.j, i, false);
        atzr.e(parcel, 4, this.k);
        atzr.e(parcel, 5, this.l);
        atzr.e(parcel, 6, this.m);
        atzr.v(parcel, 7, this.n, false);
        atzr.v(parcel, 8, this.o, false);
        atzr.y(parcel, 9, this.p, false);
        atzr.v(parcel, 10, this.q, false);
        atzr.c(parcel, a2);
    }
}
