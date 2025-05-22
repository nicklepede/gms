package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atww;
import defpackage.atxm;
import defpackage.atxn;
import defpackage.atxo;
import java.util.Collection;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atww();
    public static final Scope[] a = new Scope[0];
    public static final Feature[] b = new Feature[0];
    public final int c;
    public final int d;
    public int e;
    public String f;
    public IBinder g;
    public Scope[] h;
    public Bundle i;
    public Account j;
    public Feature[] k;
    public Feature[] l;
    public boolean m;
    public int n;
    public boolean o;
    public String p;

    public GetServiceRequest(int i) {
        this(i, null);
    }

    private static Account c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return atxn.c(queryLocalInterface instanceof atxo ? (atxo) queryLocalInterface : new atxm(iBinder));
    }

    public final Account a() {
        return c(this.g);
    }

    public final void b(Collection collection) {
        this.h = (Scope[]) collection.toArray(new Scope[0]);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        atww.a(this, parcel, i);
    }

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? a : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? b : featureArr;
        featureArr2 = featureArr2 == null ? b : featureArr2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f = "com.google.android.gms";
        } else {
            this.f = str;
        }
        if (i < 2) {
            this.j = c(iBinder);
        } else {
            this.g = iBinder;
            this.j = account;
        }
        this.h = scopeArr;
        this.i = bundle;
        this.k = featureArr;
        this.l = featureArr2;
        this.m = z;
        this.n = i4;
        this.o = z2;
        this.p = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GetServiceRequest(int r16, java.lang.String r17) {
        /*
            r15 = this;
            int r3 = defpackage.aswe.c
            com.google.android.gms.common.api.Scope[] r6 = com.google.android.gms.common.internal.GetServiceRequest.a
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            com.google.android.gms.common.Feature[] r9 = com.google.android.gms.common.internal.GetServiceRequest.b
            r12 = 0
            r13 = 0
            r1 = 6
            r4 = 0
            r5 = 0
            r8 = 0
            r11 = 1
            r10 = r9
            r0 = r15
            r2 = r16
            r14 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GetServiceRequest.<init>(int, java.lang.String):void");
    }
}
