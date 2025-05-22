package com.google.android.gms.contextmanager.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajgv;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.aurj;
import defpackage.avvc;
import defpackage.rzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ContextManagerClientInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avvc();
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    private rzr l;

    public ContextManagerClientInfo(String str, String str2, int i, String str3, int i2, int i3, String str4, String str5, int i4, int i5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = i3;
        this.g = str4;
        this.h = str5;
        this.i = i4;
        this.j = i5;
        this.k = str6;
    }

    public static ContextManagerClientInfo b(Context context, String str, ajgv ajgvVar) {
        Account account = ajgvVar.f;
        if (account != null) {
            str = account.name;
        }
        return new ContextManagerClientInfo(str, context.getPackageName(), Process.myUid(), ajgvVar.a, aurj.b(context, context.getPackageName()), ajgvVar.b, ajgvVar.c, ajgvVar.d, ajgvVar.e, Process.myPid(), ajgvVar.g);
    }

    public final rzr a() {
        String str = this.a;
        if (str == null) {
            return null;
        }
        if (this.l == null) {
            this.l = new rzr(str);
        }
        return this.l;
    }

    public final boolean c() {
        return a() != null;
    }

    public final boolean d() {
        return this.f == 1;
    }

    public final boolean e() {
        return this.f == 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextManagerClientInfo)) {
            return false;
        }
        ContextManagerClientInfo contextManagerClientInfo = (ContextManagerClientInfo) obj;
        return this.c == contextManagerClientInfo.c && this.e == contextManagerClientInfo.e && this.f == contextManagerClientInfo.f && this.i == contextManagerClientInfo.i && TextUtils.equals(this.a, contextManagerClientInfo.a) && TextUtils.equals(this.b, contextManagerClientInfo.b) && TextUtils.equals(this.d, contextManagerClientInfo.d) && TextUtils.equals(this.g, contextManagerClientInfo.g) && TextUtils.equals(this.h, contextManagerClientInfo.h) && TextUtils.equals(this.k, contextManagerClientInfo.k);
    }

    public final boolean f() {
        return this.f == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h, Integer.valueOf(this.i)});
    }

    public final String toString() {
        return "(accnt=" + String.valueOf(a()) + ", " + this.b + "(" + this.c + "):" + this.d + ", vrsn=" + this.e + ", " + Integer.toString(this.f) + ", 3pPkg = " + this.g + " ,  3pMdlId = " + this.h + " ,  pid = " + this.j + " ,  featureId = " + this.k + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.o(parcel, 4, this.c);
        atzr.v(parcel, 5, this.d, false);
        atzr.o(parcel, 6, this.e);
        atzr.o(parcel, 7, this.f);
        atzr.v(parcel, 8, this.g, false);
        atzr.v(parcel, 9, this.h, false);
        atzr.o(parcel, 10, this.i);
        atzr.o(parcel, 11, this.j);
        atzr.v(parcel, 12, this.k, false);
        atzr.c(parcel, a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextManagerClientInfo(String str, String str2, int i, String str3, int i2, int i3, int i4) {
        this(str, str2, i, str3, i2, i3, null, null, -1, i4, null);
        atzb.q(str);
        atzb.q(str2);
        atzb.q(str3);
    }
}
